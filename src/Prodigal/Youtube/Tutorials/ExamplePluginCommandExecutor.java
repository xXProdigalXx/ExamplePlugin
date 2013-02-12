package Prodigal.Youtube.Tutorials;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExamplePluginCommandExecutor implements CommandExecutor{
	
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args){
		Player pl = (Player)s;

		if(cmd.getName().equalsIgnoreCase("hello")){
			pl.sendMessage(ChatColor.AQUA + "Hello " + pl.getDisplayName() + "!");
		}
		
		
		return false;
	}
}
