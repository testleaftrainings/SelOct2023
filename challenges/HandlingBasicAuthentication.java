package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.network.model.Headers;


public class HandlingBasicAuthentication {

	public static void main(String[] args) {

		// Start Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Get devTools
		DevTools chromeDevTools = driver.getDevTools();

		// Create sessions
		chromeDevTools.createSession();

		// Enable network
		chromeDevTools.send(Network.enable(Optional.of(0), Optional.of(0), Optional.of(0)));

		// Create hashmap for storing key value pair
		Map<String, Object> header = new HashMap<>();

		// Create authentication string- please replace with your application username
		// and password - in current case guest is username and password as well.
		String basicAuth = "Basic "
				+ new String(new Base64().encode(String.format("%s:%s", "admin", "testleaf").getBytes()));

		// add Authorization as key and basicAuth as value
		header.put("Authorization", basicAuth);

		// add authentication as part of header
		chromeDevTools.send(Network.setExtraHTTPHeaders(new Headers(header)));

		// please replace this with your application url
		driver.get("http://leafground.com:8090/login");
		

	}

}
