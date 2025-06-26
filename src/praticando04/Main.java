package praticando04;

public class Main {
    public static void main(String[] args) {
        Garrafa c1 = new Garrafa("Roxo", "Modus");

      //  c1.escrever();      // não escreve, pois está tampada
        c1.destampar();
        c1.escrever();      // agora escreve
        c1.tampar();
    }
}