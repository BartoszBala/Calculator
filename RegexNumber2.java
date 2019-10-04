package Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumber2 {


    public static double liczba2(String liczba) {
        String regex = "([0-9]+)+([^0-9])+([0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(liczba);
        Double liczba3 = (double) 0;
        if (matcher.find()) {

liczba3= Double.parseDouble(matcher.group(3));
        }
return liczba3;
    }

}
