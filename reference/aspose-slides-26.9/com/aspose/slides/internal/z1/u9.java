package com.aspose.slides.internal.z1;

import com.aspose.slides.ms.System.d1;

public class u9 extends k5 {
   private int n5 = this.n5().u3().size();

   public u9(com.aspose.slides.internal.t9.n5 var1) {
      super(var1);
   }

   @Override
   public String n5(int var1) {
      if (this.n5 == 0) {
         return d1.n5;
      }

      var1 %= this.n5;
      if (var1 == 0) {
         var1 = this.n5 - 1;
      } else {
         var1--;
      }

      return this.n5().u3().get_Item(var1);
   }
}
