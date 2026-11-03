package com.aspose.slides;

public class Timing implements ITiming, r0g {
   private final r0g x8;
   private boolean n3;
   float n5 = 0.0F;
   float l6 = 0.0F;
   boolean k5 = false;
   float u3 = Float.NaN;
   float a6 = 1.0F;
   float u9 = Float.NaN;
   int h0 = -1;
   float c8 = 1.0F;
   float t2 = Float.NaN;
   int s7;
   private int y4;

   @Override
   public final float getAccelerate() {
      return this.n5;
   }

   @Override
   public final void setAccelerate(float value) {
      this.n5 = value;
   }

   @Override
   public final float getDecelerate() {
      return this.l6;
   }

   @Override
   public final void setDecelerate(float value) {
      this.l6 = value;
   }

   @Override
   public final boolean getAutoReverse() {
      return this.k5;
   }

   @Override
   public final void setAutoReverse(boolean value) {
      this.k5 = value;
   }

   @Override
   public final float getDuration() {
      return com.aspose.slides.internal.v6g.k5.l6(this.x8, Effect.class) ? ((Effect)this.x8).u3() : this.n5();
   }

   @Override
   public final void setDuration(float value) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.x8, Effect.class)) {
         ((Effect)this.x8).n5(value);
      } else {
         this.n5(value);
      }
   }

   @Override
   public final float getRepeatCount() {
      return this.a6;
   }

   @Override
   public final void setRepeatCount(float value) {
      this.a6 = value;
      if (!com.aspose.slides.ms.System.n1.a6(value)) {
         this.n3 = false;
      }
   }

   @Override
   public final boolean getRepeatUntilEndSlide() {
      return com.aspose.slides.ms.System.n1.a6(this.a6) && !this.getRepeatUntilNextClick();
   }

   @Override
   public final void setRepeatUntilEndSlide(boolean value) {
      if (value) {
         this.a6 = Float.POSITIVE_INFINITY;
         this.n3 = false;
      } else if (!this.getRepeatUntilNextClick()) {
         this.a6 = 1.0F;
      }
   }

   @Override
   public final boolean getRepeatUntilNextClick() {
      return this.n3;
   }

   @Override
   public final void setRepeatUntilNextClick(boolean value) {
      this.n3 = value;
      if (value) {
         this.a6 = Float.POSITIVE_INFINITY;
      }
   }

   @Override
   public final float getRepeatDuration() {
      return this.u9;
   }

   @Override
   public final void setRepeatDuration(float value) {
      this.u9 = value;
   }

   @Override
   public final int getRestart() {
      return this.h0;
   }

   @Override
   public final void setRestart(int value) {
      this.h0 = value;
   }

   @Override
   public final boolean getRewind() {
      Effect var1 = com.aspose.slides.internal.v6g.k5.n5(this.x8, Effect.class);
      if (var1 != null && var1.getPresetClassType() == 4 && var1.getTargetShape() != null) {
         IAudioFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getTargetShape(), IAudioFrame.class);
         if (var2 != null) {
            return var2.getRewindAudio();
         }

         IVideoFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var1.getTargetShape(), IVideoFrame.class);
         if (var3 != null) {
            return var3.getRewindVideo();
         }
      }

      return this.l6() == 0;
   }

   @Override
   public final void setRewind(boolean value) {
      boolean var2 = false;
      Effect var3 = com.aspose.slides.internal.v6g.k5.n5(this.x8, Effect.class);
      if (var3 != null && var3.getPresetClassType() == 4 && var3.getTargetShape() != null) {
         IAudioFrame var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getTargetShape(), IAudioFrame.class);
         if (var4 != null) {
            var4.setRewindAudio(value);
            var2 = true;
         } else {
            IVideoFrame var5 = com.aspose.slides.internal.v6g.k5.n5(var3.getTargetShape(), IVideoFrame.class);
            if (var5 != null) {
               var5.setRewindVideo(value);
               var2 = true;
            }
         }
      }

      if (!var2) {
         this.n5(value ? 0 : 2);
      }
   }

   @Override
   public final float getSpeed() {
      return this.c8;
   }

   @Override
   public final void setSpeed(float value) {
      this.c8 = value;
   }

   @Override
   public final float getTriggerDelayTime() {
      return this.t2;
   }

   @Override
   public final void setTriggerDelayTime(float value) {
      this.t2 = value;
   }

   @Override
   public final int getTriggerType() {
      return this.s7;
   }

   @Override
   public final void setTriggerType(int value) {
      this.s7 = value;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.x8;
   }

   Timing(r0g parentImmediate) {
      this.x8 = parentImmediate;
   }

   final float n5() {
      return this.u3;
   }

   final void n5(float var1) {
      this.u3 = var1;
   }

   final int l6() {
      return this.y4;
   }

   final void n5(int var1) {
      this.y4 = var1;
   }

   final void n5(ITiming var1) {
      this.setAccelerate(var1.getAccelerate());
      this.setDecelerate(var1.getDecelerate());
      this.setAutoReverse(var1.getAutoReverse());
      this.n5(((Timing)var1).n5());
      this.setRepeatCount(var1.getRepeatCount());
      this.setRepeatDuration(var1.getRepeatDuration());
      this.setRestart(var1.getRestart());
      this.setSpeed(var1.getSpeed());
      this.setTriggerDelayTime(var1.getTriggerDelayTime());
      this.setTriggerType(var1.getTriggerType());
   }
}
