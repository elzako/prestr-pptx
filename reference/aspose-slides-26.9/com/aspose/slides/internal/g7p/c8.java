package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;

public class c8 extends n5<com.aspose.slides.internal.w4c.k5> {
   public c8(m3 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.k5 var3) {
      w1 var4 = new w1(var1, var2);
      com.aspose.slides.internal.e3j.u3 var5 = com.aspose.slides.internal.e3j.u3.n5(var3.e2, var4);
      w1 var6 = var5.n5(var3.u9);
      if (var6 == null) {
         return null;
      }

      double var7 = 1.0 - com.aspose.slides.internal.e3j.u9.n5(var6, var3.n5) / var3.t2;
      com.aspose.slides.internal.o9b.c8 var9 = this.n5(this.n5.t2(), var7);
      com.aspose.slides.internal.e3j.u3 var10 = com.aspose.slides.internal.e3j.u3.n5(var3.y4, var4);
      w1 var11 = var10.n5(var3.h0);
      if (var11 == null) {
         return null;
      }

      double var12 = 1.0 - com.aspose.slides.internal.e3j.u9.n5(var11, var3.l6) / var3.s7;
      com.aspose.slides.internal.o9b.c8 var14 = this.n5(var3.u3, var12);
      com.aspose.slides.internal.e3j.u3 var15 = com.aspose.slides.internal.e3j.u3.n5(var3.n3, var4);
      w1 var16 = var15.n5(var3.c8);
      if (var16 == null) {
         return null;
      }

      double var17 = 1.0 - com.aspose.slides.internal.e3j.u9.n5(var16, var3.k5) / var3.x8;
      com.aspose.slides.internal.o9b.c8 var19 = this.n5(var3.a6, var17);
      return com.aspose.slides.internal.o9b.c8.n5(
         255,
         this.n5((var9.x8() & 255) + (var14.x8() & 255) + (var19.x8() & 255)),
         this.n5((var9.n3() & 255) + (var14.n3() & 255) + (var19.n3() & 255)),
         this.n5((var9.y4() & 255) + (var14.y4() & 255) + (var19.y4() & 255))
      );
   }
}
