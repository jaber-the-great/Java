import javax.swing.JFrame;

public class MetricsTest
    {

    public static void main(String[] args) {

        JFrame frame =new JFrame("Demonstrating Fonts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetricsJpabel metrics=new MetricsJpabel();
        frame.add(metrics);
        frame.setSize(400,200);
        frame.setVisible(true);
    }
}
