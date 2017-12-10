package com.seavus.library.unnecessary;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Developer {
    @Id
    @GeneratedValue
    Long id;
    @ManyToMany
  /*  @JoinTable(name = "developer_project", joinColumns = @JoinColumn(name="developer_id"),
    inverseJoinColumns = @JoinColumn(name = "project_id"));*/
    private Collection<Project> projects;

}
