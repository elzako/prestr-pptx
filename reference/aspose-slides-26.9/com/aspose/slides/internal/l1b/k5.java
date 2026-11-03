package com.aspose.slides.internal.l1b;

import com.aspose.slides.internal.u7f.a6;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class k5 {
   public static int n5(byte[] var0, int var1) {
      short var2 = var0[var1];
      if (var2 < 0) {
         var2 += 256;
      }

      return var2;
   }

   public static short l6(byte[] var0, int var1) {
      int var2 = n5(var0, var1++);
      int var3 = n5(var0, var1);
      return (short)(var2 | var3 << 8);
   }

   public static int k5(byte[] var0, int var1) {
      int var2 = n5(var0, var1++);
      int var3 = n5(var0, var1);
      return var2 | var3 << 8;
   }

   public static int u3(byte[] var0, int var1) {
      int var2 = n5(var0, var1++);
      int var3 = n5(var0, var1++);
      int var4 = n5(var0, var1++);
      int var5 = n5(var0, var1);
      return var2 | var3 << 8 | var4 << 16 | var5 << 24;
   }

   public static long a6(byte[] var0, int var1) {
      long var2 = n5(var0, var1++);
      long var4 = n5(var0, var1++);
      long var6 = n5(var0, var1++);
      long var8 = n5(var0, var1);
      return var2 | var4 << 8 | var6 << 16 | var8 << 24;
   }

   public static Rectangle u9(byte[] var0, int var1) {
      int var2 = u3(var0, var1);
      int var3 = u3(var0, var1 + 4);
      int var4 = u3(var0, var1 + 8);
      int var5 = u3(var0, var1 + 12);
      return new Rectangle(var2, var3, var4 - var2, var5 - var3);
   }

   public static Rectangle h0(byte[] var0, int var1) {
      short var2 = l6(var0, var1);
      short var3 = l6(var0, var1 + 2);
      short var4 = l6(var0, var1 + 4);
      short var5 = l6(var0, var1 + 6);
      return new Rectangle(var2, var3, var4 - var2, var5 - var3);
   }

   public static Point c8(byte[] var0, int var1) {
      return new Point(u3(var0, var1), u3(var0, var1 + 4));
   }

   public static Point t2(byte[] var0, int var1) {
      return new Point(l6(var0, var1), l6(var0, var1 + 2));
   }

   public static Dimension s7(byte[] var0, int var1) {
      return new Dimension(u3(var0, var1), u3(var0, var1 + 4));
   }

   public static AffineTransform x8(byte[] var0, int var1) {
      ByteBuffer var2 = ByteBuffer.wrap(var0, var1, 24).order(ByteOrder.LITTLE_ENDIAN);
      float var3 = var2.getFloat();
      float var4 = var2.getFloat();
      float var5 = var2.getFloat();
      float var6 = var2.getFloat();
      float var7 = var2.getFloat();
      float var8 = var2.getFloat();
      return new AffineTransform(var3, var4, var5, var6, var7, var8);
   }

   public static Color n3(byte[] var0, int var1) {
      return new Color(n5(var0, var1), n5(var0, var1 + 1), n5(var0, var1 + 2), 255);
   }

   public static char y4(byte[] var0, int var1) {
      return (char)l6(var0, var1);
   }

   public static a6 e2(byte[] var0, int var1) {
      int var2 = u3(var0, var1);
      var1 += 4;
      int var3 = u3(var0, var1);
      var1 += 4;
      short var4 = l6(var0, var1);
      var1 += 2;
      short var5 = l6(var0, var1);
      var1 += 2;
      short var6 = l6(var0, var1);
      var1 += 2;
      short var7 = l6(var0, var1);
      return new a6(var2, var3, var4, var5, var6, var7);
   }

   public static com.aspose.slides.internal.u7f.l6 t9(byte[] var0, int var1) {
      int var2 = u3(var0, var1);
      int var3 = u3(var0, var1 + 4);
      return new com.aspose.slides.internal.u7f.l6(var2, var3);
   }

   public static com.aspose.slides.internal.u7f.k5 z1(byte[] var0, int var1) {
      int var2 = u3(var0, var1);
      var1 += 4;
      int var3 = u3(var0, var1);
      var1 += 4;
      int var4 = u3(var0, var1);
      return new com.aspose.slides.internal.u7f.k5(var2, var3, var4);
   }

   public static void n5(byte[] var0, int var1, short var2) {
      var0[var1] = (byte)(var2 & 0xFF);
      var0[var1 + 1] = (byte)(var2 >> 8);
   }

   public static void n5(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 & 0xFF);
      var0[var1 + 1] = (byte)(var2 >> 8);
      var0[var1 + 2] = (byte)(var2 >> 16);
      var0[var1 + 3] = (byte)(var2 >> 24);
   }
}
