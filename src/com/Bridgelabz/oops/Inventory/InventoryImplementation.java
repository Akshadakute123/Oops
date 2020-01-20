package com.Bridgelabz.oops.Inventory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

//import com.sun.tools.javac.util.List;

public class InventoryImplementation implements InventoryInterface {
	Scanner sc = new Scanner(System.in);
	Inventory inventory=new Inventory();
	//List<Inventory> list = new ArrayList<Inventory>();
	ObjectMapper objectMapper = new ObjectMapper();
	File file = new File("/home/admin1/eclipse-workspace/OopsProject/src/com/Bridgelabz/oops/Inventory/Inventory.json");

	public List<Inventory> readfile() throws JsonParseException, JsonMappingException, IOException {
		List<Inventory> list = objectMapper.readValue(file, new TypeReference<List<Inventory>>() {
		});

		return list;

	}

	@SuppressWarnings("deprecation")
	public void writeFile(List<Inventory> list) throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.defaultPrettyPrintingWriter().writeValue(file, list);
	}

	@Override
	public List<Inventory> addinventory(List<Inventory> list) {
		//Inventory inventory = new Inventory();
		System.out.println("enter the name of product");
		inventory.setName(sc.next());
		System.out.println("enter the price");
		inventory.setPrice(sc.nextDouble());
		System.out.println("enter the weight");
		inventory.setWeight(sc.nextDouble());
		list.add(inventory);
		return list;
		

	}

	@Override
	public List<Inventory> removeInventory(List<Inventory> list) 
	{
		boolean find=false;
		System.out.println("enter the inventory name which you want to delete");
		String name1=sc.next();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(name1))
			{
				list.remove(i);
				find=true;
			}
		}
		
		return list;
	}

	@Override
	public List<Inventory> calculate(List<Inventory> list) {
	  for (int i = 0; i < list.size(); i++)
	  {
		System.out.println(list.get(i).getName()+" "+list.get(i).getPrice()*list.get(i).getWeight());
	}
		return list;
	}
	

//	@Override
//	public double totalWeight(List<Inventory>list)
//	
//	{
//		double totalweight=0;
//		for (Inventory inventory : list) 
//		{
//			totalweight=totalweight+inventory.getWeight();
//		}
//
//		return totalweight ;
//	}

	}

	


