import java.util.Arrays;

public class ArrayClass
{

    public static void main(String[] args)
    {
        double [] DoubleArray ={3.5,2.9,6.4,99,1.3,4.88,1};
        Arrays.sort(DoubleArray);
        int [] IntArray = new int[10];
        Arrays.fill(IntArray,66);
        int [] IntArrayCopy =new int[IntArray.length];
        System.arraycopy(IntArray,0,IntArrayCopy,0,IntArray.length);
        boolean b =Arrays.equals(IntArray,IntArrayCopy);
        System.out.printf("%s", b ? "==" : "!=" );
        int location = Arrays.binarySearch(DoubleArray,6.4);
        System.out.printf("%n%d",location);
        location=Arrays.binarySearch(DoubleArray,77.4);// if it can't find the element
        // returns a negative number with magnitude of the number of elements of the array
        System.out.printf("%n%d",location);

    }
}