package com.aspose.slides;

class r9l implements com.aspose.slides.internal.j4.k5 {
   private final f7s n5;

   public r9l(f7s var1) {
      this.n5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.j4.a6 n5(Object var1, com.aspose.slides.internal.j4.u3 var2) {
      if (this.n5 == null) {
         return new com.aspose.slides.internal.j4.a6(null);
      }

      com.aspose.slides.internal.z0k.t4 var3 = this.n5.n5(var2.n5());
      if (var3 == null) {
         return new com.aspose.slides.internal.j4.a6(null);
      }

      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

      try {
         byte[] var5 = new byte[1024];

         int var6;
         while (0 < (var6 = var3.read(var5, 0, var5.length))) {
            var4.write(var5, 0, var6);
         }

         return new com.aspose.slides.internal.j4.a6(var4.toArray());
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }
}
