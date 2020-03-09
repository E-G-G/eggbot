package haydena.eggBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity.ActivityType;

public class Main 
{
//	public static JDA jda;
	
	public static void main(String[] args) throws LoginException
	{
		JDABuilder builder = new JDABuilder();
		builder.setToken("Njg2NjIzNzkxMjc0NjU1NzU3.XmZ7lA.Z12TOUg-u7gsYXt-7R6Vnu9wQ5I");
		builder.setStatus(OnlineStatus.ONLINE);
		builder.build();		
		
//		builder.addEventListeners(new GuildMessageRecieved());
		
//		builder.build();
		
	}
}
