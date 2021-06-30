package org.soyphea.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
interface ReadOnlyRepository<T, ID> extends Repository<T, ID> {

  Optional<T> findById(ID id);

  Iterable<T> findAll();

}