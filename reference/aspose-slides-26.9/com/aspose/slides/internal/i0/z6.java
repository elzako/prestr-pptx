package com.aspose.slides.internal.i0;

public class z6 extends u3 {
   private int n5;

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return (this.n5 & 1) == 1;
   }

   public final byte u3() {
      int var1 = (this.n5 & 252) >> 2;
      return (byte)var1;
   }

   public final j9 a6() {
      int var1 = this.n5 >> 8;
      var1 &= 255;
      j9 var2 = new j9();
      int var3 = var1 & 15;
      int var4 = var1 >> 4 & 15;
      var2.l6(var4);
      var2.k5(var3);
      return var2;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("Data: {0}, Bezier: {1}, RunCount: {2}, PointType: {3}", this.n5, this.k5(), this.u3(), this.a6());
   }

   protected final boolean n5(z6 var1) {
      return this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5;
   }
}
