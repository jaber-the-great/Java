import javax.swing.JFrame;

public class drawArc
    {

    public static void main(String[] args) {
	// write your code here
        JFrame frame=new JFrame("drawing arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJpanel arcsJpanel=new ArcsJpanel();
        frame.add(arcsJpanel);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
