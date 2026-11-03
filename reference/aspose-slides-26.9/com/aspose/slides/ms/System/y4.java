package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.w4w.a6$n5;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class y4 {
   public static void n5(u3 var0, int var1, u3 var2, int var3, int var4) {
      Object var5 = u3.n5(var0);
      Object var6 = u3.n5(var2);
      n5(var5, var1, var6, var3, var4);
   }

   public static void n5(Object var0, int var1, Object var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      a6$n5 var5 = com.aspose.slides.internal.w4w.a6.n5(com.aspose.slides.internal.w4w.a6.n5(var0));
      a6$n5 var6 = com.aspose.slides.internal.w4w.a6.n5(com.aspose.slides.internal.w4w.a6.n5(var2));
      int var7 = com.aspose.slides.internal.w4w.a6.n5(var5);
      int var8 = com.aspose.slides.internal.w4w.a6.n5(var6);
      if (var5.equals(var6)) {
         if (var5.equals(a6$n5.a6) || var5.equals(a6$n5.u3)) {
            n5(var0, var1, var2, var3, var4, var7);
            return;
         }

         if (var1 % var7 == 0 && var3 % var8 == 0 && var4 % var7 == 0 && var4 % var8 == 0) {
            n5(var0, var1, var2, var3, var4, var7);
            return;
         }
      }

      com.aspose.slides.internal.w4w.a6 var9 = com.aspose.slides.internal.w4w.a6.n5(var0, var1, var4, var5, var7);
      com.aspose.slides.internal.w4w.a6 var10 = com.aspose.slides.internal.w4w.a6.n5(var2, var3, var4, var6, var8);
      ByteBuffer var11 = var9.l6();
      ByteBuffer var12 = var10.l6();
      ((Buffer)var12).position(var3 - var10.k5());
      ((Buffer)var11).position(var1 - var9.k5());

      for (int var13 = 0; var13 < var4; var13++) {
         var12.put(var11.get());
      }

      var10.n5();
   }

   public static void n5(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(char[] var0, int var1, char[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      System.arraycopy(var0, var1 / 2, var2, var3 / 2, var4 / 2);
   }

   public static void n5(int[] var0, int var1, int[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      System.arraycopy(var0, var1 / 4, var2, var3 / 4, var4 / 4);
   }

   public static void n5(double[] var0, int var1, double[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      System.arraycopy(var0, var1 / 8, var2, var3 / 8, var4 / 8);
   }

   private static void l6(Object var0, int var1, Object var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("src");
      }

      if (var2 == null) {
         throw new ArgumentNullException("dst");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("srcOffset", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("dstOffset", "Non-negative number required.");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      if (var4 != 0) {
         ;
      }
   }

   private static void n5(Object var0, int var1, Object var2, int var3, int var4, int var5) {
      com.aspose.slides.internal.w4w.a6.n5(var0, var1, var4, var5);
      com.aspose.slides.internal.w4w.a6.n5(var2, var3, var4, var5);
      System.arraycopy(var0, var1 / var5, var2, var3 / var5, var4 / var5);
   }

   public static int n5(u3 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else {
         int var1 = l6(var0);
         if (var1 < 0) {
            throw new ArgumentException("Object must be an array of primitives.");
         } else {
            return var1;
         }
      }
   }

   private static int l6(u3 var0) {
      Object var1 = u3.n5(var0);
      Class var2 = var1.getClass();

      while (var2.isArray()) {
         var2 = var2.getComponentType();
      }

      a6$n5 var3 = com.aspose.slides.internal.w4w.a6.n5(var2);
      return var3 == a6$n5.n5 ? -1 : var0.a6() * com.aspose.slides.internal.w4w.a6.n5(var3);
   }

   public static void n5(byte[] var0, int var1, short[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var0, var1, var0.length).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(var2, var3, var4 / 2);
   }

   public static void n5(byte[] var0, int var1, int[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var0, var1, var0.length).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(var2, var3, var4 / 4);
   }

   public static void n5(byte[] var0, int var1, float[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var0, var1, var0.length).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(var2, var3, var4 / 4);
   }

   public static void n5(byte[] var0, int var1, double[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var0, var1, var0.length).order(ByteOrder.LITTLE_ENDIAN).asDoubleBuffer().get(var2, var3, var4 / 8);
   }

   public static void n5(short[] var0, int var1, byte[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var2, var3, var4).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(var0, var1, var0.length);
   }

   public static void n5(int[] var0, int var1, byte[] var2, int var3, int var4) {
      ByteBuffer.wrap(var2, var3, var4).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(var0, var1, var0.length);
   }

   public static void n5(float[] var0, int var1, byte[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var2, var3, var4).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().put(var0, var1, var0.length);
   }

   public static void n5(double[] var0, int var1, byte[] var2, int var3, int var4) {
      l6(var0, var1, var2, var3, var4);
      ByteBuffer.wrap(var2, var3, var4).order(ByteOrder.LITTLE_ENDIAN).asDoubleBuffer().put(var0, var1, var0.length);
   }
}
