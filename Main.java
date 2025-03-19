import jdk.internal.loader.BuiltinClassLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String stringToCheck ="\nAla\t ma Kota\n i \npsa a pies ma ogon\n \t kot tez ma ogon";
        String result = stringToCheck.replaceAll("\\s+","");

        System.out.println("Result : " + result);
    };
}