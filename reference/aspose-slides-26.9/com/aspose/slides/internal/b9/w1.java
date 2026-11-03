package com.aspose.slides.internal.b9;

public class w1 extends g7 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private long u9;
   private com.aspose.slides.internal.k1.t2 h0;

   public w1(s9 var1) {
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

   public final long u3() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final long u9() {
      return this.a6;
   }

   public final void a6(long var1) {
      this.a6 = var1;
   }

   public final long h0() {
      return this.u9;
   }

   public final void u9(long var1) {
      this.u9 = var1;
   }

   public final com.aspose.slides.internal.k1.t2 c8() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.k1.t2 var1) {
      this.h0 = var1;
   }

   protected final boolean n5(w1 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && com.aspose.slides.ms.System.j8.n5(this.h0, var1.h0);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((w1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (int)this.a6;
      var1 = var1 * 397 ^ (int)this.u9;
      return var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
   }
}
