package br.dev.hygino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.dev.hygino.dto.StateRequestDto;
import br.dev.hygino.services.StateService;
import jakarta.validation.Valid;

@Controller
public class StateController {
	private final StateService stateService;
	// private final String url = "/admin/states/register";

	public StateController(StateService stateService) {
		this.stateService = stateService;
	}

	@GetMapping("/statesRegister")
	public ModelAndView register(StateRequestDto dto) {
		ModelAndView mv = new ModelAndView("admin/states/register");
		mv.addObject("state", dto);
		return mv;
	}
	
	@PostMapping("/saveState")
	public ModelAndView save(@Valid StateRequestDto dto, BindingResult result) {
		if (result.hasErrors()) {
			return register(dto);
		}
		stateService.save(dto);
		
		return register(new StateRequestDto());
	}
}
