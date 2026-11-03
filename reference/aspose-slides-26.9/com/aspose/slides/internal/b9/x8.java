package com.aspose.slides.internal.b9;

public class x8 extends s2 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private byte[] a6;
   private String u9;
   private byte[] h0;

   public x8(s9 var1) {
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

   public final byte[] u9() {
      return this.a6;
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
      this.u9 = com.aspose.slides.internal.l7h.j5.z1().l6(this.a6, 0, (int)this.k5);
      byte[] var2 = new byte[(int)this.u3];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), (int)this.k5, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, (int)this.u3);
      this.h0 = var2;
   }

   protected final boolean n5(x8 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && com.aspose.slides.internal.y6.c8.n5(this.a6, var1.a6)
         && com.aspose.slides.ms.System.d1.a6(this.u9, var1.u9)
         && com.aspose.slides.internal.y6.c8.n5(this.h0, var1.h0);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((x8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
      var1 = var1 * 397 ^ (this.u9 != null ? this.u9.hashCode() : 0);
      return var1 * 397 ^ (this.h0 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.h0)).hashCode() : 0);
   }
}
