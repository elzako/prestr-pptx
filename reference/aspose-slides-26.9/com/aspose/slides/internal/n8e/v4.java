package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ApplicationException;

public class v4 {
   private static final boolean n5 = n5();
   private static final boolean[] l6 = n5(128, 32, 35, 37, 38, 91, 93, 94, 96, 123, 125, 127);
   private static final char[] k5 = new char[]{'/', '\\'};

   public static boolean n5(float var0, float var1) {
      boolean var2 = com.aspose.slides.ms.System.n1.k5(var0);
      boolean var3 = com.aspose.slides.ms.System.n1.k5(var1);
      if (var2 == var3) {
         if (var2) {
            return true;
         } else {
            boolean var4 = com.aspose.slides.ms.System.n1.l6(var0);
            if (var4 == com.aspose.slides.ms.System.n1.l6(var1)) {
               return var4 ? var0 < 0.0F == var1 < 0.0F : var0 == var1;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean n5(double var0, double var2) {
      boolean var4 = com.aspose.slides.ms.System.d2.k5(var0);
      boolean var5 = com.aspose.slides.ms.System.d2.k5(var2);
      if (var4 == var5) {
         if (var4) {
            return true;
         } else {
            boolean var6 = com.aspose.slides.ms.System.d2.l6(var0);
            if (var6 == com.aspose.slides.ms.System.d2.l6(var2)) {
               return var6 ? var0 < 0.0 == var2 < 0.0 : var0 == var2;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean n5(Object var0, Object var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 == null ? false : var0.equals(var1);
      }
   }

   public static boolean n5(float[] var0, float[] var1) {
      if (var0 == null && var1 == null) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         boolean var2 = true;

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (!n5(var0[var3], var1[var3])) {
               var2 = false;
               break;
            }
         }

         return var2;
      } else {
         return false;
      }
   }

   public static <T> boolean n5(T[] var0, T[] var1) {
      if (var0 == null && var1 == null) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (!n5(var0[var2], var1[var2])) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static int n5(int var0, int var1, int var2) {
      if (var0 < var1) {
         var0 = var1;
      } else if (var0 > var2) {
         var0 = var2;
      }

      return var0;
   }

   public static float n5(float var0, float var1, float var2) {
      if (var0 < var1) {
         var0 = var1;
      } else if (var0 > var2) {
         var0 = var2;
      }

      return var0;
   }

   public static double n5(double var0, double var2, double var4) {
      if (var0 < var2) {
         var0 = var2;
      } else if (var0 > var4) {
         var0 = var4;
      }

      return var0;
   }

   public static com.aspose.slides.internal.o9b.c8 n5(long var0) {
      return com.aspose.slides.internal.o9b.c8.n5(
         (int)(var0 & 4294967295L & 255L), (int)((var0 & 4294967295L) >> 8 & 4294967295L & 255L), (int)((var0 & 4294967295L) >> 16 & 4294967295L & 255L)
      );
   }

   public static int n5(int var0) {
      return var0 >= 0 ? var0 : 65536 + var0;
   }

   public static int n5(short var0) {
      return var0 >= 0 ? var0 : 65536 + var0;
   }

   public static com.aspose.slides.internal.o9b.c8 n5(int var0, long var1) {
      return com.aspose.slides.internal.o9b.c8.n5(
         var0, (int)(var1 & 4294967295L & 255L), (int)((var1 & 4294967295L) >> 8 & 4294967295L & 255L), (int)((var1 & 4294967295L) >> 16 & 4294967295L & 255L)
      );
   }

   public static long n5(com.aspose.slides.internal.o9b.c8 var0) {
      return (((var0.y4() & 255) << 16 | (var0.n3() & 255) << 8) & 4294967295L | var0.x8() & 0xFF) & 4294967295L;
   }

   public static long n5(com.aspose.slides.ms.System.j5 var0) {
      long var1 = var0.t4();
      return (var1 & 4294967295L) << 32 | var1 >> 32 & 4294967295L;
   }

   public static com.aspose.slides.ms.System.j5 l6(long var0) {
      long var2 = (var0 & 4294967295L) << 32 | var0 >> 32 & 4294967295L;
      return com.aspose.slides.ms.System.j5.l6(var2);
   }

   public static <T> int n5(T[] var0, com.aspose.slides.ms.System.g7<T> var1) {
      if (var0 != null && (var0 == null || var0.length != 0)) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var1.invoke(var0[var2])) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static void n5(byte[] var0, byte var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         var0[var2] = var1;
      }
   }

   public static void n5(long[] var0, long var1) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         var0[var3] = var1;
      }
   }

   public static String n5(String var0) {
      try {
         com.aspose.slides.ms.System.r8 var1 = new com.aspose.slides.ms.System.r8(var0);
         if (!var1.c8()) {
            return var1.l6();
         }

         com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5("file:///");
         String var3 = var1.x8();

         for (int var4 = 0; var4 < var3.length(); var4++) {
            char var5 = var3.charAt(var4);
            if ((var5 & 4294967295L) < 128L && l6[(int)var5]) {
               var2.n5(com.aspose.slides.ms.System.d1.n5("%{0:x2}", new Object[]{(long)var5}));
            } else {
               var2.n5(var5);
            }
         }

         String var7 = var2.toString();
         return com.aspose.slides.internal.n2d.m1.l6 && var7.contains("////") ? var7.replace("////", "///") : var7;
      } catch (RuntimeException var6) {
         n5(var6);
         return var0;
      }
   }

   private static boolean[] n5(int var0, int... var1) {
      boolean[] var2 = new boolean[var0];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var1[var3]] = true;
      }

      return var2;
   }

   public static long k5(long var0) {
      long var2 = (var0 & 4294967295L) - ((var0 & 4294967295L) >> 1 & 4294967295L & 1431655765L & 4294967295L) & 4294967295L;
      var2 = (var2 & 4294967295L & 858993459L & 4294967295L) + ((var2 & 4294967295L) >> 2 & 4294967295L & 858993459L & 4294967295L) & 4294967295L;
      return (((var2 & 4294967295L) + ((var2 & 4294967295L) >> 4 & 4294967295L) & 4294967295L & 252645135L & 4294967295L) * 16843009L & 4294967295L) >> 24
         & 4294967295L;
   }

   public static int[] n5(com.aspose.slides.ms.System.u3 var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = ((Long)var0.get_Item(var2)).intValue();
      }

      return var1;
   }

   public static char[] n5(List<Character> var0) {
      char[] var1 = new char[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Character)var0.get_Item(var2);
      }

      return var1;
   }

   public static byte[] l6(List<Byte> var0) {
      byte[] var1 = new byte[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Byte)var0.get_Item(var2);
      }

      return var1;
   }

   public static int[] k5(List<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Integer)var0.get_Item(var2);
      }

      return var1;
   }

   public static double[] u3(List<Double> var0) {
      double[] var1 = new double[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Double)var0.get_Item(var2);
      }

      return var1;
   }

   public static double[] n5(Double[] var0) {
      double[] var1 = new double[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0[var2];
      }

      return var1;
   }

   public static Byte[] n5(byte[] var0) {
      Byte[] var1 = new Byte[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0[var2];
      }

      return var1;
   }

   public static float[] a6(List<Float> var0) {
      float[] var1 = new float[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Float)var0.get_Item(var2);
      }

      return var1;
   }

   public static long[] u9(List<Long> var0) {
      long[] var1 = new long[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Long)var0.get_Item(var2);
      }

      return var1;
   }

   public static com.aspose.slides.internal.o9b.w1[] n5(java.awt.geom.Point2D.Float[] var0) {
      if (var0 == null) {
         return new com.aspose.slides.internal.o9b.w1[0];
      }

      com.aspose.slides.internal.o9b.w1[] var1 = new com.aspose.slides.internal.o9b.w1[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = com.aspose.slides.internal.o9b.w1.n5(var0[var2]);
      }

      return var1;
   }

   public static java.awt.geom.Point2D.Float[] n5(com.aspose.slides.internal.o9b.w1[] var0) {
      if (var0 == null) {
         return new java.awt.geom.Point2D.Float[0];
      }

      java.awt.geom.Point2D.Float[] var1 = new java.awt.geom.Point2D.Float[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = com.aspose.slides.internal.o9b.w1.l6(var0[var2]);
      }

      return var1;
   }

   public static String n5(com.aspose.slides.internal.z0k.n5 var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (byte var2 = var0.z1(); (var2 & 255) != 0; var2 = var0.z1()) {
         var1.n5((char)(var2 & 0xFF));
      }

      return var1.toString();
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0, String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         var0.n5(var3);
      }

      var0.n5((byte)0);
   }

   public static String l6(String var0) {
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (!com.aspose.slides.ms.System.t9.k5(var3)) {
               var1.n5(var3);
            }
         }

         return var1.toString();
      } else {
         return var0;
      }
   }

   public static boolean k5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return false;
      }

      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (com.aspose.slides.ms.System.t9.k5(var2)) {
            return true;
         }
      }

      return false;
   }

   public static void n5(boolean var0, String var1) {
      if (!var0) {
         throw new ApplicationException(com.aspose.slides.ms.System.d1.n5(new String[]{"Debug assertion failed.\n", var1}));
      }
   }

   public static void n5(Throwable var0) {
   }

   private static boolean n5() {
      try {
         String var0 = System.getProperty("java.version");
         String var1 = System.getProperty("java.vm.name");
         return com.aspose.slides.internal.n2d.m1.l6 && var0.startsWith("1.8.") && var1.startsWith("Open");
      } catch (Exception var2) {
         n5(var2);
         return false;
      }
   }

   public static <T> com.aspose.slides.ms.System.o5<T>[] n5(Class<T> var0, int var1) {
      com.aspose.slides.ms.System.o5[] var2 = new com.aspose.slides.ms.System.o5[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new com.aspose.slides.ms.System.o5();
      }

      return var2;
   }

   public static <T> void l6(T[] var0, T[] var1) {
      T var2 = var0[0];
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(com.aspose.slides.internal.o9b.c8[] var0, com.aspose.slides.internal.o9b.c8[] var1) {
      com.aspose.slides.internal.o9b.c8 var2 = var0[0].o8();
      var0[0] = var1[0].o8();
      var1[0] = var2;
   }

   public static String u3(String var0) {
      var0 = com.aspose.slides.internal.z0k.z1.k5(var0);
      return com.aspose.slides.ms.System.d1.a6(var0, k5);
   }

   public static String a6(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0, " ", "_");
   }

   public static boolean n5(String var0, com.aspose.slides.ms.System.o0[] var1) {
      com.aspose.slides.ms.System.o0.n5.k5(var1[0]);
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return false;
      }

      try {
         var1[0] = new com.aspose.slides.ms.System.o0(var0);
         return true;
      } catch (RuntimeException var3) {
         n5(var3);
         return false;
      }
   }
}
