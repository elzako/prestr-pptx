package com.aspose.slides.internal.b9;

public class t9 extends z3 {
   private long n5;
   private long l6;
   private com.aspose.slides.internal.n6.n5[] k5;

   public t9(z3 var1) {
      super(var1);
      this.u3(var1.c8());
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

   protected final boolean n5(t9 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.internal.y6.c8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      return var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
   }
}
