package healthcare.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import healthcare.api.rest.model.Medico;

// Serve para acessar o banco
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
	
	Medico findByNome(String nome);
	
	Medico findByCrm(String crm);
	
	Medico findBySobrenome(String sobrenome);
}
