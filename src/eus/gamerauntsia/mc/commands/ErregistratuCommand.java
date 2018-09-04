package eus.gamerauntsia.mc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class ErregistratuCommand extends AbstractCommand {

	public static final String NAME = "Erregistratzeko laguntza";
	public static final String DESCRIPTION = "Webgunean erregistratzeko laguntza erakusten du";
	public static final String PERMISSION = "ge.user";
	public static final String USAGE = "/erregistratu";
	
			
	public ErregistratuCommand(CommandSender sender) {
		super(sender, NAME, DESCRIPTION, PERMISSION, USAGE);
		
	}

	@Override
	public void execute(CommandSender p, Command command, String label, String[] args) {
		if(!hasPermission()) {
			p.sendMessage("Ez daukazu baimenik");
			return;
		}
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.GREEN + "====================================================");
	       p.sendMessage(ChatColor.AQUA + "          Zerbitzarian jolasteko jarraitu beharreko pausoak");
	       p.sendMessage(ChatColor.YELLOW + "1- gamerauntsia.eus orrialdean erregistratu");
	       p.sendMessage(ChatColor.YELLOW + "2- Kontua e-postan aktibatu "+ChatColor.RED +" (Ez ahaztu spam karpeta!)");
	       p.sendMessage(ChatColor.YELLOW + "3- Profila editatu atalean, plataformetan MC kontua gehitu");
	       p.sendMessage(ChatColor.YELLOW + "4- gamerauntsia.eus/zerbitzariak/minecraft orrialdean sartu, arauak irakurri, eta izena emateko botoia sakatu! ");
	       p.sendMessage(ChatColor.GREEN + "");
	       p.sendMessage(ChatColor.AQUA + "Admin baten laguntza behar izanez gero idatzi /laguntza <zergatia>");
	       p.sendMessage(ChatColor.GREEN + "====================================================");
		
	}

}
