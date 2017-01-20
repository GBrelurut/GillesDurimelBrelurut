package frames;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Battle extends JInternalFrame {
	

	Battle() {
		
	}
	
	public static void main(String[] args) {
		
		
		//In the constructor of InternalFrameDemo, a JFrame subclass:
	    JDesktopPane desktop = new JDesktopPane();
	    Battle frame = new Battle();
	    frame.setVisible(true);
	    desktop.add(frame);
	    try {
	        frame.setSelected(true);
	    } catch (java.beans.PropertyVetoException e) {}
	
	    //Make dragging a little faster but perhaps uglier.
	    desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

	

	}
}