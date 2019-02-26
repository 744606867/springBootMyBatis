package cn.yyff.tax.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("cn.yyff.tax.shop.dao")
public class ShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShopApplication.class, args);
    }

}
