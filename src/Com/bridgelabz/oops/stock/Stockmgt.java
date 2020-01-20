package Com.bridgelabz.oops.stock;

import org.codehaus.jackson.annotate.JsonProperty;

public class Stockmgt 
{
	String Stockname;
	int no_of_shares;
	int price;
	public String getStockname() {
		return Stockname;
	}
//	public void setStockname(String stockname) {
//		Stockname = stockname;
//	}
	public int getNo_of_shares() {
		return no_of_shares;
	}
	public void setNo_of_shares(int no_of_shares) {
		this.no_of_shares = no_of_shares;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@JsonProperty("Stockname")
	public void setStockname(String Stockname)
	{
		this.Stockname=Stockname;
		
	}
	
}