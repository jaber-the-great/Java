import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatches
    {

    public static void main(String[] args) {

        Pattern exper=Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        //sth that starts whit 'J' followed by any single char as much as exist
        //followed by a digit from 0-3 to 5-9 then two , two digits
        String str="Jaber's Birthday is 29-11-74\n" +
                "John's Birthday is 05-12-75"+
                "Reza's Birthday is 04-02-77" +
                "Dave's Birthday is 17-06-69";
        Matcher matcher=exper.matcher(str);

        while (matcher.find())
            System.out.println(matcher.group());

    }
}
