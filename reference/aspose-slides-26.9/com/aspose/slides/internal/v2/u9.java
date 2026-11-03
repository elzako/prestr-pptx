package com.aspose.slides.internal.v2;

import com.aspose.slides.ms.System.d1;

public class u9 extends s7 {
   private t2 n5;
   private t2 l6;
   private s7 k5;

   public final t2 n5() {
      return this.n5;
   }

   public final void n5(t2 var1) {
      this.n5 = var1;
   }

   public final t2 l6() {
      return this.l6;
   }

   public final void l6(t2 var1) {
      this.l6 = var1;
   }

   public final s7 k5() {
      return this.k5;
   }

   public final void n5(s7 var1) {
      this.k5 = var1;
   }

   public u9(s7 var1) {
      this.n5(var1);
   }

   public u9(long var1, long var3) {
      this.n5((s7)null);
      this.n5(new t2((float)var1));
      this.l6(new t2((float)var3));
   }

   @Override
   public String toString() {
      return d1.n5("{0} {1} R",new Object[]{ this.n5().k5(), this.l6().k5()});
   }
}
