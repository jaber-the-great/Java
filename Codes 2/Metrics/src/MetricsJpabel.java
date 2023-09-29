import javax.swing.JPanel;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class MetricsJpabel extends JPanel
    {
            @Override
        public void paintComponent(Graphics graphics)
                {
                    super.paintComponent(graphics);
                    graphics.setFont(new Font("SansSerif ",Font.BOLD,14));
                    FontMetrics metrics= graphics.getFontMetrics();
                    graphics.drawString("current font "+graphics.getFont(),10,30);
                    graphics.drawString("ascent "+ metrics.getAscent(),10,45);
                    graphics.drawString("descent "+metrics.getDescent(),10,60);
                    graphics.drawString("height "+metrics.getHeight(),10,75);
                    graphics.drawString("leading "+metrics.getLeading(),10,90);

                }


    }
