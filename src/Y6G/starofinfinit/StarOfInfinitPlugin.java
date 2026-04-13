package Y6G.starofinfinit;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;

public class StarOfInfinitPlugin extends BaseModPlugin {
    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();

        // Test that the .jar is loaded and working, using the most obnoxious way possible.
        throw new RuntimeException("Template mod loaded and working!\nRemove this crash in TemplateModPlugin.");

    }

    // call order: onNewGame -> onNewGameAfterProcGen -> onNewGameAfterEconomyLoad -> onEnabled -> onNewGameAfterTimePass -> onGameLoad

    @Override
    public void onNewGame() {
        Global.getLogger(this.getClass()).info("Hooray, Star Of Infinit jar is loaded!");

    }

}
