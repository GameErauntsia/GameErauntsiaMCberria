package eus.gamerauntsia.mc;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import eus.gamerauntsia.mc.api.WebApi;
import eus.gamerauntsia.mc.user.User;
import eus.gamerauntsia.mc.user.UserNotFoundException;
import net.md_5.bungee.api.ChatColor;

public class EventListeners implements Listener {

	 @EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		 Player player = event.getPlayer();
		 try {
			User user = WebApi.getUser(player.getName());
			String group = user.getRol().toString().toLowerCase();
			if(!GameErauntsiaMCberria.perms.playerInGroup(player, group)) {
				for(String gr : GameErauntsiaMCberria.perms.getPlayerGroups(player))
					GameErauntsiaMCberria.perms.playerRemoveGroup(null, player, gr);
				GameErauntsiaMCberria.perms.playerAddGroup(null,player, group);
			}
		} catch (UserNotFoundException e) {
			player.sendMessage(ChatColor.GREEN + "Erregistratu gamerauntsia.eus webgunean eta gozatu abantailez!");
			player.sendMessage(ChatColor.AQUA + "Laguntza behar baduzu erabili /laguntza <zergatia>");
		}
	}
	 
	 
}
