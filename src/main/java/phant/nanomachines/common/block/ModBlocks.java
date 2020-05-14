package phant.nanomachines.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;
import phant.nanomachines.common.item.ModItems;
import phant.nanomachines.common.lib.LibMisc;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LibMisc.MOD_ID)
public final class ModBlocks {

  @ObjectHolder("nano_research_bench")
  public static Block nanoResearchBench;

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> evt) {
    IForgeRegistry<Block> r = evt.getRegistry();

    Block.Properties builder =
        Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 10).sound(SoundType.STONE);
    register(r, new BlockMod(builder), "nano_research_bench");
  }

  @SubscribeEvent
  public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
    IForgeRegistry<Item> r = evt.getRegistry();
    Item.Properties props = ModItems.defaultBuilder();

    register(r, new BlockItem(nanoResearchBench, props), "nano_research_bench");
  }

  public static <V extends IForgeRegistryEntry<V>> void register(
      IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, ResourceLocation name) {

    reg.register(thing.setRegistryName(name));
  }

  public static <V extends IForgeRegistryEntry<V>> void register(
      IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, String name) {
    register(reg, thing, new ResourceLocation(LibMisc.MOD_ID, name));
  }
}
