package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//COMENTADO PORQUE A CLASSE ESTÁ ABSTRATA
		
//		Account acc = new Account(1001, "Alex", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//		
//		//UPCARGING - É converter um objeto da SubClassepara a Superclasse 
//		
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		//DOWCASTING - É converter um objeto da superclasse para a subClasse
//		
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
//		//BusinessAccount acc5 = (BusinessAccount) acc3; nesse caso o compilador não sabe que a SavingsAccount não pertence a classe BusinessAccount
//		// o trecho abaixo testa se é possível haver uma instancia entre as classes
//		
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(200.0);
//			System.out.println("Emprestimo!");
//		}
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount)acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
//		

		
	
	}

}
