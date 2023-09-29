/**
 * Created by jaberdaneshamooz on 10/23/2017 AD.
 */
public enum MenuOptions
    {
        //declares contents of enum type
        ZERO_BALANCE(1),
        CREDIT_BALANCE(2),
        DEBIT_BALANCE(3),
        END(4);

        private final int value;
        private MenuOptions(int val)
            {
                this.value=val;
            }
    }
