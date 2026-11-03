package com.aspose.slides.internal.m6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e7.x8;
import com.aspose.slides.internal.v2.t9;
import com.aspose.slides.internal.z0k.t4;

public abstract class n5 {
   private x8 n5;
   private Dictionary<t9, com.aspose.slides.internal.v2.u9> l6;

   public final x8 n5() {
      return this.n5;
   }

   private void n5(x8 var1) {
      this.n5 = var1;
   }

   public final Dictionary<t9, com.aspose.slides.internal.v2.u9> l6() {
      return this.l6;
   }

   private void n5(Dictionary<t9, com.aspose.slides.internal.v2.u9> var1) {
      this.l6 = var1;
   }

   protected n5(t4 var1) {
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      this.n5(new Dictionary<>());
      this.n5(new x8(var1));
   }
}
