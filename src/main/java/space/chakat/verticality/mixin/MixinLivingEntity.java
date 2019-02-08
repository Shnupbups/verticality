package space.chakat.verticality.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import space.chakat.verticality.Climbable;
import space.chakat.verticality.block.ClimbableFenceBlock;

@Mixin(LivingEntity.class)
abstract class MixinLivingEntity extends Entity {

  private MixinLivingEntity() {
    super(null, null);
  }

  @Inject(
    method = "canClimb",
    at = @At(value = "RETURN", ordinal = 2),
    locals = LocalCapture.CAPTURE_FAILHARD,
    allow = 1,
    cancellable = true)
  void onCanClimb(final CallbackInfoReturnable<Boolean> cir, final BlockState state, final Block block) {
    if (block instanceof Climbable) {
      final LivingEntity self = (LivingEntity) (Object) this;
      cir.setReturnValue(((Climbable) block).canClimb(self, state, getPos()));
    } else {
      final BlockPos down = new BlockPos(x, y - 0.5, z);
      final Block below = world.getBlockState(down).getBlock();
      if (below instanceof ClimbableFenceBlock) {
        cir.setReturnValue(y - MathHelper.floor(y) < 0.5);
      }
    }
  }
}
