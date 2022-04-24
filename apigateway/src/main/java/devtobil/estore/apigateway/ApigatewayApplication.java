package devtobil.estore.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ApigatewayApplication {

	public static void main(String[] args) {
		log.info("running api-gateway");
		SpringApplication.run(ApigatewayApplication.class, args);
	}
}
