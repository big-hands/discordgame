package com.bighands.discordgame.service;

import com.bighands.discordgame.model.unit.worker.Farmer;
import com.bighands.discordgame.model.unit.worker.Worker;
import com.bighands.discordgame.model.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GameUpdateServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void test() throws Exception {
        User user = new User();
        Worker worker = new Farmer();
        user.getStats().getUnits().add(worker);
        userService.saveUser(user);

        Thread.sleep(3000);
        assertThat(user.getStats().getMoney().compareTo(BigInteger.ONE)).isEqualTo(1);
    }
}
