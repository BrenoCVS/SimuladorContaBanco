import java.util.Scanner; 

public class ContaBanco {

    String nome, agencia;
    int numero;
    double saldo;

    public void setNomeCliente(String nome) {
        this.nome = nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mensagem() {
        System.out.println(
            "Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."
        );
    }
}
