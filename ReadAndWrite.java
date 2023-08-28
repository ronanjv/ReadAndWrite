import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {

    public ReadAndWrite(String inputFile) throws IOException {
        File file = new File(inputFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        int character;
        while ((character = reader.read()) != -1) {
            sb.append((char) character);
        }
        reader.close();
    }

    public void write(String strFile, String str) throws IOException {
        PrintWriter writer = new PrintWriter(strFile);
        writer.println(str);
        writer.close();
    }
}