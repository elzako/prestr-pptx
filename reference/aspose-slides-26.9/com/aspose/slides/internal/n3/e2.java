package com.aspose.slides.internal.n3;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class e2 extends m1 {
   public abstract void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4);

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      throw new NotSupportedException("See individual properties.");
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      throw new NotSupportedException("See individual properties.");
   }

   protected final void n5(com.aspose.slides.internal.z8.t4 var1, String var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      var1.n5(var2, var3, var4);
   }

   protected final void n5(com.aspose.slides.internal.z8.t4 var1, String var2, IGenericList<com.aspose.slides.internal.z8.y4> var3, boolean var4) {
      if (var3.size() != 0) {
         var1.n5(var2, com.aspose.slides.internal.z8.n5.n5(var3).l6(), var4);
      }
   }
}
