package io.github.iangerolamo.safebetapi.service;

import io.github.iangerolamo.safebetapi.dto.BetDTO;
import io.github.iangerolamo.safebetapi.model.Bet;
import io.github.iangerolamo.safebetapi.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    public List<BetDTO> getAll() {
        List<Bet> bets = betRepository.findAll();
        return bets.stream().map(bet -> BetDTO.convert(bet)).collect(Collectors.toList());
    }

    public BetDTO save(BetDTO betDTO) {
        Bet bet = betRepository.save(Bet.convert(betDTO));
        return BetDTO.convert(bet);
    }
}
