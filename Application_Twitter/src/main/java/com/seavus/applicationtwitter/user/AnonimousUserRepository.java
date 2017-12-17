package com.seavus.applicationtwitter.user;

import org.springframework.data.repository.CrudRepository;

public interface AnonimousUserRepository extends CrudRepository<AnonymousUser, Long> {
}
