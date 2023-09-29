import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;


public class ListFrame extends JFrame
{
    private final JList<String> colorList;
    private static final String[] colorName={"Black","Blue","Cyan","Orange",
    "Pink","Red","White","Yellow"};

    private static final Color[] colors={Color.black,Color.BLUE,Color.CYAN,Color.ORANGE,Color.PINK,Color.RED,
    Color.WHITE,Color.YELLOW};

    public ListFrame()
    {
        super("List Test");//the title bar
        setLayout(new FlowLayout());
        colorList=new JList<String>(colorName);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//do not allow multiple selection

        add(new JScrollPane(colorList));// different adding

        //anonymous inner class
        colorList.addListSelectionListener(new
                                                   ListSelectionListener() {
                                                       @Override
                                                       public void valueChanged(ListSelectionEvent e) {
                                                           getContentPane().setBackground(colors
                                                                   [colorList.getSelectedIndex()]);
                                                       }
                                                   });
    }
}
