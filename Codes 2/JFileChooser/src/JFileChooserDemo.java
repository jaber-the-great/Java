import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JFileChooserDemo extends JFrame
    {
        private final JTextArea outputArea;

        public JFileChooserDemo() throws IOException
            {
                super("JFileChooserDemo");
                outputArea=new JTextArea();
                add(new JScrollPane(outputArea));//outputArea is scorllable
                analyzePath();//get path from user and displays it
            }
        //displays information about file or directory path specifies
        public void analyzePath() throws IOException
            {
                //get path to user-selected file or directory
                Path p=getFileOrDirectoryPath();

                if(p!=null && Files.exists(p))//if exist, display info
                    {
                        //gathering file or directory information
                        StringBuilder builder = new StringBuilder();
                        builder.append(String.format("%s%n", p.getFileName()));
                        builder.append(String.format("%s%n", Files.getLastModifiedTime(p)));
                        builder.append(String.format("%s%n", Files.size(p)));
                        builder.append(String.format("%s%n", p.toAbsolutePath()));

                        if (Files.isDirectory(p))
                            {
                                builder.append(String.format("%nDirectory Contents%n"));

                                //object for iterating through a directory's content
                                DirectoryStream<Path> directoryStream =
                                        Files.newDirectoryStream(p);

                                for (Path temp : directoryStream)
                                    builder.append(String.format("%s%n", p));
                            }
                        outputArea.setText(builder.toString());//displays string content
                    }
                else//paths does not exist
                    {
                        JOptionPane.showMessageDialog(this,p.getFileName()+
                                "does not exist","ERROR",JOptionPane.ERROR_MESSAGE);
                    }





            }
        //allows user to specify file or directory name
        private Path getFileOrDirectoryPath()
            {
                //configure dialog allowing selection of a file or directory
                JFileChooser fileChooser=new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                int result=fileChooser.showOpenDialog(this);

                //if user clicked on cancel button, then return
                if(result==JFileChooser.CANCEL_OPTION)
                    System.exit(1);


                //return path representing the file chooser
                return fileChooser.getSelectedFile().toPath();

            }




    }
