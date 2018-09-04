package eus.gamerauntsia.mc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import eus.gamerauntsia.mc.Utils;
import eus.gamerauntsia.mc.api.WebApi;

public class LaguntzaCommand extends AbstractCommand {

	public static final String NAME = "Laguntza";
	public static final String DESCRIPTION = "Telegramera laguntza mezua bidaltzen duen komandoa";
	public static final String PERMISSION = "ge.user";
	public static final String USAGE = "/laguntza <mezua>";
	
			
	public LaguntzaCommand(CommandSender sender) {
		super(sender, NAME, DESCRIPTION, PERMISSION, USAGE);
		
	}

	@Override
	public void execute(CommandSender sender, Command command, String label, String[] args) {
		if(!hasPermission()) {
			sender.sendMessage("Ez daukazu baimenik");
			return;
		}
		if(args.length < 1) {
			sendUsage();
			return;
		}
		
		if(WebApi.sendMsg(sender.getName(),Utils.arrayToString(args)))
			sender.sendMessage("Mezua ondo bidali da");
		else
			sender.sendMessage("Ezin izan da mezua bidali");
		
	}

}
