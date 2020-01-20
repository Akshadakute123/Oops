package com.Bridgelabz.oops.Inventory;

public class Inventory 
{
   String name;
   double price;
   double weight;
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public double getPrice() 
{
	return price;
}
public void setPrice(double price) 
{
	this.price = price;
}
public double getWeight() 
{
	return weight;
}
public void setWeight(double weight)
{
	this.weight = weight;
}
@Override
public String toString() 
{
	return "Inventory [name=" + name + ", price=" + price + ", weight=" + weight + "]";
}

   
	
	
}
