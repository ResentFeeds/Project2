package io.github.HydroSeeds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftBaseball extends JavaPlugin {

    @Override
    public void onEnable (){
        getLogger().info("onEnable has been invoked!");
    }

    @Override
    public void onDisable (){
        getLogger().info("onDisable has been invoked!");
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("basic")){

            return true;
        }
        return false;
    }

}
