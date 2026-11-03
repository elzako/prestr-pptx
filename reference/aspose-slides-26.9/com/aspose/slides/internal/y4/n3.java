package com.aspose.slides.internal.y4;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class n3 extends n5 {
   private int l6;
   private short k5;
   protected static final String[] n5 = new String[]{
      d1.n5, "%", "em", "ex", "px", "cm", "mm", "in", "pt", "pc", "deg", "rad", "grad", "ms", "s", "Hz", "kHz", d1.n5
   };

   public n3(int var1, short var2) {
      super(var2);
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{a3.n5(this.l6, com.aspose.slides.internal.h0.h0.n5), n5[this.k5 - 1]});
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public float n5(short var1) {
      return this.l6;
   }

   @Override
   public int l6(short var1) {
      return this.l6;
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      n3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n3.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : f0.l6(this.h0(), var2.h0()) && a3.l6(this.l6, var2.l6);
      }
   }
}
