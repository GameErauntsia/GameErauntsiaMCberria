package eus.gamerauntsia.mc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import eus.gamerauntsia.mc.commands.AbstractCommand;
import eus.gamerauntsia.mc.commands.ArauakCommand;
import eus.gamerauntsia.mc.commands.ErregistratuCommand;
import eus.gamerauntsia.mc.commands.LaguntzaCommand;
import net.milkbowl.vault.permission.Permission;
import eus.gamerauntsia.mc.commands.GeCommand;

public class GameErauntsiaMCberria extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventListeners(), this);
		setupPermissions();
		System.out.println("GameErauntsiaMC piztu da!");;
	}
	
	@Override
	public void onDisable() {
		System.out.println("GameErauntsiaMC itzali da!");;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		AbstractCommand cmd = null;
        switch(command.getName().toLowerCase()){
        case "ge":
        	cmd = new GeCommand(sender);
        	break;
        case "laguntza":
        	cmd = new LaguntzaCommand(sender);
        	break;
        case "arauak":
        	cmd = new ArauakCommand(sender);
        	break;
        case "erregistratu":
        	cmd = new ErregistratuCommand(sender);
        	break;
        }
		if(cmd != null)
			cmd.execute(sender, command, label, args);
		else
			sender.sendMessage("Laguntza behar baduzu erabili /laguntza <mezua>");
		return true;
	}
	
    public static Permission perms = null;
    
    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }






}
