package com.aspose.slides.internal.w2k;

import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;
import java.util.Iterator;

public class k5 extends n5 {
   private final com.aspose.slides.internal.o8r.k5 n5;
   private final com.aspose.slides.internal.o8r.k5 l6;

   public k5(float var1, float var2, AffineTransform var3) {
      this.n5 = new com.aspose.slides.internal.o8r.k5(var1, var3);
      this.l6 = new com.aspose.slides.internal.o8r.k5(var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.a6 var1, com.aspose.slides.internal.k3w.h0 var2, w1 var3, com.aspose.slides.internal.z3o.a6 var4, boolean var5) {
      this.n5(var1, var1.h0(), var2, var3, var4, var5);
   }

   private void n5(
      com.aspose.slides.internal.k3w.a6 var1,
      com.aspose.slides.internal.k3w.u9 var2,
      com.aspose.slides.internal.k3w.h0 var3,
      w1 var4,
      com.aspose.slides.internal.z3o.a6 var5,
      boolean var6
   ) {
      float var7 = var2.u9.l6();
      float var8 = var2.u9.k5();
      float var9 = var4.l6();
      float var10 = var4.k5();
      float var11 = var2.a6.l6();
      float var12 = var2.a6.k5();
      com.aspose.slides.internal.z3o.a6 var13 = var3.u3;
      if (var1.a6()) {
         if (this.n5(var3.h0, var6)) {
            this.n5(this.n5, var1, var3, var11, var12, var13.n5, var13.l6, var5.n5, var5.l6, false, var6);
         } else {
            this.n5(this.l6, var1, var3, var11, var12, var13.k5, var13.u3, var5.k5, var5.u3, true, var6);
         }
      } else {
         if (this.n5(var3.h0, var6)) {
            this.n5(this.n5, var1, var3, var11, var12, var13.n5, var13.l6, var5.n5, var5.l6, false, var6);
         } else {
            var3.t2 = var3.s7 = this.n5(var11, var12, var7, var8, var9, var10, var13.n5, var13.l6, var5.n5, var5.l6);
         }

         if (this.n5(var3.c8, var6)) {
            this.n5(this.l6, var1, var3, var11, var12, var13.k5, var13.u3, var5.k5, var5.u3, true, var6);
         } else {
            var3.x8 = var3.n3 = this.n5(var11, var12, var7, var8, var9, var10, var13.k5, var13.u3, var5.k5, var5.u3);
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.o8r.k5 var1,
      com.aspose.slides.internal.k3w.a6 var2,
      com.aspose.slides.internal.k3w.h0 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      boolean var10,
      boolean var11
   ) {
      if (!com.aspose.slides.internal.e3j.u9.n5(var6, var7, var8, var9, 1.0E-5F)) {
         com.aspose.slides.internal.o8r.n5 var12 = new com.aspose.slides.internal.o8r.n5(var1, var6, var7, var8, var9, var11);
         this.n5(var2, var3, var4, var5, var10, var12.l6(), var12.n5());
      }
   }

   private void n5(
      com.aspose.slides.internal.k3w.a6 var1,
      com.aspose.slides.internal.k3w.h0 var2,
      float var3,
      float var4,
      boolean var5,
      boolean var6,
      com.aspose.slides.internal.v9l.k5 var7
   ) {
      u3 var8 = new u3(this, var1, var2, var3, var4, var5);
      Iterator var9 = var6 ? var7.h0() : var7.u9();

      while (var9.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var10 = (com.aspose.slides.internal.v9l.l6)var9.next();
         var10.n5(var8);
      }
   }
}
