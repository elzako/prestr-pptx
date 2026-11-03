package com.aspose.slides.internal.k7;

import com.aspose.slides.internal.k5.l6$n5;

public class t4 extends n5 {
   private com.aspose.slides.internal.q0.e2 n5;
   private boolean l6;
   private boolean k5;

   public t4(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      if (this.l6()) {
         if (l6$n5.a7 == var1) {
            this.l6 = true;
         } else if (l6$n5.r8 == var1) {
            this.k5 = true;
         } else if (l6$n5.c3 == var1) {
            this.n5 = new com.aspose.slides.internal.q0.e2(-90.0F, 10);
         } else if (l6$n5.l4 == var1) {
            this.n5 = new com.aspose.slides.internal.q0.e2(0.0F, 10);
         } else if (l6$n5.i6 == var1) {
            this.n5 = new com.aspose.slides.internal.q0.e2(90.0F, 10);
         }
      } else {
         this.n5 = y1.n5((com.aspose.slides.internal.y4.n5)var1);
      }
   }
}
