package com.aspose.slides.internal.f7v;

public class f2 extends p3 {
   private int[] t2 = new int[0];

   public f2(com.aspose.slides.internal.c5e.l6 var1) {
      super("hIST", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (!this.a6.h0) {
         throw new com.aspose.slides.internal.c5e.e2("only indexed images accept a HIST chunk");
      }

      int var2 = var1.k5.length / 2;
      this.t2 = new int[var2];

      for (int var3 = 0; var3 < this.t2.length; var3++) {
         this.t2[var3] = com.aspose.slides.internal.c5e.h0.l6(var1.k5, var3 * 2);
      }
   }

   public int[] l6() {
      return this.t2;
   }
}
