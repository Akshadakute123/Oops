package Com.Bridgelabz.oops.commercialdata;

import java.time.LocalDateTime;

public class Transaction 
{
   public String company_name;
   public int number_of_companyshares;
   public String customer_name;
   public int no_of_customershares;
   public LocalDateTime datetime;
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public int getNumber_of_companyshares() {
	return number_of_companyshares;
}
public void setNumber_of_companyshares(int number_of_companyshares) {
	this.number_of_companyshares = number_of_companyshares;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public int getNo_of_customershares() {
	return no_of_customershares;
}
public void setNo_of_customershares(int no_of_customershares) {
	this.no_of_customershares = no_of_customershares;
}
public LocalDateTime getDatetime() {
	return datetime;
}
public void setDatetime(LocalDateTime datetime) {
	this.datetime = datetime;
}
@Override
public String toString() {
	return "Transaction [company_name=" + company_name + ", number_of_companyshares=" + number_of_companyshares
			+ ", customer_name=" + customer_name + ", no_of_customershares=" + no_of_customershares + ", datetime="
			+ datetime + "]";
}
   
   
}
