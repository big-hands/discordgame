package com.bighands.discordgame.model.unit.worker;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Farmer implements Worker {
    private int headcount;

    public BigInteger generateIncome() {
        return BigInteger.valueOf(headcount);
    }
}
