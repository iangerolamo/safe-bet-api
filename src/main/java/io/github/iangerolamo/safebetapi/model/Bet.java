package io.github.iangerolamo.safebetapi.model;

import io.github.iangerolamo.safebetapi.dto.BetDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String event;
    private Date date;
    private String sport;
    private String competition;
    private String market;
    private BigDecimal stake;
    private BigDecimal result;
    private BigDecimal odd;

    public static Bet convert(BetDTO betDTO) {
        Bet bet = new Bet();
        bet.setEvent(betDTO.getEvent());
        bet.setDate(betDTO.getDate());
        bet.setSport(betDTO.getSport());
        bet.setCompetition(betDTO.getCompetition());
        bet.setMarket(betDTO.getMarket());
        bet.setStake(betDTO.getStake());
        bet.setResult(betDTO.getResult());
        bet.setOdd(betDTO.getOdd());

        return bet;
    }
}
