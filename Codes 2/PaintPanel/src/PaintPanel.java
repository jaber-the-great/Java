import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JLabel;


public class PaintPanel extends JLabel
{
    private final ArrayList<Point> points = new ArrayList<Point>();

    public PaintPanel()
    {
        addMouseMotionListener(new MouseMotionAdapter() {// anonymous inner class
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();// repaint the JFrame
            }
        });
    }
// draw ovals in a 4 by 4 bounding box at specific location of the window
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);//clear drawing area
        //draw all
        for (Point p:points)
        {
            g.fillOval(p.x,p.y,4,4);
            //g.drawOval(p.x,p.y,8,8);
           // g.clearRect(p.x,p.y,8,8);
          //  g.clipRect(p.x,p.y,8,8);
        }
    }
}
