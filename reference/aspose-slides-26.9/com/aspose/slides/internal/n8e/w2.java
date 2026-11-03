package com.aspose.slides.internal.n8e;

import java.io.ByteArrayOutputStream;
import java.text.MessageFormat;

class w2 {
   static boolean n5(byte[] var0, byte[] var1, byte[] var2, byte[] var3) throws Exception {
      return l6(var0, var1, var2, var3);
   }

   private static boolean l6(byte[] var0, byte[] var1, byte[] var2, byte[] var3) throws Exception {
      boolean var4 = false;
      if (var3.length != var0.length) {
         b5.n5(1);
         var4 = true;
      }

      byte[] var5 = t1.n5(var3);
      j8 var6 = new j8(var0, var1);
      byte[] var7 = t1.n5(var6, var5);
      byte[] var8 = t1.n5(var7, var6.n5().bitLength() >> 3);
      byte[] var9 = n5(var0, var2, var8.length);
      if (var8.length != var9.length) {
         var4 = true;
      } else {
         for (int var10 = 0; var10 < var8.length; var10++) {
            var4 = var4 || var8[var10] != var9[var10];
         }
      }

      p6 var15 = new p6(var7);
      var15.n5(var5.length, var9.length, false);
      ByteArrayOutputStream var11 = new ByteArrayOutputStream();
      var11.write(var7, 0, var7.length);
      var15.n5(var11, var9, var5.length);
      if (var15.n5()) {
         var5[0] = 0;
         var5[1] = 17;
      }

      d1 var12 = new d1(var15, var8, true, var15.n5());
      int[] var13 = new int[var7.length];

      for (int var14 = 0; var14 < var7.length; var14++) {
         var13[var14] = var7[var14];
      }

      var12.n5(var13, var15);
      var12.n5(null, true);
      var12.n5(true);
      var15.n5(true);
      String var16 = "1234567890ABCDEF";
      var12.n5(var16, false);
      var12.n5(var7, "Aspose.Slides");
      return !var4;
   }

   private static byte[] n5(byte[] var0, byte[] var1, int var2) throws Exception {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      var3.write(n5(var0), 0, n5(var0).length);
      byte[] var4 = z1.n5(var0.length == 128 ? 0 : 1, var1);
      var3.write(var4, 0, var4.length);
      if (var2 < var3.size() + 11) {
         b5.n5(11);
      }

      ByteArrayOutputStream var5 = new ByteArrayOutputStream();
      var5.write(0);
      var5.write(1);
      int var6 = var2 - var3.size() - 3;

      for (int var7 = 0; var7 < var6; var7++) {
         var5.write(255);
      }

      var5.write(0);
      var3.writeTo(var5);
      return var5.toByteArray();
   }

   private static byte[] n5(byte[] var0) {
      byte[] var1 = new byte[]{48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20};
      byte[] var2 = new byte[]{48, 49, 48, 13, 6, 9, 96, -122, 72, 1, 101, 3, 4, 2, 1, 5, 0, 4, 32};
      return l6(var0).equals("SHA1") ? var1 : var2;
   }

   private static String l6(byte[] var0) {
      switch (var0.length) {
         case 128:
            return "SHA1";
         case 256:
            return "SHA256";
         default:
            throw new IllegalStateException(MessageFormat.format("Unexpected public key modulus length: {0}", var0.length));
      }
   }
}
