package com.aspose.slides.internal.a8e;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.t9z.u9;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class u3 extends n5 {
   private final u9 l6;
   private final com.aspose.slides.internal.p6x.n5 k5;

   public u3(u9 var1) {
      super(var1.l6());
      this.l6 = new u9(var1);
      this.k5 = new com.aspose.slides.internal.p6x.n5(var1.k5(), var1.l6());
   }

   @Override
   protected void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.x4g.u9 var2, float var3, float var4, float var5, float var6) {
      m3 var7 = this.n5(var2);
      if (!(2.0F * var7.q0() < this.n5.u3())) {
         float var8 = this.k5.n5(var2);
         s7 var9 = s7.n5((Object)(this.n5(var2.y4(), var3, var4, var8 * var5, var8 * var6)));
         this.l6.n5(var9);
         this.l6.n5(new h0(var7, this.l6.l6().u3()));
         this.l6.n5(m1.n5.t2());
         this.l6.n5(false);
         com.aspose.slides.internal.t9z.l6 var10 = new com.aspose.slides.internal.t9z.l6(this.l6);
         com.aspose.slides.internal.w1y.n5 var11 = var10.n5();

         for (com.aspose.slides.internal.w1y.l6 var14 : var11.n5()) {
            com.aspose.slides.internal.t9z.u3.n5(var14.n5, var1);
            com.aspose.slides.internal.t9z.u3.n5(var14.l6, var1);
            com.aspose.slides.internal.t9z.u3.n5(var14.k5, var1);
         }
      }
   }

   private m3 n5(com.aspose.slides.internal.x4g.u9 var1) {
      m3 var2 = new m3(this.n5.n5().l6());
      AffineTransform var3 = this.n5.n5().t4().t2();
      double var4 = Math.abs(var3.getScaleX());
      double var6 = Math.abs(var3.getScaleY());
      double var8 = Math.abs(var3.getShearX());
      double var10 = Math.abs(var3.getShearY());
      AffineTransform var12 = new AffineTransform(var4 < 1.0 ? 1.0 / var4 : var4, 0.0, 0.0, var6 < 1.0 ? 1.0 / var6 : var6, 0.0, 0.0);
      var2.n5(m1.n5(var12));
      if (var4 >= 1.0 && var6 >= 1.0) {
         var2.k5(this.n5.l6() * var1.t2());
      }

      var2.u9(var1.h0());
      int[] var13 = new int[1];
      int[] var14 = new int[1];
      var1.n5(var13, var14);
      var2.u3(var13[0]);
      var2.a6(var14[0]);
      return var2;
   }

   private Shape n5(s7 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.t9z.n5 var6 = new com.aspose.slides.internal.t9z.n5();
      com.aspose.slides.internal.t9z.u3.n5(var1, new a6(this, var6, var2, var4, var5, var3));
      return var6.k5();
   }
}
