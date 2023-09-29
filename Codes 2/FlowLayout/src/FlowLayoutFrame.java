import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class FlowLayoutFrame extends JFrame
{
    private final JButton left;
    private final JButton right;
    private final JButton center;
    private final FlowLayout flowLayout;
    private final Container container;//container to set layout

    //set up GUI and event listener
    public FlowLayoutFrame()
    {
        super("The FlowLayout Test");

        flowLayout=new FlowLayout();
        container=getContentPane();//get container to Layout , GUI component attach to the window
        setLayout(flowLayout);

        left=new JButton("LeftSide");
        add(left);// add the button to the frame
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.LEFT);
                flowLayout.layoutContainer(container);// realign attached components
            }
        });



        center=new JButton("centerSide");
        add(center);// add the button to the frame
        center.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.CENTER);
                flowLayout.layoutContainer(container);// realign attached components
            }
        });



        right=new JButton("rightSide");
        add(right);// add the button to the frame
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.RIGHT);
                flowLayout.layoutContainer(container);// realign attached components
            }
        });
    }
}
