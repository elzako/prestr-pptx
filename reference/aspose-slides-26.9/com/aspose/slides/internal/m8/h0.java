package com.aspose.slides.internal.m8;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class h0 extends e2 {
   public com.aspose.slides.internal.t5.q0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.t5.n3 var2 = (com.aspose.slides.internal.t5.n3)new c8().n5(var1);
      com.aspose.slides.internal.t5.y4 var3 = new com.aspose.slides.internal.t5.y4(var2);

      try {
         var3.n5((com.aspose.slides.internal.t5.k5)new l6().n5(var1));
      } catch (ArgumentOutOfRangeException var5) {
         com.aspose.slides.internal.f8y.n5.k5(d1.n5(new String[]{"ArgumentOutOfRangeException in EmfDesignVectorReader:", var5.getMessage()}));
      }

      return var3;
   }
}
