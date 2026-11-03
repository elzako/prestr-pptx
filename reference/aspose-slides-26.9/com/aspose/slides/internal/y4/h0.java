package com.aspose.slides.internal.y4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;

public class h0 extends n5 {
   private float n5;
   private String l6;

   public h0(float var1, String var2) {
      super((short)18);
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{n1.n5(this.n5, com.aspose.slides.internal.h0.h0.n5), this.l6});
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public float n5(short var1) {
      return this.n5;
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : f0.l6(this.h0(), var2.h0()) && n1.l6(this.n5, var2.n5);
      }
   }
}
