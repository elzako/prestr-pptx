package com.aspose.slides.internal.i0;

public class j4 extends v4 {
   private int n5;
   private com.aspose.slides.internal.k1.k7[] l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.k7[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k1.k7[] var1) {
      this.l6 = var1;
   }

   protected final boolean n5(j4 var1) {
      return this.n5() == var1.n5() && com.aspose.slides.internal.y6.c8.n5(this.l6(), var1.l6());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((j4)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5() * 397 ^ (this.l6() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6())).hashCode() : 0);
   }

   @Override
   public int u9() {
      return 4 + this.n5() * 16;
   }
}
