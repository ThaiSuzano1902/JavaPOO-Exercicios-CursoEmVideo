package ContaBanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    //Métodos Acessiveis, Especiais
    //Get le dados
    //Set escreve com controle
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
    //Método Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    //Métodos()
        //public String ??
        public void abrirConta(String t) {
            setTipo(t);
            setStatus(true);
            if (t == "CC") {
               // saldo += 50;
                System.out.println("Conta aberta com sucesso!!");
                this.setSaldo(50);
                } else if (t == "CP") {
               // saldo = saldo + 50;
                this.setSaldo(150);
                System.out.println("Conta aberta com sucesso!!");
            }
        }
    public void fecharConta(){
        if (this.getSaldo() > 0f) {
            System.out.println("Atenção, conta com saldo");
        } else if (getSaldo() < 0f){
            System.out.println("Conta em débito");
        } else {
            System.out.println("Conta encerrada com sucesso");
            this.setStatus(false);
        }
    }

    public void depositar(float v){
        if (this.isStatus()) {
            System.out.println("Deposite o seu valor");
            //saldo = saldo + v;
            setSaldo((getSaldo() + v));
            //Modifique o saldo atual (set) e some com o valor atual (get) + v
        } else {
            System.out.println("A sua conta" + tipo + ("Está fechada"));
        }
    }
    public void sacar(float v){
        if (this.isStatus()) {
            if(this.getSaldo() >= v) {
                //System.out.println("Digite o valor de saque");
                //Modifique o saldo e suvtraia o valor v pelo saldo atual (getSaldo)
                setSaldo((getSaldo() - v));
                System.out.println("Saque realizado na conta de: " + this.getDono() );
            } else {
                System.out.println("Não há saldo em sua conta " );
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = v + 12;
        } else if (this.getTipo() == "CP") {
            v = v + 20;
        } if (this.isStatus()) {
            setSaldo((getSaldo() - v));
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossivel pagar");
        }
    }

}
