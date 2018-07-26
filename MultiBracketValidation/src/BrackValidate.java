import java.util.Stack;

public class BrackValidate {


    public static boolean multiBracketValidator(String string) {
        boolean result = true;
        if (string.equals("")){
            System.out.println("Balanced but Empty");
            return true;
        }
        Stack<Character> openBracketStack = new Stack<>();
        char current, previous;
        for (int i = 0; i < string.length(); i++) {
            current = string.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                openBracketStack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (openBracketStack.isEmpty()) {
                    result = false;
                    break;
                } else {
                    previous = openBracketStack.peek();
                    if ((current == ')' && previous == '(') ||
                            (current == ']' && previous == '[')
                            || (current == '}' && previous == '{')) {
                        openBracketStack.pop();
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        if (!openBracketStack.isEmpty()) {
                result = false;
        }
        return result;
    }
}


