package com.aspose.slides.internal.e5a;

public class h0 {
   private long n5;
   private static final long[] l6 = new long[256];
   private long k5 = 4294967295L;

   public final long n5() {
      return this.n5;
   }

   public final int l6() {
      return (int)(~(this.k5 & 4294967295L) & 4294967295L);
   }

   public final int n5(com.aspose.slides.internal.z0k.t4 var1) {
      return this.n5(var1, null);
   }

   public final int n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      if (var1 == null) {
         throw new f2("The input stream must not be null.");
      }

      byte[] var3 = new byte[8192];
      short var4 = 8192;
      this.n5 = 0L;
      int var5 = var1.read(var3, 0, var4);
      if (var2 != null) {
         var2.write(var3, 0, var5);
      }

      for (this.n5 += var5; var5 > 0; this.n5 += var5) {
         this.n5(var3, 0, var5);
         var5 = var1.read(var3, 0, var4);
         if (var2 != null) {
            var2.write(var3, 0, var5);
         }
      }

      return (int)(~(this.k5 & 4294967295L) & 4294967295L);
   }

   public final int n5(int var1, byte var2) {
      return n5(var1 & 4294967295L, var2);
   }

   public static int n5(long var0, byte var2) {
      return (int)(l6[(int)((var0 & 4294967295L ^ var2 & 0xFF) & 4294967295L & 255L & 4294967295L)] ^ (var0 & 4294967295L) >> 8);
   }

   public final void n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new f2("The data buffer must not be null.");
      }

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var2 + var4;
         this.k5 = ((this.k5 & 4294967295L) >> 8 ^ l6[(int)((var1[var5] & 0xFF ^ this.k5 & 4294967295L & 255L & 4294967295L) & 4294967295L)]) & 4294967295L;
      }

      this.n5 += var3;
   }

   static {
      long var0 = 3988292384L;

      for (long var2 = 0L; (var2 & 4294967295L) < 256L; var2++) {
         long var4 = var2;

         for (long var6 = 8L; (var6 & 4294967295L) > 0L; var6--) {
            if ((var4 & 4294967295L & 1L & 4294967295L) == 1L) {
               var4 = ((var4 & 4294967295L) >> 1 ^ var0) & 4294967295L;
            } else {
               var4 = (var4 & 4294967295L) >> 1 & 4294967295L;
            }
         }

         l6[(int)var2] = var4;
      }
   }
}
