package me.rllol.smp.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatEvent implements Listener {
    @EventHandler
    public void e(AsyncPlayerChatEvent chatEvent) {
        String message = chatEvent.getMessage();
        message = message.replace("<3", "§c❤");
        chatEvent.setMessage(message);
    }
}
