import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private final JButton[] buttons; //array of buttons to hide the portion
    private static final String[] names = {"Hide North","Hide South","Hide East","Hide West", "Hide Center"};
    private final BorderLayout layout;// for re layout of the components

    public BorderLayoutFrame()
    {
        super("Border layout Demo");

        layout= new BorderLayout(5,5); // gaps between components horizontally and vertically
        setLayout(layout);
        buttons=new JButton[names.length];// it does not create JButton objects,
        // it create an array that can refer to JButton Objects

        for(int count=0; count< names.length;count++)
        {
            buttons[count]=new JButton(names[count]);
            buttons[count].addActionListener(this);
        }
        add(buttons[0],BorderLayout.NORTH);
        add(buttons[1],BorderLayout.SOUTH);
        add(buttons[2],BorderLayout.EAST);
        add(buttons[3],BorderLayout.WEST);
        add(buttons[4],BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // check event source and layout content pane correspondingly
        for(JButton jb : buttons)
        {
            if(e.getSource()==jb)
            {
                jb.setVisible(false);//hides the button that was clicked
            }
            else
            {
                jb.setVisible(true);
            }
        }

        layout.layoutContainer(getContentPane());//for getting the buttons reposition and resize

    }



}
