package de.eventalizer.web;

import de.eventalizer.domain.Bewertung;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bewertungs")
@Controller
@RooWebScaffold(path = "bewertungs", formBackingObject = Bewertung.class)
public class BewertungController {
}
