package conta;

import java.io.IOException;
import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// Teste classe conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		// Teste classe Conta Corrente

		ContaCorrente cc1 = new ContaCorrente(2, 123, 2, "Mariana", 15000.0f, 1000.0f);
		Scanner leia = new Scanner(System.in);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// Teste classe conta poupança

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(10000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		int opcao, numero, agencia, tipo, aniversario;
		float saldo,limite;
		String titular;

		while (true) {

			System.out.println(Cores.TEXT_BLUE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ " *****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				
				System.out.println("Número de agencia: \n\n");
				agencia = leia.nextInt();
				
				System.out.println("Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				System.out.println("Tipo de Conta (1-CC/ 2-CP)\n\n");
				tipo = leia.nextInt();
				
				System.out.println("Limite da conta corrente: \n\n");
				saldo = leia.nextFloat();
				
				System.out.println("Aniversário da conta poupança: \n\n");
				aniversario = leia.nextInt();
				

				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				keyPress();
				break;
			case 6:
				System.out.println("Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println("Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
