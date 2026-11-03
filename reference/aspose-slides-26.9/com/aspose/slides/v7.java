package com.aspose.slides;

class v7 {
   public static byte[] n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         String var1 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "BinaryHelper", "text"});
         throw new t1c(var1);
      }

      try {
         return com.aspose.slides.internal.l7h.j5.e2().u3(var0);
      } catch (RuntimeException var3) {
         String var2 = com.aspose.slides.ms.System.d1.n5("Error during converting string to binary data. Details: {0}", new Object[]{var3.getMessage()});
         throw new t1c(var2, var3);
      }
   }

   public static String n5(byte[] var0) {
      if (var0 == null) {
         String var1 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "BinaryHelper", "binaryData"});
         throw new t1c(var1);
      }

      try {
         return com.aspose.slides.internal.l7h.j5.e2().l6(var0);
      } catch (RuntimeException var3) {
         String var2 = com.aspose.slides.ms.System.d1.n5("Error during converting binary data to string. Details: {0}.", new Object[]{var3.getMessage()});
         throw new t1c(var2, var3);
      }
   }
}
