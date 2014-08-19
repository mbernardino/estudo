package com.ciandt.testews;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ciandt.testews.model.Product;

@WebService(name="TestMartCatalog" , portName="TestMartCatalogPort", serviceName="TestMartCatalogService",
targetNamespace="http://testews.ciandt.com/")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> geProductCategories();
	
	@WebMethod
	public abstract List<String> getProducts(@WebParam(partName="category") String category);
	
	@WebMethod
	public abstract boolean addProduct(@WebParam(partName="category") String category, @WebParam(partName="product") String product);
	
	@WebMethod
	public abstract List<Product> getProductsv2(@WebParam(partName="category") String category);

}