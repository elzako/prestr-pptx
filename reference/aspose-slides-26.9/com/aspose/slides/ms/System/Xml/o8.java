package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class o8 {
   public abstract Object n5(com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.ms.System.y8 var3);

   public com.aspose.slides.ms.System.r8 n5(com.aspose.slides.ms.System.r8 var1, String var2) {
      if (var1 == null || !var1.z3() && var1.m1().length() == 0) {
         com.aspose.slides.ms.System.r8 var3 = new com.aspose.slides.ms.System.r8(var2, 0);
         if (!var3.z3() && var3.m1().length() > 0) {
            var3 = new com.aspose.slides.ms.System.r8(com.aspose.slides.internal.z0k.z1.k5(var2));
         }

         return var3;
      } else if (var2 == null || var2.length() == 0) {
         return var1;
      } else if (!var1.z3()) {
         throw new NotSupportedException(v3.n5("Relative URIs are not supported."));
      } else {
         return new com.aspose.slides.ms.System.r8(var1, var2);
      }
   }

   public boolean n5(com.aspose.slides.ms.System.r8 var1, com.aspose.slides.ms.System.y8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("absoluteUri");
      } else {
         return var2 == null || var2 == com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class);
      }
   }
}
