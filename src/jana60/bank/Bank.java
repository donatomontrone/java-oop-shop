package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome completo");
		Conto conto1 = new Conto(in.nextLine());
		System.out.println("Ciao, " + conto1.getName() + " questo è il tuo saldo " 
						+ conto1.getBalance() + "€. Il tuo conto ha ID " 
						+ conto1.getAccountNumber() );
		
		int choise = 0;
		
		while(choise != 3) {
			System.out.println("Cosa vuoi fare?");
			System.out.println("1 - Versare");
			System.out.println("2 - Prelevare");
			System.out.println("3 - Uscire");
			choise = in.nextInt();
			
			if(choise == 1) {
				System.out.println("Inserisci la cifra che vuoi versare");
				int versamento = in.nextInt();
				if(versamento <= 0 ) {
					System.out.println("Impossibile versare una cifra negativa o nulla");
				} else {
					System.out.println("Versamento in corso...");
					conto1.deposit(versamento);
					System.out.println("Il tuo saldo attuale ammonta a " + conto1.getBalance() + "€");
				}
			} else if (choise == 2) {
				if (conto1.getBalance() > 0) {
					System.out.println("Inserisci la cifra che vuoi prelevare");
					int prelievo = in.nextInt();
					if(prelievo < 0 || prelievo > conto1.getBalance()) {
						System.out.println("Errore, credito insufficente o cifra errata!");
					} else {
						System.out.println("Prelievo in corso...");
						conto1.withdraw(prelievo);
						System.out.println("Il tuo saldo attuale ammonta a " + conto1.getBalance() + "€");
					}
				} else {
					System.out.println("Impossibile prelevare. Il tuo saldo è di " + conto1.getBalance() + "€");
				}
			} else if (choise != 3) {
		        System.out.println("Scelta non valida. Riprova.");
		    }
		}
		
		in.close();
		System.out.println("Grazie per averci scelto!");
	}
}
