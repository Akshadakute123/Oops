package Com.bridgelabz.oops.stock;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.Bridgelabz.oops.Inventory.Inventory;



public class StockImplementation implements StockInterface

{
	Scanner sc = new Scanner(System.in);
	Stockmgt stock=new Stockmgt();
	
	//List<Inventory> list = new ArrayList<Inventory>();
	ObjectMapper objectMapper = new ObjectMapper();
	File file = new File("/home/admin1/Akshada/OopsProject/src/Com/bridgelabz/oops/stock/Stockmgte.json");

	public List<Stockmgt> readfile() throws JsonParseException, JsonMappingException, IOException {
		List<Stockmgt>list=objectMapper.readValue(file,new TypeReference<List<Stockmgt>>() {
		});
		return list;

	}

	@SuppressWarnings("deprecation")
	public void writeFile(List<Stockmgt> list) throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.defaultPrettyPrintingWriter().writeValue(file, list);
	}

	@Override
	public List<Stockmgt> addStock(List<Stockmgt> list) 
	{
		System.out.println("enter the name of stock");
		stock.setStockname(sc.next());
		System.out.println("enter the price");
		stock.setPrice(sc.nextInt());
		System.out.println("enter the number of shares");
		stock.setNo_of_shares(sc.nextInt());
		list.add(stock);
		return list;
	}

	@Override
	public List<Stockmgt> removeStock(List<Stockmgt> list) {
		boolean find=false;
		System.out.println("enter the name which you want to delete");
		String name=sc.next();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getStockname().equalsIgnoreCase(name))
			{
				list.remove(i);
				find=true;
			}		
		}
		return list;
	}

	@Override
	public List<Stockmgt> update(List<Stockmgt> list) 
	{
		System.out.println("enter the stock name which you want to update");
       	String names=sc.next();
       	for (Stockmgt stockmgt : list) 
       	{
       	 	if(stockmgt.getStockname().equalsIgnoreCase(names))
       	 	{
       	 		System.out.println("enter updated name");
       	 		  stockmgt.setStockname(sc.next());
       	 		System.out.println("enter updated shares");
       	 	     stockmgt.setNo_of_shares(sc.nextInt());
       	 	 System.out.println("enter updated price");
  	 		  stockmgt.setPrice(sc.nextInt());
  	 		  
       	 	}
		}
      
	
		
		return list;
	}
	public List<Stockmgt> calculate(List<Stockmgt> list) 
	{
	int [] counts=new int[10];
	int sum=0;
		  for (int i = 0; i < list.size(); i++)
		  {
			//System.out.println(list.get(i).getStockname()+" ");
		int totalcount=list.get(i).getNo_of_shares()*list.get(i).getPrice();
			
				//counts[j]=list.get(i).getNo_of_shares()*list.get(i).getPrice();
						sum=sum+list.get(i).getNo_of_shares()*list.get(i).getPrice();;
				
			
		}
		  System.out.println("sum of total comapnies"+sum);
			
			return list;
		}
		

}
