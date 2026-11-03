package com.aspose.slides.internal.i0;

public abstract class f2 extends f0 {
   private i1 n5;

   protected f2() {
      this.n5(new i1());
   }

   public final i1 t2() {
      return this.n5;
   }

   public final void n5(i1 var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("Version: {0}", new Object[]{this.n5});
   }

   protected final boolean n5(f2 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((f2)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }
}
