package com.aspose.slides.internal.o6;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;

public class n5 {
   public static short[] n5(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      short[] var2 = new short[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.k7();
      }

      return var2;
   }

   public static int[] l6(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      int[] var2 = new int[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.r4();
      }

      return var2;
   }

   public static long[] n5(long var0, com.aspose.slides.internal.z0k.n5 var2) {
      long[] var3 = new long[(int)(var0 & 4294967295L)];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var2.c4();
      }

      return var3;
   }

   public static void n5(t4 var0, int var1) {
      int var2 = (int)(var0.getPosition() % var1);
      if (var2 > 0) {
         var2 = var1 - var2;
         var0.seek(var2, 1);
      }
   }

   public static float[] k5(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      float[] var2 = new float[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.w1();
      }

      return var2;
   }

   public static float[] l6(long var0, com.aspose.slides.internal.z0k.n5 var2) {
      return k5((int)var0, var2);
   }

   public static String u3(int var0, com.aspose.slides.internal.z0k.n5 var1) {
      byte[] var2 = var1.c8(var0 << 1);
      return j5.z1().l6(var2);
   }

   public static String k5(long var0, com.aspose.slides.internal.z0k.n5 var2) {
      return u3((int)var0, var2);
   }

   public static String n5(byte[] var0) {
      int var1 = var0.length - 1;

      for (int var2 = 0; var2 < var0.length - 1; var2 += 2) {
         if ((var0[var2] & 255) == 0 && (var0[var2 + 1] & 255) == 0) {
            var1 = var2;
            break;
         }
      }

      return j5.z1().l6(var0, 0, var1);
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
