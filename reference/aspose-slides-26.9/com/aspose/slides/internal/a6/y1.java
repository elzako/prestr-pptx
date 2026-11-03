package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class y1 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "auto",
      "crosshair",
      "default",
      "pointer",
      "move",
      "e-resize",
      "ne-resize",
      "nw-resize",
      "n-resize",
      "se-resize",
      "sw-resize",
      "s-resize",
      "w-resize",
      "text",
      "wait",
      "progress",
      "help",
      "url"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "auto";
         case 1:
            return "crosshair";
         case 2:
            return "default";
         case 3:
            return "pointer";
         case 4:
            return "move";
         case 5:
            return "e-resize";
         case 6:
            return "ne-resize";
         case 7:
            return "nw-resize";
         case 8:
            return "n-resize";
         case 9:
            return "se-resize";
         case 10:
            return "sw-resize";
         case 11:
            return "s-resize";
         case 12:
            return "w-resize";
         case 13:
            return "text";
         case 14:
            return "wait";
         case 15:
            return "progress";
         case 16:
            return "help";
         case 17:
            return "url";
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
         case 15:
            var2[0] = 15;
            return true;
         case 16:
            var2[0] = 16;
            return true;
         case 17:
            var2[0] = 17;
            return true;
         default:
            throw new ArgumentException("token");
      }
   }
}
