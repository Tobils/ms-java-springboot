package devtobil.estore.product.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private Environment environment;

  @PostMapping
  public String create() {
    log.info("create product");
    return "this is string response post";
  }

  @GetMapping(params = "uuid")
  public String findOne(@RequestParam String uuid) {
    log.info("uuid query params is {}", uuid);
    return "find one with uuid " + environment.getProperty("local.server.port");
  }

  @PutMapping
  public String update() {
    return "";
  }

  @DeleteMapping
  public String delete() {
    return "";
  }
}
