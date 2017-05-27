package org.teamavion.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.teamavion.core.MCUtils.automation.SetupHelper;
import org.teamavion.core.systems.tech.wrench.ItemAvionWrench;

@Mod(modid = Ref.MODID, version = Ref.VERSION, name = "Team Avion Core!")
public class TeamAvionCore {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        SetupHelper.setup(ItemAvionWrench.class);
    }
}
