package springboot.es.demo2.Conto.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.es.demo2.Conto.Pojo.ContoBancario;
import springboot.es.demo2.Conto.Repo.ContoBancarioRepo;

@Service
public class ContoBancarioService {

    @Autowired
    private ContoBancarioRepo contoBancarioRepo;

    public ContoBancario createConto(ContoBancario conto) {
        return contoBancarioRepo.save(conto);
    }
    public ContoBancario updateConto(ContoBancario conto) {
        return contoBancarioRepo.save(conto);
    }
    public List<ContoBancario> getAllConti(){
        return contoBancarioRepo.findAll();
    }
    public Optional<ContoBancario> getContoBancarioById(int id){
        return contoBancarioRepo.findById(id);
    }
    public void deleteConto(int id) {
        contoBancarioRepo.deleteById(id);
    }
}

    



