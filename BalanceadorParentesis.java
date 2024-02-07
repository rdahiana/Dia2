import java.util.Stack;

public class BalanceadorParentesis {

    public static Boolean isBalanced(final String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == '{' || caracter == '(' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == '}' || caracter == ')' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char caracterPila = pila.pop();
                if (caracter == ')' && caracterPila != '(') return false;
                if (caracter == '}' && caracterPila != '{') return false;
                if (caracter == ']' && caracterPila != '[') return false;
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{}{}"));   // true
        System.out.println(isBalanced("{{}}"));   // true
        System.out.println(isBalanced("{}}{"));   // false
        System.out.println(isBalanced("({[()]()})}")); //true
        System.out.println(isBalanced("({[()]()})")); //false
    }
}

