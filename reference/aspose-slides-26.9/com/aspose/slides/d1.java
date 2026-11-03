package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.ms.System.IDisposable;

final class d1 extends e8s {
   private final w1g n5 = new w1g();
   private final float l6;

   public d1(MathArray var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.e2 = true;
      var3.n5(this.n5);
      IGenericEnumerator var4 = var1.getArguments().iterator();

      try {
         while (var4.hasNext()) {
            IMathElement var5 = (IMathElement)var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, MathematicalText.class)) {
               ((MathematicalText)var5).u3();
               MathBlock var6 = new MathBlock(var5);
               this.n5(var6, var3.n5());
            } else {
               this.n5(var5, var3.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.l6 = (this.n5.c8 > 0 ? 43.0F : 68.0F) * var3.a6 / 96.0F;
   }

   @Override
   protected y1m n5(d2k var1) {
      ReadOnlyCollection var2 = this.h0;
      float var3 = 0.0F;
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            e8s var5 = (e8s)var4.next();
            y1m var6 = var5.u9().n5();
            var3 = com.aspose.slides.ms.System.q1.n5((float)(var3), (float)(var6.n5));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List var15 = this.n5(var2);

      for (int var16 = 0; var16 < var2.size(); var16++) {
         int var7 = 0;
         e8s var8 = (e8s)var2.get_Item(var16);
         if (com.aspose.slides.internal.v6g.k5.l6(var8, t7e.class)) {
            for (int var9 = 0; var9 < var8.h0.size(); var9++) {
               if (com.aspose.slides.internal.v6g.k5.l6(var8.h0.get_Item(var9), b4i.class) && ((b4i)var8.h0.get_Item(var9)).n5()) {
                  float var10 = (Float)var15.get_Item(var7) - var8.h0.get_Item(var9).h0().n5;
                  if (var7 == 0) {
                     for (int var11 = 0; var11 < var9; var11++) {
                        d2k var12 = var8.h0.get_Item(var11).h0().u3();
                        var12.n5 += var10;
                        var8.h0.get_Item(var11).l6(var12.u3());
                     }
                  }

                  for (int var24 = var9; var24 < var8.h0.size(); var24++) {
                     d2k var25 = var8.h0.get_Item(var24).h0().u3();
                     var25.n5 += var10;
                     var8.h0.get_Item(var24).l6(var25.u3());
                  }

                  var15 = this.n5(var2);
                  var7++;
               }
            }
         }
      }

      float var17 = 0.0F;

      for (int var18 = 0; var18 < var2.size(); var18++) {
         e8s var20 = (e8s)var2.get_Item(var18);
         y1m var22 = var20.u9().n5();
         float var23 = (var3 - var22.n5) / 2.0F;
         if (var15.size() > 0) {
            var23 = 0.0F;
         }

         var20.l6(var23, var17);
         var17 += var22.l6.n5();
         if (var18 + 1 < var2.size()) {
            var17 += this.l6 - var22.l6.l6;
         }
      }

      p1e var19 = this.a6().n5(this.n5.a6);
      y1m var21 = new y1m();
      n5(var17, var19.t2()).n5(var21.l6);
      var21.n5 = var3;
      return var21;
   }

   private List<Float> n5(ReadOnlyCollection<e8s> var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         int var4 = 0;
         e8s var5 = (e8s)var1.get_Item(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var5, t7e.class)) {
            for (int var6 = 0; var6 < var5.h0.size(); var6++) {
               if (com.aspose.slides.internal.v6g.k5.l6(var5.h0.get_Item(var6), b4i.class) && ((b4i)var5.h0.get_Item(var6)).n5()) {
                  if (var2.size() == var4) {
                     var2.addItem(var5.h0.get_Item(var6).h0().n5);
                  } else {
                     var2.set_Item(var4, com.aspose.slides.ms.System.q1.n5((float)(var5.h0.get_Item(var6).h0().n5), (float)((Float)var2.get_Item(var4))));
                  }

                  var4++;
               }
            }
         }
      }

      return var2;
   }

   static n3y n5(float var0, float var1) {
      float var2 = var0 / 2.0F + var1;
      return new n3y(var2, var0 - var2);
   }
}
