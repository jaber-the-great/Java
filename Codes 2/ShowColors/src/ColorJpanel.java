import java.awt.Graphics;//its an abstract class
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJpanel extends JPanel
    {
            //draws rectangles and strings in different colors
        @Override
        public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                //this.setBackground(Color.PINK);
                this.setBackground(new Color(150,250,150));

                //set new color using integers
                g.setColor(new Color(255,0,0,100));//the last number is for opaqueness
              //  g.fill3DRect(15,15,100,20,true);
                g.fillRect(15,15,100,20);
                g.drawString("The color is :"+g.getColor(),130,40);

                //set new color using floating points
                g.setColor(new Color(.1f,0.2f,1f));
                g.fillRect(15,50,100,20);
                g.drawString("The color is :"+g.getColor(),130,65);

                //set new colors using static color objects
                g.setColor(Color.BLACK);
                g.fillRect(15,75,100,20);
                g.drawString("The color is :"+g.getColor(),130,90);

                //displays individual RGB values
                Color color=Color.MAGENTA;
                g.setColor(color);
                g.fillRect(15,100,100,20);
                g.drawString("RGB values :"+ color.getRed() +","+ color.getGreen()
                +","+ color.getBlue(),130,115);


            }
    }
