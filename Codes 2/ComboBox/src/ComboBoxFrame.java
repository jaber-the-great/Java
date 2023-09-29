import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.Icon;



public class ComboBoxFrame extends JFrame
{
    //private final JComboBox<String> imageCombo; // holds icon names
    private final JComboBox<Icon> imageCombo; // holds icon names
    private final JLabel label;

    private static final String[] names =
    {"bug1.gif","bug2.gif","travelbug.gif","buganim.gif"};

    private final Icon[] icons = {
    new ImageIcon(getClass().getResource(names[0])),
    new ImageIcon(getClass().getResource(names[1])),
    new ImageIcon(getClass().getResource(names[2])),
    new ImageIcon(getClass().getResource(names[3]))};

    public ComboBoxFrame()
    {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        //imageCombo=new JComboBox<String>(names);
        imageCombo=new JComboBox<Icon>(icons); // very good and funny
        imageCombo.setMaximumRowCount(2);


        // anonymous inner class
        imageCombo.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED)
                        {
                            label.setIcon(icons[imageCombo.getSelectedIndex()]);
                        }

                    }
                }
        );

        add(imageCombo);//add comboBox to JFrame
        label=new JLabel(icons[0]);// display first icon
        add(label);
    }// end of class


}//end of the class


