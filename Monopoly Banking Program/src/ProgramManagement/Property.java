package ProgramManagement;

public class Property 
{
	private String propertyName, propertyGroup;
	private int[] rentAmount;
	private int houseCount, mortgageAmount, price, housePrice;
	private boolean isMortgaged, isOwned;
	
	public Property(String name, String group, 
			int[] amt, int hCount, int mAmt, int price, int hPrice, 
			boolean isMort, boolean isOwn)
	{
		propertyName = name;
		propertyGroup = group;
		rentAmount = amt;
		houseCount = hCount;
		mortgageAmount = mAmt;
		housePrice = hPrice;
		isMortgaged = isMort;
		isOwned = isOwn;
	}
	
	
	
	public String getPropertyName() {
		return propertyName;
	}

	public String getPropertyGroup() {
		return propertyGroup;
	}

	public int[] getRentAmount() {
		return rentAmount;
	}

	public int getHouseCount() {
		return houseCount;
	}

	public int getMortgageAmount() {
		return mortgageAmount;
	}

	public boolean isMortgaged() {
		return isMortgaged;
	}

	public boolean isOwned() {
		return isOwned;
	}
	
	
}
