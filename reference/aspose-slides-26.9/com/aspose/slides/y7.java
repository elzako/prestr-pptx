package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

final class y7 implements IDisposable {
   public final com.aspose.slides.internal.o9b.l6 n5;
   public final m0s l6;

   public y7(com.aspose.slides.internal.o9b.p8 var1, m0s var2) {
      if (var2 == null) {
         throw new ArgumentNullException("input");
      }

      this.l6 = var2;
      this.n5 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5());
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
      this.l6.dispose();
   }

   public final void n5(float var1) {
      com.aspose.slides.internal.o9b.z1 var2 = com.aspose.slides.internal.o9b.z1.n5(this.n5);

      try {
         var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         this.l6.n5(var1, var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final void n5(com.aspose.slides.internal.w0.t4 var1, com.aspose.slides.internal.o9b.l6 var2) {
      com.aspose.slides.internal.w0.t4 var3 = new com.aspose.slides.internal.w0.t4(this.n5.e2(), this.n5.h0());
      com.aspose.slides.internal.w0.t4 var4 = com.aspose.slides.internal.w0.t4.n5.n5();
      com.aspose.slides.internal.w0.t4[] var5 = new com.aspose.slides.internal.w0.t4[]{var1};
      com.aspose.slides.internal.w0.t4[] var6 = new com.aspose.slides.internal.w0.t4[]{var4};
      com.aspose.slides.internal.w0.t4[] var7 = new com.aspose.slides.internal.w0.t4[]{var3};
      com.aspose.slides.internal.o9.n5.n5(new com.aspose.slides.internal.w0.t4(var2.e2(), var2.h0()), var7[0].n5(), var5, var6, var7);
      var5[0].n5(var1);
      var6[0].n5(var4);
      var7[0].n5(var3);
      if (var3.k5 > 0 && var3.u3 > 0) {
         com.aspose.slides.internal.o9.n5.n5(var2, this.n5, var1.n5(), var4.n5(), var3.n5(), new y7$1(this));
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      n5(var1, this.n5);
   }

   public static void n5(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.o9.n5.n5(var0, var1, new y7$2());
   }

   private static int l6(int var0, int var1) {
      com.aspose.slides.internal.w0.n5 var2 = com.aspose.slides.internal.w0.n5.n5(var0).k5();
      com.aspose.slides.internal.w0.n5 var3 = com.aspose.slides.internal.w0.n5.n5(var1).k5();
      var2.l6 = com.aspose.slides.internal.v6g.k5.n5((Object)((var3.k5 & 0xFF) / 255.0F * (var2.l6 & 0xFF)), 13);
      return var2.l6();
   }

   // $VF: synthetic method
   static int n5(int var0, int var1) {
      return l6(var0, var1);
   }
}
