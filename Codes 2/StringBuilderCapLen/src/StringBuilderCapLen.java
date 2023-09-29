public class StringBuilderCapLen
    {

    public static void main(String[] args) {

        StringBuilder buffer =new StringBuilder("hello, how are you?");
        System.out.printf("toString : %s\t length : %s\t capacity : %s%n",buffer.toString()
        ,buffer.length(),buffer.capacity());// the initial capacity depends on
        //the value of object-->if it was shorter, the capacity was lower

        buffer.ensureCapacity(75);// if prev capacity is larger,
        //this command will be ignored
        System.out.printf("the ensured capacity is : %s%n",buffer.capacity());

        buffer.setLength(9);//if it is smaller than the length, it
        //truncates the original content
        System.out.printf("new length is : %s%ntoString is :%s%n",buffer.length()
        ,buffer.toString());
    }
}
