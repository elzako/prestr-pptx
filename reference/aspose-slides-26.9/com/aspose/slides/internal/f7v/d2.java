package com.aspose.slides.internal.f7v;

public class d2 extends p3 {
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;

   public d2(com.aspose.slides.internal.c5e.l6 var1) {
      super("bKGD", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (this.a6.u9) {
         this.t2 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 0);
      } else if (this.a6.h0) {
         this.y4 = var1.k5[0] & 255;
      } else if (var1.k5.length >= 6) {
         this.s7 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 0);
         this.x8 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 2);
         this.n3 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 4);
      }
   }

   public int l6() {
      if (!this.a6.u9) {
         throw new com.aspose.slides.internal.c5e.e2("only gray images support this");
      } else {
         return this.t2;
      }
   }

   public int k5() {
      if (!this.a6.h0) {
         throw new com.aspose.slides.internal.c5e.e2("only indexed (pallete) images support this");
      } else {
         return this.y4;
      }
   }

   public int[] u3() {
      if (!this.a6.u9 && !this.a6.h0) {
         return new int[]{this.s7, this.x8, this.n3};
      } else {
         throw new com.aspose.slides.internal.c5e.e2("only rgb or rgba images support this");
      }
   }
}
