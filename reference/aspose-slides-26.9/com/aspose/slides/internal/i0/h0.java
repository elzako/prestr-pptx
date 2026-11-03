package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.NotSupportedException;

public final class h0 extends l6 {
   private a3 n5;
   private byte[][] l6;

   public final a3 u3() {
      return this.n5;
   }

   public final void n5(a3 var1) {
      this.n5 = var1;
   }

   public final byte[][] a6() {
      return this.l6;
   }

   public final void n5(byte[][] var1) {
      this.l6 = var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      throw new com.aspose.slides.internal.p5.n5("Use EmfPlusBitmap.GetBitmap() instead of this.");
   }

   @Override
   public com.aspose.slides.internal.l5.c8 l6() {
      return new com.aspose.slides.internal.l5.u3(this.n5());
   }

   @Override
   public byte[] k5() {
      throw new NotSupportedException();
   }

   private boolean n5(h0 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, h0.class) && this.n5((h0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      return var1 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5(this.l6, 1, true).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.u3().u9();
      }

      if (this.l6 != null) {
         var1 += this.l6.length;
      }

      return var1;
   }
}
