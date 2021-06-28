package io.github.iangerolamo.safebetapi.controller;

import io.github.iangerolamo.safebetapi.dto.BetDTO;
import io.github.iangerolamo.safebetapi.model.Bet;
import io.github.iangerolamo.safebetapi.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BetController {

    @Autowired
    private BetService betService;

    @GetMapping("/bet")
    public List<BetDTO> getBets() {
        return betService.getAll();
    }

    @PostMapping("/bet")
    public BetDTO newBet(@RequestBody BetDTO betDTO) {
        return betService.save(betDTO);
    }
}
