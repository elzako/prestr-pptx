package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class x7b implements IDisposable {
   private com.aspose.slides.internal.x4g.s7 l6 = new com.aspose.slides.internal.x4g.s7();
   private boolean k5 = false;
   private static final byte[] u3 = new byte[]{0, 1, 1, -127};
   public static final x7b n5 = new x7b();

   protected x7b() {
   }

   public x7b(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      boolean var5
   ) {
      byte[] var6 = (byte[])u3.clone();
      if (var5) {
         var6[3] = (byte)(var6[3] & 0xFF | 128);
      }

      this.l6 = new com.aspose.slides.internal.x4g.s7(new com.aspose.slides.internal.o9b.w1[]{var1, var2, var3, var4}, var6);
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.k5) {
         if (var1) {
            this.l6.dispose();
         }

         this.k5 = true;
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.m3 var1, com.aspose.slides.internal.o9b.u3 var2, t9z var3) {
      if (var3 != null && this.l6.h0() > 0) {
         var3.n5(this.l6, 0.5F);
      }

      if (var3 != null && this.l6.h0() > 0 && !w8d.n5(var3)) {
         var3.n5(this.l6);
      }
   }
}
