package service;


import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 * Skrypt serwisowy demonstrujący użycie profili i argumentów przekazywanych przez commandline.
 * W linii poleceń dodać argument (w uszach dowolna treść) : -Dargument.static='treść dziamdziaka z Zamówienia w PowerFarm'
 * W linii poleceń dodać profil: -PINT
 * @author MAK
 */
public class WorkshopTest {
	
	// dane profili
	Properties testNgProps = new Properties();
	
	
	/**
	 * Odczyt danych profili.
	 */
	public WorkshopTest() throws IOException {
		InputStream is = this.getClass().getResourceAsStream("/workshop.properties");
		testNgProps.load(new InputStreamReader(is));
	}
	
	
	@Test
	public void metodaTestowa01() {
		
		// odczyt danych z profili
		System.out.println("wartość parametru z profilu 'argument.workshop': >" + testNgProps.getProperty("argumentWorkshop") + "<");
		System.out.println("wartość parametru z profilu 'argument.url': >" + testNgProps.getProperty("argumentUrl") + "<");
		System.out.println("wartość parametru z profilu 'argument.static': >" + testNgProps.getProperty("argumentStatic") + "<");
		System.out.println("wartość parametru z profilu 'argument.cmdline': >" + testNgProps.getProperty("argumentCmdline") + "<");
		
	}
	
}
