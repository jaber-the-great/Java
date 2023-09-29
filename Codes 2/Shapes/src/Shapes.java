import javax.swing.JFrame;
public class Shapes
    {

    public static void main(String[] args) {
	        JFrame frame=new JFrame("demonstrating shapes");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        shapesJPanel shapesJPanel=new shapesJPanel();
	        frame.add(shapesJPanel);
            frame.setSize(500,300);
            frame.setVisible(true);


    }
}
