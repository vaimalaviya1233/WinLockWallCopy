import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;


class walcpt{
    public static void main(String[] args) {
        String userDir = System.getProperty("user.home") + "\\";
        out.println(userDir);
        //String[] formatter = userDir.split("\\");
        
        File assetFolderWalpapers = new File((userDir+"AppData\\Local\\Packages\\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\\LocalState\\Assets"));
        int wallFileCounted = assetFolderWalpapers.listFiles().length; 
        out.println("wallpaper found = " + wallFileCounted);

        for(File i: assetFolderWalpapers.listFiles()){
            out.println(i.getName().toString());
        }    

    }
}