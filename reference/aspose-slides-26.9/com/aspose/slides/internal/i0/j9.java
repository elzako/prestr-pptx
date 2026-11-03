package com.aspose.slides.internal.i0;

public final class j9 extends u3 {
   private int n5;
   private int l6;
   private int k5;

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
      this.l6 = var1 & 15;
      this.k5 = var1 << 4;
   }

   public final void l6(int var1) {
      this.k5 = var1;
      this.n5 &= 240;
      this.n5 |= (byte)var1 & 255;
   }

   public final void k5(int var1) {
      this.l6 = var1;
      this.n5 &= 15;
      this.n5 |= (byte)(var1 << 4) & 255;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "Data: {0}, Flags: {1}, Type: {2}",
         this.n5,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.y1.class, this.l6),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.y2.class, this.k5)
      );
   }

   private boolean n5(j9 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, j9.class) && this.n5((j9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      return var1 * 397 ^ this.k5;
   }

   @Override
   public int u9() {
      return 1;
   }
}
