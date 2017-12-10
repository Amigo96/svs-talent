package com.seavus.library.unnecessary;

import com.seavus.library.unnecessary.Developer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Project {
    @Id
    @GeneratedValue
    Long id;
@ManyToMany(mappedBy = "projects")
    private Collection<Developer> developers;


}
