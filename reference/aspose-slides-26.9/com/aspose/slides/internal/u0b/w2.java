package com.aspose.slides.internal.u0b;

import com.aspose.slides.internal.f4l.f5;
import com.aspose.slides.internal.f4l.j3;

class w2 {
   private final f5 n5;

   public w2(f5 var1) {
      this.n5 = var1;
   }

   public final j3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      j3 var2 = new j3();
      if (this.n5.y4() > 0) {
         var2.n5(com.aspose.slides.internal.q5v.n5.l6(this.n5.y4(), var1));
      }

      if (this.n5.t2() > 0) {
         com.aspose.slides.internal.f4l.z1[] var3 = new com.aspose.slides.internal.f4l.z1[this.n5.t2()];

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = x8.n5(var1);
         }

         var2.n5(var3);
      }

      return var2;
   }
}
