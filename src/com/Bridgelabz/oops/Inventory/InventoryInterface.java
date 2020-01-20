package com.Bridgelabz.oops.Inventory;

import java.util.List;

public interface InventoryInterface
{
	 
	

	List<Inventory> addinventory(List<Inventory> list);
	List<Inventory> removeInventory(List<Inventory>list);
	List<Inventory> calculate(List<Inventory>list);
	//double totalWeight(List<Inventory> list);
	
	

}
