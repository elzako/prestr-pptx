package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

class k7p implements j2m {
   private final List<p0w> n5;
   private double l6;
   private int k5 = 0;

   public k7p() {
      this.n5 = new List<>();
      this.l6 = 0.0;
   }

   @Override
   public final void dispose() {
      if (this.n5.size() != 0) {
         for (int var1 = this.n5.size() - 1; var1 >= 0; var1--) {
            this.n5.get_Item(var1).n5.dispose();
         }

         this.n5.clear();
         this.k5 = 0;
      }
   }

   public final void n5(j2m var1) {
      if (var1 == null) {
         throw new ArgumentNullException("player");
      }

      double var2 = this.l6;
      p0w var4 = new p0w(var1);
      var4.l6 = var2;
      var4.k5 = var2 + var1.k5();
      this.l6 = var4.k5;
      this.n5.addItem(var4);
   }

   @Override
   public final double k5() {
      return this.l6;
   }

   @Override
   public final void n5(double var1) {
      if (this.n5.size() != 0) {
         if (var1 >= this.k5()) {
            this.I_();
         } else {
            int var3 = -1;
            p0w var4 = null;

            for (int var5 = 0; var5 < this.n5.size(); var5++) {
               p0w var6 = this.n5.get_Item(var5);
               if (var6.l6 <= var1 && var1 < var6.k5) {
                  var3 = var5;
                  var4 = var6;
               }
            }

            if (var4 != null) {
               if (var3 > this.k5) {
                  for (int var7 = this.k5; var7 < var3; var7++) {
                     this.k5 = var7;
                     this.n5.get_Item(var7).n5.I_();
                  }
               }

               this.k5 = var3;
               var4.n5.n5(var1 - var4.l6);
            }
         }
      }
   }

   @Override
   public final void I_() {
      if (this.n5.size() != 0) {
         for (int var1 = this.k5; var1 < this.n5.size(); var1++) {
            this.k5 = var1;
            this.n5.get_Item(var1).n5.I_();
         }
      }
   }
}
