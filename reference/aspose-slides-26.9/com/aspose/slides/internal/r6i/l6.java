package com.aspose.slides.internal.r6i;

import com.aspose.slides.ms.System.z6;
import com.aspose.slides.ms.System.z7;

public abstract class l6 extends z6 {
   public abstract void invoke(Object var1, n5 var2);

   public final z7 beginInvoke(Object sender, n5 e, com.aspose.slides.ms.System.h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new k5(this, this, callback, state, sender, e));
   }

   public final void endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
   }
}
