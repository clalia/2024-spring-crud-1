package springboot.es.demo2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springboot.es.demo2.Conto.Pojo.ContoBancario;
import springboot.es.demo2.Conto.Service.ContoBancarioService;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

    @Autowired
    private ContoBancarioService contoBancarioService;

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		
        ContoBancario conto = new ContoBancario();
        contoBancarioService.createConto(conto);

        contoBancarioService.getAllConti().forEach(System.out::println);

        
        conto.deposita(100);
        contoBancarioService.updateConto(conto);
        System.out.println("Dopo deposito: " + conto);

        
        conto.preleva(50);
        contoBancarioService.updateConto(conto);
        System.out.println("Dopo prelievo: " + conto);

        
        contoBancarioService.deleteConto(conto.getId());
        System.out.println("Dopo eliminazione: " + contoBancarioService.getAllConti());
    }
}
