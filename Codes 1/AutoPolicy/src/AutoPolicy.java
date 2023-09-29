
public class AutoPolicy
{
    private int AccountNumebr;
    private String MakeAndModel;
    private String state;

    public AutoPolicy(int AccountNumber , String MakeAndModel, String state)
    {
        this.AccountNumebr=AccountNumber;
        this.MakeAndModel=MakeAndModel;
        this.state=state;

    }

    public void setAccountNumebr(int accountNumebr) {
        AccountNumebr = accountNumebr;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public int getAccountNumebr() {
        return AccountNumebr;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public boolean NoFault()
    {
    boolean NoFault;
    switch (getState())
    {
        case "MA":
        case "NJ":
        case "NY":
        case "PA":
            NoFault = true;
            break;
            default:
                NoFault=false;
                break;
    }
return NoFault;

    }






}
