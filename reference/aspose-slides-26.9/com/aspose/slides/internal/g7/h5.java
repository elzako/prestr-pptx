package com.aspose.slides.internal.g7;

class h5 {
   private static final short n5 = com.aspose.slides.internal.v6g.k5.l6((byte)-18, 6);

   public static byte[] n5(byte[] var0) {
      t4 var1 = new t4(var0);
      byte[] var2 = new byte[com.aspose.slides.internal.v6g.k5.u3(var1.u9(), 8) * 2];
      byte var3 = 0;
      short var4 = 0;

      for (int var5 = 0; var5 < var2.length; var5 += 2) {
         var3 = var1.c8();
         short var6;
         if (com.aspose.slides.internal.v6g.k5.u3(var3, 6) < n5) {
            var6 = com.aspose.slides.internal.v6g.k5.l6(var3, 6);
         } else if (com.aspose.slides.internal.v6g.k5.u3(var3, 6) >= com.aspose.slides.internal.v6g.k5.u3((byte)-8, 6)
            && com.aspose.slides.internal.v6g.k5.u3(var3, 6) <= com.aspose.slides.internal.v6g.k5.u3((byte)-1, 6)) {
            var6 = com.aspose.slides.internal.v6g.k5.l6(var1.c8(), 6);
            var6 = (short)(var6 + (com.aspose.slides.internal.v6g.k5.u3(var3, 6) - com.aspose.slides.internal.v6g.k5.u3((byte)-8, 6) + 1) * n5);
         } else if (com.aspose.slides.internal.v6g.k5.u3(var3, 6) >= com.aspose.slides.internal.v6g.k5.u3((byte)-17, 6)
            && com.aspose.slides.internal.v6g.k5.u3(var3, 6) <= com.aspose.slides.internal.v6g.k5.u3((byte)-9, 6)) {
            var6 = com.aspose.slides.internal.v6g.k5.l6(var1.c8(), 6);
            var6 = (short)(-(var6 + (com.aspose.slides.internal.v6g.k5.u3(var3, 6) - com.aspose.slides.internal.v6g.k5.u3((byte)-17, 6)) * n5));
         } else {
            var6 = var1.h0();
         }

         var6 = (short)(var6 + var4);
         var4 = var6;
         var2[var5] = (byte)(var6 >> 8 & 0xFF);
         var2[var5 + 1] = (byte)(var6 & 0xFF);
      }

      return var2;
   }
}
