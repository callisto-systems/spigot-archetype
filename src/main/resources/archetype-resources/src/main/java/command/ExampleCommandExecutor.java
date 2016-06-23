#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author Grant Mills
 * @since 5/20/16
 * An example CommandExecutor
 */
public class ExampleCommandExecutor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		commandSender.sendMessage("You have issued an example command");
		return false;
	}
}
