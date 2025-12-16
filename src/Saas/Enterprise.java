package Saas;

public class Enterprise extends Signature{
    public Enterprise(Integer quantityPeopleWorkingAtThisSaas) {
        super(quantityPeopleWorkingAtThisSaas);
        this.setUserLimitNumber(quantityPeopleWorkingAtThisSaas);
        this.setPricePerMonth(300.00);
        this.typeSignatureAccount = TYPE_SIGNATURE.ENTERPRISE;
    }
}
