    import java.io.File;

    public class FileDeleter {
        public static void main(String[] args) {
            File myFile = new File("newFile.txt");
            if (myFile.delete()) {
                System.out.println("Deleted the file: " + myFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }