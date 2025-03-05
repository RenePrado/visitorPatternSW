public interface TelcoSubscription{
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean getUnliCallText();
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallsTextOffer offer, boolean unliCallText);
}
