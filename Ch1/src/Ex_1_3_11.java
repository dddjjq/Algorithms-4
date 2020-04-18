import java.util.Stack;

public class Ex_1_3_11 {
    public static void main(String[] args) {
        System.out.println(getValue("5+2*(3*(3-1*2+1))"));
    }

    public static int getValue(String s) {
        String change = change(s);
        Stack<Integer> vals = new Stack<>();
        char[] chars = change.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                vals.push(c - '0');
            } else {
                int val1 = vals.pop();
                int val2 = vals.pop();
                switch (c) {
                    case '+':
                        vals.push(val2 + val1);
                        break;
                    case '-':
                        vals.push(val2 - val1);
                        break;
                    case '*':
                        vals.push(val2 * val1);
                        break;
                    case '/':
                        vals.push(val2 / val1);
                        break;
                }
            }
        }
        return vals.pop();
    }

    public static String change(String s) {
        char[] chars = s.toCharArray();
        String resultString = "";
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                resultString += c;
                continue;
            }
            // ( * / 直接入栈
            if (c == '('
                    || c == '*' || c == '/') {
                stack.push(c);
                continue;
            }
            // + - 存在优先级情况，所以判断后再入栈
            if (c == '+' || c == '-') {
                if (!stack.isEmpty() &&
                        (stack.peek() == '*' || stack.peek() == '/')) {
                    while (!stack.empty() && stack.peek() != '(') {
                        resultString += stack.pop();
                    }
                }
                stack.push(c);
            }
            //) 所有弹出直到遇见(
            if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    resultString += stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            resultString += stack.pop();
        }
        return resultString;
    }
}
