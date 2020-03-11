package haydena.eggBot;

import java.util.Scanner;

import haydena.eggBot.listeners.PingListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.MessageChannel;

public class Main 
{
//	public static JDA jda;
	public static String prefix = "@Egg#7301";
	
	public static void main(String[] args) throws Exception
	{
		JDA api = new JDABuilder("Njg2NjIzNzkxMjc0NjU1NzU3.Xmkyrg.hWk5VgIZvuLHmM7mExMntU1HFGg").build();
		api.addEventListener(new PingListener());
		

			
		
	}
}
