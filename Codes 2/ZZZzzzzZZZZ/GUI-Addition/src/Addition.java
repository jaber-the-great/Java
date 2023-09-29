
import javax.swing.JOptionPane;


public class Addition
{

    public static void main(String[] args)
    {
        String alaki =JOptionPane.showInputDialog(null,"Ye Adad Alaki bezan","Jaber Daneshamooz",JOptionPane.PLAIN_MESSAGE);
        String firstNumber= JOptionPane.showInputDialog("Enter first integer :");
        String secNumber= JOptionPane.showInputDialog("Enter Second interger :");


        int number1= Integer.parseInt(firstNumber);
        int number2=Integer.parseInt(secNumber);

        int sum=number1+number2;

        JOptionPane.showConfirmDialog(null,"the sum is : " +sum,"Sum of two Integer",JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null,"this message:","the title bar",JOptionPane.INFORMATION_MESSAGE);

    }
}
