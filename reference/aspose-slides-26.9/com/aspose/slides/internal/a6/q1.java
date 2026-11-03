package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class q1 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "first-line",
      "first-letter",
      "before",
      "after",
      "first",
      "left",
      "right",
      "link",
      "visited",
      "focus",
      "active",
      "hover",
      "target",
      "default",
      "selection",
      "marker"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 1:
            return "first-line";
         case 2:
            return "first-letter";
         case 3:
            return "after";
         case 4:
            return "before";
         case 5:
            return "marker";
         case 6:
            return "first";
         case 7:
            return "left";
         case 8:
            return "right";
         case 9:
            return "link";
         case 10:
            return "visited";
         case 11:
            return "focus";
         case 12:
            return "active";
         case 13:
            return "hover";
         case 14:
            return "target";
         case 15:
            return "default";
         case 16:
            return "selection";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(var1)) {
         case 0:
            var2[0] = 1;
            return true;
         case 1:
            var2[0] = 2;
            return true;
         case 2:
            var2[0] = 4;
            return true;
         case 3:
            var2[0] = 3;
            return true;
         case 4:
            var2[0] = 6;
            return true;
         case 5:
            var2[0] = 7;
            return true;
         case 6:
            var2[0] = 8;
            return true;
         case 7:
            var2[0] = 9;
            return true;
         case 8:
            var2[0] = 10;
            return true;
         case 9:
            var2[0] = 11;
            return true;
         case 10:
            var2[0] = 12;
            return true;
         case 11:
            var2[0] = 13;
            return true;
         case 12:
            var2[0] = 14;
            return true;
         case 13:
            var2[0] = 15;
            return true;
         case 14:
            var2[0] = 16;
            return true;
         case 15:
            var2[0] = 5;
            return true;
         default:
            var2[0] = (Integer)com.aspose.slides.internal.v6g.k5.k5(int.class);
            return false;
      }
   }
}
