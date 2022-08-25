import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) throws Exception {
        try {
            InputStream inStream = new FileInputStream(new File("C:\\Users\\vinh9\\IdeaProjects\\module02\\tuan4\\Copy-file-text\\source.txt"));
            OutputStream  outStream = new FileOutputStream(new File("C:\\Users\\vinh9\\IdeaProjects\\module02\\tuan4\\Copy-file-text\\target.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer,0,length);

            }

            System.out.println("File is copied successful!");
            inStream.close();
            outStream.close();
        } catch (Exception e) {
            System.out.println("File ko ton tai hoac noi dung file loi!");
        } finally {
            System.out.println("Ket thuc");
        }
    }
}

