package Prodigal.Youtube.Tutorials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;

public class ExamplePluginListener implements Listener{
	
	public ExamplePluginListener(ExamplePlugin ep, PluginManager pm){
		pm.registerEvents(this, ep);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e){
		Bukkit.broadcastMessage(ChatColor.AQUA + "LOL! " + e.getEntity().getName() +  " died like a n00b!");
	}
	
}
