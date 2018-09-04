package eus.gamerauntsia.mc;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import eus.gamerauntsia.mc.user.Rol;
import eus.gamerauntsia.mc.user.User;

public class Utils {

	
	public static Rol parseString(String str) {
		switch(str) {
			case "Administrator":
				return Rol.ADMIN;
			case "Normal":
				return Rol.MEMBER;
			case "Vip":
				return Rol.VIP;
			default:
				return Rol.GUEST;
		}

	}
	
	public static String arrayToString(String[] array) {
		return Arrays.toString(array)
        .replaceAll("\\s+", "%20")
        .replace(",", "")
        .replace("[", "")
        .replace("]", "");
	}
	
	public static void printUser(CommandSender sender, User user) {
		sender.sendMessage(formatPrint("Jokalaria: ", user.getMcName()));
		sender.sendMessage(formatPrint("GE kontua: ", user.getGeName()));
		sender.sendMessage(formatPrint("Uuid: ", user.getUuid()));
		sender.sendMessage(formatPrint("Rol: ", user.getRol().toString()));
		sender.sendMessage(formatPrint("Erregistratze data: ", user.getCreated()));
	}
	
	public static String formatPrint(String param, String value) {
		return (ChatColor.YELLOW + param + ChatColor.BLUE+ value);
	}
	
}
