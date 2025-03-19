import jdk.internal.loader.BuiltinClassLoader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".*cat.*");
        String StringToCheck ="cataaaacatttt";
        Matcher matcher = pattern.matcher(StringToCheck);

        if (matcher.find()) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    };
}