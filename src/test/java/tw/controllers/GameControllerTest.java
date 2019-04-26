package tw.controllers;

import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import tw.GuessNumberModule;

import java.io.IOException;

import static com.google.inject.Guice.createInjector;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    private Injector injector = createInjector(new GuessNumberModule());
    private GameController gameController = injector.getInstance(GameController.class);
    @Test
    public void begin_game_test() throws IOException {
        gameController.beginGame();
        Assert.assertEquals("------Guess Number Game, You have 6 chances to guess!  ------", log.getLog().trim());
    }
}
