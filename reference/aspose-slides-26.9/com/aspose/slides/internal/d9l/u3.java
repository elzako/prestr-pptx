package com.aspose.slides.internal.d9l;

import com.aspose.slides.exceptions.ArgumentException;

public class u3 {
   private float[] n5;

   public u3(float[] var1) {
      if (var1.length != 12 && var1.length != 9) {
         throw new ArgumentException("Matrix can have 12 or 9 elements only");
      }

      this.n5 = var1;
   }

   public final void n5(float[] var1) {
      float var2 = com.aspose.slides.internal.g7i.k5.k5(var1[0]);
      float var3 = com.aspose.slides.internal.g7i.k5.k5(var1[1]);
      float var4 = com.aspose.slides.internal.g7i.k5.k5(var1[2]);
      float var5 = this.n5[0] * var2 + this.n5[1] * var3 + this.n5[2] * var4;
      float var6 = this.n5[3] * var2 + this.n5[4] * var3 + this.n5[5] * var4;
      float var7 = this.n5[6] * var2 + this.n5[7] * var3 + this.n5[8] * var4;
      if (this.n5.length == 12) {
         var5 += this.n5[9];
         var6 += this.n5[10];
         var7 += this.n5[11];
      }

      var1[0] = com.aspose.slides.internal.g7i.k5.k5(var5);
      var1[1] = com.aspose.slides.internal.g7i.k5.k5(var6);
      var1[2] = com.aspose.slides.internal.g7i.k5.k5(var7);
   }
}
