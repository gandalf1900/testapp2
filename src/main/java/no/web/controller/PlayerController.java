package no.web.controller;

import no.web.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping("/playerlist.json")
    public
    @ResponseBody
    List<String> getPlayerList() {
        return playerService.getAllPlayers();
    }

    @RequestMapping(value = "/addPlayer/{player}", method = RequestMethod.POST)
    public
    @ResponseBody
    void addPlayer(@PathVariable("player") String player) {
        playerService.addPlayer(player);
    }

    @RequestMapping(value = "/removePlayer/{player}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    void removePlayer(@PathVariable("player") String player) {
        playerService.deletePlayer(player);
    }

    @RequestMapping(value = "/removeAllPlayers", method = RequestMethod.DELETE)
    public
    @ResponseBody
    void removeAllPlayers() {
        playerService.deleteAll();
    }

    @RequestMapping("/layout")
    public String getPlayerPartialPage() {
        return "players/layout";
    }
}
