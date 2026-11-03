package com.aspose.slides.internal.r5t;

import com.aspose.slides.ms.System.z6;
import com.aspose.slides.ms.System.z7;

public abstract class m1 extends z6 {
   public abstract void invoke();

   public final z7 beginInvoke(com.aspose.slides.ms.System.h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new k7(this, this, callback, state));
   }

   public final void endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
   }
}
