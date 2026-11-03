package com.aspose.slides.internal.v2o;

import com.aspose.slides.internal.z0k.t4;

public class n5 {
   private long n5;
   private long l6;
   private boolean k5;
   private long[] u3;
   private long a6 = 4294967295L;

   public long n5() {
      return this.l6;
   }

   public int l6() {
      return (int)(~(this.a6 & 4294967295L));
   }

   public int n5(t4 var1) {
      return this.n5(var1, null);
   }

   public int n5(t4 var1, t4 var2) {
      if (var1 == null) {
         throw new RuntimeException("The input stream must not be null.");
      }

      byte[] var3 = new byte[8192];
      short var4 = 8192;
      this.l6 = 0L;
      int var5 = var1.read(var3, 0, var4);
      if (var2 != null) {
         var2.write(var3, 0, var5);
      }

      for (this.l6 += var5; var5 > 0; this.l6 += var5) {
         this.n5(var3, 0, var5);
         var5 = var1.read(var3, 0, var4);
         if (var2 != null) {
            var2.write(var3, 0, var5);
         }
      }

      return (int)(~(this.a6 & 4294967295L));
   }

   public void n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new RuntimeException("The data buffer must not be null.");
      }

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var2 + var4;
         byte var6 = var1[var5];
         if (this.k5) {
            long var7 = (this.a6 & 4294967295L) >> 24 ^ var6 & 0xFF;
            this.a6 = this.a6 << 8 & 4294967295L ^ this.u3[(int)var7] & 4294967295L;
         } else {
            long var9 = this.a6 & 4294967295L & 255L ^ var6 & 0xFF;
            this.a6 = (this.a6 & 4294967295L) >> 8 ^ this.u3[(int)var9] & 4294967295L;
         }
      }

      this.l6 += var3;
   }

   private static long n5(long var0) {
      long var2 = var0;
      var2 = (var2 & 4294967295L & 1431655765L) << 1 & 4294967295L | (var2 & 4294967295L) >> 1 & 1431655765L;
      var2 = (var2 & 4294967295L & 858993459L) << 2 & 4294967295L | (var2 & 4294967295L) >> 2 & 858993459L;
      var2 = (var2 & 4294967295L & 252645135L) << 4 & 4294967295L | (var2 & 4294967295L) >> 4 & 252645135L;
      return var2 << 24 & 4294967295L | (var2 & 4294967295L & 65280L) << 8 & 4294967295L | (var2 & 4294967295L) >> 8 & 65280L | (var2 & 4294967295L) >> 24;
   }

   private static byte n5(byte var0) {
      long var1 = (var0 & 0xFF & 4294967295L) * 131586L;
      long var3 = 17055760L;
      long var5 = var1 & 4294967295L & var3 & 4294967295L;
      long var7 = var1 << 2 & 4294967295L & var3 << 1 & 4294967295L;
      return (byte)(16781313L * ((var5 & 4294967295L) + (var7 & 4294967295L)) >> 24);
   }

   private void k5() {
      this.u3 = new long[256];
      byte var1 = 0;

      do {
         long var2 = var1 & 0xFF;

         for (byte var4 = 8; (var4 & 255) > 0; var4--) {
            if ((var2 & 4294967295L & 1L) == 1L) {
               var2 = (var2 & 4294967295L) >> 1 ^ this.n5 & 4294967295L;
            } else {
               var2 = (var2 & 4294967295L) >> 1;
            }
         }

         if (this.k5) {
            this.u3[n5(var1) & 0xFF] = n5(var2);
         } else {
            this.u3[var1 & 0xFF] = var2;
         }
      } while (++var1 != 0);
   }

   public n5() {
      this(false);
   }

   public n5(boolean var1) {
      this(-306674912, var1);
   }

   public n5(int var1, boolean var2) {
      this.k5 = var2;
      this.n5 = var1;
      this.k5();
   }
}
