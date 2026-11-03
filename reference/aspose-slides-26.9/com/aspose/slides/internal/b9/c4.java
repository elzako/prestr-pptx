package com.aspose.slides.internal.b9;

public class c4 extends g7 {
   private long n5;
   private com.aspose.slides.internal.t5.e2 l6;

   public c4(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.t5.e2 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.t5.e2 var1) {
      this.l6 = var1;
   }

   protected final boolean n5(c4 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((c4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      return var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
   }
}
