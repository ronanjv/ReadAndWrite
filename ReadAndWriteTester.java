import java.io.IOException;

public class ReadAndWriteTester {
    public static void main(String[] args) throws IOException {
        ReadAndWrite rw = new ReadAndWrite("readandwritetest.txt");
        rw.write("test.txt", "hello this has 14");
        System.out.println(rw.getString());
        System.out.println(rw.countCharacters("test.txt"));
    }
}
