package com.aspose.slides.internal.o5k;

import java.awt.Rectangle;
import java.io.IOException;

public class k5 extends com.aspose.slides.internal.s2b.u3 {
   int n5;
   Rectangle l6;
   Rectangle k5;
   com.aspose.slides.internal.c4t.n5 u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = new Rectangle(
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 6),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 4),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2)
      );
      var2 += 8;
      this.k5 = new Rectangle(
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 6),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 4),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2)
      );
      var2 += 8;
      this.u3 = new com.aspose.slides.internal.c4t.n5();
      this.u3.n5(var1, var2, var3 - var2, false);
   }

   @Override
   public int n5() {
      return 2881;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.n5, this.u3.n5(), this.k5, this.l6);
      super.n5(var1, var2, var3);
   }
}
