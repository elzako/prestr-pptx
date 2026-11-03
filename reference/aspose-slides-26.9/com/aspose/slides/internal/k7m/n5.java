package com.aspose.slides.internal.k7m;

import com.aspose.slides.exceptions.ArgumentNullException;

public class n5 {
   public static int n5(com.aspose.slides.internal.f2i.n5 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("options");
      }

      if (var0.x8() == 0) {
         int var1 = var0.y2();
         int var2 = var0.m3();
         int[] var3 = var0.k7();
         if ((var1 == 0 || var1 == 1) && (var2 == 1 || var2 == 32773 || var2 == 2) && var3.length == 1 && (var3[0] & 65535) == 1) {
            return 1;
         }

         if ((var1 == 0 || var1 == 1) && (var2 == 1 || var2 == 32773) && var3.length == 1 && ((var3[0] & 65535) == 4 || (var3[0] & 65535) == 8)) {
            return 2;
         }

         if (var1 == 3 && (var2 == 1 || var2 == 32773) && var3.length == 1 && ((var3[0] & 65535) == 4 || (var3[0] & 65535) == 8)) {
            return 3;
         }

         byte var4 = 3;
         if (var1 == 2
            && (var2 == 1 || var2 == 32773)
            && var3.length >= 3
            && (var3[0] & 65535) == 8
            && (var3[1] & 65535) == 8
            && (var3[2] & 65535) == 8
            && (var0.s3() & 65535) >= 3
            && var0.z8() == null) {
            return 4;
         }
      }

      return 0;
   }
}
