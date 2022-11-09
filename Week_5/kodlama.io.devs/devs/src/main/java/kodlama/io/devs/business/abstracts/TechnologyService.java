package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologiesResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologyRequest createTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest);

	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
}
