package space.chakat.verticality;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VItems {
  public final Item climbableBars;

  VItems(Verticality mod) {
    // Assumes mod.blocks is already initialized.
    this.climbableBars =
        register(
            "climbable_bars",
            mod.blocks.climbableBars,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
  }

  private static Item register(String id, Block block, Settings settings) {
    return Registry.ITEM.register(
        new Identifier(Verticality.ID, id), new BlockItem(block, settings));
  }
}
