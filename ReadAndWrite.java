import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {
    StringBuilder sb;

    public ReadAndWrite(String inputFile) throws IOException {
        File file = new File(inputFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        sb = new StringBuilder();
        int character;
        while ((character = reader.read()) != -1) {
            sb.append((char) character);
        }
        reader.close();
    }

    public String getString() {
        return sb.toString();
    }

    public void write(String strFile, String str) throws IOException {
        PrintWriter writer = new PrintWriter(strFile);
        writer.println(str);
        writer.close();
    }

    public int countCharacters(String fileName) throws FileNotFoundException, IOException {
        int count = 0;
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            count++;
            reader.read();
        }
        reader.close();
        return count - 1;
    }
}