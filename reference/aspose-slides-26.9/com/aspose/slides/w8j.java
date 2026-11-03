package com.aspose.slides;

class w8j implements com.aspose.slides.internal.b5j.u3 {
   private final IExternalResourceResolver n5;
   private final String l6;

   public w8j(IExternalResourceResolver var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final com.aspose.slides.internal.k5.t1 n5(Object var1, com.aspose.slides.internal.k5.u6 var2) {
      if (this.n5 == null) {
         return null;
      }

      String var3 = this.n5.resolveUri(this.l6, var2.n5());
      if (var3 != null) {
         com.aspose.slides.internal.z0k.t4 var4 = com.aspose.slides.internal.z0k.t4.fromJava(this.n5.getEntity(var3));
         if (var4 != null) {
            byte[] var5 = this.n5(var4);
            return new com.aspose.slides.internal.k5.t1(var5);
         }
      }

      return null;
   }

   private byte[] n5(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = new byte[32768];
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         int var4;
         while ((var4 = var1.read(var2, 0, var2.length)) > 0) {
            var3.write(var2, 0, var4);
         }

         return var3.toArray();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
