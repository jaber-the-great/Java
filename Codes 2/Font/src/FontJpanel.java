import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class FontJpanel extends JPanel

    {

                @Override
                public void paintComponent(Graphics g )
                {
                    super.paintComponent(g);

                    g.setFont(new Font("Serif",Font.BOLD,12));
                    g.drawString("serif 12 ping bold ",20,30);

                    g.setColor(Color.RED);
                    g.setFont(new Font("Serif",Font.ITALIC,16));
                    g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+"Point bold italic" ,
                            20,60);

                }
               



    }
