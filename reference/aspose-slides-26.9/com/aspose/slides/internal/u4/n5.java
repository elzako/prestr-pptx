package com.aspose.slides.internal.u4;

import com.aspose.slides.ms.System.o5;

public class n5 {
   private com.aspose.slides.internal.w5.k5 n5;
   private o5<Integer> l6 = new o5<>();
   private o5<Float> k5 = new o5<>();
   private String u3;

   public n5(com.aspose.slides.internal.w5.k5 var1) {
      this.n5 = var1;
   }

   public final int n5() {
      if (o5.n5(this.l6, null)) {
         l6 var1 = new l6(this.n5);
         this.l6 = new o5<>(var1.l6());
      }

      return this.l6.n5();
   }

   public final float l6() {
      if (o5.n5(this.k5, null)) {
         l6 var1 = new l6(this.n5);
         this.k5 = new o5<>(var1.k5());
      }

      return this.k5.n5();
   }

   public final String k5() {
      if (this.u3 == null) {
         l6 var1 = new l6(this.n5);
         this.u3 = var1.u3();
      }

      return this.u3;
   }
}
