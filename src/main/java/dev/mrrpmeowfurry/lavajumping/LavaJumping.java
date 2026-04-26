package dev.mrrpmeowfurry.lavajumping;

import org.bukkit.plugin.java.JavaPlugin;

public final class LavaJumping extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, World!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye bye!");
    }
    
}
