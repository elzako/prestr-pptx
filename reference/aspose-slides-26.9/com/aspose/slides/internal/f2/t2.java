package com.aspose.slides.internal.f2;

import com.aspose.slides.internal.e5.t9;

public class t2 implements u9 {
   private u9 n5;
   private int l6;
   private int k5;

   public t2(u9 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final int n5(int var1, t9 var2) {
      if (var1 == this.l6) {
         return this.k5;
      } else {
         return this.n5 != null ? this.n5.n5(var1, var2) : -1;
      }
   }
}
