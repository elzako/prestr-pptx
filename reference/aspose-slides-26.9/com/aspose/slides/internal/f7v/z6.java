package com.aspose.slides.internal.f7v;

public class z6 extends p3 {
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int[] y4 = new int[0];

   public z6(com.aspose.slides.internal.c5e.l6 var1) {
      super("tRNS", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (this.a6.u9) {
         this.t2 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 0);
      } else if (this.a6.h0) {
         int var2 = var1.k5.length;
         this.y4 = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.y4[var3] = var1.k5[var3] & 255;
         }
      } else {
         if (var1.k5.length >= 2) {
            this.s7 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 0);
         }

         if (var1.k5.length >= 4) {
            this.x8 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 2);
         }

         if (var1.k5.length >= 6) {
            this.n3 = com.aspose.slides.internal.c5e.h0.l6(var1.k5, 4);
         }
      }
   }

   public int[] l6() {
      if (!this.a6.u9 && !this.a6.h0) {
         return new int[]{this.s7, this.x8, this.n3};
      } else {
         throw new com.aspose.slides.internal.c5e.e2("only rgb or rgba images support this");
      }
   }

   public int k5() {
      if (!this.a6.u9) {
         throw new com.aspose.slides.internal.c5e.e2("only grayscale images support this");
      } else {
         return this.t2;
      }
   }

   public int[] u3() {
      if (!this.a6.h0) {
         throw new com.aspose.slides.internal.c5e.e2("only indexed images support this");
      } else {
         return this.y4;
      }
   }

   public byte[] a6() {
      int[] var1 = this.u3();
      byte[] var2 = new byte[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = (byte)var1[var3];
      }

      return var2;
   }
}
