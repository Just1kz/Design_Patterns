package design.patterns.A_Creational.prototype;

import design.patterns.A_Creational.prototype.example_one.CreditContract;
import design.patterns.A_Creational.prototype.example_one.PaymentType;
import design.patterns.A_Creational.prototype.example_two.SaleContract;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CreditContract contract = new CreditContract();
        contract.setId("1");
        contract.setCost(1);
        contract.setDate(new Date());
        contract.setPercent(5.05);
        contract.setPaymentType(PaymentType.ANNUITY);

        CreditContract creditContract = (CreditContract) contract.clone();
        creditContract.setId("2");
        creditContract.setPaymentType(PaymentType.DIFFERENTIAL);

        System.out.println(contract);
        System.out.println("==============================");
        System.out.println(creditContract);
        System.out.println();

        SaleContract saleContract = new SaleContract("1", 1, new Date());
        SaleContract saleContractCopy = saleContract.clone();
        System.out.println(saleContract);
        System.out.println("==============================");
        System.out.println(saleContractCopy);
    }
}
