package com.aspose.slides.internal.d6;

import com.aspose.slides.exceptions.ArgumentException;

public class n5 extends com.aspose.slides.internal.p4.n5 {
   @Override
   public String n5(int var1) {
      switch (Integer.valueOf(var1)) {
         case 0:
            return "And";
         case 1:
            return "Or";
         case 2:
            return "NotEqual";
         case 3:
            return "LesserOrEqual";
         case 4:
            return "GreaterOrEqual";
         case 5:
            return "Lesser";
         case 6:
            return "Greater";
         case 7:
            return "Equal";
         case 8:
            return "Minus";
         case 9:
            return "Plus";
         case 10:
            return "Modulo";
         case 11:
            return "Div";
         case 12:
            return "Times";
         case 13:
            return "Pow";
         case 14:
            return "BitwiseAnd";
         case 15:
            return "BitwiseOr";
         case 16:
            return "BitwiseXOr";
         case 17:
            return "Same";
         case 18:
            return "NotSame";
         case 19:
            return "LeftShift";
         case 20:
            return "RightShift";
         case 21:
            return "UnsignedRightShift";
         case 22:
            return "InstanceOf";
         case 23:
            return "In";
         case 24:
            return "Unknown";
         default:
            throw new ArgumentException();
      }
   }
}
