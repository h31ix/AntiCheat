/*
 * AntiCheat for Bukkit.
 * Copyright (C) 2012 H31IX http://h31ix.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package net.h31ix.anticheat.event;

import net.h31ix.anticheat.Anticheat;
import net.h31ix.anticheat.manage.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class EventListener implements Listener 
{
    private static final CheckManager CHECK_MANAGER = AnticheatManager.CHECK_MANAGER;   
    private static final Backend BACKEND = AnticheatManager.BACKEND;  
    private static final Anticheat PLUGIN = Anticheat.getPlugin();
    private static final PlayerManager PLAYER_MANAGER = AnticheatManager.PLAYER_MANAGER;
    
    public void log(String message,Player player)
    {
        if(AnticheatManager.CONFIGURATION.logConsole())
        {
            AnticheatManager.log(player.getName()+" "+message);
            PLAYER_MANAGER.increaseLevel(player);
        }
    }
    
    public CheckManager getCheckManager()
    {
        return CHECK_MANAGER;
    }
    
    public Backend getBackend()
    {
        return BACKEND;
    }  
    
    public Anticheat getPlugin()
    {
        return PLUGIN;
    }    
}
