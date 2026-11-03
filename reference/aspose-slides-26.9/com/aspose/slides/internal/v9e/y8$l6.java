package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XmlException;

class y8$l6 extends y8$n3 {
   public y8$l6() {
      super(1, 2, 3, new int[]{5, 3});
   }

   @Override
   public Object n5(com.aspose.slides.internal.k4s.h0 var1, Object[] var2, com.aspose.slides.internal.x6s.a6 var3) {
      String var4 = null;
      if (var2.length == 2) {
         com.aspose.slides.internal.x6s.h0 var5 = n5(var2[1]);
         if (var5.l6()) {
            var4 = var5.k5().t2();
         } else {
            var4 = com.aspose.slides.ms.System.d1.n5;
         }
      }

      try {
         return y8.n5((y8)var1, var2[0], var4);
      } catch (RuntimeException var6) {
         if (!XmlException.isCatchableException(var6)) {
            throw var6;
         } else {
            return com.aspose.slides.internal.v7y.s4.n5;
         }
      }
   }
}
