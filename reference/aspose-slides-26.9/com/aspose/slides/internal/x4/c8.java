package com.aspose.slides.internal.x4;

public class c8 implements l6 {
   private s7[] n5;
   private int l6;

   public final void n5(t9 var1) {
      this.l6 = var1.m3();
      var1.k7();
      short var2 = var1.k7();
      this.n5 = new s7[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5[var3] = new s7(var1.m3());
      }
   }

   @Override
   public final int l6() {
      return this.l6;
   }

   @Override
   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public final int n5() {
      return 10;
   }
}
