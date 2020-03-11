package haydena.eggBot.listeners;

import java.util.Scanner;

import haydena.eggBot.Main;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.Message.MentionType;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingListener extends ListenerAdapter 
{
	private MessageChannel channel;
	
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        // We don't want to respond to other bot accounts, including ourself
        Message message = event.getMessage();
        String content = message.getContentRaw(); 
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
//        if (message.isMentioned(arg0, arg1))
//        {
//            MessageChannel channel = event.getChannel();
//            channel.sendMessage(event.getAuthor().getName()).queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
//        }
        
        System.out.println(message.getAuthor() + " from " + message.getChannel() + ", " + message.getGuild() + ": " + content);
        
        Scanner input = new Scanner(System.in);
        if(content.contains("egg"))
        {
        	this.channel = message.getChannel();
        	System.out.println("Bot input summoned to " + this.channel.toString());
        }
        
        while(this.channel != null)
        {
        	this.channel.sendMessage(input.nextLine()).queue();
        }
    }
}
