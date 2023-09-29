import java.util.Scanner;
// the assert works only we use -ea in vm in edit configuration
// in terminal we should write : java -ea AssertTest
public class AssertTest {/////Important

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter a number between 0 and 10 : ");
        int number =input.nextInt();

        assert (number >=0 && number <=10): "bad number : " +number;
        System.out.printf("You Entered : %d",number);

    }
}
