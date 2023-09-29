//class StringBuilder is in java.lang just like class String
public class StringBuilderConstructor
    {

    public static void main(String[] args) {
	     //contents of StringBuilder are dynamically modifiable
        //in contrast to String
        StringBuilder s1=new StringBuilder();//it converts into String
        //automatically with implicit call
        StringBuilder s2=new StringBuilder(10);//10 char capacity,
        //program does not need to resize it and also saves memory somehow
        StringBuilder s3=new StringBuilder("hello");

        System.out.printf("/%s/%n/%s/%n/%s/%n",s1,s2,s3);

    }
}
