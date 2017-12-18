package com.seavus.library;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Member(){}


    @ManyToMany(mappedBy = "members")
    Collection<Book> books;

    public Member(Long id, String name) {
    this.id = id;
    this.name = name ;
    }
}
