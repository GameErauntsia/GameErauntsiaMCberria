package eus.gamerauntsia.mc.user;

import org.json.simple.JSONObject;

import eus.gamerauntsia.mc.Utils;

public class User {
	String mcName;
	String uuid;
	String geName;
	String created;
	Rol rol;
	
	public User(String mcName, String uuid) {
		this.mcName = mcName;
		this.uuid = uuid;
	}
	
	public User(JSONObject json) {
		geName = json.get("user").toString();
		mcName = json.get("mc_user").toString();
		uuid = json.get("uuid").toString();
		created = json.get("created").toString();
		rol = Utils.parseString(json.get("rol").toString());
	}

	@Override
	public int hashCode() {
		return uuid.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof User)) return false;
		User user = (User) obj;
		return uuid.equals(user.getUuid());
	}

	@Override
	public String toString() {
		return mcName;
	}
	
	public String getUuid() {
		return uuid;
	}
	
	public String getMcName() {
		return mcName;
	}

	public String getGeName() {
		return geName;
	}
	
	public String getCreated() {
		return created;
	}
	
	public Rol getRol() {
		return rol;
	}
	
}
