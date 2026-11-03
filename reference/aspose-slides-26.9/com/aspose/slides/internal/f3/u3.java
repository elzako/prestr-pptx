package com.aspose.slides.internal.f3;

import com.aspose.slides.ms.System.h0;
import com.aspose.slides.ms.System.z6;
import com.aspose.slides.ms.System.z7;

public abstract class u3<TArg, TResult> extends z6 {
   public abstract TResult invoke(TArg var1);

   public final z7 beginInvoke(TArg arg, h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new u3$1(this, this, callback, state, arg));
   }

   public final TResult endInvoke(z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
      return (TResult)this.peekResult();
   }

   // $VF: synthetic method
   static void access$000(u3 x0, Object x1) {
      x0.pushResult(x1);
   }
}
