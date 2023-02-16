package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgramLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgramLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramLanguage;

@Service
public class ProgramLanguageManager implements ProgramLanguageService{

	private ProgramLanguageRepository programLanguageRepository;
	
	@Autowired
	public ProgramLanguageManager(ProgramLanguageRepository programLanguageRepository) {
		
		this.programLanguageRepository = programLanguageRepository;
	}

	@Override
	public List<ProgramLanguage> getAll() {
		
		return programLanguageRepository.getAll();
	}

	@Override
	public ProgramLanguage getById(int id) {
		
		return programLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgramLanguage programLanguage) throws Exception {
		if(programLanguage.getName().isEmpty()) {
			throw new Exception("Programlama Dili Boş Geçilemez !");
		}
		else
		{
			for (ProgramLanguage programLanguage2 : getAll()) {
				if(programLanguage2.getName().equals(programLanguage.getName()))
				{
					throw new Exception("Aynı isimle programlama dili mevcuttur.!");
				}
				else {
					programLanguageRepository.add(programLanguage);
				}
			}
		}
		
	}

	@Override
	public void delete(int id) {
		programLanguageRepository.delete(id);
		
	}

	@Override
	public ProgramLanguage update(int id, ProgramLanguage newProgramLanguage) throws Exception {
		for (ProgramLanguage programLanguage : getAll()) {
			if(newProgramLanguage.getName().equals(programLanguage.getName()))
			{
				throw new Exception("Aynı isimle programlama dili mevcuttur.!");
			}
			else
			{
				programLanguageRepository.update(id, newProgramLanguage);
			}
		}
		return newProgramLanguage;
				
	}

}
