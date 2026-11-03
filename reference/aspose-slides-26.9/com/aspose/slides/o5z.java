package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class o5z implements z9l {
   public final String n5;
   public final z9l l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("sin", "cos", "tan", "asin", "acos", "atan", "ln");

   public o5z(String var1, z9l var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static boolean n5(String var0) {
      switch (k5.n5(var0)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
            return true;
         default:
            return false;
      }
   }

   @Override
   public final float n5(r9g var1) {
      float var2 = this.l6.n5(var1);
      switch (k5.n5(this.n5)) {
         case 0:
            return (float)com.aspose.slides.ms.System.q1.h0(var2);
         case 1:
            return (float)com.aspose.slides.ms.System.q1.c8(var2);
         case 2:
            return (float)com.aspose.slides.ms.System.q1.t2(var2);
         case 3:
            return (float)com.aspose.slides.ms.System.q1.e2(var2);
         case 4:
            return (float)com.aspose.slides.ms.System.q1.y4(var2);
         case 5:
            return (float)com.aspose.slides.ms.System.q1.t9(var2);
         case 6:
            return (float)com.aspose.slides.ms.System.q1.t4(var2);
         default:
            throw new NotImplementedException();
      }
   }
}
