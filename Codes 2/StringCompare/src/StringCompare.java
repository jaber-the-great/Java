public class StringCompare
    {

    public static void main(String[] args) {

        String s1=new String("Hello");//physically different object in memory
        String s2="monday";
        String s3="Happy Birthday";
        String s4="happy birthday";

        if(s1.equals("Hello"))//true  ---> depends to the class
            System.out.println(".equals s1 is the same object as / Hello/");
        else
            System.out.println(".equals s1 is not the same object as /Hello/");

        if(s1=="Hello")//not equal -->performs reference comparison
            System.out.println("==s1 is the same object as / Hello/");
        else
            System.out.println("==s1 is not the same object as /Hello/");

        if(s3.equalsIgnoreCase(s4))// ---> ignore cases
            System.out.println("ignored case: are equal");
        else
            System.out.println("ignored case: are not equal");

        if(s3.equals(s4))
            System.out.println(" are equal");
        else
            System.out.println(" are not equal");

        System.out.printf("%n compare s1 s2 %d",s1.compareTo(s2));
        //the first letter is compared, if equals, the sec letter and so on
        System.out.printf("%n compare s2 s1 %d", s2.compareTo(s1));
        System.out.printf("%n compare s1 s1 %d",s1.compareTo(s1));
        System.out.printf("%n compare s3 s4 %d",s3.compareTo(s4));

        //testing region mach
        //first 0 is the beginning of s3 , s4 is other string, sec 0 is the
        // beginning of s4 and 5 is the number of letters
         if(s3.regionMatches(0,s4,0,5))//case sensitive
             System.out.printf("%n case sense first 5 char of s3 and s4 are equal");
         else
             System.out.printf("%n case sense first 5 char of s3 and s4 are NOT equal");

        //ignore cases
        if(s3.regionMatches(true,0,s4,0,5))//case sensitive
            System.out.printf("%n ignore case:first 5 char of s3 and s4 are equal");
        else
            System.out.printf("%n ignore case:first 5 char of s3 and s4 are NOT equal");

    }
}
