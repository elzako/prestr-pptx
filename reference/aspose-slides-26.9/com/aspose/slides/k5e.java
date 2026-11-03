package com.aspose.slides;

class k5e implements IXamlOutputSaver {
   @Override
   public final void save(String path, byte[] binaryData) {
      if (com.aspose.slides.ms.System.d1.n5(path)) {
         String var11 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamlOutputSaver", "path"});
         throw new t1c(var11);
      }

      if (binaryData == null) {
         String var10 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamlOutputSaver", "binaryData"});
         throw new t1c(var10);
      }

      try {
         String var3 = com.aspose.slides.internal.z0k.z1.u9(path);
         if (!com.aspose.slides.ms.System.d1.n5(var3) && !com.aspose.slides.internal.z0k.u3.k5(var3)) {
            com.aspose.slides.internal.z0k.u3.n5(var3);
         }

         com.aspose.slides.internal.z0k.n3 var12 = new com.aspose.slides.internal.z0k.n3(path, 4, 2);

         try {
            var12.write(binaryData, 0, binaryData.length);
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }
      } catch (RuntimeException var9) {
         String var4 = com.aspose.slides.ms.System.d1.n5(
            "Error in writing a binary data to a file stream. Exception details: {0}", new Object[]{var9.getMessage()}
         );
         throw new t1c(var4, var9);
      }
   }
}
