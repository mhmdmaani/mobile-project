import com.google.common.base.CharMatcher;

public class MainClass {
    public static void main(String[] args) {
      String greetingText = "Grupp 11 osama and mohammad ";
        System.out.println(greetingText);
        CharMatcher matcher = CharMatcher.isNot('n');
        String result = matcher.retainFrom(greetingText);
        System.out.println(result);
    }
    }

