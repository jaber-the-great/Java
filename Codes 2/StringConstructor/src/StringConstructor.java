public class StringConstructor
    {

    public static void main(String[] args)
        {
            char [] chararray={'j','a','b','e','r',' ','D'};
            String s=new String("hellow");


            //using string constructor
            String s1=new String();
            String s2=new String(s);//there is difference between comparing two strings
            //that refer to the same object and two strings that have same content
            //and also difference between == operator of class string and equality method
            //of that class
            String s3=new String(chararray);
            String s4=new String(chararray,4,3);//4 is starting index address
            //and 3 is the number of characters
            System.out.printf("%s%n%s%n%s%n%s%n",s1,s2,s3,s4);


        }
}
