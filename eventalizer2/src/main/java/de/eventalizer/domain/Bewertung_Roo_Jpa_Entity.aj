// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.eventalizer.domain;

import de.eventalizer.domain.Bewertung;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Bewertung_Roo_Jpa_Entity {
    
    declare @type: Bewertung: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Bewertung.id;
    
    @Version
    @Column(name = "version")
    private Integer Bewertung.version;
    
    public Long Bewertung.getId() {
        return this.id;
    }
    
    public void Bewertung.setId(Long id) {
        this.id = id;
    }
    
    public Integer Bewertung.getVersion() {
        return this.version;
    }
    
    public void Bewertung.setVersion(Integer version) {
        this.version = version;
    }
    
}