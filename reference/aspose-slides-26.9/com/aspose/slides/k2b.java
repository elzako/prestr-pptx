package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class k2b {
   ChartDataCell n5;
   long l6;
   int k5;
   int u3;
   int a6;
   int u9;

   public final boolean n5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("column");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("row");
      } else {
         return var1 >= this.k5 && var1 <= this.a6 && var2 >= this.u3 && var2 <= this.u9;
      }
   }
}
