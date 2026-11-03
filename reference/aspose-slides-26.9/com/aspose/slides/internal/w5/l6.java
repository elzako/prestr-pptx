package com.aspose.slides.internal.w5;

import com.aspose.slides.internal.f5.q0;
import com.aspose.slides.internal.f5.z1;
import com.aspose.slides.ms.System.d1;

public class l6 extends q0 {
   private boolean n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("-//W3C//DTD HTML 4.01//EN");

   public l6(String var1, String var2, String var3, String var4, z1 var5) {
      super(var1, var2, var3, var4, var5);
      if (!d1.n5(var1) && d1.a6(d1.t2(var1), "HTML") && !d1.n5(var2)) {
         switch (l6.n5(d1.t2(var2))) {
            case 0:
               this.n5 = true;
         }
      }
   }

   public final boolean t9() {
      return this.n5;
   }
}
