package eus.gamerauntsia.mc.user;

	
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String username) {
		super(username + " erabiltzailea ez da aurkitu");
	}

}



