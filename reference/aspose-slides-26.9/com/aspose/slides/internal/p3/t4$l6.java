package com.aspose.slides.internal.p3;

class t4$l6 {
   public static final String[] n5 = new String[]{"VERY TIGHT", "TIGHT", "LOOSE", "VERY LOOSE"};

   public static int n5(double var0) {
      if (var0 < -0.5) {
         return 0;
      } else if (var0 <= 0.5) {
         return 1;
      } else {
         return var0 <= 1.0 ? 2 : 3;
      }
   }
}
