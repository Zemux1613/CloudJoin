package dev.exceptionworks.cloudjoin.commands;/*

 __                           _      _  _   
/  |                         | |    (_)| |  
`| |   ___   ___   _ __ ___  | |__   _ | |_ 
 | |  / __| / _ \ | '_ ` _ \ | '_ \ | || __|
_| |_| (__ | (_) || | | | | || |_) || || |_ 
\___/ \___| \___/ |_| |_| |_||_.__/ |_| \__|

» Class created by 1combit | Luca
» Date: 18.04.2021 | 18:09
» 1combit#8044


 */

import dev.exceptionworks.cloudjoin.CloudJoin;
import dev.exceptionworks.cloudjoin.util.ItemCreator;
import eu.thesimplecloud.api.CloudAPI;
import eu.thesimplecloud.api.service.ICloudService;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class JoinCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = ((Player) commandSender);

        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("1")) {
                createServerGui(player, CloudJoin.getInstance().getSettingsConfig().getString("Gui-1.Name"), CloudJoin.getInstance().getSettingsConfig().getString("Gui-1.Material"), CloudJoin.getInstance().getSettingsConfig().getString("Gui-1.GROUP"));
            } else {

            }


        }


        return false;
    }
    public void createServerGui(Player player, String title, String material, String group) {
        Inventory inventory = Bukkit.createInventory(null, 9 * 6, title);
        ItemStack glass = ItemCreator.create(Material.STAINED_GLASS_PANE, "§a", 0, 15);

        for (ICloudService service : CloudAPI.getInstance().getCloudServiceGroupManager().getServiceGroupByName(group).getAllServices()) {


            int slot = 10;
            ItemStack item = new ItemStack(Material.valueOf(material));
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(service.getName());
            item.setAmount(1);
            ArrayList<String> itemL = new ArrayList<>();
            itemL.add("§7§m----------------------");
            itemL.add("§7");
            itemL.add("§7MOTD §8➔ §a" + service.getMOTD());
            itemL.add("§7Spieler §8➔ §a" + service.getOnlineCount() + " §8/ §a" + service.getMaxPlayers());
            itemL.add("§7");
            itemL.add("§7§m----------------------");
            itemMeta.setLore(itemL);
            item.setItemMeta(itemMeta);


            inventory.setItem(0, glass);
            inventory.setItem(1, glass);
            inventory.setItem(2, glass);
            inventory.setItem(3, glass);
            inventory.setItem(4, glass);
            inventory.setItem(5, glass);
            inventory.setItem(6, glass);
            inventory.setItem(7, glass);
            inventory.setItem(8, glass);
            inventory.setItem(9, glass);
            inventory.setItem(17, glass);
            inventory.setItem(18, glass);
            inventory.setItem(26, glass);
            inventory.setItem(27, glass);
            inventory.setItem(35, glass);
            inventory.setItem(36, glass);
            inventory.setItem(44, glass);
            inventory.setItem(45, glass);
            inventory.setItem(46, glass);
            inventory.setItem(47, glass);
            inventory.setItem(48, glass);
            inventory.setItem(49, glass);
            inventory.setItem(50, glass);
            inventory.setItem(51, glass);
            inventory.setItem(52, glass);

            inventory.setItem(slot, item);
            slot++;

            player.openInventory(inventory);

        }
    }
}
