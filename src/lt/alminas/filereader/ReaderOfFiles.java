package lt.alminas.filereader;

import lt.alminas.model.Card;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;

/**
 * ReaderOfFiles - Allows the card data to be read and write to another file.
 */
public class ReaderOfFiles {

    Card card = new Card();

    public ReaderOfFiles() {
    }

    /** Gets file directory path.
     *
     * @return file directory path.
     */
    private String fileSelection() {
        JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jFileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jFileChooser.getSelectedFile();
            System.out.println("File path - " + selectedFile.getAbsolutePath());
            return selectedFile.getAbsolutePath();
        }
        return "Wrong choose";
    }

    /** Gets the old file data and enters it into the new file using the verification code IBAN.
     *
     * @throws IOException On input error.
     * @see IOException
     */
    public void fileSaving() throws IOException {
        String textFile = fileSelection();
        File file = new File(textFile);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String fileName = file.getName().replaceFirst("[.][^.]+$", "");
        FileWriter fileWriter = new FileWriter(fileName + "." + "out" + "." + "txt");

        boolean isValid;
        String fileContent = "";
        String st;
           try {
               while ((st = br.readLine()) != null) {
                   isValid = card.ibanNumberCheck(st);
                   fileContent = fileContent.concat(st +";"+ isValid + "\n");
               }
           }catch (Exception ex) {
               System.out.println(ex.getLocalizedMessage());
           }
           fileWriter.write(fileContent);
           fileWriter.close();
    }

}

