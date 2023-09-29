


public class AutoPolicyTestFile
{

    public static void main(String[] args) {
        AutoPolicy a = new AutoPolicy(11111, "Toyota Camry", "NJ");
        AutoPolicy b = new AutoPolicy(22222, "Ford Fusion", "ME");
        AutoPolicy c=new AutoPolicy(33333,"BMW","CAf");
        PolicyInNOFaultState(a);
        PolicyInNOFaultState(b);
        PolicyInNOFaultState(c);
    }

    public static void PolicyInNOFaultState(AutoPolicy policy)
        {
        System.out.printf("Account : %d Car : %s State : %s %s no fault state%n", policy.getAccountNumebr(), policy.getMakeAndModel(),
                policy.getState(), (policy.NoFault() ? "is" : "is not"));

        }

}