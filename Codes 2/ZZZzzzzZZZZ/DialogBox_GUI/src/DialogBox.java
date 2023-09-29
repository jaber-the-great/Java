import javax.swing.JOptionPane;
public class DialogBox {

    public static void main(String[] args)
    {
        String name =JOptionPane.showInputDialog("What Is Your Name ?");

       JOptionPane.showMessageDialog(null,"Welcome To Java GUI Programming!");

        String message = String.format("Welcome  %s  , This Is Your First Java GUI Programming!",name);
        JOptionPane.showMessageDialog(null,message);

    }
}
