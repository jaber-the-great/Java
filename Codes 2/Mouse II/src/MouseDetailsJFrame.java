import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsJFrame extends JFrame
{
    private  String details;
    private final JLabel statusbar;


    public MouseDetailsJFrame()
    {
        super("mouse clicks and buttons");
        statusbar=new JLabel("click the mouse");
        add(statusbar,BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());

    }
// inner class to handle mouse event
    private class MouseClickHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            details=String.format("Clicked %d time(s)",e.getClickCount());

            if(e.isMetaDown())//for right click
                details+="with right mouse button";

            else if(e.isAltDown())//middle mouse button
                details+="with center mouse button";
            else // what is the name of function for left mouse button
                details+="with left mouse button";
            statusbar.setText(details);
        }
    }
}
