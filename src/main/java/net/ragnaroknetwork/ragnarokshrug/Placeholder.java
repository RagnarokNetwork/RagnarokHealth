package net.ragnaroknetwork.ragnarokshrug;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.OfflinePlayer;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Placeholder extends PlaceholderExpansion {
    private final RagnarokHealth plugin;

    public Placeholder(RagnarokHealth plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getAuthor() {
        return "Bloedarend";
    }

    @Override
    public String getIdentifier() {
        return "ragnarok";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public boolean canRegister(){
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        if (player == null) {
            return "";
        }

        EntityPlayer entityPlayer = ((CraftPlayer) player).getHandle();

        Float absorption = entityPlayer.getAbsorptionHearts();
        Double heatlh = player.getHealth();
        int total = (int) (absorption + heatlh);

        String value = String.valueOf(total);

        if (identifier.equals("health")) {
            return value;
        }

        return null;
    }
}
