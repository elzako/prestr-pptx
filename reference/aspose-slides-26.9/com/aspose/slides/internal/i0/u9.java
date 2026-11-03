package com.aspose.slides.internal.i0;

public final class u9 extends l6 {
   private l6 n5;
   private int l6;
   private long k5;
   private int u3;
   private long a6;
   private int u9;

   public final l6 u3() {
      return this.n5;
   }

   public final void n5(l6 var1) {
      this.n5 = var1;
   }

   public final int a6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final long h0() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final int c8() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final long t2() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }

   public final int s7() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      if (this.t2() == 1L) {
         return this.u3().n5();
      }

      h0 var1 = com.aspose.slides.internal.v6g.k5.n5(this.u3(), h0.class);
      int var2 = (int)this.h0();
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(this.s7(), this.a6(), var2);
      if ((var2 & 65536) == 65536) {
         com.aspose.slides.internal.j9e.u3 var4 = var3.t2();

         for (int var5 = 0; var5 < (var1.u3().l6() & 4294967295L); var5++) {
            var1.u3().k5()[var5].a6().n5(var4.n5()[var5]);
         }

         var3.n5(var4);
      }

      com.aspose.slides.internal.j9e.n5 var7 = var3.n5(new com.aspose.slides.internal.o9b.y2(0, 0, this.s7(), this.a6()), 2, var2);
      com.aspose.slides.ms.System.x9 var8 = var7.u3();

      for (int var6 = 0; var6 < var1.a6().length; var6++) {
         com.aspose.slides.internal.e3m.n5.n5(var1.a6()[var6], 0, var8, var1.a6()[var6].length);
         var8 = new com.aspose.slides.ms.System.x9(var8.l6() + var1.a6()[var6].length);
      }

      var3.n5(var7);
      return var3;
   }

   @Override
   public com.aspose.slides.internal.l5.c8 l6() {
      return new com.aspose.slides.internal.l5.u3(this.n5());
   }

   @Override
   public byte[] k5() {
      return this.u3().k5();
   }

   private boolean n5(u9 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, u9.class) && this.n5((u9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      return var1 * 397 ^ this.u9;
   }

   @Override
   public int u9() {
      return 20 + this.n5.u9();
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "[BitmapData: {0}, Height: {1}, PixelFormat: {2}, Stride: {3}, Type: {4}, Width: {5}]",
         this.n5,
         this.l6,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.d5.class, this.k5),
         this.u3,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.n5.class, this.a6),
         this.u9
      );
   }
}
