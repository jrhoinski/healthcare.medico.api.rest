package healthcare.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import healthcare.api.rest.model.Medico;
import healthcare.api.rest.repository.MedicoRepository;
import healthcare.api.rest.service.MedicoService;

@RestController
public class MedicoController {

	@Autowired 
	private MedicoService medicoService;
	
	@PostMapping("/medico/cadastro")
	public Medico createMedico(@RequestBody Medico medico) {
		
		return medicoService.createMedico(medico);		
	}
	
	@GetMapping("/medico/lista")
	public List<Medico> findByAll(){
		return medicoService.findAll();
	}
	
	@GetMapping("/medico/{id}")
	public Medico findById(@PathVariable Integer id) {		
		return medicoService.getById(id);
	}
	
	@PostMapping("/medico/nome")
	public Medico findByNome(@RequestBody String nome) {
		return medicoService.findByNome(nome);
	}
	
	@PostMapping("/medico/crm")
	public Medico findByCrm(@RequestBody String crm) {
		return medicoService.findByCrm(crm);
	}
	
	@PostMapping("/medico/sobrenome")
	public Medico findBySobrenome(@RequestBody String sobrenome) {
		return medicoService.findByCrm(sobrenome);
	}
	
	
}
