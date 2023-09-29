import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;


public class shapes2Jpanel extends JPanel
    {
        @Override
         public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                SecureRandom random = new SecureRandom();
                Graphics2D graphics2D=(Graphics2D) g;



                int [] xPoints ={55,67,109,73,83,55,27,37,1,43};// x and y for representing points of star
                int [] yPoints ={0,36,36,54,96,72,96,54,36,36};

                GeneralPath star =new GeneralPath();

                star.moveTo(xPoints[0],yPoints[0]);//initial coordinate of general path

                //creates star but do not draw it
                for(int cnt=1;cnt<xPoints.length;cnt++)
                    star.lineTo(xPoints[cnt],yPoints[cnt]);

                star.closePath();//closes the shape

                graphics2D.translate(150,150);//translates the origin point from 0,0 to 150,150

                for(int count=1;count<20;count++)
                    {
                        graphics2D.rotate(Math.PI/10.0);//rotates coordination system
                        graphics2D.setColor(new Color(random.nextInt(256),
                                random.nextInt(256),random.nextInt(256)));
                        graphics2D.fill(star);

                    }


            }

    }
