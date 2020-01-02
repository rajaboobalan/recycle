package com.sekar.app;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecycleRepository extends CrudRepository<RecycleObject, Long> {
}

