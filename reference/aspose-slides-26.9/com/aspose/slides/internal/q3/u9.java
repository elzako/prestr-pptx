package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.j9;
import com.aspose.slides.internal.i4.u6;
import com.aspose.slides.internal.i4.w2;
import com.aspose.slides.internal.i4.y1;

public class u9 extends u6 {
   private j9 u3;
   private l6 a6;

   public u9(j9 var1, String var2, j4 var3, l6 var4) {
      super(var3);
      this.u3 = var1;
      this.n5 = var2;
      this.a6 = var4;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4 = this.a6.n5(this.n5, var2, var3);
      var1.l6(var4);
      return var4;
   }
}
