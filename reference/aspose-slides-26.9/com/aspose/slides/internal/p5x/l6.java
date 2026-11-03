package com.aspose.slides.internal.p5x;

import java.awt.font.TextMeasurer;

public class l6 implements n5 {
   private final TextMeasurer n5;

   public l6(TextMeasurer var1) {
      this.n5 = var1;
   }

   @Override
   public float n5(int var1, int var2) {
      return var1 < var2 ? this.n5.getAdvanceBetween(var1, var2) : 0.0F;
   }

   @Override
   public int n5(int var1, float var2) {
      return this.n5.getLineBreakIndex(var1, var2);
   }
}
