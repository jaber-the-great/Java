import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class ArcsJpanel extends JPanel
    {
        @Override
            public void paintComponent(Graphics g)
            {
                super.paintChildren(g);

                g.setColor(Color.RED);
                g.drawRect(15,35,80,80);
                g.setColor(Color.black);
                g.drawArc(15,35,80,80,0,360);//sweeps anti clockwise
                // 0 degree is at angel 0 and ...

                g.setColor(Color.RED);
                g.drawRect(100,35,80,80);
                g.setColor(Color.black);
                g.drawArc(100,35,80,80,0,160);

                g.setColor(Color.RED);
                g.drawRect(185,35,80,80);
                g.setColor(Color.black);
                g.drawArc(185,35,80,80,50,-270);
                //sweeps clockwise because of negative sign

                g.fillArc(15,120,80,40,0,360);

                g.fillArc(100,120,80,40,270,-100);

                g.fillArc(185,120,80,40,-90,100);






            }

    }
