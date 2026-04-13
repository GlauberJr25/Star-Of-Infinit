package Y6G.starofinfinit;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;

public class StarOfInfinitPlugin extends BaseModPlugin {

    // call order: onNewGame -> onNewGameAfterProcGen -> onNewGameAfterEconomyLoad -> onEnabled -> onNewGameAfterTimePass -> onGameLoad

    @Override
    public void onNewGame() {
        Global.getLogger(this.getClass()).info("Hooray, Star Of Infinit jar is loaded!");

    }

}
