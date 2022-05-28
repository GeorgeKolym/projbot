package Dbotpackage.ACommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;


public class Filter extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

    if(FilterOnOff.filterOn){
                String[] LIST_OF_BAD_WORDS = {"anal", "anus", "arse", "ass", "motherfucker", "balls", "bastard", "bitch", "blowjob", "blow job", "buttplug","cock","coon","cunt","dildo","fag","dyke","fuck","fucking","nigger","Goddamn","jizz","nigga","pussy","shit","whore"};
                String[] message = event.getMessage().getContentRaw().split(" ");
                for(int i = 0;i < message.length;i++){
                    boolean badWord = false;
                    //Check each message for each bad word
                    for(int b = 0; b < LIST_OF_BAD_WORDS.length;b++){
                        if (message[i].equalsIgnoreCase(LIST_OF_BAD_WORDS[b])){
                            event.getMessage().delete().queue();
                            badWord = true;
                            if(FilterMessage.allowed){ //Prints a message saying watch your language IF enabled by $filtermessage
                                event.getChannel().sendMessage("Watch yo vernacular(mouth) " + event.getMember().getUser().getName()).queue();
                            }
                        }
                    }
                    System.out.println(message[i] + " " + badWord); //Just a report for console
                }
            }
        }
    }






