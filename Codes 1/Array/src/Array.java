import java.io.PrintStream;

public class Array {

    public static void main(String[] args)
    {
        int [] array = new int[10];//initialize to zero automatically
        boolean [] jaber = new boolean[7];//initialized to false automatically
        double [][] twoD=new double[2][3];
        int [] arr ={3,4,7,12,5,34};//array initializer
        final int Arr_lenght=8;
        int [] jj=new int [Arr_lenght];
        int [][] array4={{1,2,3},{4,5,6,6,8,44,33,55,11},{11,4,5,127}} ;
        int [][][] triD ={ {{1,4},{3,6,7}} , {{9},{11,32}} ,  {{3},{87},{33,2,1}} };
        int [] response ={1,4,3,5,9,2,1,3,3,16,2};
        int [] freq =new int [6];
        int ArrLenght=6;
        char [] CHar=new char[ArrLenght];
        for (int i=0;i<response.length;i++)//important
        {
            try
            {
                ++freq[response[i]];
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf("response[%d] = %d%n",i,response[i]);

            }
        }
        System.out.printf("%s%10s%n","rating ", "frequency");
        for (int i=1;i<freq.length;i++)
        {
             System.out.printf("%d%10d%n", i, freq[i]);
        }

        for (int cnt =0;cnt<arr.length && cnt<jaber.length;cnt++)
        {
            jj[cnt]=2+cnt*2;
            ++jj[cnt];
            System.out.printf("%5d%5d%20b   %03d\n",cnt,arr[cnt],jaber[cnt],jj[cnt]);
            //important (zero filler)

        }
        int total=0;
        for (int number : response)// very important
        total+=number;


        System.out.printf("%5s%5d","The total is :",total);

        System.out.printf("%n///////////////////////////%n");
        ShowArray(array4);
        System.out.printf("%n///////////////////////////%n");
        EnhancedShowArrya(array4);


    }


    public static void ShowArray(int [][] InputArr) // very important
    {
        for (int row = 0; row < InputArr.length; row++)
        {
            for (int col = 0; col < InputArr[row].length; col++)
                System.out.printf("%d\t", InputArr[row][col]);

            System.out.println();
        }
    }
    public static void EnhancedShowArrya(int [][] inarr)//important
    {
        for (int [] arr : inarr)
        {
            for(int mark : arr)
            {
                System.out.printf("%d\t",mark);
            }
        }
    }

}
