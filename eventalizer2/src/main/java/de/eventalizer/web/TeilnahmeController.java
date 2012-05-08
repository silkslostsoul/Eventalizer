package de.eventalizer.web;

import de.eventalizer.domain.Teilnahme;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/teilnahmes")
@Controller
@RooWebScaffold(path = "teilnahmes", formBackingObject = Teilnahme.class)
public class TeilnahmeController {
}
