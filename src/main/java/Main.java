import events.Hello;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {

    public static void main(String[] args) {

        JDA jda = JDABuilder.createDefault("MTA1NDQ2NzI0NjE0NTE1NTA3Mw.GLRPMX.8ZOx1fXD8kGeBlD6somy-FL3mClWf6V25zkleo")
                .setActivity(Activity.watching("Pornhub.com")).enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build();

        jda.addEventListener(new Hello());

    }
}