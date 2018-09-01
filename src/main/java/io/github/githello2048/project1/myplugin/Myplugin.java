package io.github.githello2048.project1.myplugin;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "myplugin",
        name = "Myplugin",
        url = "https://github.com/GIThello2048/MyFirstPlugin",
        authors = {
                "githello2048"
        }
)
public class Myplugin {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        
    }
}
