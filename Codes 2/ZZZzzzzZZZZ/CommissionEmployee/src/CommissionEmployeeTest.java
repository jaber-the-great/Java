import java.security.PrivateKey;

public class CommissionEmployeeTest {

    public static void main(String[] args)
    {
        CommissionEmployee employee = new CommissionEmployee("Jaber " , "Daneshamooz" ,
                "932_58_93",12000,0.5);

        System.out.printf("%s",employee);
        employee.setGrossSale(45000.15);
        employee.setCommissionRate(.2);
        System.out.printf("%s",employee);

        BasePlusCommissionEmployee Inherited =new BasePlusCommissionEmployee("reza","yazdani","38-384-34",
                6000,0.3,1234);

        System.out.printf("BasePlus ... Inherited class object's name and" +
                " grossSale and Base Salary is :%n%s%n%.2f%n%.2f%n////////%n",
                Inherited.getFirstName(),Inherited.getGrossSale(),Inherited.getBaseSalary());

       // Inherited.setBaseSalary(876878655.4);
        System.out.printf("%s",Inherited.toString());
        System.out.printf("%.2f%n%.2f%n%.2f",Inherited.earning(),Inherited.earning1(),employee.earning());

    }
}
