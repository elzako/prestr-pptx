package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.List;

public class c8 {
   public static int n5(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   public static int l6(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   public static int n5(float[] var0) {
      if (var0 == null) {
         return 0;
      } else {
         return var0.length == 0 ? 0 : 1;
      }
   }

   public static float[] n5(com.aspose.slides.internal.z2.n5 var0, float var1) {
      if (var0 == null) {
         return new float[0];
      }

      List var2 = var0.l6();
      float[] var3 = new float[var2.size()];

      for (int var4 = 0; var4 < var2.size(); var4++) {
         var3[var4] = ((Integer)var2.get_Item(var4)).intValue() / var1;
      }

      return var3;
   }
}
