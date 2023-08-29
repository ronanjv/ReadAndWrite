import java.io.IOException;

public class ReadAndWriteTester {
    public static void main(String[] args) throws IOException {
        ReadAndWrite rw = new ReadAndWrite("readandwritetest.txt");
        rw.write("test.txt", "abcdefg");
        System.out.println(rw.getString());
    }
}
