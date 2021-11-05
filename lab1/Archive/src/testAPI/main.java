package testAPI;

import java.io.IOException;
import support.WeatherAPI;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WeatherAPI wAPI = new WeatherAPI();
		String key =  "0c72e0670fb7e6bf0d188a765e70ea44";
		String city = "Covilha,pt";
		String unit = "metric";
		String language = "pt";

		Double temp = wAPI.getTemp(key,city,unit,language);
		System.out.println("Temperatura em "+city+": " + temp.toString());
		
	}

}
