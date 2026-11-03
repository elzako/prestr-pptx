package com.aspose.slides.internal.b1r;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.c4;

public class k5 extends u3 {
   private final com.aspose.slides.internal.j3b.u3 n5;
   private final c4 l6;

   public k5(c8 var1, com.aspose.slides.internal.j3b.u3 var2) {
      super(var1);
      this.n5 = var2;
      this.l6 = new c4(var2);
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = (byte)this.l6.n5(var1[var3]);
      }

      return var2;
   }
}
