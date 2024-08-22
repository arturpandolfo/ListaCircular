public class Main {
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();

        listaCircular.adicionar(1);
        listaCircular.adicionar(2);
        listaCircular.adicionar(3);
        listaCircular.adicionar(4);

        listaCircular.exibir();
        System.out.println("Tamanho: " + listaCircular.tamanho());
    }
}
