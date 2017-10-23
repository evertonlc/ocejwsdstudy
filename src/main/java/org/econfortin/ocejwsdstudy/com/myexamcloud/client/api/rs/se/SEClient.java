package org.econfortin.ocejwsdstudy.com.myexamcloud.client.api.rs.se;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SEClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ocejwsdstudy/vlavaav/home");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-type", "application/xml");
        OutputStream os = connection.getOutputStream();
        os.flush();
        System.out.println(connection.getResponseCode());
        connection.disconnect();
    }
}
