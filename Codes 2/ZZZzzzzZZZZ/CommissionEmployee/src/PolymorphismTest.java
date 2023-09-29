/**
 * Created by jaberdaneshamooz on 9/2/2016 AD.
 */
public class PolymorphismTest
{
    public static void main(String []args)
    {
        CommissionEmployee employee = new CommissionEmployee("PJaber " , "PDaneshamooz" ,
                "932_58_93",12000,0.5);

        BasePlusCommissionEmployee Inherited =new BasePlusCommissionEmployee("Preza","yazdani","38-384-34",
                6000,0.3,1234);
        System.out.printf("%s/////////fuck u%n",Inherited);
        System.out.printf("%s///////// fuck u%n",employee);
        System.out.printf( "%.2f what ????????????????????????",Inherited.earning());
        CommissionEmployee Polycommission = Inherited;// superclass refers to subclass
        System.out.printf(" after polymorphic reference to Preza :%n%s/////////%n",Polycommission);//important
       // BasePlusCommissionEmployee xxx=employee; //compilation error
        System.out.printf(" after polymorphic reference to Preza " +
                "with explicit toString call :%n%s/////////%n",Polycommission.toString());
        System.out.printf( "%.2f what the fuck",Polycommission.earning());//important , it executes the earning method of
        // BasePlusCommissionEmployee

    }


}
