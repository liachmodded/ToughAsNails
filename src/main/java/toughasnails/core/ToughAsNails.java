package toughasnails.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import toughasnails.command.TANCommand;
import toughasnails.init.ModHandlers;
import toughasnails.init.ModPotions;

@Mod(modid = ToughAsNails.MOD_ID, name = ToughAsNails.MOD_NAME)
public class ToughAsNails
{
    public static final String MOD_NAME = "Tough As Nails";
    public static final String MOD_ID = "ToughAsNails";
    
    @Instance(MOD_ID)
    public static ToughAsNails instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModPotions.init();
        ModHandlers.init();
    }
    
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new TANCommand());
    }
}