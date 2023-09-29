import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo
    {

    public static void main(String[] args) throws IOException
        {

        //dot means the current folder for relative path
        // the compiler has ability to retrieve the absolute path from relative
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter file or directory name : ");
        //create path object based on user input
        Path p=Paths.get(inp.nextLine());

        if(Files.exists(p))//if files exist, output info about it
            {
                System.out.printf("%n%s exist %n",p.getFileName());
                System.out.printf("%s a directory %n",Files.isDirectory(p)? "is " : "is not");
                System.out.printf("%s an absolute path%n",p.isAbsolute()? "is ": "is not");
                System.out.printf("Last modified %s%n",Files.getLastModifiedTime(p));
                System.out.printf("Size = %s%n",Files.size(p));
                System.out.printf("Path is : %s%n",p);//to string
                System.out.printf("Absolute path is : %s%n",p.toAbsolutePath());



            }
        if(Files.isDirectory(p))//if it is, output directory listing
            {
                    System.out.println("directory contents : ");
                    //object for iterating through directory's content
                DirectoryStream<Path> dirStream = Files.newDirectoryStream(p);
                for (Path temp : dirStream)
                    System.out.println(temp);
            }
        else
            {
                System.out.printf("%s does not exist",p);
            }


    }
}
