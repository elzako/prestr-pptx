package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class i1 extends y8 {
   private int n5;
   private int l6;

   public i1() {
      this.n5(900097);
      this.n5 = 2;
   }

   public final int n5() {
      return this.l6;
   }

   private void n5(int var1) {
      if (var1 != 900097) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final int l6() {
      return this.n5;
   }

   private void l6(int var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(Object var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(var1, int.class);
      this.n5((int)((var2 & 4294963200L & 4294967295L) >> 12));
      this.l6(var2 & 4095);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "GraphicsVersion: {0}, MetafileSignature: {1:X5}",new Object[]{ com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.n3.class, this.n5), this.l6
      });
   }

   private boolean n5(i1 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, i1.class) && this.n5((i1)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ this.l6;
   }

   @Override
   public int u9() {
      return 4;
   }
}
