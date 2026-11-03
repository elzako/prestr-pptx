package com.aspose.slides.internal.s9;

import com.aspose.slides.internal.j4.a6;
import com.aspose.slides.internal.j4.k5;
import com.aspose.slides.internal.j4.u3;
import com.aspose.slides.internal.k5.p8;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.ms.System.d1;

public class n5 implements p8 {
   private k5 n5;

   public n5(k5 var1) {
      this.n5 = var1;
   }

   @Override
   public final t1 n5(Object var1, u6 var2) {
      a6 var3 = this.n5.n5(var1, n5(var2));
      return n5(var3);
   }

   private static u3 n5(u6 var0) {
      return new u3(var0.n5());
   }

   private static t1 n5(a6 var0) {
      return !d1.n5(var0.u3()) && (d1.n5(var0.u3()) || !"text/css".equals(var0.u3())) ? new t1(null) : new t1(var0.n5(), var0.k5());
   }
}
