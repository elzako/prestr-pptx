package com.aspose.slides.internal.i0;

public class k7 extends v4 {
   private int[][] n5;

   public final void n5(int[][] var1) {
      this.n5 = var1;
   }

   protected final boolean n5(k7 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((k7)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? com.aspose.slides.ms.System.u3.n5(this.n5, 1, true).hashCode() : 0;
   }

   @Override
   public int u9() {
      return 100;
   }
}
