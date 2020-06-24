package org.brainacad;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Brainacad4 on 24.06.2020.
 */
public class PropertiesMain {

    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            try(InputStream is = PropertiesMain.class.getClassLoader().getResourceAsStream("conf.properties")) {
               prop.load(is);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String localHello = (String) prop.get("props.local.hello");
        String mvnHello = (String) prop.get("props.mvn.hello");
        String serverUrl = (String) prop.get("props.server");
        System.out.println(localHello);

    }

}
