package Dbotpackage;


import Dbotpackage.nCommands.Calculate;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import javax.security.auth.login.LoginException;

public class MainDbotc {




    public static void main(String[] args) throws LoginException, InterruptedException {

        JDA bot = JDABuilder.createDefault("OTc3NTA1MDE2MDM2MzI3NDk1.GftgMH.UigLUaM_ICDhpak7glpYmkfmoM5UV6Lc9IGbo8")
                .setActivity(Activity.watching("terrorists bullying citizens!"))
                .addEventListeners(new Calculate())
                .build().
                awaitReady(); //added awaitReady so we can get the Guild not until after the bot is done doing its thing

        //Global Command - Can take up to an hour to register and be available
        bot.upsertCommand("shoot", "You got shot").queue();

        //Guild Command - Added immediately. Make sure you use awaitReady like above.
        Guild testServer = bot.getGuildById("973479624141058098");
        if(testServer != null){

            //Add the guild commands

            testServer.upsertCommand("food", "Announce your favorite food")
                    .addOption(OptionType.STRING, "food", "the name of the food you like", true)
                    .queue();

            testServer.upsertCommand("add", "Add two numbers")
                    .addOptions(
                            new OptionData(OptionType.INTEGER, "operator1", "the first number", true)
                                    .setRequiredRange(1, Integer.MAX_VALUE),
                            new OptionData(OptionType.INTEGER, "operator2", "the second number", true)
                                    .setRequiredRange(1, Integer.MAX_VALUE)
                    )
                    .queue();

        }




    }
    }

