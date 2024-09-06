package cn.ksmcbrigade.tsr.mixin;

import cn.ksmcbrigade.tsr.TimeUtil;
import net.minecraft.world.level.storage.PrimaryLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PrimaryLevelData.class)
public class PrimaryLevelDataMixin {
    @Inject(method = "getDayTime",at = @At("HEAD"),cancellable = true)
    public void time(CallbackInfoReturnable<Long> cir){
        cir.setReturnValue(TimeUtil.getMinecraftTime());
    }
}
