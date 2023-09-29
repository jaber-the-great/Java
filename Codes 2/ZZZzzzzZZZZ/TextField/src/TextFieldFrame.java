import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame
{

    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame()
    {
        super("Jaber testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1=new JTextField(10);//the width of field is 10 capital M letter
        add(textField1);

        textField2=new JTextField("Enter text here");
        textField2.setToolTipText("It can be changed");
        add(textField2);

        textField3=new JTextField("uneditable text field",21);
        textField3.setEditable(false);
        add(textField3);

        passwordField=new JPasswordField("Hidden field");
        add(passwordField);

        TextFieldHandler handler =new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }


    private class TextFieldHandler implements ActionListener //nested class , only
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String str="";
            if(event.getSource()==textField1)
            {
                str=String.format("textField1:  %s",event.getActionCommand());
            }

            else if(event.getSource()==textField2)
            {
                str=String.format("textField2:  %s",event.getActionCommand());
            }

            else if(event.getSource()==textField3)
            {
                str=String.format("textField3:  %s",event.getActionCommand());
            }

            else if (event.getSource()==passwordField)
            {
                str=String.format("PasswordField:  %s",event.getActionCommand());
            }

            JOptionPane.showMessageDialog(TextFieldFrame.this,str);

        }
    }
}
