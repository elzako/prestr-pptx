package com.aspose.slides.internal.g7;

class i6 {
   public i6() {
   }

   public final byte[] n5(v3 var1, j8 var2) {
      int var3 = 0;
      int var4 = 0;
      w2 var5 = new w2(var2.u3());

      for (int var6 = 0; var6 < var2.k5(); var6++) {
         int[] var7 = new int[]{var3};
         int[] var8 = new int[]{var4};
         var2.n5(var6, var7, var8);
         var3 = var7[0];
         var4 = var8[0];
         p8 var9 = new p8();
         s3 var10 = new s3(var9, new a3(), true);
         var10.n5(var1);
         var9.n5(var10);
         var9.l6(new m1(var2.u9(), var3, var4));
         var10.f2().seek(0L, 0);
         var10.f2().close();
         var5.n5(var10.f2().toArray());
      }

      com.aspose.slides.internal.z0k.e2 var14 = new com.aspose.slides.internal.z0k.e2();

      try {
         h2 var15 = new h2(var14);
         v8 var16 = new v8(var15);
         var16.n5(var5.n5(), 0L);
         var14.close();
         return var14.toArray();
      } finally {
         if (var14 != null) {
            var14.dispose();
         }
      }
   }
}
