import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Container;


public class GridLayoutFrame extends JFrame implements ActionListener
{
    private final JButton[] buttons;
    private static final String[] names={"one","two","three","four","five","six"};
    private boolean toggle=true;// toggle between layout
    private Container container;//frame container
    private final GridLayout gridLayout1;
    private final GridLayout gridLayout2;


    public GridLayoutFrame()
    {
        super("Grid Layout Of Jaber");
        gridLayout1=new GridLayout(2,3,5,5);//2 by 3 , horizontal and vertical gaps of 5 pix
       // gridLayout1=new GridLayout(2,3);// no gaps specified
        gridLayout2=new GridLayout(3,2,5,5);//3 by 2

        container=getContentPane();
        setLayout(gridLayout1);

        buttons=new JButton[names.length];
        for (int count =0; count<names.length;count++)
        {
            buttons[count]=new JButton(names[count]);
            buttons[count].addActionListener(this);// register listener
            add(buttons[count]);//add buttons to frame
        }

    }
//handles button events
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (toggle)
        {
            container.setLayout(gridLayout1);
        }
        else
        {
            container.setLayout(gridLayout2);
        }
        toggle=!toggle;

        container.validate();// re lay out the container
    }

}
