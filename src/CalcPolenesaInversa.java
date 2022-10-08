import java.util.*;

public class CalcPolenesaInversa {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);


    public static void calculadora() throws Exception {

        System.out.println("Calculadora polonesa pos-fixa");

        Entrada();
    }

    private static void Entrada() {
        String numero = " ";
        while (!numero.equals("x")) {
            System.out.println("Proxima entrada: ");
            numero = input.next();
            try {
                int intnumero = Integer.valueOf(numero);
                stack.push(intnumero);
            } catch (Exception e) {
                if (numero.equals("*")) {
                    stack.push(stack.pop() * stack.pop());

                } else if (numero.equals("/")) {
                    stack.push((int) stack.pop() / stack.pop());

                } else if (numero.equals("+")) {
                    stack.push(stack.pop() + stack.pop());

                } else if (numero.equals("-")) {
                    stack.push(stack.pop() - stack.pop());

                } else if (numero.equals("=")) {
                    System.out.println(stack.pop());

                } else if (numero.equals("operar")) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.println(stack.get(i));
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        try {
            calculadora();
        } catch (Exception e) {
            System.out.println("Nao funcionou... ");
        }

    }
}
