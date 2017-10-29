package org.econfortin.ocejwsdstudy.enthuware.test1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * What are connection setup methods that can be in line //1?
 *
 * From the API:
 * java.net.URLConnection
 * openConnection() - Manipulate parameters that affect the connection to the remote resource.
 * connect() - Interact with the resource; query header fields and contents.
 *
 * The setup parameters are modified using the following methods:
 * setAllowUserInteraction
 * setDoInput - Set the DoInput flag to true if you intend to use the URL connection for input
 * setDoOutput - Set the DoInput flag to true if you intend to use the URL connection for output
 * setIfModifiedSince
 * setUseCaches
 *
 * java.net.HttpURLConnection extends java.net.URLConnection
 * setRequestMethod is defined on the HttpURLConnection class.
 */
public class URLConClient {
    public static void main(String[] args) throws IOException {
        URL restURL = new URL("http://localhost:8080/SimpleRS/jax/rs/add/5/6");
        HttpURLConnection connection = (HttpURLConnection) restURL.openConnection();
        // 1
        //connection.setRequestMethod("GET");
        //connection.setDoInput(true);
        //connection.setReadTimeout(10000);
        readFrom(connection);
    }

    private static void readFrom(HttpURLConnection connection) {
    }
}
