package streams;

import java.io.*;

public class ReadAndWriterDemo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source-file> <destination-file>");
            return;
        }

        String sourceFileName = args[0];
        String destFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File destFile = new File(destFileName);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist");
            return;
        }

        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destFile)) {

            if (destFile.exists()) {
                System.out.print("Destination file already exists. Overwrite? (Yes/No): ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();

                if (!input.equalsIgnoreCase("Yes")) {
                    System.out.println("File copy cancelled");
                    return;
                }
            }

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
