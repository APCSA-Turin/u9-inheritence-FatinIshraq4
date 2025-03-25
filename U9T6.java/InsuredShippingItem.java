public class InsuredShippingItem extends ShippingItem {
    private double insuredAmount;

    public InsuredShippingItem(double w, double insAmt) {
        super(w);
        insuredAmount=insAmt;
    }


    public double getInsuredAmount() {
        return insuredAmount;
    }

    public double getCost() {
        double ans = super.getCost();
        return ans+insuredAmount;
    }

    
    public void addMoreInsurance(double amt) {
        insuredAmount += amt;
    }
}
