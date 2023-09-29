//find the avarage

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
	    int total=0,grade=0,cnt=0;
        System.out.print("enter the grade or type the end-of-file indicator to terminate input:\n" +
                "type <command> d then press enter");// important

        while(inp.hasNext())//important
        {
            grade=inp.nextInt();
            total+=grade;
            cnt++;
        }
        if(cnt!=0)
        System.out.printf("the average is :\n%.2f", (double)total/cnt);   //casting

    }
}
