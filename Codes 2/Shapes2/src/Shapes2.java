import javax.swing.JFrame;
import java.awt.Color;

public class Shapes2
    {

    public static void main(String[] args) {
	    JFrame frame=new JFrame("Demonstrating Shapes 2 ");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    shapes2Jpanel shape =new shapes2Jpanel();
	    frame.add(shape);
	    frame.setBackground(Color.white);
	    frame.setSize(315,330);
	    frame.setVisible(true);

    }
}
