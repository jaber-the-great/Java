public class VariableArgs {

   // public static double AVG(int a,int... numbers)//it will make problem
    public static double AVG(int... numbers) //important
    {
        int total=0;
        for(int i : numbers)
        {
            total+=i;
        }
        return (double) total/numbers.length;
    }

    public static void main(String[] args)
    {
	int a=6,b=9,c=44,d=17;
        System.out.printf("%8.2f%n",AVG(d));
       System.out.printf("%25.3f%n",AVG(a,b));
        System.out.printf("%-16.3f",AVG(a,b,c));
        System.out.printf("%20f%n",AVG(a,b,c,d));


    }
}
