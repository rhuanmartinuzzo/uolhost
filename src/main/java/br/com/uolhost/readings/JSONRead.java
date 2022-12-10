package br.com.uolhost.readings;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import static java.nio.charset.StandardCharsets.UTF_8;


public class JSONRead {
    private String from = "https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/vingadores.json";
    URL url;
    String jsonStr;
    public void read() {
        try {
            url = new URL(from);
            jsonStr = IOUtils.toString(url, UTF_8);
            System.out.println(jsonStr);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
