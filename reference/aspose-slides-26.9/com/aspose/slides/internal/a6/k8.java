package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class k8 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("a5", "a4", "a3", "b5", "b4", "letter", "legal", "ledger");

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "A5";
         case 1:
            return "A4";
         case 2:
            return "A3";
         case 3:
            return "B5";
         case 4:
            return "B4";
         case 5:
            return "letter";
         case 6:
            return "legal";
         case 7:
            return "ledger";
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
         case 4:
            var2[0] = 4;
            return true;
         case 5:
            var2[0] = 5;
            return true;
         case 6:
            var2[0] = 6;
            return true;
         case 7:
            var2[0] = 7;
            return true;
         default:
            throw new ArgumentException("value");
      }
   }
}
