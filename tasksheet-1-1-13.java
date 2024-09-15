import java.io.FileReader;
import java.io.IOException;

class FileReaderC {

     private String filePath;

     public FileReaderC (String filePath) {
        this.filePath = filePath;
     }

     public void readFile(){
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(filePath);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.println((char) character);
            }
        }
        catch (IOException e){
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
        finally{
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: An I/O error occurred while closing the file.");
            }
        }
     }
}

class FileReaderApp {
    public static void main(String[] args) {
        String filePath = "readme.txt";
        FileReaderC fileReaderC = new FileReaderC(filePath);

        try {
            System.out.println("Reading data from file.");
            fileReaderC.readFile();
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    } 
}