package com.aspose.slides.internal.l9;

import com.aspose.slides.internal.e5a.i1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class t2 {
   private static final byte[] n5 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   private static final byte[] l6 = n5("IHDR");
   private static final byte[] k5 = n5("iCCP");
   private static final byte[] u3 = n5("PLTE");
   private static final byte[] a6 = n5("IDAT");
   private static final byte[] u9 = n5("IEND");
   private static final long[] h0 = l6();
   private final t4 c8;

   public t2(t4 var1) {
      this.c8 = var1;
      var1.write(n5, 0, n5.length);
   }

   public final void n5(int var1, int var2, int var3, int var4) {
      e2 var5 = new e2();

      try {
         n5(var1, var5);
         n5(var2, var5);
         var5.writeByte((byte)var3);
         var5.writeByte((byte)var4);
         var5.writeByte((byte)0);
         var5.writeByte((byte)0);
         var5.writeByte((byte)0);
         this.n5(l6, var5.toArray());
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private static byte[] n5(String var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = (byte)var0.charAt(var3);
      }

      return var2;
   }

   public final void n5(byte[] var1) {
      e2 var2 = new e2();

      try {
         var2.writeByte((byte)73);
         var2.writeByte((byte)67);
         var2.writeByte((byte)67);
         var2.writeByte((byte)0);
         var2.writeByte((byte)0);
         i1 var3 = new i1(var2, 0);

         try {
            var3.write(var1, 0, var1.length);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         this.n5(k5, var2.toArray());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final void l6(byte[] var1) {
      this.n5(u3, var1);
   }

   public final void n5(byte[] var1, int var2) {
      e2 var3 = new e2();

      try {
         i1 var4 = new i1(var3, 0);

         try {
            int var5 = 0;

            while (var5 < var1.length - var2) {
               var4.writeByte((byte)0);
               var4.write(var1, var5, var2);
               var5 += var2;
            }

            int var6 = var1.length - var5;
            if (var6 > 0) {
               var4.writeByte((byte)0);
               var4.write(var1, var5, var6);
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         this.n5(a6, var3.toArray());
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final void n5() {
      this.n5(u9, new byte[0]);
   }

   public final void n5(int var1) {
      n5(var1, this.c8);
   }

   public static void n5(int var0, t4 var1) {
      var1.writeByte((byte)(var0 >> 24));
      var1.writeByte((byte)(var0 >> 16));
      var1.writeByte((byte)(var0 >> 8));
      var1.writeByte((byte)var0);
   }

   public final void n5(byte[] var1, byte[] var2) {
      this.n5(var2.length);
      this.c8.write(var1, 0, 4);
      this.c8.write(var2, 0, var2.length);
      long var3 = n5(4294967295L, var1, 0, var1.length);
      var3 = (n5(var3, var2, 0, var2.length) ^ 4294967295L) & 4294967295L;
      this.n5((int)var3);
   }

   private static long n5(long var0, byte[] var2, int var3, int var4) {
      long var5 = var0;

      for (int var7 = 0; var7 < var4; var7++) {
         var5 = (h0[(int)((var5 & 4294967295L ^ var2[var7 + var3] & 0xFF) & 4294967295L & 255L & 4294967295L)] ^ (var5 & 4294967295L) >> 8) & 4294967295L;
      }

      return var5;
   }

   private static long[] l6() {
      long[] var0 = new long[256];

      for (long var1 = 0L; (var1 & 4294967295L) < 256L; var1++) {
         long var3 = var1;

         for (int var5 = 0; var5 < 8; var5++) {
            if ((var3 & 4294967295L & 1L & 4294967295L) != 0L) {
               var3 = (3988292384L ^ (var3 & 4294967295L) >> 1) & 4294967295L;
            } else {
               var3 = (var3 & 4294967295L) >> 1 & 4294967295L;
            }
         }

         var0[(int)var1] = var3;
      }

      return var0;
   }
}
