package com.bighands.discordgame.model.unit.worker;

import com.bighands.discordgame.model.unit.Unit;

import java.math.BigInteger;

public interface Worker extends Unit {
    BigInteger generateIncome();
}
