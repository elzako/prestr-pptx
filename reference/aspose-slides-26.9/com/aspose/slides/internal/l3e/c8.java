package com.aspose.slides.internal.l3e;

public class c8 {
   public static h0 n5() {
      h0 var0 = new h0();
      byte[] var1 = new byte[1408];
      int var2 = 256;
      var0.n5(var2);

      for (int var3 = 0; var3 <= 255; var3++) {
         var1[var2 + var3] = (byte)var3;
      }

      var2 += 128;

      for (int var5 = 128; var5 < 512; var5++) {
         var1[var2 + var5] = -1;
      }

      com.aspose.slides.ms.System.u3.n5(var1, var2 + 512, 384);
      var0.n5(var1);
      var0.n5((short[])null);
      return var0;
   }

   public static h0 l6() {
      h0 var0 = new h0();
      var0.n5(4096);
      short[] var1 = new short[22528];
      int var2 = 4096;

      for (int var3 = 0; var3 <= 4095; var3++) {
         var1[var2 + var3] = (short)var3;
      }

      var2 += 2048;

      for (int var5 = 2048; var5 < 8192; var5++) {
         var1[var2 + var5] = 4095;
      }

      com.aspose.slides.ms.System.u3.n5(var1, var2 + 8192, 6144);
      var0.n5((byte[])null);
      var0.n5(var1);
      return var0;
   }
}
