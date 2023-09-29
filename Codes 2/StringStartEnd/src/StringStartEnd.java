public class StringStartEnd
    {

    public static void main(String[] args) {

        String [] strings={"started","starting","ended","ending","Startup"};
        for(String str : strings)
            {
                if(str.startsWith("sta"))//it is case sensitive
                    {
                        System.out.printf("the / %s / starts with 'sta' %n",str);
                    }

            }
        for (String str : strings)
            {
                if(str.startsWith("art",2))
                    System.out.printf("the  / %s /starts with 'art' at position 2%n",str);
            }
        for (String s : strings)
            {
                if(s.endsWith("ed"))
                    System.out.printf("the / %s / ends with 'ed' %n",s);
            }


    }
}
