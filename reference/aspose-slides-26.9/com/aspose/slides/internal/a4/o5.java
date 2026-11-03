package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class o5 extends e5 {
   private long n5;
   private long l6;

   public o5() {
      this.l6((short)16413);
   }

   public o5(b3 var1) {
      super(var1);
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long u3() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   protected final boolean n5(o5 var1) {
      return super.n5(var1) && this.k5() == var1.k5() && this.u3() == var1.u3();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((o5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.k5();
      return var1 * 397 ^ (int)this.u3();
   }

   @Override
   public String toString() {
      return d1.n5("{0}, X: {1}, Y: {2}", super.toString(), this.k5(), this.u3());
   }

   @Override
   public int u9() {
      return 8;
   }
}
