package phant.nanomachines.common.core;

import javax.annotation.Nonnull;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import phant.nanomachines.common.item.ModItems;

public class ModItemGroup {
  public static final ItemGroup NANOMACHINES =
      (new ItemGroup("nanomachines") {
        @Override
        @Nonnull
        public ItemStack createIcon() {
          return new ItemStack(ModItems.nanomachine);
        }
      });
}
