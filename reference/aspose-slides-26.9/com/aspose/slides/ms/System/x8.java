package com.aspose.slides.ms.System;

import com.aspose.slides.internal.w4w.l6$k5;
import com.aspose.slides.internal.w4w.l6$l6;
import com.aspose.slides.internal.w4w.l6$n5;

public class x8 {
   public static int n5(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, var1 << 3, true) & 65535;
   }

   public static long l6(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.l6(var0, var1 << 3, true) & 4294967295L;
   }

   public static long k5(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.u3(var0, var1 << 3, true);
   }

   public static int u3(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, var1 << 3, true);
   }

   public static int a6(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.l6(var0, var1 << 3, true);
   }

   public static long u9(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.u3(var0, var1 << 3, true);
   }

   public static char h0(byte[] var0, int var1) {
      return (char)com.aspose.slides.internal.w4w.l6.n5(var0, var1 << 3, true);
   }

   public static float c8(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.k5(var0, var1 << 3, true);
   }

   public static double t2(byte[] var0, int var1) {
      return com.aspose.slides.internal.w4w.l6.a6(var0, var1 << 3, true);
   }

   public static byte[] n5(Boolean var0) {
      return new byte[]{(byte)(var0 ? 1 : 0)};
   }

   public static byte[] n5(char var0) {
      return n5((short)var0);
   }

   public static byte[] n5(double var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static byte[] n5(float var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static byte[] n5(short var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static byte[] n5(int var0) {
      return com.aspose.slides.internal.w4w.l6.n5((short)(var0 & 65535), true);
   }

   public static byte[] l6(int var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static byte[] n5(long var0) {
      return com.aspose.slides.internal.w4w.l6.n5((int)(var0 & 4294967295L), true);
   }

   public static byte[] l6(long var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static byte[] k5(long var0) {
      return com.aspose.slides.internal.w4w.l6.n5(var0, true);
   }

   public static String n5(byte[] var0) {
      return s7(var0, 0);
   }

   public static String s7(byte[] var0, int var1) {
      int var2 = var0.length - var1;
      return n5(var0, var1, var2);
   }

   public static String n5(byte[] var0, int var1, int var2) {
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, var1, var3, 0, var2);
      return com.aspose.slides.internal.w4w.l6.n5(var3, l6$l6.n5, l6$k5.a6, false, l6$n5.n5);
   }

   public static long l6(double var0) {
      return u9(n5(var0), 0);
   }
}
