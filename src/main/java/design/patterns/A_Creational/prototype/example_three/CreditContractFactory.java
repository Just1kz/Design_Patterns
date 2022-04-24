package design.patterns.A_Creational.prototype.example_three;

import design.patterns.A_Creational.prototype.example_one.CreditContract;

public class CreditContractFactory implements Copyable {
    private CreditContract creditContract;

    public CreditContractFactory(CreditContract creditContract) {
        this.creditContract = creditContract;
    }

    @Override
    public Object copy() {
        return creditContract.clone() ;
    }
}
