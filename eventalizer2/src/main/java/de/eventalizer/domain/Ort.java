package de.eventalizer.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Ort {

    private String bezeichnung;

    private String strasse;

    private String hausnummer;

    private String postleitzahl;

    private String ortsname;

    private Long latitude;

    private Long longitude;
}
