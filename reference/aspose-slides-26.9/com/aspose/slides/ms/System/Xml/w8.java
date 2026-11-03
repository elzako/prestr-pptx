package com.aspose.slides.ms.System.Xml;

public class w8 extends com.aspose.slides.internal.z0k.e2 {
   private com.aspose.slides.ms.System.r8 n5;

   public w8(com.aspose.slides.ms.System.r8 var1, com.aspose.slides.internal.z0k.t4 var2) {
      this.n5 = var1;

      try {
         byte[] var3 = new byte[4096];
         int var4 = 0;

         while ((var4 = var2.read(var3, 0, 4096)) > 0) {
            this.write(var3, 0, var4);
         }

         super.setPosition(0L);
      } finally {
         var2.close();
      }
   }
}
