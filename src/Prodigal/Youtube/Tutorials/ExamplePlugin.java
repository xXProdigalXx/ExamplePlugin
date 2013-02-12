package Prodigal.Youtube.Tutorials;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin{
	
	private String pluginName = "Example Plugin";
	private ExamplePluginListener epl;
	private ExamplePluginCommandExecutor epce;
	private CommandExecutor ce;
	
	public void onEnable(){
		getLogger().info("Plugin: " + pluginName + " has been enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		
		ce = getCommand("hello").getExecutor();
		epce = new ExamplePluginCommandExecutor();
		getCommand("hello").setExecutor(epce);
		
		epl = new ExamplePluginListener(this, pm);
	}
	
	public void onDisable(){
		getLogger().info("Plugin: " + pluginName + " has been disabled!");
	}
}
