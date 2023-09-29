public class StringMiscellaneous
    {

    public static void main(String[] args) {

        String s1="hello there";
        char [] chararray=new char[5];

        System.out.println(s1);
        System.out.println(s1.length());//in contrast to C and C++ java does no terminate a
        //string by null character '\0'
        for(int count =s1.length() -1;count>= 0;count --)
            {
                System.out.printf("%c",s1.charAt(count));//charAt is used for indexing
            }
        s1.getChars(2,7,chararray,0);
        //2 source begin, 7 source end, 0 dest begin

        System.out.println();
        for(char ch:chararray)
            {
                System.out.printf("%c",ch);
            }

    }
}
