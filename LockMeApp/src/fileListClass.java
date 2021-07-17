import java.io.File;
public class fileListClass {

    void fileList(){

        String folderpath = "C:\\Users\\ARUD\\IdeaProjects\\LockMeApp";
        File folder = new File(folderpath);
        File[] files  = folder.listFiles();
        for(File file:files)
            if (file.isFile())
            {
                System.out.println("File ->" +file.getName());
            }
            else if(file.isDirectory())
            {
                System.out.println("folder ->" +file.getName());
            }
    }

}