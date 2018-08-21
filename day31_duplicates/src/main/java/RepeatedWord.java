import java.util.HashSet;

public class RepeatedWord {

    public static String repeatedWord(String string) {
        HashSet<String> setString = new HashSet<>();
        string = string.toLowerCase();
        String[] arrayString = string.split("\\W+");
        for (int i = 0; i < arrayString.length - 1; i++) {
            String iteratedString = arrayString[i];
            if (setString.contains(iteratedString)) {
                return iteratedString;
            } else {
                setString.add(iteratedString);
            }
        }
        return "String has no repeats";
    }
}
