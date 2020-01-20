package com.Bridgelabz.oops.Inventory;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class InventoryMain 
{
 public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
 {
	 char ch='y';
	 Scanner scan=new Scanner(System.in);
	 InventoryImplementation im=new InventoryImplementation();
	 List<Inventory>list=im.readfile();
	 for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getName()+"\nprice "+list.get(i).getPrice()+"\n weight"+list.get(i).getWeight());
			System.out.println(list.get(i).getPrice()*list.get(i).getWeight());
		}
	 do {
		 
	 System.out.println("enter 1 to add inventory\n enter 2 to remove inventory\nenter 3 to calculate");
	 System.out.println("enter your choice");
	 int choice=scan.nextInt();
	 switch(choice)
	 {
	 case 1 :
		 List<Inventory>add=im.readfile();
	     List<Inventory>add1=im.addinventory(add);
			im.writeFile(add1);
			break;
	 case 2:
		 List<Inventory>remove=im.readfile();
		 List<Inventory>removed=im.removeInventory(remove);
			im.writeFile(removed);
			break;
	 case 3:
		 List<Inventory>cal=im.readfile();
		 List<Inventory>calculated=im.calculate(cal);
		 break;
		 default:
			 System.out.println("please enter valid information");
	 }
	 }
	
	while(ch == 'y');
		}
	 
}

