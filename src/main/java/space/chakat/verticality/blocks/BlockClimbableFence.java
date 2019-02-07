package space.chakat.verticality.blocks;

import java.lang.reflect.Field;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import space.chakat.verticality.IClimbable;

public class BlockClimbableFence extends FenceBlock implements IClimbable {
  public BlockClimbableFence(Settings settings) {
    super(settings);
  }

  @Override
  public boolean canClimb(LivingEntity entity, BlockState state, BlockPos position) {
    return true;
  }
}
