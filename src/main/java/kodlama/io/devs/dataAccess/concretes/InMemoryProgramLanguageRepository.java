package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgramLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramLanguage;

@Repository
public class InMemoryProgramLanguageRepository implements ProgramLanguageRepository{

	List<ProgramLanguage> programLanguages;
	
	public InMemoryProgramLanguageRepository() {
		programLanguages=new ArrayList<ProgramLanguage>();
		programLanguages.add(new ProgramLanguage(1, "Java"));
		programLanguages.add(new ProgramLanguage(2, "C#"));
		programLanguages.add(new ProgramLanguage(3, "Phyton"));
		programLanguages.add(new ProgramLanguage(4, "Coldfusion"));
		
	}
	@Override
	public List<ProgramLanguage> getAll() {
		
		return programLanguages;
	}
	@Override
	public void add(ProgramLanguage programLanguage) {
		programLanguages.add(programLanguage);
		
	}

	@Override
	public void delete(int id) {
		
		for (ProgramLanguage programLanguage : programLanguages) {
			if(programLanguage.getId()== id)
			{ 
				programLanguages.remove(programLanguage);
			}	
		}
		
		
	}

	@Override
	public ProgramLanguage getById(int id) {
		for (ProgramLanguage programLanguage : programLanguages) {
			if(programLanguage.getId()== id)
			{ 
				return programLanguage;
			}	
		}
		return null;
	}
	@Override
	public ProgramLanguage update(int id, ProgramLanguage newProgramLanguage) {
		for (ProgramLanguage programLanguage : programLanguages) {
			if(programLanguage.getId() == id)
			{
				programLanguage.setName(newProgramLanguage.getName());
			}
		}
		return newProgramLanguage;
	}
	

}
