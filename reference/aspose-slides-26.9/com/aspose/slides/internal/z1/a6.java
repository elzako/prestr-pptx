package com.aspose.slides.internal.z1;

import com.aspose.slides.internal.l7h.a5;

public class a6 extends k5 {
   public a6(com.aspose.slides.internal.t9.n5 var1) {
      super(var1);
   }

   @Override
   public String n5(int var1) {
      if (var1 == 0) {
         return this.n5().u3().get_Item(0);
      }

      boolean var2 = false;
      long var3 = var1;
      if (var3 < 0L) {
         var2 = true;
         var3 *= -1L;
      }

      a5 var5 = new a5();

      for (int var6 = this.n5().u3().size(); var3 != 0L; var3 = (int)(var3 / var6)) {
         int var7 = (int)(var3 % var6);
         var5.n5(0, this.n5().u3().get_Item(var7));
      }

      if (var2) {
         var5.n5(0, "-");
      }

      return var5.toString();
   }
}
