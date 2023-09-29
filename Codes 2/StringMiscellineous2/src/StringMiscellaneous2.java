public class StringMiscellaneous2
    {

    public static void main(String[] args) {

        String s1="hello";
        String s2="GOOD BYe";
        String s3="     Spaces   ";

        System.out.printf("replaces all 'l' with 'L' in s1 :%s%n",s1.replace('l','L'));
        System.out.printf("s1 after replacing 'l' with 'L' : %s%n",s1);
        System.out.printf("s1 to uppercase :%s%n",s1.toUpperCase());
        System.out.printf("s2 to lowercase :%s%n",s2.toLowerCase());
        // for chars that do not have lower of upper case, the original char will be returned

        System.out.printf("s3 after trim :/%s/%n",s3.trim());//removes all leading and tail spaces

        char [] chararray=s1.toCharArray();//converts string to char array
        for(char ch: chararray)
            System.out.printf("%c",ch);

    }
}
