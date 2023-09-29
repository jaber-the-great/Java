public class EmployeeTest
{

    public static void main(String[] args)
    {
      
	    Date birth =new Date(1996,2,18);
        Date hire =new Date(2016,11,24);
        Employee jaber =new Employee("Jaber","Daneshamooz",birth,hire);
        String temp=jaber.toString();
        System.out.printf("%s%n",jaber);
        System.out.printf("%s%n",temp);
        Date bir =new Date(1990,10,24);
        Date begin= new Date(2016,2,9);
        Employee Hesam=new Employee("Hesam","Babaiee",bir,begin);
        System.out.printf("%s%n",Hesam);
        System.out.println(jaber);

    }
}
