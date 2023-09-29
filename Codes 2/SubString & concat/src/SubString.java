public class SubString
    {

    public static void main(String[] args) {

        String letters="abcdefghijklmnoabcdefghijklmno";

        System.out.printf("Substring form 20 to end is :%S %n",letters.substring(20));
        //if we print %s in uppercase (%S) ---> the output will be in uppercase
        System.out.printf("Substring from index 3 to index 6 : %s %n",letters.substring(3,6));

        String s1="happy";
        String s2="birthday";
        //every operation that we do on string, it does no change the string,
        //rather it creates an entirely new string
        System.out.printf("the concat with s2 result in: %s%n",s1.concat(s2));//does not modify s1
        System.out.printf("s1 after concat wiht s2: %s%n",s1);
        s1.concat("jaber");
        System.out.printf("s1 after concat with 'jaber': %s%n",s1);
    }
}
