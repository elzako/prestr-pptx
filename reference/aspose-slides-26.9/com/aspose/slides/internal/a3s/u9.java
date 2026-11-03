package com.aspose.slides.internal.a3s;

public class u9 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("underline", "overline", "line-through", "blink");

   public static String n5(int var0) {
      switch (var0) {
         case 0:
         default:
            return "none";
         case 1:
            return "underline";
         case 2:
            return "overline";
         case 3:
            return "line-through";
         case 4:
            return "blink";
      }
   }
}
