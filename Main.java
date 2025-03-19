import jdk.internal.loader.BuiltinClassLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\b[1-9][0-9]*\\b");
        String StringToCheck ="0123 123 0456 999 851 0214 01 0 52 10 1520";
        Matcher matcher = pattern.matcher(StringToCheck);

        List<String> MatchingInts=new ArrayList<>();
        while (matcher.find()) {
            MatchingInts.add(matcher.group());
        }
        System.out.println("Ints: " + MatchingInts);
    };
}