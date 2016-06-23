#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import ${package}.command.ExampleCommandExecutor;
import ${package}.listener.ExamplePlayerJoinListener;

public class ${pluginFile} extends JavaPlugin {

	/**
     *  This code is called after the server starts and after the /reload command
     **/
    @Override
    public void onEnable() {
		//Register Event Listeners
		PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvents(new ExamplePlayerJoinListener(), this);

		//Register Command Executors
		this.getCommand("exampleCommand").setExecutor(new ExampleCommandExecutor());
    }

	/**
     *  This code is called before the server stops and after the /reload command
     **/
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());
    }
}
