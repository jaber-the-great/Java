public class PassArray {

    public static void main(String[] args)
    {
    int [] array ={5,3,88,12,9,3,7};
    for(int value : array)
        System.out.printf(" %d ",value);

    	Modifyarrya(array);
        System.out.println();

        for(int value : array)
            System.out.printf(" %d ",value);

        System.out.println();
        System.out.printf(" %d%n",array[3] );
        Modifyelement(array[3]);
        System.out.printf(" %d%n",array[3]);
    }
    // String is not modifiable
    //we can not pass the primitive type by reference in java ; we can make a class to do it by set and get method
    public static void Modifyarrya (int [] array2)
    {
    for (int i=0;i<array2.length;i++)
    {
        array2[i]*=2;
    }
    }

    public static void Modifyelement(int element)
    {
    element*=2;

    }
}
