public class ListaCircular {
    private No cabeca = null;
    private No cauda = null;


    public void adicionar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
            cauda.proximo = cabeca; 
        } else {
            cauda.proximo = novoNo;
            cauda = novoNo;
            cauda.proximo = cabeca; 
        }
    }


    public void exibir() {
        No atual = cabeca;
        if (cabeca != null) {
            do {
                System.out.print(" " + atual.dado);
                atual = atual.proximo;
            } while (atual != cabeca);
            System.out.println();
        }
    }

    public boolean estaVazia() {
        return cabeca == null;
    }


    public int tamanho() {
        if (cabeca == null) return 0;
        No atual = cabeca;
        int contador = 0;
        do {
            contador++;
            atual = atual.proximo;
        } while (atual != cabeca);
        return contador;
    }
}
