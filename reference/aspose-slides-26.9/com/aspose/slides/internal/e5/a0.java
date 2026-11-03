package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;

public class a0 extends w1 {
   private a5[] l6 = new a5[302];
   private a5[] k5 = new a5[302];

   public a0(t9 var1, w1 var2) {
      super(var1, var2);
   }

   @Override
   public a5 l6(int var1) {
      return this.l6[var1];
   }

   @Override
   public void n5(int var1, a5 var2) {
      this.l6[var1] = var2;
      if (this.k5[var1] != null) {
         this.k5[var1] = var2;
      }
   }

   @Override
   public a5 n5(int var1, boolean var2, boolean var3) {
      a5 var4 = this.k5[var1];
      if (var4 == null) {
         var4 = super.n5(var1, var2, var3);
         this.k5[var1] = var4;
      }

      return var4;
   }
}
