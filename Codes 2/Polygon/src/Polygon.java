import javax.swing.JFrame;

public class Polygon
    {

    public static void main(String[] args) {
	    JFrame frame=new JFrame("drawing polygons");
	    frame.setDefaultCloseOperation(3);//equals Jframe.EXIT_ON_CLOSE

        polygonJpanel polyg=new polygonJpanel();
        frame.add(polyg);
        frame.setVisible(true);
        frame.setSize(280,270);
    }
}
