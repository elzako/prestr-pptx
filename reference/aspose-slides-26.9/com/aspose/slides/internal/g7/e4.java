package com.aspose.slides.internal.g7;

public class e4 {
   public long n5;
   public long l6;
   public int k5;
   public long u3;
   public long[] a6;
   public long[][] u9;

   public e4(long var1, int var3, long var4, long[] var6, long[][] var7) {
      this.n5 = var1;
      this.l6 = ((var1 & 4294967295L) + (var6.length & 4294967295L) & 4294967295L) - 1L & 4294967295L;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var6;
      this.u9 = var7;
   }

   public final long n5(char var1) {
      if (var1 == 8205L) {
         return 2147483661L;
      } else if (var1 == 8204L) {
         return 13L;
      } else {
         return var1 >= (this.n5 & 4294967295L) && var1 <= (this.l6 & 4294967295L) ? this.a6[(int)(var1 - (this.n5 & 4294967295L))] & 4294967295L : 0L;
      }
   }

   public final long[] n5(long var1) {
      int var3 = ((int)var1 & 983040) >> 16;
      return this.u9[var3 - 1];
   }

   public static boolean l6(long var0) {
      return (var0 & 65535L & 4294967295L) == 1L;
   }

   public static boolean k5(long var0) {
      return (var0 & 65535L & 4294967295L) == 2L;
   }

   public static boolean u3(long var0) {
      return (var0 & 2147483648L & 4294967295L) != 0L;
   }

   public static boolean a6(long var0) {
      return (var0 & 1073741824L & 4294967295L) != 0L;
   }

   public static boolean u9(long var0) {
      return (var0 & 65535L & 4294967295L) == 7L;
   }

   public static boolean h0(long var0) {
      return (var0 & 65535L & 4294967295L) == 12L;
   }

   public static boolean c8(long var0) {
      return (var0 & 536870912L & 4294967295L) != 0L;
   }

   public static boolean t2(long var0) {
      var0 = var0 & 65535L & 4294967295L;
      return (var0 & 4294967295L) >= 8L && (var0 & 4294967295L) <= 11L;
   }

   public static boolean s7(long var0) {
      return (var0 & 983040L & 4294967295L) != 0L;
   }

   public static boolean x8(long var0) {
      return (var0 & 67108864L & 4294967295L) != 0L;
   }

   public static boolean n3(long var0) {
      return (var0 & 402653184L & 4294967295L) != 0L;
   }

   public static boolean y4(long var0) {
      return (var0 & 134217728L & 4294967295L) != 0L;
   }

   public static boolean e2(long var0) {
      return (var0 & 268435456L & 4294967295L) != 0L;
   }

   public final boolean l6(char var1) {
      return l6(this.n5(var1));
   }

   public final boolean k5(char var1) {
      return k5(this.n5(var1));
   }

   public final boolean u3(char var1) {
      return u3(this.n5(var1));
   }

   public final boolean a6(char var1) {
      return a6(this.n5(var1));
   }

   public final boolean u9(char var1) {
      return h0(this.n5(var1));
   }

   public final boolean h0(char var1) {
      return u9(this.n5(var1));
   }
}
