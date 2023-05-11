package tn.esprit.spring.khademsouhaila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication //il s'agit d'une aaplication springboot , classe exécutable principale
@EnableAspectJAutoProxy //activer la configuration de l'AOP
public class KhademSouhailaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhademSouhailaApplication.class, args);
    }

}
