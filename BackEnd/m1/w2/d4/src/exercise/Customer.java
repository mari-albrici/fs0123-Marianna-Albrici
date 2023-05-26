package exercise;

public class Customer {

	private Long id = (long) (Math.random() * 10000);
	private String name;
	private int tier;
	
	public Customer ( String name, int tier) {
		this.name = name;
		this.tier = tier;
	}
	
	public void getCustumerInfo() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("TIER: " + tier);
	}
	
	public int getCustomerTier() {
		return tier;
	}
	
	public String getCustomerName() {
		return name;
	}
}
