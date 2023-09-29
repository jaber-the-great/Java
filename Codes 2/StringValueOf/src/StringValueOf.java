public class StringValueOf
    {

    public static void main(String[] args) {

        //valueOf method converts int, double, bool,char array ... to string
        //it also gets object of every class and converts the result of
        //toString method of that class to String
        char [] chararray={'a','b','c'};
        char ch ='Z';
        boolean bool =true;
        int i=10;
        double d=15.66;
        float f=144.4f;//f indicates that the number is float
        long l=123456789123456789L;//L suffix indicate long, without it U get error
        Object o="how are U";//assign string to an object reference

        System.out.printf("%s%n",String.valueOf(chararray));
        System.out.println(String.valueOf(ch));
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(o));



    }
}
