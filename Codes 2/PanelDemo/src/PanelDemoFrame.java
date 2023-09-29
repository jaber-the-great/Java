import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PanelDemoFrame extends JFrame
{
    private final JPanel buttonPanle;//panel to hold buttons
    //JPanel is a type of container
    private final JButton[] buttons;

    public PanelDemoFrame()
    {
        super("panel demo example");

        buttons=new JButton[5];
        buttonPanle=new JPanel();
        buttonPanle.setLayout(new GridLayout(1,buttons.length,20,20));// setLayout comes from container class
        //one refers to rows and button.length refers to column

        for(int count=0;count< buttons.length;count++)
        {
            buttons[count]=new JButton("Button"+ (count+1));
            buttonPanle.add(buttons[count]);// add buttons to panel
        }
        add(buttonPanle,BorderLayout.SOUTH);
    }
}
