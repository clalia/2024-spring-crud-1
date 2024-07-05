package springboot.es.demo2.Conto.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.es.demo2.Conto.Pojo.ContoBancario;

@Repository
public interface ContoBancarioRepo extends JpaRepository<ContoBancario, Integer> {

}
