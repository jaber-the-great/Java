import javax.swing.*;

public class ShowColors
    {

    public static void main(String[] args)
        {
            JFrame frame =new JFrame("Using colors");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            ColorJpanel cp=new ColorJpanel();
            frame.add(cp);
            frame.setSize(500,250);
            frame.setVisible(true);
        }
}
