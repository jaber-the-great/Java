
//JLabel with text and icon
    import javax.swing.JFrame; // for creating custom window
    import javax.swing.JLabel; // creates text to label other GUI components
    import java.awt.FlowLayout; // for flowing the text and icon
    import javax.swing.SwingConstants; // common constants used with swing
    import javax.swing.Icon; // interface to manipulate images
    import javax.swing.ImageIcon; // loading images


    public class LabelFrame extends JFrame
    {
        private final JLabel label1;
        private final JLabel label2;
        private final JLabel label3;

        public LabelFrame()
        {

            super("Testing JLable"); // the title , from class JFrame
            setLayout(new FlowLayout());// we do not store FlowLayout , we just take a reference to
            // it and it replaces the default Layout

            label1 = new JLabel("Label with text");
            label1.setToolTipText("This is label 1");
            add(label1); // adding label1 to JFrame


            Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
            label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
            label2.setToolTipText("This is label 2");
            add(label2);


            label3 = new JLabel();
            label3.setText("Label with icon and text at bottom");
            label3.setIcon(bug);
            label3.setVerticalTextPosition(SwingConstants.BOTTOM);
            label3.setHorizontalTextPosition(SwingConstants.CENTER);
            label3.setToolTipText("This is label 3");
            add(label3);

            //  add(label1,label2,label3); // this is a correct syntax
        }
    }