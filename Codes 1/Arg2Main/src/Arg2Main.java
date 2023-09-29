public class Arg2Main
{

    public static void main(String[] args)
    {
        if(args.length !=3)
        {
            int x = 5;
            x = 3;
            int[] NonConst = new int[x];//java no matters that the array length is not a constant value

            System.out.printf("Wrong number of arguments %n please enter 3 number " +
                    "for array size , initial value and increment : %n");
        }
            else
        {
            int ArrLenght = Integer.parseInt(args[0]);//important : try to make the argument an integer number
            int[] array = new int[ArrLenght];
            int InitialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            for (int cnt = 0; cnt < array.length; cnt++)
            {
                array[cnt] = cnt * increment + InitialValue;
                System.out.printf("%d\t", array[cnt]);
            }

        }
    }
}
