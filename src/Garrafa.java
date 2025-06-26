public class Garrafa {
    String cor;
    String marca;
    float valor;
    int quantidade;
    boolean tampar;

    void quebraDeLinha () {
        System.out.println("-------------------------------------");
    }
    void status () {
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Valor: " + this.valor);
        System.out.println("Quantidade (ml): " + this.quantidade);
        System.out.println("Está aberto? " + this.tampar);
    }

    void aberto () {
        if (this.tampar == true) {
            System.out.println("Beber água");
        } else {
            System.out.println("ERRO!! A garrafa está tampada");
        }
    }

    void tampado () {
        this.tampar = false;
    }
    void destampado () {
        this.tampar = true;
    }

}
