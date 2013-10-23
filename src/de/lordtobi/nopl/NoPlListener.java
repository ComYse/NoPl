package de.lordtobi.nopl;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class NoPlListener implements Listener {
	
	public NoPl plugin;
	
	public NoPlListener(NoPl plugin) {
		
		this.plugin = plugin;
		
	}
	
	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		
		Player p = event.getPlayer();
		
		if(event.getMessage().toLowerCase().endsWith("/pl") || event.getMessage().toLowerCase().startsWith("/pl ") || event.getMessage().toLowerCase().endsWith("/plugins") || event.getMessage().toLowerCase().startsWith("/plugins ")) {
			
			if(!p.isPermissionSet("nopl.pl") && !p.isOp()) {
				
				event.setCancelled(true);
				
				if(plugin.getConfig().getBoolean("Messages.EnableMessages") == Boolean.valueOf(true)) {
					
					p.sendMessage(ChatColor.valueOf(plugin.getConfig().getString("Messages.MessageColor")) + plugin.getConfig().getString("Messages.Message").replaceAll("%player", p.getName()).replaceAll("%command", event.getMessage()));
					
				}
				
			}
			
		}
		
		if(event.getMessage().toLowerCase().endsWith("/ver") || event.getMessage().toLowerCase().startsWith("/ver ") || event.getMessage().toLowerCase().endsWith("/version") || event.getMessage().toLowerCase().startsWith("/version ") || event.getMessage().toLowerCase().endsWith("/about") || event.getMessage().toLowerCase().startsWith("/about ")) {
			
			if(!p.isPermissionSet("nopl.ver") && !p.isOp()) {
				
				event.setCancelled(true);
				
				if(plugin.getConfig().getBoolean("Messages.EnableMessages") == Boolean.valueOf(true)) {
					
					p.sendMessage(ChatColor.valueOf(plugin.getConfig().getString("Messages.MessageColor")) + plugin.getConfig().getString("Messages.Message").replaceAll("%player", p.getName()).replaceAll("%command", event.getMessage()));
					
				}
				
			}
			
		}
		
		if(event.getMessage().toLowerCase().endsWith("/help") || event.getMessage().toLowerCase().startsWith("/help ") || event.getMessage().toLowerCase().endsWith("/?") || event.getMessage().toLowerCase().startsWith("/? ")) {
			
			if(!p.isPermissionSet("nopl.help") && !p.isOp()) {
				
				event.setCancelled(true);
				
				if(plugin.getConfig().getBoolean("Messages.EnableMessages") == Boolean.valueOf(true)) {
					
					p.sendMessage(ChatColor.valueOf(plugin.getConfig().getString("Messages.MessageColor")) + plugin.getConfig().getString("Messages.Message").replaceAll("%player", p.getName()).replaceAll("%command", event.getMessage()));
					
				}
				
			}
			
		}
		
		if(event.getMessage().toLowerCase().endsWith("/info") || event.getMessage().toLowerCase().startsWith("/info ") || event.getMessage().toLowerCase().endsWith("/ifo") || event.getMessage().toLowerCase().startsWith("/ifo ") || event.getMessage().toLowerCase().endsWith("/news") || event.getMessage().toLowerCase().startsWith("/news ") || event.getMessage().toLowerCase().endsWith("/eabout") || event.getMessage().toLowerCase().startsWith("/eabout ")) {
					
			if(!p.isPermissionSet("nopl.info") && !p.isOp()) {
						
				event.setCancelled(true);
						
				if(plugin.getConfig().getBoolean("Messages.EnableMessages") == Boolean.valueOf(true)) {
						
					p.sendMessage(ChatColor.valueOf(plugin.getConfig().getString("Messages.MessageColor")) + plugin.getConfig().getString("Messages.Message").replaceAll("%player", p.getName()).replaceAll("%command", event.getMessage()));
					
				}
							
			}
							
		}
			
		if(event.getMessage().toLowerCase().endsWith("/gc") || event.getMessage().toLowerCase().startsWith("/gc ") || event.getMessage().toLowerCase().endsWith("/lag") || event.getMessage().toLowerCase().startsWith("/lag ") || event.getMessage().toLowerCase().endsWith("/mem") || event.getMessage().toLowerCase().startsWith("/mem ") || event.getMessage().toLowerCase().endsWith("/memory") || event.getMessage().toLowerCase().startsWith("/memory ")) {
			
			if(!p.isPermissionSet("nopl.gc") && !p.isOp()) {
				
				event.setCancelled(true);
				
				if(plugin.getConfig().getBoolean("Messages.EnableMessages") == Boolean.valueOf(true)) {
					
					p.sendMessage(ChatColor.valueOf(plugin.getConfig().getString("Messages.MessageColor")) + plugin.getConfig().getString("Messages.Message").replaceAll("%player", p.getName()).replaceAll("%command", event.getMessage()));
					
				}			
				
			}
			
		}
		
	}

}
