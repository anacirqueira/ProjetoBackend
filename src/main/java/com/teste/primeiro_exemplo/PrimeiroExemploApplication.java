package com.teste.primeiro_exemplo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Properties;


@SpringBootApplication
public class PrimeiroExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroExemploApplication.class, args);
		Properties systemProps = System.getProperties();
		systemProps.put("javax.net.ssl.keyStorePassword","passwordForKeystore");
		systemProps.put("javax.net.ssl.keyStore","pathToKeystore.ks");
		systemProps.put("javax.net.ssl.trustStore", "pathToTruststore.ts");
		systemProps.put("javax.net.ssl.trustStorePassword","passwordForTrustStore");
		System.setProperties(systemProps);
	}

}
