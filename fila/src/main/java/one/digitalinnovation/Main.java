package one.digitalinnovation;

public class Main {

    public static void main(String args[]) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro nó");
        minhaFila.enqueue("segundo nó");
        minhaFila.enqueue("terceiro nó");
        minhaFila.enqueue("quarto nó");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

    }
}
