import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;


public class polygonJpanel extends JPanel
    {
        @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                int [] xvalue={20,50,30,60,17};
                int [] yvalue={50,40,80,90,36};

                Polygon polygon1=new Polygon(xvalue,yvalue,5);//5 is the number of points
                g.drawPolygon(polygon1);//polygon always connect the first and last point

                int [] xval={70,86,93};
                int [] yval={10,34,19};
                g.drawPolyline(xval,yval,3);// in poly line the last and first point do not connect

                //fill polygon with two array
                int [] xva={120,130,140,150};
                int [] yva={120,70,70,120};
                g.fillPolygon(xva,yva,4);

                //draw filled polygon with polygon object
                Polygon polygon2=new Polygon();
                polygon2.addPoint(160,160);
                polygon2.addPoint(200,160);
                polygon2.addPoint(200,200);
                polygon2.addPoint(160,200);//the order of points is important and gives
                //different shapes, it is in clock wise manner

                g.fillPolygon(polygon2);


            }

    }
