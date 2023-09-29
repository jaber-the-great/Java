import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseTrackerFrame extends JFrame
{
    private final JPanel mousePanel;//the area that mouse event occures
    private final JLabel statusBar;// display the status of event

    public MouseTrackerFrame()
    {
        super("Demonstrating Mouse Event");
        mousePanel=new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel,BorderLayout.CENTER);

        statusBar=new JLabel("mouse outside JPanel");
        add(statusBar,BorderLayout.SOUTH);


        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

    private class MouseHandler  implements MouseListener , MouseMotionListener
    {
        // mouse listener event handlers
        @Override
        public void mouseClicked(MouseEvent e)
         {
            statusBar.setText(String.format("Clicked at [%d , %d] ",e.getX(),e.getY()));
         }

        @Override
        public void mousePressed(MouseEvent e)
        {
            statusBar.setText(String.format("Pressed at [%d , %d] ",e.getX(),e.getY()));

        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            statusBar.setText(String.format("Released at [%d , %d] ",e.getX(),e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            statusBar.setText(String.format("Entered at [%d , %d] ",e.getX(),e.getY()));
            mousePanel.setBackground(Color.BLUE);

        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            statusBar.setText("Mouse out of JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        //mouse motion listener event handler

        @Override
        public void mouseDragged(MouseEvent e)
        {
            statusBar.setText(String.format("Dragged at [%d , %d] ",e.getX(),e.getY()));
            statusBar.setHorizontalAlignment(SwingConstants.CENTER);
        }

        @Override
        public void mouseMoved(MouseEvent e)
        {
            statusBar.setText(String.format("Moved at [%d , %d] ",e.getX(),e.getY()));
        }

    }

}
