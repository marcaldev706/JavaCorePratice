package Saas;

public  class Signature {
    protected boolean signatureState = false;
    protected Double pricePerMonth;
    protected Integer userLimitNumber;
    protected TYPE_SIGNATURE typeSignatureAccount;
    protected   STATE_SIGNATURE state;

    public Signature(Integer quantityPeopleWorkingAtThisSaas) {
        this.setSignatureState(true);
        this.pricePerMonth = pricePerMonth;
        this.userLimitNumber = userLimitNumber;
        this.typeSignatureAccount = typeSignatureAccount;
    }

    public Signature() {
        this.setSignatureState(true);
        this.pricePerMonth = pricePerMonth;
        this.userLimitNumber = userLimitNumber;
        this.typeSignatureAccount = typeSignatureAccount;
    }

    private void setSignatureState(boolean signatureState) {
        this.signatureState = signatureState;
    }

    protected STATE_SIGNATURE getState() {
        return state;
    }

    protected void setUserLimitNumber(Integer userLimitNumber) {
        this.userLimitNumber = userLimitNumber;
    }

    protected void setPricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    protected Double getPricePerMonth() {
        return pricePerMonth;
    }

    protected Integer getUserLimitNumber() {
        return userLimitNumber;
    }

    protected TYPE_SIGNATURE getTypeSignatureAccount() {
        return typeSignatureAccount;
    }

    protected void setState(STATE_SIGNATURE state) {
        this.state = state;
    }

    public void showAccountInformation(){
       if(this.getState().equals(true)){
           this.setState(STATE_SIGNATURE.ACTIVE);
           System.out.println("Account signature: " + this.getTypeSignatureAccount());
           System.out.println("Limit users: " + this.getUserLimitNumber());
           System.out.println("Price per month: " + String.format("%.2f", this.getPricePerMonth()));
       }else if(this.getState().equals(false)){
           this.setState(STATE_SIGNATURE.SUSPENDED);
           System.out.println("Signature suspended, no information to show! ");
       }
    }


    public void cancelSignature(){
        if(this.getState().equals(true)){
            this.setSignatureState(false);
            this.setState(STATE_SIGNATURE.CANCELED);
        }else{
            System.out.println("Account not actived! ");
        }
    }




}
