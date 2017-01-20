package tpjava.sequence.fenetre;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import tpjava.sequence.EnsembleSequences;
import tpjava.sequence.EnsembleSequencesConcretes;
import tpjava.sequence.ProteinConcrete;
import tpjava.sequence.Sequence;
import tpjava.sequence.SequenceADNConcrete;
import tpjava.sequence.SequenceARNConcrete;
import tpjava.sequence.SequenceConcrete;
import tpjava.sequence.SequenceNucleiqueConcrete;

public class FenetreSequence extends JFrame {
	
	private JTextArea textArea;
	private JTextField motif;
	private EnsembleSequences sequences;
	private Sequence sequenceType = new ProteinConcrete();
	private String[] types = {"ADN", "ARN", "Protein"};
	private Sequence[] sequenceTypes = {new SequenceADNConcrete(), 
			new SequenceARNConcrete(), new ProteinConcrete()};
	private JComboBox<String> typeBox;
	
	public FenetreSequence() {
		super("Fenêtre Séquence");
		setPreferredSize(new Dimension(600, 600));
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea); 
		add(scrollPane, BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout());
		
		
		typeBox = new JComboBox<String>(types);
		typeBox.setSelectedIndex(0);
		typeBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				actionChoose();
			}
		});

		panel.add(typeBox);
		
		JButton open = new JButton("Ouvrir");
		panel.add(open);
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				actionOuvrir();
			}
		});
		
		motif = new JTextField();
		motif.setPreferredSize(new Dimension(120, 30));
		panel.add(motif);
		
		JButton search = new JButton("Rechercher");
		panel.add(search);
		search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				actionChercher();
			}
		});
		
		JButton save = new JButton("Enregistrer");
		panel.add(save);
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				actionSauvegarder();
			}
		});
		
		setVisible(true);
		pack();
	}
	
	private void actionOuvrir() {
		
		JFileChooser fileChooser = new JFileChooser();
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION){
			File file = fileChooser.getSelectedFile();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				sequences = new EnsembleSequencesConcretes();
				sequences.read(reader, sequenceType);
				reader.close();
				textArea.setText(sequences.getNombre() + "sequences \n");
				for (Sequence sequence : sequences) {
					textArea.append(sequence.getId() + "\n");
					textArea.append(sequence.getSequence() + "\n");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Invalid sequence type", 
						"Sequence error", JOptionPane.ERROR_MESSAGE); 
			}
		}		
	}
	

	private void actionChercher() {
		if (sequences == null) {
			return;
		}
		String m = motif.getText().trim();
		if (m.length() == 0) {
			return;
		}
		for (Sequence sequence : sequences) {
			String occ = sequence.occurence(m);
			if (occ != null) {
				textArea.append("Nom de la Séquence : "+ sequence.getId() + "\n");
				textArea.append("Position du motif : " + sequence.getSequence().indexOf(occ) + "\n");
				textArea.append("Motif trouvé : " + sequence.occurence(m)+"\n");
			}
		}
	}
	
	private void actionSauvegarder() {
		JFileChooser chooser = new JFileChooser(".");
		int returnVal = chooser.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			try {
				PrintWriter out = new PrintWriter(file);
				out.write(textArea.getText());
				out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}
	
	private void actionChoose() {
		int index = typeBox.getSelectedIndex();
		if (index > -1) {
			sequenceType = sequenceTypes[index];
		}
	}
	
	public static void main(String[] args) {
		
		new FenetreSequence();
		
	}
}
