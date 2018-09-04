package eus.gamerauntsia.mc.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public abstract class AbstractCommand {
	//Based in https://github.com/r-clancy/PlugMan/blob/master/src/main/java/com/rylinaux/plugman/command/AbstractCommand.java
	private CommandSender sender;
	private String name;
	private String description;
	private String permission;
	private String usage;
	
	public AbstractCommand (CommandSender sender,String name, String description, String permission, String usage) {
        this.sender = sender;
        this.name = name;
        this.description = description;
        this.permission = permission;
        this.usage = usage;
	}
	
    public CommandSender getSender() {
        return sender;
    }
    
    public String getName() {
    	return name;
    }

	public String getDescription() {
		return description;
	}

	public Boolean hasPermission() {
		return sender.hasPermission(permission) || isSenderConsole();
	}

	private boolean isSenderConsole() {
		return (sender instanceof ConsoleCommandSender);
	}
	
	/*private boolean isSenderPlayer() {
		return (sender instanceof Player);
	}*/

	public String getUsage() {
		return usage;
	}
	
	public void sendUsage() {
		sender.sendMessage("Erabilera egokia: ");
		sender.sendMessage(usage);
	}
	
	public abstract void execute (CommandSender sender, Command command, String label, String[] args);
    
	
	
}
