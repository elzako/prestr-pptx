package com.aspose.slides.internal.l4o;

import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.z0k.t4;

public class k5 extends a0 {
   public k5(t4 var1) {
      super(var1);
   }

   public void k5(long var1) {
      byte[] var3 = new byte[]{
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 24, 10) & 255L, 10)), 10
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 16, 10) & 255L, 10)), 10
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) >> 8, 10) & 255L, 10)), 10
         ),
         com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var1, 10) & 255L, 10)), 10)
      };
      this.l6(var3, 0, var3.length);
   }
}
