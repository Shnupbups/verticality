package space.chakat.verticality.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import space.chakat.verticality.IClimbable;

@Mixin(LadderBlock.class)
public abstract class MixinLadderBlock implements IClimbable {

  @Override
  public boolean canClimb(LivingEntity entity, BlockState state, BlockPos position) {
    return true;
  }
}
