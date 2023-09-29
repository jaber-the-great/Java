/**
 * Created by jaberdaneshamooz on 7/16/2017 AD.
 */
public enum State
    {
        em("empty"),
        isO("O"),
        isx("X");

        private  String name;
        State(String name)
            {
                this.name=name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        @Override
        public String toString()
            {
                return super.toString();
            }
    }
