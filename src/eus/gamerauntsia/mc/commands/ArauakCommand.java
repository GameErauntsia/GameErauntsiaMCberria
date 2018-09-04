package eus.gamerauntsia.mc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class ArauakCommand extends AbstractCommand {

	public static final String NAME = "Arauak";
	public static final String DESCRIPTION = "Zerbiztariko arauak erakusten dituen komandoa";
	public static final String PERMISSION = "ge.user";
	public static final String USAGE = "/arauak";
	
			
	public ArauakCommand(CommandSender sender) {
		super(sender, NAME, DESCRIPTION, PERMISSION, USAGE);
		
	}

	@Override
	public void execute(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.BLUE +"" + ChatColor.BOLD + "=============================================");
        sender.sendMessage(ChatColor.BLUE +"" + ChatColor.BOLD + "             ZERBITZARIKO ARAUAK (Laburbildua)");
        sender.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Zerbitzariko arautegia 3 hitz hauekin laburbildu daiteke");
        sender.sendMessage(ChatColor.GREEN + "1." + ChatColor.BOLD + "- EUSKARA");
        sender.sendMessage(ChatColor.GREEN + "2." + ChatColor.BOLD + "- ERRESPETUA");
        sender.sendMessage(ChatColor.GREEN + "3." + ChatColor.BOLD + "- ERABILERA EGOKIA");
        sender.sendMessage(ChatColor.BOLD + "Arau guztiak ikusteko joan http://goo.gl/hrm1EO orrialdera");
        sender.sendMessage(ChatColor.BLUE +"" + ChatColor.BOLD + "=============================================");
		
	}

}
