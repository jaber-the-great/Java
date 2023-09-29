public class PackageDataTest
{

    public static void main(String[] args)
    {
    	PackageData mypack=new PackageData();
        System.out.printf("After Initialization %s",mypack);
        mypack.number=74;
        mypack.str="Jaber's Birthday";

        System.out.printf("After some changes : %s",mypack);
    }


}


class PackageData
{

    int number;
    String str;

    public PackageData() {
        number = 0;
        str = "Hello!";
    }

    @Override
    public String toString() {
        return String.format("Number : %d    String : %s%n", number, str);
    }
}