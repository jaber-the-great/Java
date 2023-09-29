import java.util.ArrayList;

public class ArrayListTest
{

    public static void main(String[] args)
    {
        ArrayList<String> item =new ArrayList<String>();//we can allocate the number of elements in the
        //parenthesis , if we don't , it initially get 10
        item.add("Iran");
        item.add(0,"Saveh");
        for(int i=0;i<item.size();i++)
        {
            System.out.printf("%s\t",item.get(i));

        }
        Display(item,"first time%n");
        item.add("Central");
        item.add("Iran");
        Display(item,"after adding 2 elements%n");
        item.remove("Iran");// remove first occurrence of element in braces
        Display(item,"after removing Iran%n");
        item.remove("Iran");
        Display(item,"after removing Iran again%n");
        item.add("arak");
        item.add("tehran");
        Display(item,"/////%n");
        item.remove(1);// indices begin from zero
        Display(item,"after the removing 1 %n");
        System.out.printf("the item contains arak ?%s%n",item.contains("arak") ? "yes" : "no");
        System.out.printf("the item contain shiraz ?%s%n",item.contains("shiraz") ? "yes" : "no");
        System.out.printf("the size is %d%n",item.size());




    }

    public static void Display(ArrayList<String> items,String header)
    {
        System.out.printf(header);

        for(String temp : items)
            System.out.printf("%s\t",temp);

        System.out.println();

    }
}

