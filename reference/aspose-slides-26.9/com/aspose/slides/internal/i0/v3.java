package com.aspose.slides.internal.i0;

public final class v3 extends a6 {
   private short n5;
   private short l6;
   private short k5;
   private short u3;

   public final short l6() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final short k5() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public final short u3() {
      return this.k5;
   }

   public final void k5(short var1) {
      this.k5 = var1;
   }

   public final short a6() {
      return this.u3;
   }

   public final void u3(short var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", this.n5, this.l6, this.k5, this.u3);
   }

   private boolean n5(v3 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, v3.class) && this.n5((v3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.f0.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.k5);
      return var1 * 397 ^ com.aspose.slides.ms.System.f0.n5(this.u3);
   }

   @Override
   public int u9() {
      return 8;
   }

   @Override
   public com.aspose.slides.internal.o9b.y1 n5() {
      return new com.aspose.slides.internal.o9b.y1(this.n5, this.l6, this.k5, this.u3);
   }
}
