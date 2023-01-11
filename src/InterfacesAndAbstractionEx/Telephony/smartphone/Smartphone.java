package InterfacesAndAbstractionEx.Telephony.smartphone;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\D+");
        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.matches()) {
                sb.append("Browsing: ").append(url).append("!");
            } else {
                sb.append("Invalid URL!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            sb.append(System.lineSeparator());
            if (matcher.matches()) {
                sb.append("Calling... ").append(number);
            } else {
                sb.append("Invalid number!");
            }
        }
        return sb.toString();
    }
}
