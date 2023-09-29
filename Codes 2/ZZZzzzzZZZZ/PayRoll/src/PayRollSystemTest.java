
public class PayRollSystemTest {

    public static void main(String[] args)
    {
        SalariedEmployee salary = new SalariedEmployee("Abazar","Danesh","111-11-1111",500.0);
        HourlyEmployee hourly=new HourlyEmployee("Ehsan","Mahdavi","222-22-2222",8.0,46);
        CommissionEmployee commission=new CommissionEmployee("Sina","Danesh","333-33-3333",0.1,3000.0);
        BasePlusCommissionEmployee baseplus=new BasePlusCommissionEmployee("Jaber","Daneshamooz",
                "444-44-4444",0.1,1000.0,250);

        System.out.printf("%sEarning : $%,.2f%n",salary,salary.earnings());
        System.out.printf("%sEarning : $%,.2f%n",hourly,hourly.earnings());
        System.out.printf("%sEarning : $%,.2f%n",commission,commission.earnings());
        System.out.printf("%sEarning : $%,.2f%n",baseplus,baseplus.earnings());

        Employee[] personells=new Employee[4];
        personells[0]=salary;
        personells[1]=hourly;
        personells[2]=new CommissionEmployee("Sina","Danesh","333-33-3333",0.1,3000.0);
        personells[3]=baseplus;

        for(Employee currentEmployeeeee : personells)
        {
            System.out.println(currentEmployeeeee);
            //any object of any type can be passed to println method to get the string representation
            if(currentEmployeeeee instanceof BasePlusCommissionEmployee)
            {
                BasePlusCommissionEmployee IncreasedBase=(BasePlusCommissionEmployee) currentEmployeeeee;//Important
                // cast for exception handling
                IncreasedBase.setBaseSalary(1.10* IncreasedBase.getBaseSalary());
                System.out.printf("New Base Salary with 10%% increase is :$%,.2f%n",IncreasedBase.getBaseSalary());
            }
            System.out.printf("EARNING : %s%n%n%n",currentEmployeeeee.earnings());
        }


        for(int i=0;i<personells.length;i++)//Important
        {
            System.out.printf("Employee %d is a %s%n",i+1,personells[i].getClass().getName());
        }
        

    }
}
