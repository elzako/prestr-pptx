package com.aspose.slides.internal.f7v;

public class j9 extends p3 {
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;

   public j9(com.aspose.slides.internal.c5e.l6 var1) {
      super("tIME", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 7) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk " + var1);
      }

      this.t2 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 0);
      this.s7 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 2);
      this.x8 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 3);
      this.n3 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 4);
      this.y4 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 5);
      this.e2 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 6);
   }

   public int l6() {
      return this.t2;
   }

   public int k5() {
      return this.s7;
   }

   public int u3() {
      return this.x8;
   }

   public int a6() {
      return this.n3;
   }

   public int u9() {
      return this.y4;
   }

   public int h0() {
      return this.e2;
   }
}
