package com.aspose.slides.internal.b9;

import com.aspose.slides.exceptions.NotImplementedException;

public class j5 extends g7 {
   private long n5;
   private com.aspose.slides.internal.k1.y4 l6;
   private long k5;
   private long u3;
   private byte[] a6;

   public j5(s9 var1) {
      super(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.y4 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k1.y4 var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void k5(long var1) {
      this.u3 = var1;
   }

   public final byte[] u9() {
      return this.a6;
   }

   public final void n5(byte[] var1) {
      this.a6 = var1;
   }

   protected final boolean n5(j5 var1) {
      return super.n5(var1)
         && this.n5 == var1.n5
         && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6)
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && com.aspose.slides.internal.y6.c8.n5(this.a6, var1.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((j5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      return var1 * 397 ^ (this.a6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.a6)).hashCode() : 0);
   }

   public final Object n5(com.aspose.slides.internal.r6.u9 var1) {
      throw new NotImplementedException();
   }
}
