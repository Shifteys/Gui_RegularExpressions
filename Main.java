import jdk.internal.loader.BuiltinClassLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String stringToCheck ="Tu był Jan Kowalski i Maria Nowak. Za nimi wszedł Adam Wojcik.";
        String result = stringToCheck.replaceAll("\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b", "$2, $1");

        System.out.println("Result : " + result);
    };
}