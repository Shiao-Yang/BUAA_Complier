package frontend.Lexer.Token;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "aaa132164b||  1agaaf  &&bb165165b";
        Pattern pattern;
        Matcher matcher;
        Symbol s;
        /*
        for(int i = 0; i < Symbol.values().length; i++) {
            s = Symbol.values()[i];
            pattern = Pattern.compile(s.getSymbol());
            matcher = pattern.matcher(str);
            while(matcher.find()) {
                //System.out.println(s+" : "+ s.getSymbol() + " " + matcher.matches());
                System.out.println(matcher.group(0));
            }

        }
         */
        s = Symbol.IDENFR;
        pattern = Pattern.compile(s.getSymbol());
        matcher = pattern.matcher(str);
        while(matcher.find()) {
            //System.out.println(s+" : "+ s.getSymbol() + " " + matcher.matches());
            System.out.println(matcher.group(0));
        }
    }
}
