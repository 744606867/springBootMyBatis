package cn.yyff.tax.cxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("cn.yyff.tax.cxf.dao")
public class ShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShopApplication.class, args);
    }

}
