package Com.Bridgelabz.oops.commercialdata;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Com.Bridgelabz.oops.commercialdata.Company;
import Com.Bridgelabz.oops.commercialdata.Customer;

public class Commersialimplementation {

	Company companyDetails = new Company();
	Customer customerDetails = new Customer();
	static ObjectMapper mapper = new ObjectMapper();
	// accessing json files
	File file1 = new File("/home/admin1/Akshada/OopsProject/src/Com/Bridgelabz/oops/commercialdata/Company1.json");
	File file2 = new File("/home/admin1/Akshada/OopsProject/src/Com/Bridgelabz/oops/commercialdata/Customer1.json");
	File file3 = new File("/home/admin1/Akshada/OopsProject/src/Com/Bridgelabz/oops/commercialdata/Transaction1.json");

	public List<Company> readFileCompany() throws JsonParseException, JsonMappingException, IOException { // reading company details json file
		List<Company> read = mapper.readValue(file1, new TypeReference<List<Company>>() { //mapping data with file
		});
		return read; // returning list of company data
	}

	public void writeFileCompany(List<Company> list)
			throws JsonGenerationException, JsonMappingException, IOException { //writing company details file in json file
		mapper.defaultPrettyPrintingWriter().writeValue(file1, list); //mapping data with json file
	}

	public List<Customer> readFileCustomer() throws JsonParseException, JsonMappingException, IOException { // reading customer details json file
		List<Customer> read = mapper.readValue(file2, new TypeReference<List<Customer>>() { //mapping data with file
		});
		return read; // returning list of customer data
	}

	public void writeFileCustomer(List<Customer> list)
			throws JsonGenerationException, JsonMappingException, IOException { //writing company details file in json file
		mapper.defaultPrettyPrintingWriter().writeValue(file2, list); //mapping data with json file
	}

	public List<Com.Bridgelabz.oops.commercialdata.Transaction> readFileTransaction() throws JsonParseException, JsonMappingException, IOException { // reading transaction details json file
		List<Com.Bridgelabz.oops.commercialdata.Transaction> read = mapper.readValue(file3, new TypeReference<List<Com.Bridgelabz.oops.commercialdata.Transaction>>() { //mapping data with file
		});
		return read; // returning list of transaction data
	}

	public void writeFileTransaction(List<Com.Bridgelabz.oops.commercialdata.Transaction> list)
			throws JsonGenerationException, JsonMappingException, IOException { //writing transaction details file in json file
		mapper.defaultPrettyPrintingWriter().writeValue(file3, list); //mapping data with json file
	}

}