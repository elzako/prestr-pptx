package com.aspose.slides.internal.x6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.n2d.x8;
import com.aspose.slides.ms.System.d1;

public class k5 {
   public static final int n5 = n5(new char[]{'t', 't', 'c', 'f'});
   public static final int l6 = n5(new char[]{'c', 'm', 'a', 'p'});
   public static final int k5 = n5(new char[]{'h', 'e', 'a', 'd'});
   public static final int u3 = n5(new char[]{'h', 'h', 'e', 'a'});
   public static final int a6 = n5(new char[]{'h', 'm', 't', 'x'});
   public static final int u9 = n5(new char[]{'m', 'a', 'x', 'p'});
   public static final int h0 = n5(new char[]{'n', 'a', 'm', 'e'});
   public static final int c8 = n5(new char[]{'O', 'S', '/', '2'});
   public static final int t2 = n5(new char[]{'p', 'o', 's', 't'});
   public static final int s7 = n5(new char[]{'c', 'v', 't', ' '});
   public static final int x8 = n5(new char[]{'f', 'p', 'g', 'm'});
   public static final int n3 = n5(new char[]{'g', 'l', 'y', 'f'});
   public static final int y4 = n5(new char[]{'l', 'o', 'c', 'a'});
   public static final int e2 = n5(new char[]{'p', 'r', 'e', 'p'});
   public static final int t9 = n5(new char[]{'C', 'F', 'F', ' '});
   public static final int z1 = n5(new char[]{'V', 'O', 'R', 'G'});
   public static final int t4 = n5(new char[]{'E', 'B', 'D', 'T'});
   public static final int q0 = n5(new char[]{'E', 'B', 'L', 'C'});
   public static final int z3 = n5(new char[]{'E', 'B', 'S', 'C'});
   public static final int m1 = n5(new char[]{'B', 'A', 'S', 'E'});
   public static final int k7 = n5(new char[]{'G', 'D', 'E', 'F'});
   public static final int m3 = n5(new char[]{'G', 'P', 'O', 'S'});
   public static final int z8 = n5(new char[]{'G', 'S', 'U', 'B'});
   public static final int j5 = n5(new char[]{'J', 'S', 'T', 'F'});
   public static final int w1 = n5(new char[]{'D', 'S', 'I', 'G'});
   public static final int r4 = n5(new char[]{'g', 'a', 's', 'p'});
   public static final int c4 = n5(new char[]{'h', 'd', 'm', 'x'});
   public static final int y2 = n5(new char[]{'k', 'e', 'r', 'n'});
   public static final int y1 = n5(new char[]{'L', 'T', 'S', 'H'});
   public static final int a0 = n5(new char[]{'P', 'C', 'L', 'T'});
   public static final int d2 = n5(new char[]{'V', 'D', 'M', 'X'});
   public static final int d5 = n5(new char[]{'v', 'h', 'e', 'a'});
   public static final int s3 = n5(new char[]{'v', 'm', 't', 'x'});
   public static final int p8 = n5(new char[]{'F', 'F', 'T', 'M'});
   public static final int f2 = n5(new char[]{'b', 's', 'l', 'n'});
   public static final int i1 = n5(new char[]{'f', 'e', 'a', 't'});
   public static final int e5 = n5(new char[]{'l', 'c', 'a', 'r'});
   public static final int b3 = n5(new char[]{'m', 'o', 'r', 'x'});
   public static final int o0 = n5(new char[]{'o', 'p', 'b', 'd'});
   public static final int z7 = n5(new char[]{'p', 'r', 'o', 'p'});
   public static final int v4 = n5(new char[]{'F', 'e', 'a', 't'});
   public static final int u6 = n5(new char[]{'G', 'l', 'a', 't'});
   public static final int t1 = n5(new char[]{'G', 'l', 'o', 'c'});
   public static final int a5 = n5(new char[]{'S', 'i', 'l', 'e'});
   public static final int h2 = n5(new char[]{'S', 'i', 'l', 'f'});
   public static final int v0 = n5(new char[]{'b', 'h', 'e', 'd'});
   public static final int f0 = n5(new char[]{'b', 'd', 'a', 't'});
   public static final int a3 = n5(new char[]{'b', 'l', 'o', 'c'});

   public static int n5(char[] var0) {
      return ((byte)var0[0] & 0xFF) << 24 | ((byte)var0[1] & 0xFF) << 16 | ((byte)var0[2] & 0xFF) << 8 | (byte)var0[3] & 0xFF;
   }

   public static int n5(byte[] var0) {
      return (var0[0] & 0xFF) << 24 | (var0[1] & 0xFF) << 16 | (var0[2] & 0xFF) << 8 | var0[3] & 0xFF;
   }

   public static byte[] n5(int var0) {
      return new byte[]{(byte)(0xFF & var0 >> 24), (byte)(0xFF & var0 >> 16), (byte)(0xFF & var0 >> 8), (byte)(0xFF & var0)};
   }

   public static String l6(int var0) {
      try {
         return com.aspose.slides.internal.n2d.x8.n5("us-ascii").l6(n5(var0));
      } catch (ArgumentException var3) {
         return d1.n5;
      }
   }

   public static boolean k5(int var0) {
      return var0 == k5 || var0 == v0;
   }
}
