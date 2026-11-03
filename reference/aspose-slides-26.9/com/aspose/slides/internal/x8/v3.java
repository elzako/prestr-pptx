package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class v3 extends g7 {
   private g7 n5;
   private g7 l6;

   public v3(g7 var1, g7 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public int k5() {
      return 0;
   }

   @Override
   public String u9() {
      return d1.n5(new String[]{this.n5.u9(), this.l6.u9()});
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      return this.n5.n5(var1, var2) && this.l6.n5(var1, var2);
   }

   @Override
   public int u3() {
      return this.n5.u3() + this.l6.u3();
   }

   @Override
   public boolean a6() {
      return this.l6.a6();
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.n5 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
   }
}
