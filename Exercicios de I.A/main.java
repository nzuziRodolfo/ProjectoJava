import java.util.ArrayList;
import java.util.Scanner;

// Classe ContaBancaria
class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

// Classe Banco
class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}

// Classe principal
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("\n1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Nome do titular: ");
                sc.nextLine(); // limpar buffer
                String nome = sc.nextLine();
                System.out.print("Número da conta: ");
                int numero = sc.nextInt();
                ContaBancaria conta = new ContaBancaria(nome, numero);
                banco.adicionarConta(conta);
                System.out.println("Conta criada com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Número da conta: ");
                int numero = sc.nextInt();
                ContaBancaria conta = banco.buscarConta(numero);
                if (conta != null) {
                    System.out.print("Valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depósito realizado!");
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } else if (opcao == 3) {
                System.out.print("Número da conta: ");
                int numero = sc.nextInt();
                ContaBancaria conta = banco.buscarConta(numero);
                if (conta != null) {
                    System.out.print("Valor para sacar: ");
                    double valor = sc.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } else if (opcao == 4) {
                System.out.print("Número da conta: ");
                int numero = sc.nextInt();
                ContaBancaria conta = banco.buscarConta(numero);
                if (conta != null) {
                    System.out.println("Saldo: " + conta.getSaldo());
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}