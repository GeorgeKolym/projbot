package Dbotpackage.nCommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Calculate extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        String[] message = event.getMessage().getContentRaw().split(" ");

        if(message.length == 1 && message[0].equalsIgnoreCase("$calculate")){
            event.getChannel().sendMessage("To use this command type(without brackets): !calculate [add/sub] [first-num] [second-num]").queue();
        }else if(message[0].equalsIgnoreCase("$calculate") && message[1].equalsIgnoreCase("add")){
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The Result is: " + (num1 + num2)).queue();
        }else if(message[0].equalsIgnoreCase("$calculate") && message[1].equalsIgnoreCase("sub")){
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The Result is: " + (num1 - num2)).queue();
        } else if(message[0].equalsIgnoreCase("$calculate") && message[1].equalsIgnoreCase("mul")){
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The Result is: " + (num1 * num2)).queue();
        } else if(message[0].equalsIgnoreCase("$calculate") && message[1].equalsIgnoreCase("div")) {
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The Result is: " + (num1 / num2)).queue();
        }
        }

}
