package funcLampada;

import java.util.Scanner;

public class TestLampada {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Lampada minhaLampada = new Lampada();

	        while (true) {
	            System.out.println("Digite a opcao desejada:");
	            System.out.println("1 - Ligar a lampada");
	            System.out.println("2 - Desligar a lampada");
	            System.out.println("3 - Sair");
	            String entrada = scanner.nextLine();
	            

	            if (entrada.equals("1")) {
	                minhaLampada.ligar();
	            } else if (entrada.equals("2")) {
	                minhaLampada.desligar();
	            } else if (entrada.equals("3")) {
	                System.out.println("Encerrando o programa...");
	                break;
	            } else {
	                System.out.println("Opcao invalida. Por favor, digite uma opcao valida.");
	            }
	        }

	        scanner.close();
	    }
	}