package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class f5 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "disc",
      "circle",
      "square",
      "decimal",
      "decimal-leading-zero",
      "lower-roman",
      "upper-roman",
      "lower-greek",
      "lower-latin",
      "upper-latin",
      "armenian",
      "georgian",
      "lower-alpha",
      "upper-alpha",
      "none"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "disc";
         case 1:
            return "circle";
         case 2:
            return "square";
         case 3:
            return "decimal";
         case 4:
            return "decimal-leading-zero";
         case 5:
            return "lower-roman";
         case 6:
            return "upper-roman";
         case 7:
            return "lower-greek";
         case 8:
            return "lower-latin";
         case 9:
            return "upper-latin";
         case 10:
            return "armenian";
         case 11:
            return "georgian";
         case 12:
            return "lower-alpha";
         case 13:
            return "upper-alpha";
         case 14:
            return "none";
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
         case 8:
            var2[0] = 8;
            return true;
         case 9:
            var2[0] = 9;
            return true;
         case 10:
            var2[0] = 10;
            return true;
         case 11:
            var2[0] = 11;
            return true;
         case 12:
            var2[0] = 12;
            return true;
         case 13:
            var2[0] = 13;
            return true;
         case 14:
            var2[0] = 14;
            return true;
         default:
            throw new ArgumentException("token");
      }
   }
}
