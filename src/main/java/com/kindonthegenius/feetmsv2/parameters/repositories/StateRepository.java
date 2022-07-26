package com.kindonthegenius.feetmsv2.parameters.repositories;

import com.kindonthegenius.feetmsv2.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
