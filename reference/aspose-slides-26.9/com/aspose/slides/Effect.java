package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class Effect implements IEffect, r0g {
   private IColorFormat u9;
   private float h0;
   Sequence n5;
   private final z9u c8 = new z9u();
   BehaviorCollection l6 = new BehaviorCollection();
   Timing k5;
   private ParagraphCollection t2;
   int u3;
   int a6;
   private int s7;
   private int x8;

   @Override
   public final ISequence getSequence() {
      return this.n5;
   }

   @Override
   public final ITextAnimation getTextAnimation() {
      return this.k5().a6();
   }

   @Override
   public final int getPresetClassType() {
      return this.k5().y4();
   }

   @Override
   public final void setPresetClassType(int value) {
      this.k5().k5(value);
      Effect var2 = this.n5.n5(this.k5().u3(), this.k5().e2(), this.k5().t9(), this.k5().y4(), this.getTiming().getTriggerType());
      this.l6.clear();
      this.l6 = var2.l6;
      this.k5().l6(var2.k5().x8());
      this.k5().n5(this.n5(value));
      ((Timing)this.getTiming()).n5(((Timing)var2.getTiming()).l6());
      this.n5.remove(var2);
   }

   @Override
   public final int getType() {
      return this.k5().e2();
   }

   @Override
   public final void setType(int value) {
      this.k5().u3(value);
      Effect var2 = (Effect)this.n5.addEffect(this.k5().u3(), this.k5().e2(), 0, this.getTiming().getTriggerType());
      this.l6.clear();
      this.l6 = var2.l6;
      this.k5().l6(var2.k5().x8());
      this.k5().k5(var2.k5().y4());
      this.k5().a6(var2.k5().t9());
      this.k5().n5(this.n5(this.k5().y4()));
      ((Timing)this.getTiming()).n5(((Timing)var2.getTiming()).l6());
      this.n5.remove(var2);
   }

   @Override
   public final int getSubtype() {
      return this.k5().t9();
   }

   @Override
   public final void setSubtype(int value) {
      this.k5().a6(value);
      Effect var2 = this.n5.n5(this.k5().u3(), this.k5().e2(), this.k5().t9(), this.k5().y4(), this.getTiming().getTriggerType());
      this.l6.clear();
      this.l6 = var2.l6;
      this.k5().l6(var2.k5().x8());
      ((Timing)this.getTiming()).n5(((Timing)var2.getTiming()).l6());
      this.n5.remove(var2);
   }

   @Override
   public final IBehaviorCollection getBehaviors() {
      return this.l6;
   }

   @Override
   public final void setBehaviors(IBehaviorCollection value) {
      this.l6 = (BehaviorCollection)value;
   }

   @Override
   public final ITiming getTiming() {
      return this.k5;
   }

   @Override
   public final void setTiming(ITiming value) {
      this.k5 = (Timing)value;
   }

   @Override
   public final IShape getTargetShape() {
      return this.k5().u3();
   }

   @Override
   public final IAudio getSound() {
      return this.c8.z1();
   }

   @Override
   public final void setSound(IAudio value) {
      this.c8.n5(value);
      this.c8.n5((com.aspose.slides.internal.k4y.h7e)null);
      if (value != null) {
         this.c8.k5(false);
      }
   }

   @Override
   public final boolean getStopPreviousSound() {
      return this.c8.t4();
   }

   @Override
   public final void setStopPreviousSound(boolean value) {
      this.c8.k5(value);
      this.c8.n5((com.aspose.slides.internal.k4y.h7e)null);
      if (value) {
         this.c8.n5((IAudio)null);
      }
   }

   @Override
   public final int getAfterAnimationType() {
      return this.s7;
   }

   @Override
   public final void setAfterAnimationType(int value) {
      this.s7 = value;
      if (value != 1) {
         ((ColorFormat)this.getAfterAnimationColor()).c8();
      }
   }

   @Override
   public final IColorFormat getAfterAnimationColor() {
      return this.u9;
   }

   @Override
   public final void setAfterAnimationColor(IColorFormat value) {
      this.u9 = value;
   }

   @Override
   public final int getAnimateTextType() {
      return this.x8;
   }

   @Override
   public final void setAnimateTextType(int value) {
      this.x8 = value;
      if (value == 0) {
         this.setDelayBetweenTextParts(0.0F);
      }
   }

   @Override
   public final float getDelayBetweenTextParts() {
      return this.h0;
   }

   @Override
   public final void setDelayBetweenTextParts(float value) {
      this.h0 = value;
   }

   private void n5(Object var1, u5q var2) {
      if (com.aspose.slides.ms.System.j8.l6((ParagraphCollection)var1, this.t2)) {
         if (this.t2.getCount() == 0) {
            this.u3 = -1;
            this.a6 = -1;
         } else {
            if (this.u3 < 0) {
               this.u3 = 0;
            } else if (this.u3 > this.t2.getCount() - 1) {
               this.u3 = this.t2.getCount() - 1;
            }

            if (this.a6 < 0) {
               this.a6 = 0;
            } else if (this.a6 > this.t2.getCount() - 1) {
               this.a6 = this.t2.getCount() - 1;
            }
         }
      }
   }

   final Paragraph n5() {
      return this.t2 != null && this.u3 > -1 ? (Paragraph)this.t2.get_Item(this.u3) : null;
   }

   final Paragraph l6() {
      return this.t2 != null && this.a6 > -1 ? (Paragraph)this.t2.get_Item(this.a6) : null;
   }

   Effect(Sequence parent) {
      this.c8.n5(-1);
      this.c8.u9();
      this.l6 = new BehaviorCollection();
      this.k5 = new Timing(this);
      this.u3 = -1;
      this.a6 = -1;
      this.n5 = parent;
      this.l6.n5 = this;
      this.s7 = 0;
      this.setAfterAnimationColor(new ColorFormat(parent.l6().n5()));
      this.x8 = 0;
   }

   final z9u k5() {
      return this.c8;
   }

   final void n5(int var1, int var2, ParagraphCollection var3) {
      if (var3 != null) {
         this.u3 = var1;
         this.a6 = var2;
         this.t2 = var3;
         this.t2.l6.l6(new Effect$1(this));
      }
   }

   final float u3() {
      if (this.getPresetClassType() == 0) {
         return this.a6();
      }

      if (this.getPresetClassType() == 1) {
         float var12 = 0.0F;
         IGenericEnumerator var13 = this.getBehaviors().iterator();

         try {
            while (var13.hasNext()) {
               IBehavior var14 = (IBehavior)var13.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var14, SetEffect.class)
                  && com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var14).getTo(), String.class))) {
                  var12 = ((Timing)var14.getTiming()).n5() + var14.getTiming().getTriggerDelayTime();
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }

         return var12;
      } else {
         if (this.getPresetClassType() == 2) {
            return this.u9();
         }

         if (this.getPresetClassType() != 3) {
            return this.k5.n5();
         }

         float var1 = this.k5.n5();
         IGenericEnumerator var2 = this.getBehaviors().iterator();

         try {
            while (var2.hasNext()) {
               IBehavior var3 = (IBehavior)var2.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var3, MotionEffect.class)) {
                  var1 = ((Timing)var3.getTiming()).n5();
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var1;
      }
   }

   final void n5(float var1) {
      if (this.getPresetClassType() < 2) {
         switch (this.getType()) {
            case 8:
               this.h0(var1);
               break;
            case 9:
               this.c8(var1);
               break;
            case 13:
               this.u3(var1);
               break;
            case 46:
               this.a6(var1);
               break;
            case 128:
               this.k5(var1);
               break;
            case 150:
               this.u9(var1);
               break;
            default:
               IGenericEnumerator var2 = this.getBehaviors().iterator();

               try {
                  while (var2.hasNext()) {
                     IBehavior var3 = (IBehavior)var2.next();
                     Timing var4 = (Timing)var3.getTiming();
                     if (com.aspose.slides.internal.v6g.k5.l6(var3, ISetEffect.class)) {
                        var4.setDuration(0.001F);
                        if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var3).getTo(), String.class))
                           || this.getType() == 0) {
                           var4.setTriggerDelayTime(var1 - var4.n5());
                        }
                     } else {
                        var4.setDuration(var1);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                     var2.dispose();
                  }
               }
         }
      } else if (this.getPresetClassType() == 2) {
         this.l6(var1);
      } else if (this.getPresetClassType() == 3) {
         IGenericEnumerator var13 = this.getBehaviors().iterator();

         try {
            while (var13.hasNext()) {
               IBehavior var14 = (IBehavior)var13.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var14, MotionEffect.class)) {
                  ((Timing)var14.getTiming()).n5(var1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      } else {
         this.k5.n5(var1);
      }
   }

   private float a6() {
      float var1 = 0.0F;
      switch (this.getType()) {
         case 0:
         case 9:
            Timing var31 = (Timing)this.getBehaviors().get_Item(this.getBehaviors().getCount() - 1).getTiming();
            var1 = var31.n5() + var31.getTriggerDelayTime();
            break;
         case 8:
         case 128:
            IGenericEnumerator var30 = this.getBehaviors().iterator();

            try {
               while (var30.hasNext()) {
                  IBehavior var34 = (IBehavior)var30.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var34, FilterEffect.class)) {
                     var1 = ((Timing)var34.getTiming()).n5();
                     return var1;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }
         case 13:
            IGenericEnumerator var29 = this.getBehaviors().iterator();

            try {
               while (var29.hasNext()) {
                  IBehavior var33 = (IBehavior)var29.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var33, FilterEffect.class)) {
                     var1 = ((Timing)var33.getTiming()).n5() * 10.0F;
                     return var1;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
                  var29.dispose();
               }
            }
         case 46:
            IGenericEnumerator var28 = this.getBehaviors().iterator();

            try {
               while (var28.hasNext()) {
                  IBehavior var32 = (IBehavior)var28.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var32, FilterEffect.class)) {
                     var1 = ((Timing)var32.getTiming()).n5() / 0.8F;
                     return var1;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                  var28.dispose();
               }
            }
         case 150:
            IGenericEnumerator var2 = this.getBehaviors().iterator();

            try {
               while (var2.hasNext()) {
                  IBehavior var3 = (IBehavior)var2.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var3, PropertyEffect.class)) {
                     var1 = ((Timing)var3.getTiming()).n5() + var3.getTiming().getTriggerDelayTime();
                     return var1;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         default:
            var1 = ((Timing)this.getBehaviors().get_Item(this.getBehaviors().getCount() - 1).getTiming()).n5();
      }

      return var1;
   }

   private float u9() {
      float var1 = 0.0F;
      switch (this.getType()) {
         case 3:
         case 140:
         case 145:
            Timing var13 = (Timing)this.getBehaviors().get_Item(this.getBehaviors().getCount() - 1).getTiming();
            var1 = var13.n5() + var13.getTriggerDelayTime();
            break;
         case 42:
         case 144:
            IGenericEnumerator var12 = this.getBehaviors().iterator();

            try {
               while (var12.hasNext()) {
                  IBehavior var14 = (IBehavior)var12.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var14, FilterEffect.class) || com.aspose.slides.internal.v6g.k5.l6(var14, SetEffect.class)) {
                     var1 = ((Timing)var14.getTiming()).n5();
                     return var1;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         case 44:
         case 129:
            IGenericEnumerator var2 = this.getBehaviors().iterator();

            try {
               while (var2.hasNext()) {
                  IBehavior var3 = (IBehavior)var2.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var3, ColorEffect.class)
                     || com.aspose.slides.internal.v6g.k5.l6(var3, PropertyEffect.class)
                     || com.aspose.slides.internal.v6g.k5.l6(var3, f6w.class)) {
                     var1 += ((Timing)var3.getTiming()).n5();
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         default:
            var1 = ((Timing)this.getBehaviors().get_Item(0).getTiming()).n5();
      }

      return var1;
   }

   private void l6(float var1) {
      switch (this.getType()) {
         case 3:
            int var44 = 0;
            IGenericEnumerator var49 = this.getBehaviors().iterator();

            try {
               while (var49.hasNext()) {
                  IBehavior var50 = (IBehavior)var49.next();
                  Timing var5 = (Timing)var50.getTiming();
                  if (com.aspose.slides.internal.v6g.k5.l6(var50, SetEffect.class) || com.aspose.slides.internal.v6g.k5.l6(var50, ColorEffect.class)) {
                     var5.n5(var1 * 0.95F);
                     var5.setTriggerDelayTime(var1 - var5.n5());
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var50, ScaleEffect.class)) {
                     if (var44 == 0) {
                        var5.n5(var1 * 0.1F);
                        var5.setTriggerDelayTime(0.0F);
                     } else if (var44 < 1) {
                        var5.n5(var1 * 0.1F);
                        var5.setTriggerDelayTime(var5.n5());
                     } else {
                        var5.n5(var1 * 0.3F);
                        var5.setTriggerDelayTime(var1 - var5.n5());
                     }

                     var44++;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
                  var49.dispose();
               }
            }
         case 42:
         case 144:
            IGenericEnumerator var43 = this.getBehaviors().iterator();

            try {
               while (var43.hasNext()) {
                  IBehavior var48 = (IBehavior)var43.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var48, FilterEffect.class) || com.aspose.slides.internal.v6g.k5.l6(var48, SetEffect.class)) {
                     ((Timing)var48.getTiming()).n5(var1);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var48, ScaleEffect.class) || com.aspose.slides.internal.v6g.k5.l6(var48, ColorEffect.class)) {
                     ((Timing)var48.getTiming()).n5(var1 * 0.5F);
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
                  var43.dispose();
               }
            }
         case 44:
         case 129:
            IGenericEnumerator var42 = this.getBehaviors().iterator();

            try {
               while (var42.hasNext()) {
                  IBehavior var47 = (IBehavior)var42.next();
                  ((Timing)var47.getTiming()).n5(var1 * 0.5F);
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
                  var42.dispose();
               }
            }
         case 140:
            float var51 = var1 * 0.2F;

            for (int var41 = 0; var41 < this.getBehaviors().getCount(); var41++) {
               Timing var46 = (Timing)this.getBehaviors().get_Item(var41).getTiming();
               if (var41 == 0) {
                  var46.n5(var1 * 0.1F);
               } else {
                  var46.n5(var1 * 0.2F);
                  var46.setTriggerDelayTime(var51);
                  var51 += var46.n5();
               }
            }
            break;
         case 145:
            float var6 = 0.0F;
            IGenericEnumerator var40 = this.getBehaviors().iterator();

            try {
               while (var40.hasNext()) {
                  IBehavior var45 = (IBehavior)var40.next();
                  Timing var4 = (Timing)var45.getTiming();
                  if (com.aspose.slides.internal.v6g.k5.l6(var45, MotionEffect.class)) {
                     var4.n5(var1 * 0.5F);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var45, RotationEffect.class)) {
                     var4.n5(var1 * 0.25F);
                     var4.setTriggerDelayTime(var6);
                     var6 += var1 * 0.25F;
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
                  var40.dispose();
               }
            }
         default:
            IGenericEnumerator var2 = this.getBehaviors().iterator();

            try {
               while (var2.hasNext()) {
                  IBehavior var3 = (IBehavior)var2.next();
                  ((Timing)var3.getTiming()).n5(var1);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
      }
   }

   private void k5(float var1) {
      int var2 = 0;
      IGenericEnumerator var3 = this.getBehaviors().iterator();

      try {
         while (var3.hasNext()) {
            IBehavior var4 = (IBehavior)var3.next();
            Timing var5 = (Timing)var4.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, SetEffect.class)) {
               var5.n5(0.001F);
               if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var4).getTo(), String.class))) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, FilterEffect.class)) {
               var5.n5(var1);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, PropertyEffect.class)) {
               if (var2 == 0) {
                  var5.n5(var1);
               } else if (var2 == 1) {
                  var5.n5(var1 * (this.getPresetClassType() == 0 ? 0.9F : 0.1F));
               } else {
                  var5.n5(var1 * (this.getPresetClassType() == 1 ? 0.9F : 0.1F));
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }

               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void u3(float var1) {
      int var2 = 0;
      IGenericEnumerator var3 = this.getBehaviors().iterator();

      try {
         while (var3.hasNext()) {
            IBehavior var4 = (IBehavior)var3.next();
            Timing var5 = (Timing)var4.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, SetEffect.class)) {
               var5.n5(0.001F);
               if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var4).getTo(), String.class))) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, FilterEffect.class)) {
               var5.n5(var1 * 0.1F);
               if (this.getPresetClassType() == 1) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, PropertyEffect.class)) {
               if (var2 == 0) {
                  var5.n5(var1 * (this.getPresetClassType() == 0 ? 0.4F : 0.6F));
                  if (this.getPresetClassType() == 1) {
                     var5.setTriggerDelayTime(0.0F);
                  }
               } else if (var2 == 1) {
                  var5.n5(var1 * 0.4F);
                  if (this.getPresetClassType() == 1) {
                     var5.setTriggerDelayTime(var1 - var5.n5());
                  }
               } else if (var2 == 2) {
                  var5.n5(var1 * 0.6F);
                  var5.setTriggerDelayTime(this.getPresetClassType() == 0 ? var1 * 0.4F : 0.0F);
               } else {
                  var5.n5(var1 * (this.getPresetClassType() == 0 ? 0.6F : 0.4F));
                  var5.setTriggerDelayTime(var1 * (this.getPresetClassType() == 0 ? 0.4F : 0.6F));
               }

               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void a6(float var1) {
      int var2 = 0;
      IGenericEnumerator var3 = this.getBehaviors().iterator();

      try {
         while (var3.hasNext()) {
            IBehavior var4 = (IBehavior)var3.next();
            Timing var5 = (Timing)var4.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, SetEffect.class)) {
               var5.n5(0.001F);
               if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var4).getTo(), String.class))) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, FilterEffect.class)) {
               var5.n5(var1 * 0.8F);
               if (this.getPresetClassType() == 1) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, PropertyEffect.class)) {
               if (var2 == 0) {
                  var5.n5(var1 * 0.8F);
                  if (this.getPresetClassType() == 1) {
                     var5.setTriggerDelayTime(var1 - var5.n5());
                  }
               } else if (var2 < 3) {
                  var5.n5(var1 * (this.getPresetClassType() == 0 ? 0.8F : 0.2F));
               } else {
                  var5.n5(var1 * (this.getPresetClassType() == 0 ? 0.2F : 0.8F));
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }

               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void u9(float var1) {
      int var2 = 0;
      int var3 = 0;
      IGenericEnumerator var4 = this.getBehaviors().iterator();

      try {
         while (var4.hasNext()) {
            IBehavior var5 = (IBehavior)var4.next();
            Timing var6 = (Timing)var5.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, SetEffect.class)) {
               String var7 = com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var5).getTo(), String.class);
               if (com.aspose.slides.ms.System.d1.a6("hidden", var7)) {
                  var6.n5(0.001F);
                  var6.setTriggerDelayTime(var1 - var6.n5());
               } else if (com.aspose.slides.ms.System.d1.a6("visible", var7)) {
                  var6.n5(0.001F);
                  var6.setTriggerDelayTime(0.0F);
               } else {
                  var6.n5(var1 * 0.385F);
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, FilterEffect.class)) {
               var6.n5(var1 * 0.385F);
               var6.setTriggerDelayTime(var1 * (this.getPresetClassType() == 0 ? 0.0F : 0.615F));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, ScaleEffect.class)) {
               if (var2 == 0) {
                  var6.n5(var1 * 0.385F);
                  if (this.getPresetClassType() == 1) {
                     var6.setTriggerDelayTime(var1 - var6.n5());
                  }
               } else {
                  var6.n5(var1 * 0.615F);
                  if (this.getPresetClassType() == 0) {
                     var6.setTriggerDelayTime(var1 - var6.n5());
                  }
               }

               var2++;
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, PropertyEffect.class)) {
               if (var3 == 0 || var3 == 2) {
                  var6.n5(var1 * 0.615F);
                  if (this.getPresetClassType() == 0) {
                     var6.setTriggerDelayTime(var1 - var6.n5());
                  }
               } else if (var3 == 1 || var3 == 3) {
                  var6.n5(var1 * (this.getPresetClassType() == 0 ? 0.615F : 0.385F));
                  var6.setTriggerDelayTime(var1 - var6.n5());
               }

               var3++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void h0(float var1) {
      int var2 = 0;
      IGenericEnumerator var3 = this.getBehaviors().iterator();

      try {
         while (var3.hasNext()) {
            IBehavior var4 = (IBehavior)var3.next();
            Timing var5 = (Timing)var4.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, SetEffect.class)) {
               var5.n5(0.001F);
               if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var4).getTo(), String.class))) {
                  var5.setTriggerDelayTime(var1 - var5.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, FilterEffect.class)) {
               var5.n5(var1);
               var5.setTriggerDelayTime(0.0F);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, PropertyEffect.class)) {
               if (var2 == 0 || var2 == 4) {
                  var5.n5(var1 * 0.5F);
                  var5.setTriggerDelayTime(0.0F);
               } else if (var2 == 1 || var2 == 5) {
                  var5.n5(var1 * 0.5F);
                  var5.setTriggerDelayTime(var1 * (this.getPresetClassType() == 0 ? 0.0F : 0.5F));
               } else if (var2 == 2 || var2 == 6) {
                  var5.n5(var1 * 0.5F);
                  var5.setTriggerDelayTime(var1 - var5.n5());
               } else if (var2 == 3) {
                  var5.n5(var1);
               }

               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void c8(float var1) {
      int var2 = 0;
      int var3 = 0;
      IGenericEnumerator var4 = this.getBehaviors().iterator();

      try {
         while (var4.hasNext()) {
            IBehavior var5 = (IBehavior)var4.next();
            Timing var6 = (Timing)var5.getTiming();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, SetEffect.class)) {
               var6.n5(0.001F);
               if (com.aspose.slides.ms.System.d1.a6("hidden", com.aspose.slides.internal.v6g.k5.n5(((ISetEffect)var5).getTo(), String.class))) {
                  var6.setTriggerDelayTime(var1 - var6.n5());
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, FilterEffect.class)) {
               var6.n5(var1 * (this.getPresetClassType() == 0 ? 0.29F : 0.09F));
               if (this.getPresetClassType() == 1) {
                  var6.setTriggerDelayTime(var1 - var6.n5());
               } else {
                  var6.setTriggerDelayTime(0.0F);
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, PropertyEffect.class)) {
               if (var2 == 0) {
                  var6.n5(var1 * 0.91F);
                  var6.setTriggerDelayTime(0.0F);
               } else if (var2 == 1) {
                  if (this.getPresetClassType() == 0) {
                     var6.n5(var1 * 0.33F);
                     var6.setTriggerDelayTime(0.0F);
                  } else {
                     var6.n5(var1 * 0.09F);
                     var6.setTriggerDelayTime(var1 - var6.n5());
                  }
               } else if (var2 == 2) {
                  var6.n5(var1 * 0.33F);
                  if (this.getPresetClassType() == 0) {
                     var6.setTriggerDelayTime(var6.n5());
                  } else {
                     var6.setTriggerDelayTime(0.0F);
                  }
               } else if (var2 == 3) {
                  if (this.getPresetClassType() == 0) {
                     var6.n5(var1 * 0.165F);
                     var6.setTriggerDelayTime(var1 * 0.66F);
                  } else {
                     var6.n5(var1 * 0.33F);
                     var6.setTriggerDelayTime(var6.n5());
                  }
               } else if (var2 == 4) {
                  if (this.getPresetClassType() == 0) {
                     var6.n5(var1 * 0.08F);
                     var6.setTriggerDelayTime(var1 * 0.83F);
                  } else {
                     var6.n5(var1 * 0.165F);
                     var6.setTriggerDelayTime(var1 * 0.66F);
                  }
               } else if (var2 == 5) {
                  var6.n5(var1 * 0.08F);
                  var6.setTriggerDelayTime(var1 * 0.83F);
               } else if (var2 == 6) {
                  var6.n5(var1 * 0.09F);
                  var6.setTriggerDelayTime(var1 - var6.n5());
               }

               var2++;
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, ScaleEffect.class)) {
               if (var3 == 0) {
                  var6.n5(var1 * 0.013F);
                  var6.setTriggerDelayTime(var1 * 0.325F);
               } else if (var3 == 1) {
                  var6.n5(var1 * 0.083F);
                  var6.setTriggerDelayTime(var1 * 0.338F);
               } else if (var3 == 2) {
                  var6.n5(var1 * 0.013F);
                  var6.setTriggerDelayTime(var1 * 0.656F);
               } else if (var3 == 3) {
                  var6.n5(var1 * 0.083F);
                  var6.setTriggerDelayTime(var1 * 0.669F);
               } else if (var3 == 4) {
                  var6.n5(var1 * 0.013F);
                  var6.setTriggerDelayTime(var1 * 0.821F);
               } else if (var3 == 5) {
                  var6.n5(var1 * 0.083F);
                  var6.setTriggerDelayTime(var1 * 0.834F);
               } else if (var3 == 6) {
                  var6.n5(var1 * 0.013F);
                  var6.setTriggerDelayTime(var1 * 0.904F);
               } else if (var3 == 7) {
                  var6.n5(var1 * 0.083F);
                  var6.setTriggerDelayTime(var1 * 0.917F);
               }

               var3++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private byte n5(int var1) {
      switch (var1) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 5;
         case 5:
            return 4;
         default:
            return 0;
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return null;
   }

   // $VF: synthetic method
   static void n5(Effect var0, Object var1, u5q var2) {
      var0.n5(var1, var2);
   }
}
