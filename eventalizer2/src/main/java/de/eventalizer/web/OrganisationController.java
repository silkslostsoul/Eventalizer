package de.eventalizer.web;

import de.eventalizer.domain.Organisation;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/organisations")
@Controller
@RooWebScaffold(path = "organisations", formBackingObject = Organisation.class)
public class OrganisationController {
}
