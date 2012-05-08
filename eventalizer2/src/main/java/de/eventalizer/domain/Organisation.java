package de.eventalizer.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Organisation {

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Benutzer> organisatoren = new HashSet<Benutzer>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Bewertung> bewertungen = new HashSet<Bewertung>();
}
