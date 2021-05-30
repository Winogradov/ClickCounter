package com.example.winogradov.clicker.repository;

import com.example.winogradov.clicker.model.CounterEntity;
import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<CounterEntity,Long> {
}
