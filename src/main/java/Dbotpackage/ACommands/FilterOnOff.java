package Dbotpackage.ACommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class FilterOnOff extends ListenerAdapter {

    public static boolean filterOn = true;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

    if (event.getMessage().getContentRaw().equalsIgnoreCase("$togglefilter") && filterOn){
            filterOn = false;
            event.getChannel().sendMessage("The Curse-Filter has been disabled by " + event.getMember().getUser().getName()).queue();
        }else if(event.getMessage().getContentRaw().equalsIgnoreCase("$togglefilter") && !filterOn){
            filterOn = true;
            event.getChannel().sendMessage("The Curse-Filter has been enabled by " + event.getMember().getUser().getName()).queue();
        }
    }
}
