package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.model.Operatore;

@Controller
public class ControllerSceltaNumeri {

	@RequestMapping(value = "/calcolaRisultato", method = RequestMethod.POST)
	public ModelAndView scelta(@RequestParam("scelta") String scelta, @RequestParam("x") double primoNumero,
			@RequestParam("y") double secondoNumero, Model model) {
		ModelAndView prossimaPaginaJSP = new ModelAndView();
		prossimaPaginaJSP.setViewName("risultato");
		prossimaPaginaJSP.addObject("sceltaDaController", scelta);
		prossimaPaginaJSP.addObject("x", primoNumero);
		prossimaPaginaJSP.addObject("y", secondoNumero);
		Operatore op = new Operatore(primoNumero, secondoNumero);
		if ("add".equals(scelta)) {
			prossimaPaginaJSP.addObject("risultato", op.somma());
		} else if ("sub".equals(scelta)) {
			prossimaPaginaJSP.addObject("risultato", op.sottrazione());

		} else if ("mul".equals(scelta)) {
			prossimaPaginaJSP.addObject("risultato", op.moltiplicazione());
		} else {
			prossimaPaginaJSP.addObject("risultato", op.divisione());
		}
		return prossimaPaginaJSP;
	}

}
