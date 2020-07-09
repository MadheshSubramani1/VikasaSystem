package healthCheckPac;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import fit.ColumnFixture;

public class VerifyTheSitehealth extends ColumnFixture {

	String siteUrl;
	URL url;
	HttpURLConnection connection;

	public String getRequest() throws IOException {

		url = new URL(siteUrl);

		connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");

		connection.connect();
		return "urlHit";

	}

	public int getResponseCode() throws IOException {
		int responseCode = connection.getResponseCode();
		return responseCode;

	}

	public String getResponseMessage() throws IOException {

		String responseMessage = connection.getResponseMessage();
		return responseMessage;
	}

}
