package de.eventalizer.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Event {

    @NotNull
    private String titel;

    private String beschreibung;

    private Long preis;

    private Integer minTeilnehmer;

    private Integer maxTeilnehmer;

    @Future
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date datum;

    @Future
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date spaetestesZusagedatum;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Teilnahme> plaetze = new HashSet<Teilnahme>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Bewertung> bewertungen = new HashSet<Bewertung>();

    @ManyToOne
    private Organisation organisation;

    @ManyToOne
    private Ort ort;
}
