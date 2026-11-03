package com.aspose.slides.internal.b9;

public class r7 extends j4 {
   private long n5;
   private long l6;
   private long k5;
   private com.aspose.slides.internal.t5.t9[] u3;

   public r7(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.t5.t9[] u3() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.t5.t9[] var1) {
      this.u3 = var1;
   }

   protected final boolean n5(r7 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && com.aspose.slides.internal.y6.c8.n5(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((r7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      return var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
   }
}
