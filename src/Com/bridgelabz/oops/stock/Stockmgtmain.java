package Com.bridgelabz.oops.stock;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Stockmgtmain 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	 {
		 char ch='y';
		 Scanner scan=new Scanner(System.in);
		 StockImplementation stockimp=new StockImplementation();
		 List<Stockmgt>list= stockimp.readfile();
		 for (int i = 0; i < list.size(); i++)
			{
				System.out.println(list.get(i).getStockname()+"\nprice "+list.get(i).getPrice()+"\n no of shares"+list.get(i).getNo_of_shares());
				//System.out.println(list.get(i).getPrice()*list.get(i).getWeight());
			}
		 do {
			 
		 System.out.println("enter 1 to add stock\n enter 2 to remove stock\nenter 3 to update");
		 System.out.println("enter your choice");
		 int choice=scan.nextInt();
		 switch(choice)
		 {
		 case 1 :
			 List<Stockmgt>add= stockimp.readfile();
		     List<Stockmgt>add1= stockimp.addStock(add);
		     stockimp.writeFile(add1);
				break;
		 case 2:
			 List<Stockmgt>remove= stockimp.readfile();
			 List<Stockmgt>removed= stockimp.removeStock(remove);
			 stockimp.writeFile(removed);
				break;
		 case 3:
			 List<Stockmgt>update1= stockimp.readfile();
			 List<Stockmgt>updated= stockimp.update(update1);
			 stockimp.writeFile(updated);
			 break;
			 default:
				 System.out.println("please enter valid information");
		 }
		 }
		
		while(ch == 'y');
			}

}
