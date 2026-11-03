package com.aspose.slides.internal.f7v;

public class h2 extends p3 {
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;

   public h2(com.aspose.slides.internal.c5e.l6 var1) {
      super("sBIT", var1);
   }

   private int a6() {
      int var1 = this.a6.u9 ? 1 : 3;
      if (this.a6.a6) {
         var1++;
      }

      return var1;
   }

   @Override
   public void n5(a6 var1) {
      int var2 = this.a6();
      boolean var3 = this.a6.a6 && var1.n5 == var2 - 1;
      if (!var3 && var1.n5 != var2) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk length " + var1);
      }

      if (this.a6.u9) {
         this.t2 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 0);
         if (!var3 && this.a6.a6) {
            this.s7 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 1);
         }
      } else {
         this.x8 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 0);
         this.n3 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 1);
         this.y4 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 2);
         if (!var3 && this.a6.a6) {
            this.s7 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 3);
         }
      }
   }

   public int l6() {
      if (!this.a6.u9) {
         throw new com.aspose.slides.internal.c5e.e2("only greyscale images support this");
      } else {
         return this.t2;
      }
   }

   public int k5() {
      if (!this.a6.a6) {
         throw new com.aspose.slides.internal.c5e.e2("only images with alpha support this");
      } else {
         return this.s7;
      }
   }

   public int[] u3() {
      if (this.a6.u9) {
         throw new com.aspose.slides.internal.c5e.e2("only rgb or rgba images support this");
      } else {
         return new int[]{this.x8, this.n3, this.y4};
      }
   }
}
