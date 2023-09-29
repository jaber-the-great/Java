import java.util.Scanner;
public class StaticCharMethods
    {

    public static void main(String[] args) {

        //using class character, it is part of java.lang
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a character and then press enter");
        String input=inp.next();//it reads the next token
        char ch=input.charAt(0);

        System.out.printf("%b%n%b%n%b%n%b%n%b%n",Character.isDefined(ch),Character.isDigit(ch)
        ,Character.isLowerCase(ch),Character.isJavaIdentifierStart(ch),Character.isJavaIdentifierPart(ch));
        //is JavaIdentifierStart means is it allowed to be the starting char of an identifier or not
        //eg. digits are not allowed but alphabets are allowed
        Character.toUpperCase(ch);//the methods of Character does not modify the content,
        //just like strings
        System.out.println(ch);
        System.out.println(Character.toUpperCase(ch));

        //radix is the base of numeric system eg. octal radix is 8

        System.out.println("please enter the radix");
        int radix =inp.nextInt();
        System.out.println("enter 1 for digit to char and 2 for char to digit");
        int choice=inp.nextInt();

        switch (choice)
            {
                case 1:
                    System.out.println("Enter the digit:");
                    int digit=inp.nextInt();
                    System.out.printf("convert digit to char : %s%n",Character.forDigit(digit,radix));
                    break;
                case 2:
                    System.out.println("enter the char: ");
                    char c=inp.next().charAt(0);
                    System.out.printf("convert char to digit : %s%n",Character.digit(c,radix));
                    break;
            }

        Character c1='A';//this is not char primitive type, this is char object
        //every one of java primitive types has corresponding class in java.lang
        Character c2='a';
        System.out.printf("c1 is equal to : %s%nc2 is equal to :2%s%n",c1.charValue(),c2.toString());

        if(c1.equals(c2))//case sensitive
            System.out.println("they are equal");
        else
            System.out.println("they are not equal");


    }
}

