package phant.nanomachines.common.item;

import static phant.nanomachines.common.block.ModBlocks.register;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import phant.nanomachines.common.core.ModItemGroup;
import phant.nanomachines.common.lib.LibMisc;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LibMisc.MOD_ID)
public final class ModItems {
  @ObjectHolder("nanomachine")
  public static Item nanomachine;

  public static Item.Properties defaultBuilder() {
    return new Item.Properties().group(ModItemGroup.NANOMACHINES);
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> evt) {
    IForgeRegistry<Item> r = evt.getRegistry();

    register(r, new Item(defaultBuilder()), "nanomachine");
  }
}
