import jdk.internal.loader.BuiltinClassLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String stringToCheck ="ala 'ma' kota, \"kot\" ma \"duzy\" dom, 'maciek' ma krolika, krolik ma 'm'\"aly\" 'dom'";
        Pattern pattern = Pattern.compile("(['\"])([^'\"\\\\]*?)\\1");
        Matcher matcher = pattern.matcher(stringToCheck);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    };
}