package com.aspose.slides.internal.b9;

public class b3 extends g7 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private com.aspose.slides.internal.t5.t4 u9;
   private com.aspose.slides.internal.k1.t2 h0;

   public b3(s9 var1) {
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

   public final com.aspose.slides.internal.t5.t4 h0() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.t5.t4 var1) {
      this.u9 = var1;
   }

   public final com.aspose.slides.internal.k1.t2 c8() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.k1.t2 var1) {
      this.h0 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, IhPen: {1}, Elp: {2}, BitmapBuffer: {3}", super.toString(), this.n5(), this.h0(), this.c8());
   }

   protected final boolean n5(b3 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && com.aspose.slides.ms.System.j8.n5(this.u9, var1.u9)
         && com.aspose.slides.ms.System.j8.n5(this.h0, var1.h0);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((b3)obj);
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
      var1 = var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
      return var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
   }
}
