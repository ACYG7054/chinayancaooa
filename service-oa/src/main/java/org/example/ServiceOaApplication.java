package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(basePackages = "org.example.mapper")
public class ServiceOaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceOaApplication.class, args);
    }
}

@Component
class StartupCatPrinter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("    /\\_/\\  ");
        System.out.println("   ( ° • °) ");
        System.out.println("项目启动成功啦！喵~");
    }
}
