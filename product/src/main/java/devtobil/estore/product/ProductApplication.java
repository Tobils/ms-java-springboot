package devtobil.estore.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		log.info("run application ...");
		SpringApplication.run(ProductApplication.class, args);
	}

}
