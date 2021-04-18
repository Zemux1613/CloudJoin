package dev.exceptionworks.cloudjoin;/*

 __                           _      _  _   
/  |                         | |    (_)| |  
`| |   ___   ___   _ __ ___  | |__   _ | |_ 
 | |  / __| / _ \ | '_ ` _ \ | '_ \ | || __|
_| |_| (__ | (_) || | | | | || |_) || || |_ 
\___/ \___| \___/ |_| |_| |_||_.__/ |_| \__|

» Class created by 1combit | Luca
» Date: 18.04.2021 | 17:23
» 1combit#8044


 */

import dev.exceptionworks.cloudjoin.commands.JoinCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class CloudJoin extends JavaPlugin {

    public static CloudJoin instance;
    public File settings = new File(this.getDataFolder()+"/settings.yml");
    public FileConfiguration settingsConfig = YamlConfiguration.loadConfiguration(settings);

    @Override
    public void onEnable() {
        instance = this;

        getCommand("join").setExecutor(new JoinCommand());


        /* Settings.yml */
        settingsConfig.options().header("There you can edit the settings! - Plugin by ExceptionWorks");

        settingsConfig.addDefault("Gui-1.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-1.Material", "STONE");
        settingsConfig.addDefault("Gui-1.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-2.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-2.Material", "STONE");
        settingsConfig.addDefault("Gui-2.GROUP", "CityBuild");



        settingsConfig.addDefault("Gui-3.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-3.Material", "STONE");
        settingsConfig.addDefault("Gui-3.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-4.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-4.Material", "STONE");
        settingsConfig.addDefault("Gui-4.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-5.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-5.Material", "STONE");
        settingsConfig.addDefault("Gui-5.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-6.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-6.Material", "STONE");
        settingsConfig.addDefault("Gui-6.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-7.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-7.Material", "STONE");
        settingsConfig.addDefault("Gui-7.GROUP", "CityBuild");


        settingsConfig.addDefault("Gui-8.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-8.Material", "STONE");
        settingsConfig.addDefault("Gui-8.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-9.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-9.Material", "STONE");
        settingsConfig.addDefault("Gui-9.GROUP", "CityBuild");

        settingsConfig.addDefault("Gui-10.Name", "§aGamemode");
        settingsConfig.addDefault("Gui-10.Material", "STONE");
        settingsConfig.addDefault("Gui-10.GROUP", "CityBuild");



        settingsConfig.options().copyDefaults(true);
        saveCustomYml(settingsConfig, settings);
        /* Settings.yml */

    }

    @Override
    public void onDisable() {

    }

    public static CloudJoin getInstance() {
        return instance;
    }

    public FileConfiguration getSettingsConfig() {
        return settingsConfig;
    }

    public void saveCustomYml(FileConfiguration ymlConfig, File ymlFile) {
        try {
            ymlConfig.save(ymlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
