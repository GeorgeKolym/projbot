package Dbotpackage.nCommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
/*
public class Invite extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        int timeString = 3600; //seconds in an hour
        String[] message = event.getMessage().getContentRaw().split(" "); //splits message received into an array holding each word in each index
        if (message.length == 1 && message[0].equalsIgnoreCase("$invite")) {  //if they type the command alone, tell them how to use it
            event.getChannel().sendMessage("To use $invite do: $invite create").queue(); //tells user how to use the $invite command
        } else if (message[0].equalsIgnoreCase("$invite") && message[1].equalsIgnoreCase("create")) {
            event.getChannel().sendMessage("Hey " + event.getAuthor().getName() + "! You want to invite someone? Cool!").queue();
            event.getChannel().sendMessage("Give them this link: " + event.getChannel().createInvite().setMaxAge(timeString).complete().getURL()).queue(); //create an invite, set length to 1 hour, return url as string
            event.getChannel().sendMessage("The invite expires in: " + timeString + " seconds.").queue(); //Tells them how long the invite will exist for
        }
    }
}
*/