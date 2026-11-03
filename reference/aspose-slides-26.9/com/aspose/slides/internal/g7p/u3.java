package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;
import java.util.List;

public class u3 extends l6<com.aspose.slides.internal.w4c.n5> {
   private List<com.aspose.slides.internal.o9b.c8[]> u3 = this.n5();

   public u3(m3 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.n5 var3) {
      if (var3.k5(var1, var2)) {
         com.aspose.slides.internal.o9b.c8 var4 = this.n5(0.0, this.n5.t2(), this.k5[0], this.k5[1], this.l6[0], this.l6[1]);
         return com.aspose.slides.internal.o9b.c8.n5(255, var4.x8() & 255, var4.n3() & 255, var4.y4() & 255);
      } else {
         double var5 = this.n5(new w1(var1, var2), var3, true);
         return var5 == -1.0 ? null : this.n5(this.u3, var5);
      }
   }
}
