    import java.io.FileWriter;
    import java.io.IOException;

    public class FileWriterExample {
        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("newFile.txt");
                myWriter.write("Hello, this is some text written to a file.");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }