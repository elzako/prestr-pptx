package com.aspose.slides.internal.t0;

import com.aspose.slides.internal.i0.j9;
import com.aspose.slides.internal.i0.s0;
import com.aspose.slides.internal.i0.v8;
import com.aspose.slides.internal.i0.w2;
import com.aspose.slides.internal.i0.z6;

public class s3 extends y1 {
   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.p3 var3 = (com.aspose.slides.internal.i0.p3)var1;
      com.aspose.slides.internal.o8.u3.n5(var3.t2(), var2);
      var2.n5(var3.n5() & 4294967295L);
      var2.n5(var3.l6());
      var2.n5(var3.u3());
      if (com.aspose.slides.internal.n7.k5.n5(var3.l6(), 11)) {
         com.aspose.slides.internal.o8.u3.n5(com.aspose.slides.internal.v6g.k5.k5(var3.k5(), v8[].class), var2);
      } else if (com.aspose.slides.internal.n7.k5.n5(var3.l6(), 14)) {
         com.aspose.slides.internal.o8.u3.n5(com.aspose.slides.internal.v6g.k5.k5(var3.k5(), w2[].class), var2);
      } else {
         com.aspose.slides.internal.o8.u3.n5(com.aspose.slides.internal.v6g.k5.k5(var3.k5(), s0[].class), var2);
      }

      if (com.aspose.slides.internal.n7.k5.n5(var3.l6(), 11)) {
         for (int var4 = 0; var4 < var3.a6().length; var4++) {
            z6 var5 = (z6)var3.a6()[var4];
            var2.n5((byte)var5.l6());
         }
      } else {
         for (int var6 = 0; var6 < var3.a6().length; var6++) {
            j9 var7 = (j9)var3.a6()[var6];
            var2.n5((byte)var7.l6());
         }
      }

      if (var3.h0() != null && var3.h0().length > 0) {
         var2.n5(var3.h0());
      }
   }
}
