package eus.gamerauntsia.mc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import eus.gamerauntsia.mc.Utils;
import eus.gamerauntsia.mc.api.WebApi;
import eus.gamerauntsia.mc.user.User;
import eus.gamerauntsia.mc.user.UserNotFoundException;


public class GeCommand extends AbstractCommand {

	public static final String NAME = "GE fitxa";
	public static final String DESCRIPTION = "Webguneko datu baseko jokalariaren fitxa erakusten du";
	public static final String PERMISSION = "ge.admin";
	public static final String USAGE = "/ge <jokalariaren-izena>";
	
			
	public GeCommand(CommandSender sender) {
		super(sender, NAME, DESCRIPTION, PERMISSION, USAGE);
		
	}

	@Override
	public void execute(CommandSender sender, Command command, String label, String[] args) {
		if(!hasPermission()) {
			sender.sendMessage("Ez daukazu baimenik");
			return;
		}
		if(args.length != 1) {
			sendUsage();
			return;
		}
		
		try {
			User user = WebApi.getUser(args[0]);
			Utils.printUser(sender, user);
		} catch (UserNotFoundException e) {
			sender.sendMessage("Jokalaria ez da aurkitu");
		}
		
	}

}

