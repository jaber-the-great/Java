import javax.swing.JPanel;
import java.awt.*;

public class LinesRectsOvals extends JPanel
    {
        @Override
        public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                this.setBackground(Color.white);

                g.setColor(Color.GREEN);
                g.drawLine(5,30,380,30);//the direction of beginning and end of line


                g.setColor(Color.BLACK);
                g.drawRect(5,40,90,55);//hallow shape
                g.fillRect(100,40,90,55);//filled shape

                g.setColor(Color.BLUE);
                g.drawRoundRect(195,40,90,55,20 ,70);
                g.fillRoundRect(290,40,90,55,20,20);

                g.setColor(Color.YELLOW);
                g.draw3DRect(5,100,90,55,true);
                g.fill3DRect(100,100,90,55,true);


                g.setColor(Color.red);
                g.drawOval(195,100,90,55);
                g.drawRect(195,100,90,55);
                g.fillOval(290,100,90,55);
            }


    }
