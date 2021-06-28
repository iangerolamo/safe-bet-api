package io.github.iangerolamo.safebetapi.dto;

import io.github.iangerolamo.safebetapi.model.Bet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BetDTO {
    private String event;
    private Date date;
    private String sport;
    private String competition;
    private String market;
    private BigDecimal stake;
    private BigDecimal result;
    private BigDecimal odd;

    public static BetDTO convert(Bet bet) {
        BetDTO betDTO = new BetDTO();
        betDTO.setEvent(bet.getEvent());
        betDTO.setDate(bet.getDate());
        betDTO.setSport(bet.getSport());
        betDTO.setCompetition(bet.getCompetition());
        betDTO.setMarket(bet.getMarket());
        betDTO.setStake(bet.getStake());
        betDTO.setResult(bet.getResult());
        betDTO.setOdd(bet.getOdd());

        return betDTO;
    }
}
