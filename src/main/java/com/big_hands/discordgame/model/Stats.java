package com.big_hands.discordgame.model;

import com.big_hands.discordgame.model.item.Item;
import com.big_hands.discordgame.model.unit.Unit;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class Stats {
    private BigInteger money;
    private ArrayList<Pair<Item, Integer>> items = new ArrayList<>();
    private ArrayList units = new ArrayList<Unit>();
    // items, characters, level, health, armor
}
