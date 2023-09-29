

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.text.PlainDocument;


public class ButtonFrame extends JFrame
{

    private final JButton PlainButton;
    private final JButton FancyButton;

    public ButtonFrame()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        PlainButton=new JButton("Plain Button"); // button with text
        add(PlainButton);

        Icon bug1=new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2=new ImageIcon((getClass().getResource("bug2.gif")));
        FancyButton=new JButton("Fancy Button",bug1);
        FancyButton.setRolloverIcon(bug2);
        add(FancyButton);


        ButtonHandler handler=new ButtonHandler();
        FancyButton.addActionListener(handler);
        PlainButton.addActionListener(handler);



    }


    public class ButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You Pressed : %s",event.getActionCommand()));

        }

    }


}
