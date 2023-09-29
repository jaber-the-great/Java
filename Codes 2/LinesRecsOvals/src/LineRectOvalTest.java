import java.awt.Color;
import javax.swing.JFrame;

public class LineRectOvalTest
    {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Drawing lines,Rects and Ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LinesRectsOvals lro=new LinesRectsOvals();
        lro.setBackground(Color.white);//redundant because we determined in in LinesRectsOvals
        frame.add(lro);
        frame.setSize(400,200);
        frame.setVisible(true);


    }
}
