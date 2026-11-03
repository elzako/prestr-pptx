package com.aspose.slides.internal.i0;

public final class n5 extends y8 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte u3;

   public n5() {
   }

   public n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5 = var1.s7();
      this.l6 = var1.y4();
      this.k5 = var1.n3();
      this.u3 = var1.x8();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final byte k5() {
      return this.k5;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void u3(byte var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8 a6() {
      return com.aspose.slides.internal.o9b.c8.n5(this.n5() & 255, this.u3() & 255, this.k5() & 255, this.l6() & 255);
   }

   @Override
   public int u9() {
      return 4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("Alpha: {0}, Blue: {1}, Green: {2}, Red: {3}", this.n5, this.l6, this.k5, this.u3);
   }

   private boolean n5(n5 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, n5.class) && this.n5((n5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.e2.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.k5);
      return var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u3);
   }
}
