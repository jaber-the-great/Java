import java.lang.StringBuilder;
public class StringBuilderChar
    {

    public static void main(String[] args) {

        StringBuilder buffer=new StringBuilder("hello Jaber");

        System.out.printf("%s%n%c\t%c%n",buffer.toString(),buffer.charAt(0),buffer.charAt(4));
        //toString can be called implicitly

        char [] chararray =new char[buffer.length()];
        buffer.getChars(0,buffer.length(),chararray,0);
        //copies String into a char array (from beginning to end)
        for(char ch : chararray)
            {
                System.out.printf("%c",ch);
            }
        System.out.println();
        buffer.setCharAt(4,'z');
        buffer.setCharAt(7,'q');
        System.out.printf("%s%n%c\t%c%n",buffer.toString(),buffer.charAt(0),buffer.charAt(4));

        buffer.reverse();
        System.out.println(buffer.toString());

    }
}
