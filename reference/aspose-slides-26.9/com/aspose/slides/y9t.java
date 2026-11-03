package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class y9t {
   private d2k a6 = new d2k();
   private t3x u9;
   final e8s[] n5;
   public final a1w l6;
   public final MathParagraph k5;
   w1g u3 = new w1g();
   private y1m h0 = new y1m();

   public final t3x n5() {
      return this.u9;
   }

   public final void n5(t3x var1) {
      this.u9 = var1;
   }

   y9t(MathParagraph var1, t3x var2, a1w var3, w1g var4) {
      this.k5 = var1;
      this.n5(var2);
      this.l6 = var3;
      var4.n5(this.u3);
      d2k.k5.n5(this.a6);
      this.n5 = new e8s[var1.getCount()];
      int var5 = 0;
      IGenericEnumerator var6 = var1.iterator();

      try {
         while (var6.hasNext()) {
            MathBlock var7 = (MathBlock)var6.next();
            this.n5[var5] = var3.n5(var7, var3, var4.n5());
            var5++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   public final void n5(v1l var1, d2k var2) {
      c6v var3 = new c6v(var1.n5);

      try {
         var1.n5.n5(var2.n5, var2.l6);
         e8s.n5(var1.n5(), com.aspose.slides.ms.System.u3.n5(this.n5));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final y1m l6() {
      return this.h0.n5();
   }

   private void n5(y1m var1) {
      this.h0 = var1.n5();
   }

   public final void n5(d2k var1, int var2, n3y var3, float var4) {
      d2k[] var5 = new d2k[]{this.a6};
      y1m var6 = this.n5(var1.u3(), var5, var2, var3.l6(), var4).n5();
      var5[0].n5(this.a6);
      this.n5(var6.n5());
   }

   private y1m n5(d2k var1, d2k[] var2, int var3, n3y var4, float var5) {
      float var6 = 0.0F;
      float var7 = 0.0F;
      e8s[] var8 = this.n5;

      for (e8s var12 : var8) {
         var12.l6(d2k.k5.u3());
         var12.k5(var1.u3());
      }

      if (var8.length == 0) {
         d2k.k5.n5(var2[0]);
         y1m var33 = new y1m();
         var33.n5 = 0.0F;
         var33.l6 = new n3y(0.0F, 0.0F);
         return var33;
      }

      float var32 = 0.0F;
      float[] var34 = new float[var8.length];

      for (int var35 = 0; var35 < var8.length; var35++) {
         for (int var38 = 0; var38 < var8[var35].h0.size(); var38++) {
            b4i var13 = com.aspose.slides.internal.v6g.k5.n5(var8[var35].h0.get_Item(var38), b4i.class);
            if (var13 != null && var13.l6().l6().u9()) {
               var34[var35] = ((b4i)var8[var35].h0.get_Item(var38)).h0().n5;
               if (var32 < var34[var35]) {
                  var32 = var34[var35];
               }
               break;
            }
         }
      }

      for (int var36 = 0; var36 < var8.length; var36++) {
         var6 = com.aspose.slides.ms.System.q1.n5((float)(var6), (float)(var8[var36].u9().n5));
         var8[var36].l6(var32 - var34[var36] + var8[var36].h0().n5, var8[var36].h0().l6);
      }

      float var14 = var1.n5 - var6;
      var7 = n5(var3, var14, var14 / 2.0F);
      float var37 = 1.0F;
      p1e var39 = this.l6.n5(this.u3.a6);
      if (this.n5().h0() > 0.0F && this.k5.n5()) {
         var37 = this.n5().h0() * 0.01F;
         if (var37 > 1.0F) {
            var5 = 0.0F;
         }
      }

      d2k var40 = new d2k(Float.MAX_VALUE, Float.MAX_VALUE);
      float var15 = -Float.MAX_VALUE;
      float var16 = 0.0F;
      float var17 = 0.0F;

      for (int var18 = 0; var18 < var8.length; var18++) {
         e8s var19 = var8[var18];
         y1m var20 = this.n5(var19, var4.l6(), var37).n5();
         n3y var21 = this.n5(var20.l6.l6(), var4.l6(), var5).l6();
         var17 = var21.n5;
         var14 = var1.n5 - var6;
         float var22 = var7 + n5(1, var14, var14 / 2.0F) + var19.h0().n5;
         float var23 = var21.n5 - var20.l6.n5;
         if (var37 > 1.0F) {
            boolean var24 = false;
            IGenericEnumerator var25 = var19.h0.iterator();

            try {
               while (var25.hasNext()) {
                  e8s var26 = (e8s)var25.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var26, k3i.class)) {
                     var24 = true;
                     k3i var27 = (k3i)var26;
                     if (var27.l6().u9().l6.l6 > 1.0F && var27.n5().u9().l6.n5 < var39.n5() - var39.u3() && var37 <= 1.5F) {
                        var21.n5 = com.aspose.slides.ms.System.q1.n5((float)(var21.n5), (float)(var21.n5 + var39.n5() * 0.87F - var27.n5().u9().l6.n5));
                     } else if (var27.n5().u9().l6.n5 > var39.n5() * 0.9F) {
                        var21.n5 = com.aspose.slides.ms.System.q1.n5((float)(var21.n5), (float)(var21.n5 + var27.l6().u9().l6.l6));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
                  var25.dispose();
               }
            }

            if (var24) {
               var23 += var21.n5 - var20.l6.n5;
               var23 -= var21.n5() * 0.025146F * var37;
            } else {
               var23 -= var39.u3() * 0.846F * var37;
            }

            var23 += var21.n5() * var37 - var21.n5();
         }

         var19.l6(var22, var23 + var16);
         var16 += var21.n5() * var37;
         var40.n5 = com.aspose.slides.ms.System.q1.l6(var40.n5, var22);
         var40.l6 = com.aspose.slides.ms.System.q1.l6(var40.l6, var23);
         var15 = com.aspose.slides.ms.System.q1.n5((float)(var15), (float)(var22 + var20.n5));
      }

      var40.n5(var2[0]);
      y1m var42 = new y1m();
      var42.n5 = var6;
      var42.l6 = new n3y(var17, var16 - var17);
      return var42;
   }

   private y1m n5(e8s var1, n3y var2, float var3) {
      y1m var4 = var1.u9().n5();
      IGenericEnumerator var5 = var1.h0.iterator();

      try {
         while (var5.hasNext()) {
            e8s var6 = (e8s)var5.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var6, g5s.class)) {
               var6 = ((g5s)var6).h0.get_Item(0);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var6, w2k.class) && !com.aspose.slides.internal.v6g.k5.l6(var6.h0.get_Item(0), l4i.class)) {
               if (var4.l6.l6 > var2.l6 && var4.l6.n5 < var2.n5 && var3 > 1.0F) {
                  var4.l6.l6 *= 2.0F;
               } else {
                  var4.l6.l6 = com.aspose.slides.ms.System.q1.n5((float)(((w2k)var6).h0.get_Item(0).u9().l6.l6), (float)(var4.l6.l6));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4;
   }

   private n3y n5(n3y var1, n3y var2, float var3) {
      if (var1.n5() + var3 > this.l6.n5) {
         var1.n5 += var3;
      }

      return n3y.n5(var2.l6(), var1.l6());
   }

   private static float n5(int var0, float var1, float var2) {
      switch (var0) {
         case 1:
         default:
            return 0.0F;
         case 2:
            return var1;
         case 3:
         case 4:
            return var2;
      }
   }
}
