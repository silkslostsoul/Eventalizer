// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.eventalizer.domain;

import de.eventalizer.domain.Benutzer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Benutzer_Roo_Jpa_Entity {
    
    declare @type: Benutzer: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Benutzer.id;
    
    @Version
    @Column(name = "version")
    private Integer Benutzer.version;
    
    public Long Benutzer.getId() {
        return this.id;
    }
    
    public void Benutzer.setId(Long id) {
        this.id = id;
    }
    
    public Integer Benutzer.getVersion() {
        return this.version;
    }
    
    public void Benutzer.setVersion(Integer version) {
        this.version = version;
    }
    
}