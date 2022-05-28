package Dbotpackage.ACommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class FilterMessage extends ListenerAdapter {

    public static boolean allowed = false;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
       if(FilterOnOff.filterOn) {
            if (event.getMessage().getContentRaw().equalsIgnoreCase("$filtermessage") && !allowed) {
                event.getChannel().sendMessage("Filter Response Has Been Enabled.").queue();
                System.out.println("Enabled");
                allowed = true;
            } else if (event.getMessage().getContentRaw().equalsIgnoreCase("$filtermessage") && allowed) {
                event.getChannel().sendMessage("Filter Response Has Been Disabled.").queue();
                System.out.println("Disabled");
                allowed = false;
            }
        }else if(event.getMessage().getContentRaw().equalsIgnoreCase("$filtermessage") && !FilterOnOff.filterOn){
            event.getChannel().sendMessage("You can't toggle filter response while the filter is off. To turn the filter on, run $togglefilter").queue();
        }


    }

}