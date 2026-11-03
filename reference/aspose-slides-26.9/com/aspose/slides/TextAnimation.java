package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class TextAnimation implements ITextAnimation {
   int n5 = 0;
   int l6 = -1;
   private Sequence u3;
   private k4i a6 = new k4i();
   boolean k5;

   @Override
   public final IEffect addEffect(int effectType, int subtype, int triggerType) {
      int var4 = z9u.n5(effectType, subtype);
      Effect var5 = this.n5().n5(this.l6().a6(), effectType, subtype, var4, triggerType);
      this.l6().n5().addItem(var5);
      this.k5();
      return var5;
   }

   @Override
   public final int getBuildType() {
      return this.n5;
   }

   @Override
   public final void setBuildType(int value) {
      int var2 = this.n5;
      this.n5 = value;
      this.n5(var2);
   }

   @Override
   public final IEffect getEffectAnimateBackgroundShape() {
      return this.l6().l6();
   }

   @Override
   public final void setEffectAnimateBackgroundShape(IEffect value) {
      if (this.l6().l6() != null) {
         this.n5().n5().u3().removeItem(this.l6().l6());
         this.l6().n5().removeItem(this.l6().l6());
         this.l6().n5((IEffect)null);
      }

      if (value != null) {
         this.l6().n5(value);
         this.n5().n5().u3().insertItem(0, value);
         this.l6().n5().insertItem(0, value);
      }

      this.k5();
   }

   final Sequence n5() {
      return this.u3;
   }

   final void n5(Sequence var1) {
      this.u3 = var1;
   }

   final k4i l6() {
      return this.a6;
   }

   final void k5() {
      List$Enumerator var1 = this.l6().n5().iterator();

      try {
         while (var1.hasNext()) {
            Effect var2 = (Effect)var1.next();
            var2.k5().n5(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final void n5(int var1) {
      if (this.n5 != 0) {
         IAutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6().a6(), IAutoShape.class);
         if (var2 != null && var2.getTextFrame() != null) {
            if (var1 == 0) {
               IEffect[] var3 = this.n5().getEffectsByShape(var2);

               for (IEffect var7 : var3) {
                  if (var7.getTextAnimation() != null && var7.getTextAnimation().getBuildType() == 0) {
                     ((TextAnimation)var7.getTextAnimation()).n5 = 1;
                  }
               }
            }

            switch (this.n5) {
               case 1:
                  this.n5(var2, -1, var1);
                  break;
               case 2:
                  this.n5(var2, 0, var1);
                  break;
               case 3:
                  this.n5(var2, 1, var1);
                  break;
               case 4:
                  this.n5(var2, 2, var1);
                  break;
               case 5:
                  this.n5(var2, 3, var1);
                  break;
               case 6:
                  this.n5(var2, 4, var1);
            }
         }
      }
   }

   private void n5(IAutoShape var1, int var2, int var3) {
      IEffect[] var4 = this.l6().n5().toArray(new IEffect[0]);
      if (var4.length != 0) {
         ParagraphCollection var5 = (ParagraphCollection)var1.getTextFrame().getParagraphs();
         List var6 = new List();

         for (int var7 = 0; var7 < var5.getCount(); var7++) {
            if (!com.aspose.slides.ms.System.d1.n5(var5.get_Item(var7).getText())) {
               var6.addItem(var7);
            }
         }

         if (var6.size() != 0 || var5.getCount() != 0) {
            Effect var13 = (Effect)var4[0];
            var13.k5().n5((com.aspose.slides.internal.k4y.v6b)null);

            for (IEffect var11 : var4) {
               Effect var12 = (Effect)var11;
               if (var12.u3 > -1 || var12.a6 > -1 || var12.k5().t2() != null) {
                  this.n5().n5().u3().removeItem(var12);
                  this.l6().n5().removeItem(var12);
               }
            }

            int var14 = z9u.n5(var13.getType(), var13.getSubtype());
            if (var6.size() == 0) {
               if (var3 > 0) {
                  var13.n5(0, 0, (ParagraphCollection)var1.getTextFrame().getParagraphs());
               } else {
                  Effect var15 = this.n5(var13, var14);
                  var15.getTiming().setTriggerType(2);
                  var15.n5(0, 0, (ParagraphCollection)var1.getTextFrame().getParagraphs());
                  this.l6().n5().addItem(var15);
               }
            }

            for (int var16 = 0; var16 < var6.size(); var16++) {
               int var17 = (Integer)var6.get_Item(var16);
               if (var16 == 0 && var3 > 0 && this.l6().l6() == null) {
                  var13.n5(var17, var17, (ParagraphCollection)var1.getTextFrame().getParagraphs());
               } else {
                  Effect var18 = this.n5(var13, var14);
                  if (this.n5 == 1 || var5.get_Item(var16).getParagraphFormat().getDepth() > var2) {
                     var18.getTiming().setTriggerType(2);
                  }

                  var18.n5(var17, var17, (ParagraphCollection)var1.getTextFrame().getParagraphs());
                  this.l6().n5().addItem(var18);
               }
            }

            this.k5();
         }
      }
   }

   private Effect n5(Effect var1, int var2) {
      Effect var3 = this.n5().n5(this.l6().a6(), var1.getType(), var1.getSubtype(), var2, var1.getTiming().getTriggerType());
      var3.getBehaviors().clear();
      IGenericEnumerator var4 = var1.getBehaviors().iterator();

      try {
         while (var4.hasNext()) {
            IBehavior var5 = (IBehavior)var4.next();
            var3.getBehaviors().add(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      ((Timing)var3.getTiming()).n5(var1.getTiming());
      var3.k5().n5(var1.k5().n5());
      var3.k5().l6(this.n5().l6().n5().n3());
      return var3;
   }
}
