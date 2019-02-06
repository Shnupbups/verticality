package space.chakat.verticality.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import space.chakat.verticality.IClimbable;

@Mixin(LivingEntity.class)
public class MixinLivingEntity {

  @Inject(
      method = "canClimb",
      at =
          @At(
              value = "INVOKE_ASSIGN",
              target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;"),
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true)
  public void onCanClimb(CallbackInfoReturnable<Boolean> cir, BlockState state, Block block) {
    if (block instanceof IClimbable) {
      IClimbable climbable = (IClimbable) block;
      LivingEntity thisEntity = (LivingEntity) (Object) this;
      cir.setReturnValue(climbable.canClimb(thisEntity, state, thisEntity.getPos()));
    }
  }
}
