package com.elton.base.services;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by elton on 12/07/2017.
 */
@Component
public class IntegrationService {

    public BufferedReader getInputStreamReaderByURL(String uri) throws IOException{
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        return new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
    }

}
