package com.aspose.slides;

public class SlideShowTransition extends DomObject<BaseSlide> implements ISlideShowTransition {
   TransitionValueBase n5;
   boolean l6 = true;
   int k5 = 0;
   long u3 = 0L;
   Audio a6;
   private boolean c8;
   private boolean t2;
   int h0 = -1;
   private final t6r s7;
   private final w9d x8;
   private boolean n3;

   SlideShowTransition(BaseSlide parentImmediate) {
      super(parentImmediate);
      this.n5 = new TransitionValueBase(0);
      this.s7 = new t6r(this);
      this.x8 = new w9d();
   }

   final t6r n5() {
      return this.s7;
   }

   final w9d l6() {
      return this.x8;
   }

   @Override
   public final IAudio getSound() {
      return this.a6;
   }

   @Override
   public final void setSound(IAudio value) {
      this.a6 = (Audio)value;
   }

   @Override
   public final int getSoundMode() {
      return this.h0;
   }

   @Override
   public final void setSoundMode(int value) {
      this.h0 = value;
   }

   @Override
   public final boolean getSoundLoop() {
      return this.t2;
   }

   @Override
   public final void setSoundLoop(boolean value) {
      this.t2 = value;
   }

   @Override
   public final boolean getAdvanceOnClick() {
      return this.l6;
   }

   @Override
   public final void setAdvanceOnClick(boolean value) {
      this.l6 = value;
   }

   @Override
   public final boolean getAdvanceAfter() {
      return this.n3;
   }

   @Override
   public final void setAdvanceAfter(boolean value) {
      this.n3 = value;
   }

   @Override
   public final long getAdvanceAfterTime() {
      return this.u3;
   }

   @Override
   public final void setAdvanceAfterTime(long value) {
      this.u3 = value;
      this.setAdvanceAfter(true);
   }

   @Override
   public final int getSpeed() {
      return this.k5;
   }

   @Override
   public final void setSpeed(int value) {
      this.k5 = value;
   }

   @Override
   public final ITransitionValueBase getValue() {
      return this.n5;
   }

   @Override
   public final int getType() {
      return this.n5.n5;
   }

   @Override
   public final void setType(int value) {
      TransitionValueBase var2 = n5(value);
      if (var2 != null) {
         this.n5 = var2;
      }

      int var3 = 0;
      int[] var4 = new int[]{this.k5};
      int[] var5 = new int[]{0};
      boolean var6 = n5(value, var4, var5);
      this.k5 = var4[0];
      var3 = var5[0];
      if (var6) {
         this.s7.n5(com.aspose.slides.ms.System.a3.l6(var3));
      }

      this.n5().k5();
   }

   @Override
   public final boolean getSoundIsBuiltIn() {
      return this.c8;
   }

   @Override
   public final void setSoundIsBuiltIn(boolean value) {
      this.c8 = value;
   }

   @Override
   public final String getSoundName() {
      if (this.a6 == null) {
         throw new PptxException("Sound property is not assigned. Sound property must be assigned to use the SoundName property.");
      } else {
         return this.a6.n5().n5();
      }
   }

   @Override
   public final void setSoundName(String value) {
      if (this.a6 == null) {
         throw new PptxException("Sound property is not assigned. Sound property must be assigned to use the SoundName property.");
      }

      this.a6.n5().n5(value);
   }

   @Override
   public final int getDuration() {
      byte var1 = -1;
      int[] var2 = new int[]{-1};
      return com.aspose.slides.ms.System.a3.n5(this.s7.n5(), var2) ? var2[0] : -1;
   }

   @Override
   public final void setDuration(int value) {
      this.s7.n5(value < 0 ? null : com.aspose.slides.ms.System.a3.l6(value));
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.internal.v6g.k5.l6(obj, SlideShowTransition.class) ? this.n5((ISlideShowTransition)obj) : false;
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   final boolean n5(ISlideShowTransition var1) {
      if (var1 == null) {
         return false;
      }

      SlideShowTransition var2 = (SlideShowTransition)var1;
      return this.a6 == null ^ var2.a6 == null
         ? false
         : this.n5.n5(var2.n5)
            && this.l6 == var2.l6
            && this.k5 == var2.k5
            && this.u3 == var2.u3
            && this.getAdvanceAfter() == var2.getAdvanceAfter()
            && (this.a6 == null || this.a6.k5() == var2.a6.k5())
            && this.c8 == var2.c8
            && this.t2 == var2.t2
            && this.h0 == var2.h0
            && this.s7.n5(var2.s7)
            && this.x8.n5(var2.x8);
   }

   final void l6(ISlideShowTransition var1) {
      if (var1 != null) {
         SlideShowTransition var2 = (SlideShowTransition)var1;
         this.n5 = var2.n5;
         this.k5 = var2.k5;
         this.l6 = var2.l6;
         this.u3 = var2.u3;
         this.setAdvanceAfter(var2.getAdvanceAfter());
         this.t2 = var2.t2;
         this.c8 = var2.c8;
         this.h0 = var2.h0;
         this.a6 = var2.a6;
         this.x8.n5(var2.x8.n5());
         this.s7.n5(var2.s7.n5());
      }
   }

   static TransitionValueBase n5(int var0) {
      switch (var0) {
         case 0:
            return new TransitionValueBase(0);
         case 1:
         case 15:
         case 31:
         case 32:
            OrientationTransition var12 = new OrientationTransition(var0);
            var12.setDirection((byte)1);
            return var12;
         case 2:
         case 4:
            return new OrientationTransition(var0);
         case 3:
         case 7:
         case 8:
         case 10:
         case 11:
         case 14:
         case 18:
         case 26:
         case 40:
         case 46:
         case 48:
         case 49:
         case 50:
            return new EmptyTransition(var0);
         case 5:
         case 12:
            return new EightDirectionTransition(var0);
         case 6:
            return new OptionalBlackTransition(var0);
         case 9:
            return new OptionalBlackTransition(var0);
         case 13:
            SideDirectionTransition var11 = new SideDirectionTransition(var0);
            var11.setDirection(1);
            return var11;
         case 16:
            SplitTransition var10 = new SplitTransition(var0);
            var10.setOrientation((byte)1);
            return var10;
         case 17:
            return new CornerDirectionTransition(var0);
         case 19:
            return new WheelTransition(var0);
         case 20:
         case 27:
         case 28:
         case 29:
         case 30:
            return new SideDirectionTransition(var0);
         case 21:
            return new InOutTransition(var0);
         case 22:
            SideDirectionTransition var9 = new SideDirectionTransition(var0);
            var9.setDirection(3);
            return var9;
         case 23:
         case 24:
         case 47:
         case 54:
         case 55:
            LeftRightDirectionTransition var8 = new LeftRightDirectionTransition(var0);
            var8.setDirection(1);
            return var8;
         case 25:
            return new RippleTransition(var0);
         case 33:
         case 34:
         case 35:
         case 44:
         case 45:
         case 51:
         case 52:
         case 53:
            LeftRightDirectionTransition var7 = new LeftRightDirectionTransition(var0);
            var7.setDirection(0);
            return var7;
         case 36:
            SideDirectionTransition var6 = new SideDirectionTransition(var0);
            var6.setDirection(1);
            return var6;
         case 37:
            GlitterTransition var5 = new GlitterTransition(var0);
            var5.setDirection(0);
            var5.setPattern(1);
            return var5;
         case 38:
            InOutTransition var4 = new InOutTransition(var0);
            var4.setDirection(0);
            return var4;
         case 39:
            FlyThroughTransition var3 = new FlyThroughTransition(var0);
            var3.setDirection(0);
            return var3;
         case 41:
            return new ShredTransition(var0);
         case 42:
            RevealTransition var2 = new RevealTransition(var0);
            var2.setDirection(1);
            return var2;
         case 43:
            return new WheelTransition(var0);
         case 56:
            MorphTransition var1 = new MorphTransition(var0);
            var1.setMorphType(0);
            return var1;
         default:
            return null;
      }
   }

   static boolean n5(int var0, int[] var1, int[] var2) {
      switch (var0) {
         case 0:
            return false;
         case 1:
         case 28:
         case 30:
         case 34:
         case 35:
            var1[0] = 2;
            var2[0] = 1600;
            break;
         case 2:
            var1[0] = 2;
            var2[0] = 2500;
            break;
         case 3:
         case 7:
         case 39:
            var1[0] = 2;
            var2[0] = 800;
            break;
         case 4:
         case 10:
         case 14:
            return false;
         case 5:
         case 11:
         case 12:
         case 13:
         case 15:
         case 17:
         case 18:
         case 19:
         case 20:
         case 40:
         case 43:
            var1[0] = 2;
            var2[0] = 1000;
            break;
         case 6:
            var1[0] = 0;
            var2[0] = 100;
            break;
         case 8:
         case 21:
         case 24:
         case 27:
            var1[0] = 2;
            var2[0] = 1200;
            break;
         case 9:
            var1[0] = 1;
            var2[0] = 700;
            break;
         case 16:
         case 32:
            var1[0] = 2;
            var2[0] = 1500;
            break;
         case 22:
            var1[0] = 2;
            var2[0] = 4000;
            break;
         case 23:
            var1[0] = 2;
            var2[0] = 1100;
            break;
         case 25:
         case 31:
            var1[0] = 2;
            var2[0] = 1400;
            break;
         case 26:
            var1[0] = 2;
            var2[0] = 4400;
            break;
         case 29:
         case 33:
         case 44:
         case 45:
         case 47:
         case 48:
         case 49:
         case 50:
         case 56:
            var1[0] = 2;
            var2[0] = 2000;
            break;
         case 36:
            var1[0] = 2;
            var2[0] = 1300;
            break;
         case 37:
            var1[0] = 2;
            var2[0] = 3900;
            break;
         case 38:
            var1[0] = 2;
            var2[0] = 900;
            break;
         case 41:
            var1[0] = 2;
            var2[0] = 3000;
            break;
         case 42:
            var1[0] = 2;
            var2[0] = 3400;
            break;
         case 46:
            var1[0] = 2;
            var2[0] = 6000;
            break;
         case 51:
         case 52:
         case 53:
         case 54:
            var1[0] = 2;
            var2[0] = 1250;
            break;
         case 55:
            var1[0] = 2;
            var2[0] = 3250;
            break;
         default:
            return false;
      }

      return true;
   }
}
