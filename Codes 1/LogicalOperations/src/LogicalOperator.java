

public class LogicalOperator {

    public static void main(String[] args)
    {
	    System.out.printf("true ( && ) false is : %b\n",(false && true));// the %b is for boolean and show true or false
        //conditional and . the right side will not be evaluated if the left side is false
        System.out.printf("true ( & ) false is : %b\n",(false & true));//both sides will be evaluated
        System.out.printf("true ( || ) false is : %b\n",(true || true));//the right side will not be evaluated
        // if the left side is true
        System.out.printf("true ( | ) false is : %b\n",(true | false));//both sides will be evaluated
        System.out.printf("true exclusive or (^) false is : %b\n",(true^false));
        System.out.printf("true exclusive or (^) true is : %b\n",(true^true));

    }
}
