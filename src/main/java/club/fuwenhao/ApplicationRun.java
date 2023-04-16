package club.fuwenhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//todo-fwh-扫描dao包
//@MapperScan(basePackages = "club.fuwenhao.service")
//@EnableJpaRepositories(basePackages = "club.fuwenhao.service")
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }
}

