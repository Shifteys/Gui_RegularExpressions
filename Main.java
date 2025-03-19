import jdk.internal.loader.BuiltinClassLoader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\."+
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ipv4check.txt"))){
            String line;
            System.out.println("correct ipv4s: ");
            while ((line = bufferedReader.readLine()) !=null){
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            System.out.println("error w file" + e.getMessage());
        }
    };
}