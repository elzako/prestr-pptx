package com.aspose.slides;

public abstract class MovePlayer$GetPointHandler extends com.aspose.slides.ms.System.z6 {
   public abstract d2k invoke(float var1);

   public final com.aspose.slides.ms.System.z7 beginInvoke(float t, com.aspose.slides.ms.System.h0 callback, Object state) {
      return com.aspose.slides.internal.u5b.n5.n5(new MovePlayer$GetPointHandler$1(this, this, callback, state, t));
   }

   public final d2k endInvoke(com.aspose.slides.ms.System.z7 result) {
      com.aspose.slides.internal.u5b.n5.n5(this, result);
      return (d2k)this.peekResult();
   }

   // $VF: synthetic method
   static void n5(MovePlayer$GetPointHandler var0, Object var1) {
      var0.pushResult(var1);
   }
}
