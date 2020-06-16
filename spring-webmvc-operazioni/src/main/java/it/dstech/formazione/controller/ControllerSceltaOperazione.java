package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSceltaOperazione {

	@RequestMapping(value = "/sceltaAzione", method = RequestMethod.POST)
	public ModelAndView scelta(@RequestParam("scelta") String scelta, Model model) {
		ModelAndView prossimaPaginaJSP = new ModelAndView();
		prossimaPaginaJSP.setViewName("sceltaNumeri");
		prossimaPaginaJSP.addObject("sceltaDaController", scelta);
		return prossimaPaginaJSP;
	}

}
