package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class u9 extends l6 {
   public u9(b3 var1, b3 var2) {
      super(var1, var2);
   }

   @Override
   public int k5() {
      return 11;
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{this.n5().u9(), " > ", this.l6().u9()});
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      com.aspose.slides.internal.j3.z3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.a5(), com.aspose.slides.internal.j3.z3.class);
      return var3 != null && var3.n3() == 1 ? this.n5().n5(var3, null) && this.l6().n5(var1, var2) : false;
   }
}
