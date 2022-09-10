package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService feeService;

    public ContractService(OnlinePaymentService feeService) {
        this.feeService = feeService;
    }

    public void processContract (Contract contract, int months) {
        double installmentAmount = contract.getTotalValue()/months;
        for (int i = 0; i<months; i++) {
            Calendar calAux = Calendar.getInstance();
            Date dateInstallment = contract.getDate();
            calAux.setTime(dateInstallment);
            calAux.add(Calendar.MONTH, i + 1);
            dateInstallment = calAux.getTime();


            Double amount = feeService.paymentFee(feeService.interest(installmentAmount, i + 1));

            Installment installment = new Installment(dateInstallment, amount);

            contract.addInstallmentList(installment);
        }
    }
}
