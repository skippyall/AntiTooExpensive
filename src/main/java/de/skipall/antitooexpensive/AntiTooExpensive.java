package de.skipall.antitooexpensive;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiTooExpensive extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e){
        if(e.getInventory() instanceof AnvilInventory){
            ((AnvilInventory)e.getInventory()).setMaximumRepairCost(Integer.MAX_VALUE);
        }
    }
}
