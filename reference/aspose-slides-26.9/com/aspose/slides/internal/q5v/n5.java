package com.aspose.slides.internal.q5v;

import com.aspose.slides.internal.l7h.j5;

public class n5 {
   public static short[] n5(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      short[] var2 = new short[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.k7();
      }

      return var2;
   }

   public static float[] l6(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      float[] var2 = new float[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.w1();
      }

      return var2;
   }

   public static String k5(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      byte[] var2 = var1.c8(var0 << 1);
      return j5.z1().l6(var2);
   }

   public static String n5(short[] var0) {
      byte[] var1 = new byte[var0.length << 1];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2 << 1] = (byte)var0[var2];
         var1[(var2 << 1) + 1] = (byte)(var0[var2] >> 8);
      }

      return j5.z1().l6(var1);
   }
}
