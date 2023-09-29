import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class TextAreaFrame extends JFrame
{
    private final JTextArea jTextArea1;
    private final JTextArea jTextArea2;
    private final JButton cpButton;

    public TextAreaFrame()
    {
        super("two text area !");
        Box boxxx=Box.createHorizontalBox();// try vertical
        String demo="this is Jaber Daneshamoooz Java training\n do not" +
                "bother him please \n he will soon\n become a super professional programmer\n" +
                "and earn lots\n of money and have pleasure";
        //in text area , you should use \n instead of %n

        jTextArea1=new JTextArea(demo,25,15);//25 rows and 15 columns
      //  jTextArea1.setEditable(true);// not necessary
        boxxx.add(new JScrollPane(jTextArea1));//adding scroll pane for Text area and adding
        //scroll pane to the box
       // jTextArea1.setLineWrap(true);


        cpButton=new JButton("Copy>>>");
        boxxx.add(cpButton);//add copy button to box
        cpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea2.setText(jTextArea1.getSelectedText());
            }
        });


            jTextArea2=new JTextArea(10,15);
            boxxx.add(new JScrollPane(jTextArea2));
            jTextArea2.setEditable(false);

            add(boxxx);//add box container to frame , and because we have not specified, the
        // border layout is center
        // the sequence of initialization is important in the manner that the text area
        // buttons appear in the box

    }
}
