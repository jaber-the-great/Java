public class StringIndex
    {

    public static void main(String[] args) {

        String letters="abcdefghijklemabcdefghijklmno";

        System.out.println(letters.indexOf('c'));
        System.out.println(letters.indexOf('a',2));//starts searching after sec char of str
        System.out.println(letters.indexOf('$'));// if not exist return -1

        //it searches from the end
        System.out.println(letters.lastIndexOf('c'));
        System.out.println(letters.lastIndexOf('a',25));
        //start from the end starting from a given char position
        System.out.println('@');


        System.out.println(letters.indexOf("def"));
        System.out.println(letters.indexOf("def",4));
        System.out.println(letters.indexOf("hello"));

        System.out.println(letters.lastIndexOf("def"));
        System.out.println(letters.lastIndexOf("hello"));
    }
}
