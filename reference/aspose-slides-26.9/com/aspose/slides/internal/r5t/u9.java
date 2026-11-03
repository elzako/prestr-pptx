package com.aspose.slides.internal.r5t;

import com.aspose.slides.ms.System.z6;
import com.aspose.slides.ms.System.z7;

public abstract class u9 extends z6 {
   public abstract void invoke(Object var1);

   public final z7 beginInvoke(Object obj, com.aspose.slides.ms.System.h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new h0(this, this, callback, state, obj));
   }

   public final void endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
   }
}
