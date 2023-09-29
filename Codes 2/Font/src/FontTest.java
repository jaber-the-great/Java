import javax.swing.JFrame;

public class FontTest
    {

        public static void main(String[] args)
            {
                JFrame frame = new JFrame("Using fonts");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                FontJpanel  fontJpanel=new FontJpanel();
                frame.add(fontJpanel);
                frame.setSize(400,100);
                frame.setVisible(true);

            }
    }