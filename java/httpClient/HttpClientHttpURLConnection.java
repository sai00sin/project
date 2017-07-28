import java.net.*;
import java.io.*;
import java.util.*;

public class HttpClientHttpURLConnection {
	public static void main(String[] args) {
		throws MalformedURLException, ProtocolException, IOException {
			URL = url = new URL("http://www.debian.org/");

			HttpURLConnection urlconn = (HttpURLConnection)url.openConnection();
			urlconn.setRequestMethod("GET");
			urlconn.setInstanceFollowRedirects(false);
			urlconn.setRequestProperty()	
		}
	}
}