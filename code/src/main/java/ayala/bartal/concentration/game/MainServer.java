package ayala.bartal.concentration.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainServer {


	public static void main(String[] args) {
		System.out.println("Concentration Game Server");
		SpringApplication.run(MainServer.class, args);
	}
	
}
