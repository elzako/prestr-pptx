package com.aspose.slides.internal.n2d;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.System.q1;

public class t4 {
   private static final char[] l6 = new char[]{';'};
   private static final char[] k5 = new char[]{','};
   private static final char[] u3 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public static final byte[] n5 = new byte[0];

   public static void n5(int var0, byte[] var1, int var2) {
      for (int var3 = 0; var3 < 4; var3++) {
         var1[var2 + var3] = (byte)var0;
         var0 >>= 8;
      }
   }

   public static boolean n5(long var0) {
      return (var0 & 1L) != 0L;
   }

   public static int n5(long var0, int var2) {
      long var3 = var0 / var2;
      if (var0 % var2 != 0L) {
         var3++;
      }

      return (int)var3;
   }

   public static int l6(long var0, int var2) {
      return n5(var0, var2) * var2;
   }

   public static void n5(com.aspose.slides.internal.z0k.t4 var0, int var1) {
      int var2 = l6(var0.getPosition(), var1);
      if (var0.getLength() < var2) {
         var0.setLength(var2);
      }

      var0.setPosition(var2);
   }

   public static byte[] n5(com.aspose.slides.internal.z0k.t4 var0, long var1) {
      long var3 = var0.getPosition();
      byte[] var5 = new byte[(int)var1];
      var0.read(var5, 0, var5.length);
      var0.setPosition(var3);
      return var5;
   }

   public static void n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.t4 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("srcStream");
      }

      if (var1 == null) {
         throw new ArgumentNullException("dstStream");
      }

      byte[] var2 = new byte[4096];

      while (true) {
         int var3 = var0.read(var2, 0, var2.length);
         if (var3 <= 0) {
            return;
         }

         var1.write(var2, 0, var3);
      }
   }

   public static com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.t4 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.z0k.e2.class);
      if (var1 != null) {
         return var1;
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2((int)var0.getLength());
      n5(var0, var2);
      return var2;
   }

   public static byte[] l6(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("srcStream");
      }

      byte[] var1 = new byte[(int)var0.getLength()];
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1);

      try {
         var0.setPosition(0L);
         n5(var0, var2);
         return var1;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static byte[] n5(String var0) {
      com.aspose.slides.internal.z0k.n3 var1 = com.aspose.slides.internal.z0k.u9.u3(var0);

      try {
         return l6(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static byte[] k5(com.aspose.slides.internal.z0k.t4 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.z0k.e2.class)) {
         return ((com.aspose.slides.internal.z0k.e2)var0).toArray();
      }

      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         n5(var0, var1);
         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static boolean l6(String var0) {
      return var0 != null && var0.length() > 0;
   }

   public static boolean k5(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (var0.charAt(var1) > 127) {
            return false;
         }
      }

      return true;
   }

   public static void n5(String var0, String var1) {
      if (!l6(var0)) {
         throw new ArgumentException("The argument cannot be null or empty string.", var1);
      }
   }

   public static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.u3(var0), 14);
   }

   public static boolean n5(String var0, String var1, boolean var2) {
      if (var2) {
         var0 = d1.t2(var0);
         var1 = d1.t2(var1);
      }

      return d1.c8(var0, var1) >= 0;
   }

   public static boolean n5(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'F' || var0 >= 'a' && var0 <= 'f';
   }

   public static String n5(byte[] var0, int var1, int var2, boolean var3) {
      a5 var4 = new a5(var2 * 2);
      int var5 = var3 ? -1 : 1;
      if (var3) {
         var1 += var2 - 1;
      }

      for (int var6 = 0; var6 < var2; var6++) {
         var4.n5(n5(var0[var1]));
         var1 += var5;
      }

      return var4.toString();
   }

   public static char[] n5(byte var0) {
      return new char[]{u3[(var0 & 255) >> 4 & 15], u3[var0 & 0xFF & 15]};
   }

   public static String n5(byte[] var0) {
      return n5(var0, 0, var0.length, false);
   }

   public static boolean l6(String var0, String var1) {
      return var0.equalsIgnoreCase(var1);
   }

   public static boolean n5(f2 var0, f2 var1, double var2) {
      return q1.n5(var0.l6() - var1.l6()) <= var2 && q1.n5(var0.k5() - var1.k5()) <= var2
         ? true
         : q1.n5(var0.l6() - var1.k5()) <= var2 && q1.n5(var0.k5() - var1.l6()) <= var2;
   }

   public static boolean[] l6(byte var0) {
      boolean[] var1 = new boolean[8];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (var0 & 255 & 1 << var2) != 0;
      }

      return var1;
   }

   public static byte[] n5(List<Byte> var0) {
      byte[] var1 = new byte[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Byte)var0.get_Item(var2);
      }

      return var1;
   }

   public static Byte[] l6(byte[] var0) {
      Byte[] var1 = new Byte[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0[var2];
      }

      return var1;
   }

   public static long[] l6(List<Long> var0) {
      long[] var1 = new long[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Long)var0.get_Item(var2);
      }

      return var1;
   }

   public static float[] k5(List<Float> var0) {
      float[] var1 = new float[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Float)var0.get_Item(var2);
      }

      return var1;
   }

   public static char[] u3(List<Character> var0) {
      char[] var1 = new char[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Character)var0.get_Item(var2);
      }

      return var1;
   }

   public static byte[] n5(o0 var0) {
      byte[] var1 = var0.n5();
      com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, 4);
      com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 4, 2);
      com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 6, 2);
      return var1;
   }

   public static boolean n5(com.aspose.slides.internal.z0k.n5 var0, int var1) {
      return var1 <= var0.x8().getLength() - var0.x8().getPosition();
   }
}
