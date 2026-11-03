package com.aspose.slides.internal.x8w;

public final class n3 {
   public static String n5(byte[] var0) {
      if (var0 == null) {
         return null;
      }

      StringBuilder var1 = new StringBuilder(var0.length * 2);

      for (byte var5 : var0) {
         var1.append(com.aspose.slides.ms.System.e2.n5(var5, "X2", com.aspose.slides.internal.x7n.l6.k5()));
      }

      return var1.toString();
   }
}
