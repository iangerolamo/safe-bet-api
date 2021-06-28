package io.github.iangerolamo.safebetapi.repository;

import io.github.iangerolamo.safebetapi.model.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Long> {

}
