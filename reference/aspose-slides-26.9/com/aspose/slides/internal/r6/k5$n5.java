package com.aspose.slides.internal.r6;

public class k5$n5 {
   private boolean n5 = false;
   private com.aspose.slides.internal.y6.u3 l6;

   public k5$n5(com.aspose.slides.internal.y6.u3 var1) {
      this.l6 = var1;
   }

   public final k5$n5 n5() {
      k5$n5 var1;
      try {
         var1 = new k5$n5(this.l6.a6());
         var1.n5(this.l6());
      } catch (CloneNotSupportedException var3) {
         com.aspose.slides.internal.f8y.n5.k5(var3.getMessage());
         var1 = null;
      }

      return var1;
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.y6.u3 k5() {
      return this.l6;
   }
}
