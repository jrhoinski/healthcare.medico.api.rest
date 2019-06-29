package healthcare.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healthcare.api.rest.model.Medico;
import healthcare.api.rest.repository.MedicoRepository;

@Service
public class MedicoService {
	// Autoriza usar a repository 
	@Autowired
	private MedicoRepository medicoRepository;
	
	public Medico createMedico(Medico medico) {
		Medico objMedico = new Medico();
		if(medico != null){			
			objMedico = medicoRepository.save(medico);			
		}
		return objMedico;
	}
	
	public List<Medico> findAll(){
		return medicoRepository.findAll();
	}
	
	public Medico getById(Integer id) {
		
		Medico objMedico = new Medico();
		if(id != null && id > 0) {			
			objMedico = medicoRepository.findById(id).orElse(null);
		}		
		return objMedico;
	}
	
	public Medico findByNome(String nome) {
		
		Medico objMedico = new Medico();
		if(nome != null) {
			objMedico = medicoRepository.findByNome(nome);
		}
		
		return objMedico;
	}
	
	public Medico findByCrm(String crm) {
		Medico objMedico = new Medico();
		if(crm != null) {
			objMedico = medicoRepository.findByCrm(crm);
		}		
		return objMedico;
	}
	
	public Medico findBySobrenome(String sobrenome) {
		Medico objMedico = new Medico();
		if(sobrenome != null) {
			objMedico = medicoRepository.findBySobrenome(sobrenome);
		}
		
		return objMedico;
	}

}
