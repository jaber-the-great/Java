import java.util.Arrays;

public class RegexSubstitution
    {

    public static void main(String[] args) {

        String first="this sentece ends with 5 stars *****";
        String sec="1, 2, 3, 4, 5,6,7,      8";

        System.out.println(first);
        first=first.replaceAll("\\*","^");
        //it does not actually modify it, it creates totally new string
        System.out.println(first);

        first=first.replaceAll("stars","carets");
        System.out.println(first);

        first=first.replaceAll("\\w","word");
        System.out.println(first);

        for(int i=0;i<3;i++)
            {
                sec=sec.replaceFirst("\\d","digit");
            }
        System.out.println(sec);

        String [] result=sec.split(",\\s*");//splits by comma and  discard whit spaces
        System.out.println(Arrays.toString(result));

    }
}
