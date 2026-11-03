package com.aspose.slides.internal.i0;

public final class w2 extends u3 {
   private short n5;
   private short l6;

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

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X: {0}, Y: {1}",new Object[]{ this.n5, this.l6});
   }

   private boolean n5(w2 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, w2.class) && this.n5((w2)obj);
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.ms.System.f0.n5(this.n5) * 397 ^ com.aspose.slides.ms.System.f0.n5(this.l6);
   }

   @Override
   public com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.n5, this.l6);
   }

   @Override
   public int u9() {
      return 4;
   }
}
