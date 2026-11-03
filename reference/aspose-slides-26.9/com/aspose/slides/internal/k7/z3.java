package com.aspose.slides.internal.k7;

import com.aspose.slides.internal.m3.w5;

public class z3 extends n5 {
   private int n5;
   private int l6;
   private com.aspose.slides.internal.q0.e2 k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "larger", "smaller", "xx-small", "x-small", "small", "medium", "large", "x-large", "xx-large", "xxx-large"
   );

   public z3(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      if (this.l6()) {
         switch (a6.n5(((com.aspose.slides.internal.k5.u3)var1).u9())) {
            case 0:
            case 1:
               this.l6 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(w5.class), this.u3());
               this.u3 = 1;
               break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
               this.n5 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.m3.n5.class), this.u3());
               this.u3 = 0;
         }
      } else {
         this.k5 = y1.n5((com.aspose.slides.internal.y4.n5)var1);
         this.u3 = 2;
      }
   }

   public final int h0() {
      return this.n5;
   }

   public final boolean c8() {
      return this.u3 == 0;
   }
}
