package no.web.service;

import java.util.List;

public interface PlayerService {
    public List<String> getAllPlayers();

    public void addPlayer(String player);

    public void deletePlayer(String player);

    public void deleteAll();
}
