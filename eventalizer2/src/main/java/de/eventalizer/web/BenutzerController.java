package de.eventalizer.web;

import de.eventalizer.domain.Benutzer;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/benutzers")
@Controller
@RooWebScaffold(path = "benutzers", formBackingObject = Benutzer.class)
public class BenutzerController {
}
