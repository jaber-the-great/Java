//garbage remover only removes objects that there is no reference to them

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaintPanelTest {

    public static void main(String[] args) {
        JFrame application=new JFrame("a simple paint program");

        PaintPanel PP=new PaintPanel();
        application.add(PP,BorderLayout.CENTER);

        application.add(new JLabel("Drag the mouse to draw"),BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400,200);
        application.setVisible(true);

	// write your code here
    }
}
