package com.aspose.slides.internal.b9;

public class f0 extends d5 {
   private com.aspose.slides.internal.k1.k7 n5;
   private long l6;
   private long k5;
   private int u3;
   private int a6;
   private com.aspose.slides.internal.t5.m1 u9;

   public f0(s9 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.k1.k7 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.t5.m1 h0() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.t5.m1 var1) {
      this.u9 = var1;
   }

   protected final boolean n5(f0 var1) {
      return super.n5(var1)
         && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9.equals(var1.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((f0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ this.a6;
      return var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
   }
}
