/**
 * Created by jaberdaneshamooz on 7/16/2017 AD.
 */
public enum TrafficEnum
    {
        R("RED",15),
        G("GREEN",15),
        Y("YELLO",3);


        private final String name;
        private final int duration;

        TrafficEnum(String name, int duration)
            {
                this.name=name;
                this.duration=duration;
            }

        public String getName()
            {
                return name;
            }

        public int getDuration()
            {
                return duration;
            }
    }
