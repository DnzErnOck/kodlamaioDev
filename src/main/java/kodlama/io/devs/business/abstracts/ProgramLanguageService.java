package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageService {
	List<ProgramLanguage> getAll();
	
	ProgramLanguage getById(int id);

	void add(ProgramLanguage programLanguage) throws Exception;

	void delete(int id);

	ProgramLanguage update(int id,ProgramLanguage newProgramLanguage) throws Exception;
}
