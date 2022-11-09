package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.DeleteProgramminLanguageRequest;
import kodlama.io.devs.business.requests.GetByIdProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgramminLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;

	void update(UpdateProgramminLanguageRequest updateProgramminLanguageRequest);

	void delete(DeleteProgramminLanguageRequest deleteProgramminLanguageRequest);

	GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest);
}
