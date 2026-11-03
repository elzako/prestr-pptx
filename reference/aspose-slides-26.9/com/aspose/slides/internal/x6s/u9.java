package com.aspose.slides.internal.x6s;

import com.aspose.slides.Collections.IEqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;

public class u9 implements IEqualityComparer {
   @Override
   public final boolean equals(Object obj1, Object obj2) {
      a6 var3 = com.aspose.slides.internal.v6g.k5.n5(obj1, a6.class);
      a6 var4 = com.aspose.slides.internal.v6g.k5.n5(obj2, a6.class);
      return var3 != null && var4 != null && var3.l6(var4);
   }

   @Override
   public final int hashCode(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      }

      com.aspose.slides.internal.o8x.h0 var2;
      int var3;
      if (null != (var2 = com.aspose.slides.internal.v6g.k5.n5(obj, com.aspose.slides.internal.o8x.h0.class))) {
         var3 = var2.y2();
      } else {
         a6 var4;
         if (null != (var4 = com.aspose.slides.internal.v6g.k5.n5(obj, a6.class))) {
            Object var5 = var4.n3();
            if (var5 != null) {
               var3 = var5.hashCode();
            } else {
               var3 = var4.k5();
               var3 ^= var4.u3().hashCode();
               var3 ^= var4.h0().hashCode();
               var3 ^= var4.a6().hashCode();
            }
         } else {
            var3 = obj.hashCode();
         }
      }

      return var3;
   }
}
