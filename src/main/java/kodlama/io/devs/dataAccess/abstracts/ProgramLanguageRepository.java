package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageRepository {
	List<ProgramLanguage> getAll();

	ProgramLanguage getById(int id);

	void add(ProgramLanguage programLanguage);

	void delete(int id);

	ProgramLanguage update(int id,ProgramLanguage newProgramLanguage);
}
