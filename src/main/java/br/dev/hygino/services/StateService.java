package br.dev.hygino.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.hygino.dto.StateRequestDto;
import br.dev.hygino.models.State;
import br.dev.hygino.repositories.StateRepository;
import jakarta.validation.Valid;

@Service
public class StateService {
	private final StateRepository stateRepository;

	public StateService(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}

	@Transactional
	public void save(@Valid StateRequestDto dto) {
		State entity = new State();
		dtoToEntity(dto, entity);
		stateRepository.saveAndFlush(entity);
	}

	private void dtoToEntity(@Valid StateRequestDto dto, State entity) {
		entity.setName(dto.getName());
		entity.setAbbreviation(dto.getAbbreviation());
	}
}
