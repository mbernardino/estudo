package com.ciandt.testews;

import java.util.List;

import javax.jws.WebService;

import com.ciandt.testews.business.ProductServiceImpl;
import com.ciandt.testews.model.Product;

@WebService(endpointInterface="com.ciandt.testews.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServer = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.ciandt.testews.ProductCatalogInterface#geProductCategories()
	 */
	@Override
	public List<String> geProductCategories(){
		return productServer.getProductCategories();
	}
	/* (non-Javadoc)
	 * @see com.ciandt.testews.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productServer.getProducts(category);
	}
	/* (non-Javadoc)
	 * @see com.ciandt.testews.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product){
		return productServer.addProduct(category, product);
	}

	/* (non-Javadoc)
	 * @see com.ciandt.testews.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return productServer.getProductsv2(category);
	}	
	
}
