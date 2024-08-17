package org.buscador.cep.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationProvider {
    private static final Properties properties = new Properties();

    static {
        try (InputStream inputStream = ConfigurationProvider.class.getClassLoader().getResourceAsStream(".env")) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                System.err.println("Arquivo .env não encontrado.");
                System.out.println("Caminho do arquivo: " + ConfigurationProvider.class.getClassLoader().getResource(".env"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}