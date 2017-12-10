package com.seavus.library;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Member {
    @Id
    @GeneratedValue
    Long id;

    @ManyToMany(mappedBy = "members")
    Collection<Book> books;

}
