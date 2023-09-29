import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ChooseColor extends JFrame
    {
        private final JButton changeColorButton;
        private final JPanel jpanelColor;
        private Color color=Color.LIGHT_GRAY;

        public ChooseColor()
            {

                super("Choosing color");
                jpanelColor=new JPanel();
                jpanelColor.setBackground(color);

                changeColorButton=new JButton("Change Color");
                changeColorButton.addActionListener(new ActionListener()
                    {
                        //displays JcolorChoose when u click on the button
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {
                               color=JColorChooser.showDialog(ChooseColor.this,"choose " +
                                       "a color",color);
                               //sets default color if no color is returned
                                if(color==null)
                                    {
                                        color=Color.LIGHT_GRAY;
                                    }

                                jpanelColor.setBackground(color);

                            }
                    });
                add(jpanelColor,BorderLayout.CENTER);
                add(changeColorButton,BorderLayout.SOUTH);

                setSize(400,100);
                setVisible(true);

            }
    }
