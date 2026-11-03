package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class s7 extends v4 {
   private boolean n5 = false;

   public s7() {
   }

   public s7(List<com.aspose.slides.internal.r4.u9> var1) {
      super(var1);
   }

   @Override
   public boolean c8() {
      return false;
   }

   @Override
   public boolean n5(v4 var1) {
      return !var1.c8() && !this.n5;
   }

   @Override
   public boolean l6(v4 var1) {
      return false;
   }

   @Override
   public boolean n5(v4 var1, boolean var2, z1 var3) {
      if (!this.n5(var1)) {
         return false;
      }

      if (var2) {
         var3.n5(1000);
         this.addItem(var3);
      } else if (!this.s7().x_()) {
         var3.n5(0);
         this.addItem(var3);
      }

      for (com.aspose.slides.internal.r4.u9 var5 : var1) {
         this.addItem(var5);
      }

      return true;
   }

   @Override
   public v4 h0() {
      this.n5 = true;
      return this;
   }
}
