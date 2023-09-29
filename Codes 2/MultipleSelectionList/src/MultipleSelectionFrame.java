import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;


public class MultipleSelectionFrame extends JFrame
{
    private final JList<String> colorList;
    private final JList<String> copy;
    private JButton cpButton;

    private static final String[] colors={"Black","Blue","Cyan","Dark Gray","Gray","Green",
            "Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};

    public MultipleSelectionFrame()
    {
        super("Multiple List Selection Test");
        setLayout(new FlowLayout());

        colorList=new JList<String>(colors);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorList)); //add list with scroll pane

        cpButton=new JButton("copy >>>");

        // anonymous inner class
      cpButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

              // place the selected values in copy
              copy.setListData(colorList.getSelectedValuesList().toArray(new String[0]));

          }
      });
        add(cpButton);

        copy=new JList<String>();
        copy.setVisibleRowCount(5);
        copy.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        copy.ensureIndexIsVisible(3);
        copy.setFixedCellHeight(15);
        copy.setFixedCellWidth(100);

        add(new JScrollPane(copy));

    }


}
