import java.util.Stack;

public class TestaPilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // Adicionar elemento
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        // Verificar o tamanho da pilha
        System.out.println(pilha.size());

        // Imprimir elementos da pilha
        System.out.println(pilha);

        // Topo da pilha
        System.out.println(pilha.getLast());

        // Verificar se existe elemento na pilha
        System.out.println(pilha.search(1));

        // Excluir elemento
        System.out.println(pilha.pop());
        System.out.println(pilha);
    }
}
