package org.koushik.javabrains;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
	
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("You need to pass in one IP address...");
		}
		else{
			
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap(); 
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			//IP test > (www.google.com) 173.194.118.36
			//IP test > (www.google.com.br) 173.194.118.159
			//IP test > (www.unicamp.br) 143.106.10.174
			System.out.println("IP ............: "	+	geoIP.getIP());
			System.out.println("Country Code ..: " 	+ 	geoIP.getCountryCode());
			System.out.println("Country Name ..: "	+	geoIP.getCountryName());
			System.out.println("Code Details ..: "	+ 	geoIP.getReturnCodeDetails());
			
		}
	}

}
