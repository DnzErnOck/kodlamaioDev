package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgramLanguageService;
import kodlama.io.devs.entities.concretes.ProgramLanguage;

@RestController
@RequestMapping("/api/programlanguage")
public class ProgramLanguagesController {
	private ProgramLanguageService languageService;
	
	@Autowired
	public ProgramLanguagesController(ProgramLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgramLanguage> getAll() {
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody ProgramLanguage programLanguage) throws Exception {
		languageService.add(programLanguage);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		languageService.delete(id);
	}
	@GetMapping("/getbyid/{id}")
	public ProgramLanguage getById(@PathVariable("id") int id) {
		
		return languageService.getById(id);
	}
	@PutMapping("/update/{id}")
	public ProgramLanguage update(@PathVariable("id") int id, @RequestBody ProgramLanguage newProgramLanguage) throws Exception {
		return languageService.update(id, newProgramLanguage);
		
	}
}
