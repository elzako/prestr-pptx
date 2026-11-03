package com.aspose.slides.internal.b8;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.z3;

public class k5 {
   private final String n5;
   private int l6;

   public k5(byte[] var1, int var2, int var3) {
      this.n5 = z3.n5(var1, var2, var3);
   }

   public final String n5() {
      int var1 = q1.l6(76, this.n5.length() - this.l6);
      String var2 = d1.l6(this.n5, this.l6, var1);
      this.l6 += var1;
      return var2;
   }

   public final boolean l6() {
      return this.l6 >= this.n5.length();
   }
}
