#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Grant Mills
 * @since 5/20/16
 * An example event listener
 */
public final class ExamplePlayerJoinListener implements Listener {

	@EventHandler
	public void onLogin(PlayerJoinEvent event) {
		Player playerLoggingOn = event.getPlayer();
		playerLoggingOn.sendMessage("You logged on!");
	}
}
