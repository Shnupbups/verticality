package space.chakat.verticality.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import space.chakat.verticality.IClimbable;

public class BlockClimbableBars extends PaneBlock implements IClimbable {
  public BlockClimbableBars(Settings settings) {
    super(settings);
  }

  @Override
  public boolean canClimb(LivingEntity entity, BlockState state, BlockPos position) {
    return true;
  }
}
