/**
 * Created by jaberdaneshamooz on 6/29/2016 AD.
 */
public enum Book
{

    HTDYH("how to defeat your hurt","2020"),
    TSOFCWI("the similarity of French culture with Iran","2024"),
    TOPII("the obstacles of progress in Iran","2030"),
    HTMPSIL("how to make people stand in line","2035"),
    TBORFS("the benefits of religion for society","2040"),
    BJD("biography of jaber daneshamooz ","2060") ;//the lastone ends with semicolon


    private final String title;
    private final String year;
    Book (String tile,String year)// for the constructor , we do not mention the keyword public
            // for declaring the method type
    {
        this.title=tile;
        this.year=year;

    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }


}
