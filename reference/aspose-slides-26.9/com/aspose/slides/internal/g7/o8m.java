package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentNullException;

public class o8m implements e8 {
   private final h3d n5;
   private final int l6;
   private final q8 k5;

   public o8m(h3d var1, int var2, q8 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("FeatureList");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void n5(int var1, g2x var2) {
      this.n5(this.n5.n5(var1), var2);
   }

   private void n5(u6p var1, g2x var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Feature");
      }

      var2.n5(var1);
      Integer[] var3 = var1.k5();
      int var4 = var3.length;

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var3[var5];

         try {
            r3 var7 = this.k5.n5(this.l6, var6 & 65535);
            var7.n5(var2);
         } catch (RuntimeException var8) {
         }
      }
   }
}
