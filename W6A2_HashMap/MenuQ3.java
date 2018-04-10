package W6A2_HashMap;

public class MenuQ3 {
	private String item;
	private Integer qty;
	
	public MenuQ3() {          // constructor
		super();
	}

	public MenuQ3(String item) {
		super();
		this.item = item;
		this.qty = 0;         // initialize quantity to zero  
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public void addQty(Integer qty) {
		this.qty += qty;         // initialize quantity to zero  
	}
}
