package br.dev.hygino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.models.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
