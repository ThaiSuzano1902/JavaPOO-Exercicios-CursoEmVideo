package praticando04;

public class Garrafa {
    //criando atributos
    private String Garrafa;
    public String cor;
    private String marca;
    private int qtdMl;
    private boolean tampada;

    public Garrafa(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
        this.tampada = true;
    }


    public void escrever() {
        if (this.tampada) {
            System.out.println("Não posso beber água agora, a Garrafa está tampada");
        } else {
            System.out.println("Estou bebendo a minha água na garrafa : " + this.marca + " de cor " + this.cor + "e marca: " + this.marca);
        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Garrafa tampada.");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Garrafa Destampada");
    }

    // Getters e Setters
    //Evita que atributos importantes sejam alterados de forma incorreta.
    //Getter	Ler o valor	console.log(pessoa.nome)
    //Setter	Alterar com controle	pessoa.nome = "Novo nome"
    public String getCor() {
        return cor;
    }
    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getQtdMl() {
        return qtdMl;
    }

    public void setQtdMl(int qtdMl) {
        this.qtdMl = qtdMl;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
// commit de teste para garantir push

