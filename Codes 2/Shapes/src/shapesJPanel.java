import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
public class shapesJPanel extends JPanel
    {
        @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                Graphics2D g2d=(Graphics2D) g;//casting g to graphics 2d

                //draw 2d ellipse filled with blue-yellow gradient
                g2d.setPaint(new GradientPaint(5,30,Color.BLUE,35,80,Color.yellow,true));
                //the first 2 digits are the starting point of a line that the gradient will follow
                //the second 2 digits are the ending point of a line that the gradient will follow
                //though, these 4 numbers are used to determine the angle of gradient
                //the cyclic gradients repeat themselves
                g2d.fill(new Ellipse2D.Double(5,30,65,100));
                //the fill method takes as its argument a shape object

                //draw 2d rectangle
                g2d.setPaint(Color.black);//if we do not use this, it will use the prev (gradient blue & yellow)
                // and it is somehow like setColor and works as the same here
                g2d.setStroke(new BasicStroke(10.2f));//basic stroke for solid line and its thickness
                g2d.draw(new Rectangle2D.Double(80,30,65,100));

                //draw 2d rounded rectangle with buffered background
                //buffer image allows u to create a new image in the memory and then
                //u can use it to do your own drawing into that image
                BufferedImage buffimage=new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
                // the last argument is the type of image that we want to create

                // obtain the graphic2d from buffimage and draw on it
                Graphics2D gg=buffimage.createGraphics();
                gg.setColor(Color.green);
                gg.fillRect(0,0,10,10);
                gg.setColor(Color.RED);
                gg.fillRect(1,1,6,6);
                gg.setColor(Color.black);
                gg.fillRect(1,1,3,3);
                gg.setColor(Color.gray);
                gg.fillRect(1,4,3,3);
                gg.setColor(Color.YELLOW);
                gg.fillRect(4,4,3,3);

                //paint buffimage onto the Jframe
                g2d.setPaint(new TexturePaint(buffimage,new Rectangle(10,10)));
                g2d.fill(new RoundRectangle2D.Double(155,30,75,100,50,50));

                g2d.setPaint(Color.DARK_GRAY);
                g2d.setStroke(new BasicStroke(5));
                g2d.draw(new Arc2D.Double(240,30,75,100,30,280,Arc2D.PIE));
                //the last argument specifies the type of the arc2d

                //draw 2d lines in green and red
                g2d.setPaint(Color.GREEN);
                g2d.draw(new Line2D.Double(380,50,320,150));//uses the prev stroke

                //draw 2d lines using stroke
                float [] dashes ={10,4,6};//specifies dash patters, can add more numbers to this
                g2d.setPaint(Color.RED);
                g2d.setStroke(new BasicStroke(4,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND
                ,20,dashes,2));

                g2d.draw(new Line2D.Double(320,30,380,140));

            }
    }
