package org.igorski.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.StringJoiner;

public class GenericHttpClient {
    private static final Logger LOG = LoggerFactory.getLogger(GenericHttpClient.class);
    public String sendGetRequest(String target) {
        LOG.info("Requesting at: " + target);
        StringJoiner joiner = new StringJoiner("\n");

        try {
            URL url = new URL(target);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);

            try(InputStream inputStream = conn.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream))) {

                String line;
                while ((line = rd.readLine()) != null) {
                    joiner.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return joiner.toString();
    }

}
