package net.leandroabreu.springbootmongorestex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoRestController {

	@Autowired
	private ContatoRepository repo;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Contato> getAll() {
		return repo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Contato create(@RequestBody Contato contato) {
		return repo.save(contato);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public void delete(@PathVariable String id) {
		repo.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public Contato update(@PathVariable String id, @RequestBody Contato contato) {
		Contato update = repo.findOne(id);
		update.setEndereco(contato.getEndereco());
		update.setEmail(contato.getEmail());
		update.setFacebookProfile(contato.getFacebookProfile());
		update.setNome(contato.getNome());
		update.setGooglePlusProfile(contato.getGooglePlusProfile());
		update.setLinkedInProfile(contato.getLinkedInProfile());
		update.setTelefone(contato.getTelefone());
		update.setTwitterHandle(contato.getTwitterHandle());
		
		return repo.save(update);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Contato getContato(@PathVariable String id) {
		return repo.findOne(id);
	}
}
