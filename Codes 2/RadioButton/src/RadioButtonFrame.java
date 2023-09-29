
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class RadioButtonFrame extends JFrame
{
    private final JTextField textField;
    private final Font italicFont;
    private final Font boldFont;
    private final Font plainFont;
    private final Font BoldItalicFont;

    private final JRadioButton boldButton;
    private final JRadioButton italicBotton;
    private final JRadioButton plainButton;
    private final JRadioButton BoldItalicButton;
    private final ButtonGroup radioButtonGroup;


    public RadioButtonFrame()
    {
        super("Radio Button Test");
        setLayout(new FlowLayout());
        textField=new JTextField("Watch the changes in the text",20);
        add(textField);

        // if we select two of these buttons true, when we add them to Button Group, the previous one
        // automatically turns into false
        plainButton=new JRadioButton("Plain",true);
        boldButton=new JRadioButton("Bold",false);
        italicBotton=new JRadioButton("Italic",false);
        BoldItalicButton=new JRadioButton("Bold/Italic",false);
        add(plainButton);
        add(boldButton);
        add(italicBotton);
        add(BoldItalicButton);



        radioButtonGroup=new ButtonGroup();
        radioButtonGroup.add(plainButton);
        radioButtonGroup.add(boldButton);
        radioButtonGroup.add(italicBotton);
        radioButtonGroup.add(BoldItalicButton);


        plainFont=new Font("Serif",Font.PLAIN,14);
        boldFont=new Font("Serif",Font.BOLD,14);
        italicFont=new Font("Serif",Font.ITALIC,14);
        BoldItalicFont=new Font("Serif",Font.BOLD+Font.ITALIC,14);

        // unlike previous ones , it uses separate handler for each individual object
        plainButton.addItemListener(new RadioButtonHandler(plainFont));
        boldButton.addItemListener(new RadioButtonHandler(boldFont));
        italicBotton.addItemListener(new RadioButtonHandler(italicFont));
        BoldItalicButton.addItemListener(new RadioButtonHandler(BoldItalicFont));


    }

    private class RadioButtonHandler implements ItemListener
    {
        private Font font;

        public RadioButtonHandler(Font f)
        {
            font=f;
        }

        @Override
        public void itemStateChanged(ItemEvent event)
        {
            textField.setFont(font);
        }

    }

}



