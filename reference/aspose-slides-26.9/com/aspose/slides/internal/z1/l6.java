package com.aspose.slides.internal.z1;

import com.aspose.slides.internal.l7h.a5;

public class l6 extends k5 {
   public l6(com.aspose.slides.internal.t9.n5 var1) {
      super(var1);
   }

   @Override
   public String n5(int var1) {
      if (var1 <= 0) {
         return this.n5().h0().n5(var1);
      }

      a5 var2 = new a5();

      for (int var3 = this.n5().u3().size(); var1 != 0; var1 /= var3) {
         int var4 = --var1 % var3;
         var2.n5(0, this.n5().u3().get_Item(var4));
      }

      return var2.toString();
   }
}
