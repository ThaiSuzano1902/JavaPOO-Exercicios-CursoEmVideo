public class Main {
    public static void main(String[] args) {
        Garrafa  c1 = new Garrafa();  // Criando um objeto (instância da classe Garrafa)

        // Configurando os atributos do objeto c1

        c1.cor = "Roxo";
        c1.marca = "Modus";
        c1.valor = 67.99F;
        c1.quantidade = (int) 700;
        c1.tampar = false;

        // Chamando os métodos do objeto c1
        c1.status(); // métodos
        c1.aberto();
        c1.tampado();

        c1.quebraDeLinha();
        Garrafa c2 = new Garrafa ();
        c1.cor = "Ciinza";
        c1.marca = "Stanley";
        c1.valor = 49.99F;
        c1.quantidade = (int) 500;
        c1.tampar = true;

        c1.status();
        c1.aberto();
        c1.destampado();

    }
}