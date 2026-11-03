package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class u5b {
   static void n5(ICustomData var0, com.aspose.slides.internal.k0r.d0 var1) {
      if (var1 != null) {
         CustomData var2 = (CustomData)var0;
         var2.n5().n5(var1.t2());
         d5i.n5(var2.getTags(), var1);
      }
   }

   static void l6(ICustomData var0, com.aspose.slides.internal.k0r.d0 var1) {
      if (var0 != null && var0.getTags() != null && var0.getTags().size() != 0) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         d5i.l6(var0.getTags(), var1);
      }
   }
}
