package com.seavus.library;

import org.springframework.data.repository.CrudRepository;

interface BookRepository extends CrudRepository<Book, Long> {
}
