package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class i6 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("scrollbar", "panner", "move", "marquee");

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "scrollbar";
         case 1:
            return "panner";
         case 2:
            return "move";
         case 3:
            return "marquee";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var1))) {
         case 0:
            var2[0] = 0;
            return true;
         case 1:
            var2[0] = 1;
            return true;
         case 2:
            var2[0] = 2;
            return true;
         case 3:
            var2[0] = 3;
            return true;
         default:
            throw new ArgumentException("value");
      }
   }
}
