import jdk.internal.loader.BuiltinClassLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String stringToCheck ="al-a ma k;ot::::::a, kot ma duzy dom, maciek ma krolika, krolik ma,malydom";
        String[] tokens = stringToCheck.split("\\s+|\\p{P}+");
        for (String token : tokens) {
            System.out.println(token);
        }
    };
}