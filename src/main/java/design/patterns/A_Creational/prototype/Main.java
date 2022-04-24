package design.patterns.A_Creational.prototype;

import design.patterns.A_Creational.prototype.example_one.CreditContract;
import design.patterns.A_Creational.prototype.example_one.PaymentType;
import design.patterns.A_Creational.prototype.example_three.CreditContractFactory;
import design.patterns.A_Creational.prototype.example_two.SaleContract;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CreditContract creditContract = new CreditContract();
        creditContract.setId("1");
        creditContract.setCost(1);
        creditContract.setDate(new Date());
        creditContract.setPercent(5.05);
        creditContract.setPaymentType(PaymentType.ANNUITY);

        CreditContract creditContractCopy = (CreditContract) creditContract.clone();
        creditContractCopy.setId("2");
        creditContractCopy.setPaymentType(PaymentType.DIFFERENTIAL);

        CreditContractFactory creditContractFactory = new CreditContractFactory(creditContractCopy);
        CreditContract creditContractCopyOfFactory = (CreditContract) creditContractFactory.copy();
        creditContractCopyOfFactory.setId("3");

        SaleContract saleContract = new SaleContract("4", 1, new Date());
        SaleContract saleContractCopy = saleContract.clone();
        saleContractCopy.setId("5");

        System.out.println(creditContract);
        System.out.println("==============================");
        System.out.println(creditContractCopy);
        System.out.println("==============================");

        System.out.println(creditContractCopyOfFactory);
        System.out.println("==============================");

        System.out.println(saleContract);
        System.out.println("==============================");
        System.out.println(saleContractCopy);
        System.out.println("==============================");
        System.out.println("Вывод сделан в конце исполнения инструкций преднамеренно чтобы наглядно продемонстрировать, " +
                "что изменяя состояние объектов мы работаем уже с копиями и изменив состояние копии, не меняется состояние первичного объекта");
    }
}
