package eus.gamerauntsia.mc.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import eus.gamerauntsia.mc.user.User;
import eus.gamerauntsia.mc.user.UserNotFoundException;

public class WebApi {

	public static User getUser(String mcName) throws UserNotFoundException { //FIXME
		Object obj = execUri("https://gamerauntsia.eus/api/1.0/get_minecraft_user?username=" + mcName); 
		if(obj == null || obj instanceof Boolean)
			throw new UserNotFoundException(mcName);
		else
			return new User((JSONObject) obj);
	}
	
	public static boolean sendMsg(String user, String msg) {
		Object obj = WebApi.execUri("https://gamerauntsia.eus/api/1.0/send_mctelebot_msg/" + user +"/?text=" + msg);
		return (obj != null && (Boolean) obj);
	}
	
	
	public static Object execUri(String uri) {
		Object obj = null;
		try {
            URL url =  new URL(uri);
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            JSONParser jsonParser = new JSONParser();
            obj = jsonParser.parse(new InputStreamReader(stream, "UTF-8"));

		}catch(IOException | ParseException e) {
			System.out.println("Errorea webgunearen konexioan");
		}
		
		return obj;	
	}
	


}
