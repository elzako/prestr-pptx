package com.aspose.slides.internal.w5i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.l5.y4;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.q1;

public class a6 extends n5 {
   public a6() {
      this.u9 = "radialGradient";
   }

   public final com.aspose.slides.internal.b3z.a6 e5() {
      return !this.l6.n5("cx") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), a6.class) != null
         ? ((a6)this.f2()).e5()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("cx"), com.aspose.slides.internal.b3z.a6.l6(50.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("cx", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 b3() {
      return !this.l6.n5("cy") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), a6.class) != null
         ? ((a6)this.f2()).b3()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("cy"), com.aspose.slides.internal.b3z.a6.l6(50.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("cy", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 o0() {
      return !this.l6.n5("r") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), a6.class) != null
         ? ((a6)this.f2()).o0()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("r"), com.aspose.slides.internal.b3z.a6.l6(50.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("r", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 z7() {
      if (!this.l6.n5("fx")) {
         for (a6 var1 = com.aspose.slides.internal.v6g.k5.n5(this.f2(), a6.class);
            var1 != null;
            var1 = com.aspose.slides.internal.v6g.k5.n5(var1.f2(), a6.class)
         ) {
            if (var1.l6.n5("fx")) {
               return var1.z7();
            }
         }
      }

      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("fx"), this.e5());
   }

   public final com.aspose.slides.internal.b3z.a6 v4() {
      if (!this.l6.n5("fy")) {
         for (a6 var1 = com.aspose.slides.internal.v6g.k5.n5(this.f2(), a6.class);
            var1 != null;
            var1 = com.aspose.slides.internal.v6g.k5.n5(var1.f2(), a6.class)
         ) {
            if (var1.l6.n5("fy")) {
               return var1.z7();
            }
         }
      }

      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("fy"), this.b3());
   }

   public final com.aspose.slides.internal.l5.l6 n5(t2 var1, x8 var2, n3 var3, y1 var4, y1 var5, float var6, s7[] var7) {
      this.n5(var2);
      var7[0] = new s7();
      y1 var8 = (this.d2() ? var4 : var5).y4();
      com.aspose.slides.internal.x4g.a6 var9 = this.n5(var3, var8.y4(), var6, false);
      if (var9 != null && var9.n5().length != 0) {
         if (var9.n5().length == 1) {
            return new y4(var9.n5()[0].o8());
         }

         int var10 = var3.n5;
         var3.n5 = this.d2() ? 1 : 0;
         float var11 = var3.n5(this.e5(), "x", var1, var8.c8().a6());
         float var12 = var3.n5(this.b3(), "y", var1, var8.c8().a6());
         float var13 = var3.n5(this.z7(), "x", var1, var8.c8().a6());
         float var14 = var3.n5(this.v4(), "y", var1, var8.c8().a6());
         float var15 = var3.n5(this.o0(), "x", var1, var8.c8().a6());
         float var16 = var3.n5(this.o0(), "y", var1, var8.c8().a6());
         var3.n5 = var10;
         w1[] var17 = new w1[]{new w1(var13, var14)};
         var7[0].n5(var11 - var15, var12 - var16, var15 * 2.0F, var16 * 2.0F);
         m1 var18 = this.n5(var3, var8.c8().a6());

         try {
            var18.l6(var8.x8(), var8.n3(), 0);
            var7[0].l6(var18);
            var18.n5(var17);
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }

         float var19 = var1.l6.n5("stroke-width") ? Float.valueOf(var1.l6.k5("stroke-width")) : 0.0F;
         y1 var20 = y1.n5(var4.y4(), var19, var19).y4();
         float var21 = this.d5() == 0 ? 1.0F : (float)q1.l6((double)this.n5(var20.y4(), var7[0]));
         com.aspose.slides.internal.x4g.a6 var22 = this.n5(var3, var8.y4(), var6, var21);
         y1 var23 = var7[0].s7().y4();
         w1 var24 = new w1(var23.a6() + var23.s7() / 2.0F, var23.t2() + var23.k5() / 2.0F);
         m1 var25 = new m1();

         try {
            var25.l6(-1.0F * var24.l6(), -1.0F * var24.k5(), 1);
            var25.n5(var21, var21, 1);
            var25.l6(var24.l6(), var24.k5(), 1);
            var7[0].l6(var25);
         } finally {
            if (var25 != null) {
               var25.dispose();
            }
         }

         w1 var26 = var17[0].u3();
         if (!var7[0].n5(var26.u3())) {
            this.n5(var26.u3(), var7[0]).n5(var26);
         }

         com.aspose.slides.internal.l5.x8 var27 = new com.aspose.slides.internal.l5.x8(var7[0]);
         var27.n5(var26.u3());
         var27.n5(var22);
         return var27;
      } else {
         return null;
      }
   }

   private float n5(y1 var1, s7 var2) {
      w1[] var3 = new w1[]{
         new w1(var1.x8(), var1.n3()),
         new w1(var1.x8() + var1.s7(), var1.n3()),
         new w1(var1.x8() + var1.s7(), var1.n3() + var1.k5()),
         new w1(var1.x8(), var1.n3() + var1.k5())
      };
      y1 var4 = var2.s7().y4();
      w1 var5 = new w1(var4.x8() + var4.s7() / 2.0F, var4.n3() + var4.k5() / 2.0F);
      m1 var6 = n5(0.95F, var5.l6(), var5.k5());

      try {
         int var7 = 0;

         while ((!var2.n5(var3[0].u3()) || !var2.n5(var3[1].u3()) || !var2.n5(var3[2].u3()) || !var2.n5(var3[3].u3())) && var7++ < 1000000) {
            var6.n5(var3);
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return q1.n5(var1.s7() / (var3[2].l6() - var3[0].l6()), var1.k5() / (var3[2].k5() - var3[0].k5()));
   }

   private w1 n5(w1 var1, s7 var2) {
      w1[] var3 = new w1[]{var1};
      y1 var4 = var2.s7().y4();
      w1 var5 = new w1(var4.x8() + var4.s7() / 2.0F, var4.n3() + var4.k5() / 2.0F);
      m1 var6 = n5(0.95F, var5.l6(), var5.k5());

      try {
         int var7 = 0;

         while (!var2.n5(var3[0].u3()) && var7++ < 1000000) {
            var6.n5(var3);
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return var3[0];
   }

   private static m1 n5(float var0, float var1, float var2) {
      m1 var3 = new m1();
      var3.l6(-1.0F * var1, -1.0F * var2, 1);
      var3.n5(var0, var0, 1);
      var3.l6(var1, var2, 1);
      return var3;
   }

   private com.aspose.slides.internal.x4g.a6 n5(n3 var1, y1 var2, float var3, float var4) {
      com.aspose.slides.internal.x4g.a6 var5 = this.n5(var1, var2.y4(), var3, true);
      List var6 = new List();
      List var7 = new List<>(com.aspose.slides.ms.System.u3.n5(var5.n5()));
      if (var4 > 1.0F) {
         switch (this.d5()) {
            case 1:
               for (float var26 : var5.l6()) {
                  var6.addItem(1.0F + (var26 - 1.0F) / var4);
               }

               for (int var14 = 1; var14 < var4; var14++) {
                  if (var14 % 2 == 1) {
                     for (int var20 = 1; var20 < var5.l6().length; var20++) {
                        float var24 = (var5.l6()[var20] - var5.l6()[var20 - 1]) / var4;
                        var6.insertItem(0, (Float)var6.get_Item(0) - var24);
                        var7.insertItem(0, var5.n5()[var20].o8());
                     }
                  } else {
                     for (int var19 = 0; var19 < var5.l6().length - 1; var19++) {
                        float var23 = (var5.l6()[var19 + 1] - var5.l6()[var19]) / var4;
                        var6.insertItem(0, (Float)var6.get_Item(0) - var23);
                        var7.insertItem(var19, var5.n5()[var19].o8());
                     }
                  }
               }

               float[] var15 = new float[var6.size()];
               var6.copyTo(com.aspose.slides.ms.System.u3.n5(var15), 0);
               var5.n5(var15);
               var5.n5((c8[])var7.toArray(new c8[0]));
               break;
            case 2:
               var4 = (float)q1.l6((double)var4);

               for (float var12 : var5.l6()) {
                  var6.addItem(var12 / var4);
               }

               for (int var16 = 1; var16 < var4; var16++) {
                  for (int var21 = 0; var21 < var5.l6().length; var21++) {
                     float var25 = (var16 + var5.l6()[var21]) / var4;
                     if (var21 == 0) {
                        var25 += 0.001F;
                     }

                     var6.addItem(var25);
                  }

                  var7.addRange(com.aspose.slides.ms.System.u3.n5(var5.n5()));
               }

               float[] var17 = new float[var6.size()];
               var6.copyTo(com.aspose.slides.ms.System.u3.n5(var17), 0);
               var5.n5(var17);
               var5.n5((c8[])var7.toArray(new c8[0]));
         }
      }

      return var5;
   }
}
