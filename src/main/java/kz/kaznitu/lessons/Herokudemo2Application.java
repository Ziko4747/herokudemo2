package kz.kaznitu.lessons;

import kz.kaznitu.lessons.models.Server;
import kz.kaznitu.lessons.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Herokudemo2Application implements CommandLineRunner {

	@Autowired
	ServerRepository serverRepository;

	public static void main(String[] args) {
		SpringApplication.run(Herokudemo2Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{

		Server server1 = new Server();
		server1.setName("Бокс-мастер");
		server1.setPrice(1600);

		Server server2 = new Server();
		server2.setName("Твистер");
		server2.setPrice(1250);

		serverRepository.save(server1);
		serverRepository.save(server2);
	}
}
