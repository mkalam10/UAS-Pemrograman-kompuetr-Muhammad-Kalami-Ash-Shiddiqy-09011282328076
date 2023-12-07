import java.util.Stack;

public class Soal9 {

    public static boolean isKurungValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Memeriksa kecocokan antara kurung buka dan tutup
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // Memastikan stack kosong setelah pengecekan
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((9 + 3) / 6)"; // Urutan kurung benar
        String expression2 = "((2 + 3) * 5"; // Kurung tutup kurang
        String expression3 = "((2 + 3) * 9))"; // Kurung buka kurang
        String expression4 = "((2 - 3) * 5]"; // Kurung buka dan tutup tidak cocok

        System.out.println(expression1 + " : " + isKurungValid(expression1));
        System.out.println(expression2 + " : " + isKurungValid(expression2));
        System.out.println(expression3 + " : " + isKurungValid(expression3));
        System.out.println(expression4 + " : " + isKurungValid(expression4));
    }
}
