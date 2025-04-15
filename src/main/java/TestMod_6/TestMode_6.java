package TestMod_6;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "tmv6", name = "Test Mode v6", version = "1.0")
public class TestMode_6 {
	
	public static Item itemTable;
	public static Item itemStol;
	
	public static Block blockTable;
	
	 @EventHandler
	  public void preInit(FMLPreInitializationEvent event) {
	    itemTable = new ItemTable().setUnlocalizedName("ItemTable");
	    itemStol = new ItemStol().setUnlocalizedName("ItemStol");
	    
	    blockTable = new BlockTable(Material.cloth).setBlockName("BlockTable");
	    
	    GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
	    GameRegistry.registerItem(itemStol, itemStol.getUnlocalizedName().substring(5));
	    
	    GameRegistry.registerBlock(blockTable, blockTable.getUnlocalizedName().substring(5));
	  }
	  
	  @EventHandler
	  public void init(FMLInitializationEvent event){
		  log.info("Modblock initialized");
	  }
	  
	  @EventHandler
	  public void postInit(FMLPostInitializationEvent event){
	  
	  }
}
