package com.aspose.slides.internal.f3;

import com.aspose.slides.ms.System.h0;
import com.aspose.slides.ms.System.z6;
import com.aspose.slides.ms.System.z7;

public abstract class k5<TResult> extends z6 {
   public abstract TResult invoke();

   public final z7 beginInvoke(h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new k5$1(this, this, callback, state));
   }

   public final TResult endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
      return (TResult)this.peekResult();
   }

   // $VF: synthetic method
   static void access$000(k5 x0, Object x1) {
      x0.pushResult(x1);
   }
}
