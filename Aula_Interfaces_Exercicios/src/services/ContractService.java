package services;

import java.lang.management.MonitorInfo;
import java.time.LocalDate;
import java.time.Month;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int mounths) {
		
		double basicQuota = contract.getTotalValue() / mounths;
		for(int i = 1;  i <= mounths; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
 

		
		
		
	}

}
