package ContaBanco;

public class Main {
    public static void main(String[] args) {
        //cc conta corrente e cp conta poupança
        ContaBanco p1 = new ContaBanco(); //criando objeto instanciando uma classe
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        p1.depositar(100);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

        p2.pagarMensalidade();
    }
}

//A Vantagem da POO, A classe pode ser utilizada em outro codigo sem vazamento de dados.