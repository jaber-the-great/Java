public class TrafficLight
    {
        //enum tr{RED,GREEN,YELLO};// enum like c lang
    public static void main(String[] args)
        {
           //enum like C lang
           /* tr state;
            state=tr.GREEN;
            if(state==tr.RED)
                {
                    System.out.printf("the light is red\n");
                }
            else if(state==tr.GREEN)
                {
                    System.out.printf("pass the road\n");
                }
                */
           for(TrafficEnum temp : TrafficEnum.values())
               System.out.printf("%-10s\t\t%d\n",temp.getName(),temp.getDuration());


        }
}
