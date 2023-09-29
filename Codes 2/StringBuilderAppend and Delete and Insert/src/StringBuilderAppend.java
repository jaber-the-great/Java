public class StringBuilderAppend
    {

    public static void main(String[] args) {
//using + to concatenate two string result in creating a completely new objects
        //so its better off to use stringBuilder append method
        char [] chararray={'a','b','c','d','e','f','g'};
        char ch ='Z';
        boolean bool =true;
        int i=10;
        double d=15.66;
        float f=144.4f;//f indicates that the number is float
        long l=123456789123456789L;//L suffix indicate long, without it U get error
        Object o=" how are you ";//assign string to an object reference
        StringBuilder lastBuffer=new StringBuilder("Last buffer of the string");

        StringBuilder buffer =new StringBuilder();

        //append returns a string builder
        // \n must be used instead of %n because when, if U do not, it will show the
        //character of '%n'
        buffer.append(chararray,3,2).append("\n").append(ch).append("\t")
                .append(bool).append(i).append(']').append(d).append(f)
                .append(l).append('[').append(o).append("\n").append("luck\n").append(lastBuffer);
        System.out.println(buffer);


        StringBuilder buffer1=new StringBuilder();
        buffer1.insert(0,chararray,2,5).insert(3,bool);
        //it dose not delete the occupied slots, it just shift them
        System.out.println(buffer1);
        buffer1.insert(0,l).insert(6,o);
        System.out.println(buffer1);


        buffer1.deleteCharAt(2);
        System.out.println(buffer1);
        buffer1.delete(0,4); // 0 is the beginning an 4 is one past the ending
        // --> it deletes 4 char --> 0, 1, 2, 3
        System.out.println(buffer1);

    }
}
