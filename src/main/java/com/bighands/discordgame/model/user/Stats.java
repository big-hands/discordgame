package com.bighands.discordgame.model.user;

import com.bighands.discordgame.model.item.Item;
import com.bighands.discordgame.model.quest.Mission;
import com.bighands.discordgame.model.unit.Unit;
import com.bighands.discordgame.model.unit.worker.Worker;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class Stats {
    @Id
    private String id;
    private BigInteger money = BigInteger.ZERO;
    private int level;
    private int health;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Unit> units = new ArrayList<>();
    private ArrayList<Pair<Mission, Pair<Unit, Integer>>> currentMissions = new ArrayList<>();
    private ArrayList<Pair<Mission, Pair<Unit, Integer>>> finishedMissions = new ArrayList<>();

    public void update() {
        generateIncomeFromWorkers();
    }

    private void generateIncomeFromWorkers() {
        money = money.add(
            units.stream()
                .filter(unit -> Worker.class.isAssignableFrom(unit.getClass()))
                .map(worker -> ((Worker) worker).generateIncome())
                .reduce(BigInteger::add)
                .orElse(BigInteger.ZERO));
    }
}
