package com.aspose.slides.internal.b9;

public class v0 extends s2 {
   private com.aspose.slides.internal.t5.j5 n5;

   public v0(s9 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.t5.j5 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.t5.j5 var1) {
      this.n5 = var1;
   }

   protected final boolean n5(v0 var1) {
      return super.n5(var1) && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((v0)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
   }
}
