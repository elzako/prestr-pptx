package com.aspose.slides.internal.c3;

public class n3$n5 {
   private char[] n5;
   private int l6;
   private int k5;

   public n3$n5(String var1) {
      this.n5 = com.aspose.slides.ms.System.d1.c8(var1);
      this.l6 = 0;
   }

   public final int n5() {
      if (this.l6 >= this.k5) {
         return -1;
      }

      char var1 = this.n5[this.l6];
      this.l6++;
      return var1;
   }
}
