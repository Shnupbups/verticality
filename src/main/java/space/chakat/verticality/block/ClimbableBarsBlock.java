package space.chakat.verticality.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import space.chakat.verticality.Climbable;

public class ClimbableBarsBlock extends PaneBlock implements Climbable {
  public ClimbableBarsBlock(Settings settings) {
    super(settings);
  }

  public ClimbableBarsBlock(Block type, float hardness, float resistance) {
    this(FabricBlockSettings.copy(type).strength(hardness, resistance).build());
  }
}
