package dev.exceptionworks.cloudjoin.listener;/*

 __                           _      _  _   
/  |                         | |    (_)| |  
`| |   ___   ___   _ __ ___  | |__   _ | |_ 
 | |  / __| / _ \ | '_ ` _ \ | '_ \ | || __|
_| |_| (__ | (_) || | | | | || |_) || || |_ 
\___/ \___| \___/ |_| |_| |_||_.__/ |_| \__|

» Class created by 1combit | Luca
» Date: 18.04.2021 | 18:32
» 1combit#8044


 */

import dev.exceptionworks.cloudjoin.CloudJoin;
import eu.thesimplecloud.api.CloudAPI;
import eu.thesimplecloud.api.player.ICloudPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import sun.security.krb5.internal.crypto.CksumType;

public class ClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = ((Player) event.getWhoClicked());
        ICloudPlayer iCloudPlayer = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(player.getUniqueId());


        String gui1 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-1.Name");
        String gui2 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-2.Name");
        String gui3 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-3.Name");
        String gui4 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-4.Name");
        String gui5 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-5.Name");
        String gui6 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-6.Name");
        String gui7 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-7.Name");
        String gui8 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-8.Name");
        String gui9 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-9.Name");
        String gui10 = CloudJoin.getInstance().getSettingsConfig().getString("Gui-10.Name");

        if (event.getClickedInventory().getName().equalsIgnoreCase(gui1) || event.getClickedInventory().getName().equalsIgnoreCase(gui2) || event.getClickedInventory().getName().equalsIgnoreCase(gui2)
        || event.getClickedInventory().getName().equalsIgnoreCase(gui3)  || event.getClickedInventory().getName().equalsIgnoreCase(gui4)  || event.getClickedInventory().getName().equalsIgnoreCase(gui5)  || event.getClickedInventory().getName().equalsIgnoreCase(gui6)
                || event.getClickedInventory().getName().equalsIgnoreCase(gui7)  || event.getClickedInventory().getName().equalsIgnoreCase(gui8)  || event.getClickedInventory().getName().equalsIgnoreCase(gui9)  || event.getClickedInventory().getName().equalsIgnoreCase(gui10)) {
            event.setCancelled(true);
            iCloudPlayer.connect(CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(event.getCurrentItem().getItemMeta().getDisplayName()));

        }


    }


}
