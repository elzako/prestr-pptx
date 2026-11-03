package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class t1 extends g7 {
   private long n5;

   public t1() {
      this.l6((short)16421);
   }

   public t1(b3 var1) {
      super(var1);
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   protected final boolean n5(t1 var1) {
      return super.n5(var1) && this.k5() == var1.k5();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((t1)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (int)this.k5();
   }

   @Override
   public String toString() {
      return d1.n5("{0}, StackIndex: {1}", super.toString(), this.k5());
   }

   @Override
   public int u9() {
      return 4;
   }
}
