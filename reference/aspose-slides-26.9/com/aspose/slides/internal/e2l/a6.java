package com.aspose.slides.internal.e2l;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class a6 {
   public static com.aspose.slides.internal.j3b.u3 n5(a0 var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var1 <= 0) {
         throw new NotSupportedException("palSize");
      }

      int var2 = 3 * var1;
      int[] var3 = com.aspose.slides.internal.q9u.n5.n5(var1);
      byte[] var4 = new byte[var2];
      if (var2 != var0.l6(var4)) {
         throw new com.aspose.slides.internal.g9t.n5("Cannot load palette. Not enough bytes to read from the stream.");
      }

      for (int var5 = 0; var5 < var1; var5++) {
         var3[var5] = com.aspose.slides.internal.y5s.u9.n5(
            com.aspose.slides.internal.y5s.u9.n5(var4[3 * var5] & 255, var4[3 * var5 + 1] & 255, var4[3 * var5 + 2] & 255)
         );
      }

      return new com.aspose.slides.internal.y5s.h0(var3);
   }

   public static void n5(a0 var0, com.aspose.slides.internal.j3b.u3 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var1 == null) {
         throw new ArgumentNullException("palette");
      }

      int[] var2 = var1.l6();
      byte[] var3 = new byte[var2.length * 3];
      int var4 = 0;

      for (int var5 = 0; var5 < var2.length; var5++) {
         int var6 = var2[var5];
         byte var7 = (byte)(var6 >> 16 & 0xFF);
         byte var8 = (byte)(var6 >> 8 & 0xFF);
         byte var9 = (byte)(var6 & 0xFF);
         var3[var4++] = var7;
         var3[var4++] = var8;
         var3[var4++] = var9;
      }

      var0.n5(var3);
   }

   public static byte[] l6(a0 var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("streamContainer");
      } else {
         byte[] var2 = new byte[var1];
         if (var0.l6(var2) != var1) {
            throw new com.aspose.slides.internal.g9t.n5("Cannot load data. There is not enough bytes to read from stream.");
         } else {
            return var2;
         }
      }
   }

   public static void n5(byte[] var0, t4 var1) {
      if (var0 != null) {
         int var2 = 0;

         while (var2 < com.aspose.slides.ms.System.u3.n5((Object)(var0)).a6()) {
            int var3 = q1.l6(255, com.aspose.slides.ms.System.u3.n5((Object)(var0)).a6() - var2);
            var1.writeByte((byte)var3);
            var1.write(var0, var2, var3);
            var2 += var3;
         }
      }

      var1.writeByte((byte)0);
   }

   public static byte[] n5(a0 var0) {
      return n5(var0.l6());
   }

   public static byte[] n5(t4 var0) {
      long var1 = var0.getPosition();
      int var3 = var0.readByte();
      int var4 = 0;

      while (var3 != 0) {
         var4 += var3;
         var0.seek(var3, 1);
         var3 = var0.readByte();
         if (var3 == -1) {
            return new byte[]{0};
         }
      }

      byte[] var5 = new byte[var4];
      var0.seek(var1, 0);
      int var6 = 0;

      while (var6 < var4) {
         var3 = var0.readByte();
         if (var0.read(var5, var6, var3) != var3) {
            throw new com.aspose.slides.internal.g9t.n5("Cannot load application data. There is not enough bytes to read from stream.");
         }

         var6 += var3;
      }

      var0.readByte();
      return var5;
   }
}
