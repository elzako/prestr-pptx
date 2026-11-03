package com.aspose.slides.internal.g7;

public class z8 {
   public static boolean n5(byte[] var0, byte[] var1) {
      if (var0.length != var1.length) {
         return false;
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (n5(var0, var2, var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean n5(byte[] var0, int var1, byte[] var2) {
      if (var1 + var2.length > var0.length) {
         return false;
      }

      for (int var3 = var1; var3 < var1 + var2.length; var3++) {
         if (com.aspose.slides.internal.v6g.k5.u3(var0[var3], 6) != com.aspose.slides.internal.v6g.k5.u3(var2[var3 - var1], 6)) {
            return false;
         }
      }

      return true;
   }

   public static com.aspose.slides.internal.l7h.j5 n5(String var0) {
      return com.aspose.slides.internal.l7h.j5.k5(var0);
   }
}
