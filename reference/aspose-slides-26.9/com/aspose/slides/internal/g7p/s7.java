package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;
import java.util.List;

public class s7 extends k5<com.aspose.slides.internal.w4c.k5> {
   protected List<com.aspose.slides.internal.o9b.c8[]> l6;

   public s7(m3 var1) {
      super(var1);
      this.l6 = this.n5(var1.n3().n5());
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.k5 var3) {
      com.aspose.slides.internal.x4g.a6 var4 = this.n5.n3();
      float[] var5 = var4.l6();
      return this.n5(new w1(var1, var2), var3, this.l6, var5, true);
   }

   protected com.aspose.slides.internal.o9b.c8 n5(
      w1 var1, com.aspose.slides.internal.w4c.k5 var2, List<com.aspose.slides.internal.o9b.c8[]> var3, float[] var4, boolean var5
   ) {
      double var6 = this.n5(var1, var2, var5);
      return var6 == -1.0 ? null : this.n5(var6, var3, var4);
   }
}
