package exceptionHanlding;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TryCatchTest {
    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.println(names[9]);
        int a = 10 / 0;
        Path path = Paths.get("src/main/resources/shakespeare.txt");
//        List contents = Files.readAllLines(path);
    }
}
