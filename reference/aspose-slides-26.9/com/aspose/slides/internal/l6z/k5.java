package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentNullException;

class k5 {
   public static String n5(byte[] var0, com.aspose.slides.internal.l7h.j5 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("byteArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("encoding");
      }

      char[] var2 = var1.n5(var0);
      return var2 != null ? com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.n5(var2), '\u0000') : null;
   }

   public static String n5(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("byteArray");
      }

      com.aspose.slides.internal.l7h.j5 var2 = com.aspose.slides.internal.n2d.x8.n5(var1);
      return n5(var0, var2);
   }
}
