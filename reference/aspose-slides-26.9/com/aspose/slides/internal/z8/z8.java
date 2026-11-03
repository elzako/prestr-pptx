package com.aspose.slides.internal.z8;

import com.aspose.slides.internal.l7h.a5;

public class z8 extends n5 {
   private y4 n5;

   public z8(y4 var1, short var2, y4 var3) {
      super(var2, var1);
      this.n5 = var3;
   }

   @Override
   public y4 c8() {
      return this.n5;
   }

   @Override
   public String h0() {
      switch (this.n5()) {
         case 25:
            return "counter";
         case 26:
            return "counters";
         case 27:
            return "rgb";
         case 38:
            return "rect";
         default:
            return super.h0();
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5(this.h0());
      var1.n5("()");
      return var1.toString();
   }
}
