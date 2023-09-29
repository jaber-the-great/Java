
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
    private final JTextField txtField;
    private final JCheckBox boldTextBox;
    private final JCheckBox italictextBox;


    public CheckBoxFrame()
    {
       super("regular to italic to bold");
        setLayout(new FlowLayout());

        txtField=new JTextField("Watch the font style changes !",20);
        txtField.setFont(new Font("Serif", Font.PLAIN,14));
        add(txtField);


        boldTextBox=new JCheckBox("Bold");
        italictextBox=new JCheckBox("Italic");
        add(boldTextBox);
        add(italictextBox);

        CheckBoxHandler handler=new CheckBoxHandler();
        boldTextBox.addItemListener(handler);
        italictextBox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            Font font =null;

            if(boldTextBox.isSelected() && italictextBox.isSelected())
                font=new Font("Serif",Font.BOLD + Font.ITALIC,14);
            else if (boldTextBox.isSelected())
                font=new Font("Serif",Font.BOLD,14);
            else if (italictextBox.isSelected())
                font=new Font("Serif",Font.ITALIC,14);
            else
                font=new Font("Serif",Font.PLAIN,14);

            txtField.setFont(font);

        }


    }

}
