package com.nicknotname.EnchantPlus;

import com.nicknotname.EnchantPlus.commands.EnchantInvCmd;
import com.nicknotname.EnchantPlus.inventory.events.EnchantInvBaseListener;
import com.nicknotname.EnchantPlus.inventory.events.EnchantInvItemInListener;
import org.bukkit.plugin.java.JavaPlugin;

public class enchantplus extends JavaPlugin {
    @Override
    public void onEnable(){
        this.getCommand("invtest").setExecutor(new EnchantInvCmd());

        this.getServer().getPluginManager().registerEvents(new EnchantInvBaseListener(), this);
        this.getServer().getPluginManager().registerEvents(new EnchantInvItemInListener(), this);
    }

    @Override
    public void onDisable(){

    }
}
