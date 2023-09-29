import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener
{
    private String line1=""; // first line of Text area
    private String line2=""; // second line of text area
    private String line3=""; //third line of text area
    private JTextArea textArea;

    public KeyDemoFrame()
    {
        super("Key Demo Frame test");

        textArea=new JTextArea(10,15);// it is being ignored because it automatically places into the
        //center of JFrame because we did not dedicate the alignment of Border layout and by default it
        //places in center of JFrame and takes as much space as it can
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);//the user can't type in the text area
        textArea.setDisabledTextColor(Color.RED);
        add(textArea);

        addKeyListener(this);// this represent an object of key demo frame and is a keyListener

    }
        @Override
    public void keyPressed(KeyEvent e)
        {
            line1=String.format("Key Pressed : %s",KeyEvent.getKeyText(e.getKeyCode()));//show pressed key
            // key pressed is for any key that does not have mapping to unicode like ASCII
            SetLine2and3(e);
        }

    @Override
    public void keyReleased(KeyEvent event)
    {
        line1=String.format("Key Released : %s",KeyEvent.getKeyText(event.getKeyCode()));
        SetLine2and3(event);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        line1=String.format("Key Typed : %s",KeyEvent.getKeyText(e.getKeyChar()));//unicode of typed key
        SetLine2and3(e);
    }


    private void SetLine2and3 (KeyEvent e)
    {
        line2=String.format("This key is %s an action key",(e.isActionKey()? " " : "not"));
        String tmp=KeyEvent.getKeyModifiersText(e.getModifiers());

        line3=String.format("Modifier key pressed : %s",(tmp.equals("") ? "none" : tmp));

        textArea.setText(String.format("%s\n%s\n%s\n",line1,line2,line3));//in text area / should be used
        //for going to next line
    }
}
