import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileChooser {

    public static String getFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pick your CSV File");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Only CSV Files", "csv");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return "";
    }
}
