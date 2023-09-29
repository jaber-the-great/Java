import java.util.Scanner;

public class Token
    {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("enter a sentence and press enter:");
        String str=inp.nextLine();

        String [] tokens=str.split(" ");//deliminator is space here
        System.out.printf("Number of elements is : %d%n",tokens.length);

        for(String temp : tokens)
            System.out.println(temp);

    }
}
