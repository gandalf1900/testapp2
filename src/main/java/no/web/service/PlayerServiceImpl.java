package no.web.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

    private static List<String> playerList = new ArrayList<String>();

    @Override
    public List<String> getAllPlayers() {
        return playerList;
    }

    @Override
    public void addPlayer(String player) {
        playerList.add(player);
    }

    @Override
    public void deletePlayer(String player) {
        if (playerList.contains(player)) {
            playerList.remove(player);
        }
    }

    @Override
    public void deleteAll() {
        playerList.clear();
    }
}
