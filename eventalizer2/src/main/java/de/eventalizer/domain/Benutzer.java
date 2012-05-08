package de.eventalizer.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Benutzer {

    private String vorname;

    private String nachname;

    @Column(unique = true)
    private String accountName;

    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date geburtsdatum;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<de.eventalizer.domain.Benutzer> freundesliste = new HashSet<de.eventalizer.domain.Benutzer>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<de.eventalizer.domain.Benutzer> blockierliste = new HashSet<de.eventalizer.domain.Benutzer>();

}
