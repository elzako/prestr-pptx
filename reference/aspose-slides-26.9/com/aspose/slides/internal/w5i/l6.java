package com.aspose.slides.internal.w5i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.l5.s7;
import com.aspose.slides.internal.l5.y4;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class l6 extends n5 {
   public l6() {
      this.u9 = "linearGradient";
   }

   public final com.aspose.slides.internal.b3z.a6 e5() {
      return !this.l6.n5("x1") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), l6.class) != null
         ? ((l6)this.f2()).e5()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x1"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("x1", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 b3() {
      return !this.l6.n5("y1") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), l6.class) != null
         ? ((l6)this.f2()).b3()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y1"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("y1", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 o0() {
      return !this.l6.n5("x2") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), l6.class) != null
         ? ((l6)this.f2()).o0()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x2"), com.aspose.slides.internal.b3z.a6.l6(100.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("x2", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 z7() {
      return !this.l6.n5("y2") && com.aspose.slides.internal.v6g.k5.n5(this.f2(), l6.class) != null
         ? ((l6)this.f2()).z7()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y2"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("y2", var1.toString());
   }

   public final com.aspose.slides.internal.l5.l6 n5(t2 var1, x8 var2, n3 var3, y1 var4, y1 var5, float var6) {
      this.n5(var2);
      y1 var7 = (this.d2() ? var4 : var5).y4();
      if (!this.d2() || var4.s7() != 0.0F && var4.k5() != 0.0F) {
         int var8 = var3.n5;
         var3.n5 = this.d2() ? 1 : 0;
         float var9 = var3.n5(this.e5(), "x", var1, var7.c8().a6());
         float var10 = var3.n5(this.b3(), "y", var1, var7.c8().a6());
         float var11 = var3.n5(this.o0(), "x", var1, var7.c8().a6());
         float var12 = var3.n5(this.z7(), "y", var1, var7.c8().a6());
         w1 var13 = new w1(var9, var10);
         w1 var14 = new w1(var11, var12);
         var3.n5 = var8;
         m1 var15 = this.n5(var3, var7.c8().a6());
         w1[] var16 = new w1[]{var13};
         w1[] var17 = new w1[]{var14};
         n5(var15, var16, var17);
         var16[0].n5(var13);
         var17[0].n5(var14);
         float var18 = q1.n5(var11 - var9);
         float var19 = q1.n5(var12 - var10);
         if (var18 < 1.0F) {
            var18 = var7.s7();
         }

         if (var19 < 1.0F) {
            var19 = var7.k5();
         }

         com.aspose.slides.internal.x4g.a6 var20 = this.n5(var3, var7.y4(), var6, false);
         if (var20 == null || var20.n5().length == 0) {
            return null;
         }

         if (var20.n5().length == 1) {
            return new y4(var20.n5()[0].o8());
         }

         if (this.d5() == 0) {
            float var21 = q1.l6(var13.l6(), var14.l6());
            float var22 = q1.l6(var13.k5(), var14.k5());
            y1 var23 = new y1(var21, var22, var18, var19);
            y1 var24 = y1.l6(var23.y4(), var7.y4()).y4();
            float var25 = var23.s7() > 0.0F ? var24.s7() / var23.s7() : 1.0F;
            float var26 = var23.k5() > 0.0F ? var24.k5() / var23.k5() : 1.0F;
            float var27 = q1.n5(var25, var26);
            float var28 = var13.l6() + (var14.l6() - var13.l6()) / 2.0F;
            float var29 = var13.k5() + (var14.k5() - var13.k5()) / 2.0F;
            m1 var30 = new m1();
            var30.k5(var28, var29);
            var30.n5(var27, var27);
            var30.k5(-var28, -var29);
            w1 var31 = var13.u3();
            w1 var32 = var14.u3();
            w1[] var33 = new w1[]{var31};
            w1[] var34 = new w1[]{var32};
            n5(var30, var33, var34);
            var33[0].n5(var31);
            var34[0].n5(var32);
            float var35 = (float)n5(var13.u3(), var31.u3(), var32.u3());
            var20 = this.n5(var20, var35, var27);
            var31.n5(var13);
            var32.n5(var14);
         }

         s7 var36 = new s7(var13.u3(), var14.u3(), com.aspose.slides.internal.o9b.c8.w4().o8(), com.aspose.slides.internal.o9b.c8.w4().o8());
         var36.n5(var20);
         switch (this.d5()) {
            case 2:
               var36.n5(0);
               break;
            default:
               var36.n5(3);
         }

         var36.n5("linearRGB".equals(this.s3()));
         return var36;
      } else {
         return null;
      }
   }

   private com.aspose.slides.internal.x4g.a6 n5(com.aspose.slides.internal.x4g.a6 var1, float var2, float var3) {
      if (var3 <= 1.001F) {
         return var1;
      }

      List var4 = new List();
      List var5 = new List<>(com.aspose.slides.ms.System.u3.n5(var1.n5()));
      if (var1.l6()[0] > 0.0F || q1.n5(var2) > 0.001) {
         var4.addItem(0.0F);
         var5.insertItem(0, ((c8)var5.get_Item(0)).o8());
      }

      for (float var9 : var1.l6()) {
         var4.addItem(var2 + var9 / var3);
      }

      var4.addItem(1.0F);
      var5.addItem(((c8)var5.get_Item(var5.size() - 1)).o8());
      float[] var10 = new float[var4.size()];
      var4.copyTo(com.aspose.slides.ms.System.u3.n5(var10), 0);
      var1.n5(var10);
      var1.n5((c8[])var5.toArray(new c8[0]));
      return var1;
   }

   private static void n5(m1 var0, w1[] var1, w1[] var2) {
      if (var0 != null && !var0.l6()) {
         w1[] var3 = new w1[]{var1[0], var2[0]};
         var0.n5(var3);
         var3[0].n5(var1[0]);
         var3[1].n5(var2[0]);
      }
   }

   private static double n5(w1 var0, w1 var1, w1 var2) {
      if (w1.n5(var1, var2)) {
         throw new ArgumentException("Line start and end points must not be the same.");
      }

      double var3 = var2.l6() - var1.l6();
      double var5 = var2.k5() - var1.k5();
      double var7 = var3 * var3 + var5 * var5;
      if (var7 == 0.0) {
         return 0.5;
      }

      double var9 = var0.l6() - var1.l6();
      double var11 = var0.k5() - var1.k5();
      double var13 = var3 * var9 + var5 * var11;
      double var15 = var13 / var7;
      return q1.l6(0.0, q1.k5(1.0, var15));
   }

   public static float n5(float var0, float var1, float var2, float var3) {
      float var4 = q1.n5(var1 - var0);
      float var5 = q1.n5(var3 - var2);
      if (q1.n5(var5) < 0.001) {
         return 0.0F;
      } else {
         return q1.n5(var4) < 0.001 ? 90.0F : (float)(q1.u3(var5, var4) * 180.0 / Math.PI);
      }
   }
}
