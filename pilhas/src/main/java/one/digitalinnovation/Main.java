package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(dado: 1));
        minhaPilha.push(new No(dado: 2));
        minhaPilha.push(new No(dado: 3));
        minhaPilha.push(new No(dado: 4));
        minhaPilha.push(new No(dado: 5));
        minhaPilha.push(new No(dado: 6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);


    }
}
