package de.lordtobi.nopl;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;

public class NoPl extends JavaPlugin {
	
	@Override
	public void onDisable() {
		
		Logger l = Logger.getLogger("Minecraft");
		
		PluginDescriptionFile pdf = this.getDescription();
		
		l.info(pdf.getName() + " v" + pdf.getVersion() + " disabled!");
		
	}
	
	@Override
	public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new NoPlListener(this), this);
		
		getConfig().addDefault("Messages.EnableMessages", Boolean.valueOf(true));
			
		getConfig().addDefault("Messages.Message", "Désolé, nos plugins sont privés!");
		
		getConfig().addDefault("Messages.MessageColor", "DARK_RED");
		
		getConfig().options().copyDefaults(true);
		
		saveConfig();
		
		Logger l = getLogger();
		
		PluginDescriptionFile pdf = this.getDescription();
		
		l.info(pdf.getName() + " v" + pdf.getVersion() + " enabled!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Logger l = getLogger();
		
		if(sender instanceof Player) {
			
			if(cmd.getName().equalsIgnoreCase("noplreload")) {
				
				if(sender.isPermissionSet("nopl.reload") || sender.isOp()) {
					
					reloadConfig();
					
					sender.sendMessage(ChatColor.GREEN + "Successfully reloaded NoPl.");
					
				}
				
			}
			
		} else {
			
			if(cmd.getName().equalsIgnoreCase("noplreload")) {
				
				reloadConfig();
				
				l.info(ChatColor.GREEN + "Successfully reloaded NoPl.");
				
			}
			
		}
		
		return false;
		
	}
	
}
