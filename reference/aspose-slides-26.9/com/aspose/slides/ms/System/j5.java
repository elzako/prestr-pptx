package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class j5 extends com.aspose.slides.internal.v6g.h0<j5> implements v0, Comparable<j5> {
   char[] n5 = new char[]{'d', 'D', 'f', 'F', 'g', 'G', 'm', 'M', 'o', 'O', 'r', 'R', 's', 't', 'T', 'u', 'U', 'y', 'Y'};
   private static final int[] u9 = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
   private static final int[] h0 = new int[]{0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
   public static final j5 l6 = new j5(0L, 0L);
   public static final j5 k5 = new j5(3155378975999999999L, 0L);
   public static final long u3 = -62135769599766L - TimeZone.getDefault().getOffset(j5.u3);
   private long c8;
   private Locale t2 = y2.n5();
   private static String[] s7 = new String[]{"yyyy/M/dT", "yyyy/M/d", "M/yyyy/dT", "M/yyyy/d", "yyyy'年'M'月'd'日", "yyyy'-'M'-'dT", "yyyy'-'M'-'d"};
   private static String[] x8 = new String[]{
      "yyyy/M/dT",
      "M/yyyy/dT",
      "yyyy'年'M'月'd'日",
      "yyyy/MMMM/d",
      "yyyy/d/MMM",
      "MMMM/d/yyyy",
      "d/MMM/yyyy",
      "MMMM/yyyy/d",
      "d/yyyy/MMM",
      "yy/MMMM/d",
      "yy/d/MMM",
      "MMM/yy/d"
   };
   private static String[] n3 = new String[]{
      "yyyy/M/dT", "M/yyyy/dT", "yyyy'年'M'月'd'日", "yyyy/d/MMMM", "yyyy/MMM/d", "d/MMMM/yyyy", "dd/MMM/yy", "MMM/d/yyyy", "d/yyyy/MMMM", "MMM/yyyy/d", "yy/d/M"
   };
   private static String[] y4 = new String[]{
      "yyyy/M/dT",
      "M/yyyy/dT",
      "yyyy'年'M'月'd'日",
      "yyyy/MMMM/d",
      "yyyy/d/MMM",
      "d/MMMM/yyyy",
      "MMM/d/yyyy",
      "MMMM/yyyy/d",
      "d/yyyy/MMM",
      "d/MMMM/yy",
      "yy/MMM/d",
      "d/yy/MMM",
      "yy/d/MMM",
      "MMM/d/yy",
      "MMM/yy/d"
   };
   private static String[] e2 = new String[]{
      "yyyy/M/dT",
      "M/yyyy/dT",
      "yyyy'年'M'月'd'日",
      "yyyy/MMMM/d",
      "yyyy/d/MMM",
      "MMMM/d/yyyy",
      "d/MMM/yyyy",
      "MMMM/yyyy/d",
      "d/yyyy/MMM",
      "MMMM/d/yy",
      "MMM/yy/d",
      "d/MMM/yy",
      "dd/MMM/yy",
      "yy/MMM/d",
      "d/yy/MMM",
      "yy/d/MMM"
   };
   private static String[] t9 = new String[]{
      "H:m:s.fff zzz",
      "H:m:s.fffffffzzz",
      "H:m:s.fffffff",
      "H:m:s.ffffff",
      "H:m:s.ffffffzzz",
      "H:m:s.fffff",
      "H:m:s.ffff",
      "H:m:s.fff",
      "H:m:s.ff",
      "H:m:s.f",
      "H:m:s tt zzz",
      "H:m:szzz",
      "H:m:s",
      "H:mzzz",
      "H:m",
      "H tt",
      "H'時'm'分's'秒'"
   };
   private static String[] z1 = new String[]{"MMMM/d", "d/MMM", "yyyy/MMMM", "M/yyyy"};
   private static String[] t4 = new String[]{"d/MMMM", "MMM/yy", "yyyy/MMMM"};
   // $VF: synthetic field
   static final boolean a6 = !j5.class.desiredAssertionStatus();

   public j5() {
      this.c8 = 0L;
   }

   public j5(long var1) {
      if (var1 >= 0L && var1 <= 3155378975999999999L) {
         this.c8 = var1;
      } else {
         throw new ArgumentOutOfRangeException("ticks", "Ticks must be between DateTime.MinValue.Ticks and DateTime.MaxValue.Ticks.");
      }
   }

   private static j5 a6(long var0) {
      j5 var2 = new j5();
      var2.c8 = var0;
      return var2;
   }

   public j5(long var1, long var3) {
      if (var1 < 0L || var1 > 3155378975999999999L) {
         throw new ArgumentOutOfRangeException("ticks", "Ticks must be between DateTime.MinValue.Ticks and DateTime.MaxValue.Ticks.");
      }

      if (var3 >= 0L && var3 <= 2L) {
         this.c8 = var1 | var3 << 62;
      } else {
         throw new ArgumentException("Invalid DateTimeKind value.");
      }
   }

   public j5(int var1, int var2, int var3) {
      this.c8 = n5(var1, var2, var3);
   }

   public j5(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.c8 = n5(var1, var2, var3) + l6(var4, var5, var6);
   }

   public j5(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      long var9 = n5(var1, var2, var3) + l6(var4, var5, var6);
      if (var7 >= 0L && var7 <= 2L) {
         this.c8 = var9 | var7 << 62;
      } else {
         throw new ArgumentException("Invalid DateTimeKind value.");
      }
   }

   public j5(int var1, int var2, int var3, int var4, int var5, int var6, com.aspose.slides.internal.x7n.t4 var7) {
      if (var7 == null) {
         throw new ArgumentNullException("calendar");
      }

      long var8 = var7.n5(var1, var2, var3, var4, var5, var6, 0).n3();
      if (var8 >= 0L && var8 <= 3155378975999999999L) {
         this.c8 = var8;
      } else {
         throw new ArgumentException("Arg_DateTimeRange");
      }
   }

   public j5(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = n5(var1, var2, var3) + l6(var4, var5, var6);
      if (var7 >= 0 && var7 < 1000) {
         var8 += var7 * 10000L;
         if (var8 >= 0L && var8 <= 3155378975999999999L) {
            this.c8 = var8;
         } else {
            throw new ArgumentException("Arg_DateTimeRange");
         }
      } else {
         throw new ArgumentOutOfRangeException("millisecond");
      }
   }

   private long j5() {
      return this.c8 & 4611686018427387903L;
   }

   private long w1() {
      return this.c8 & -4611686018427387904L;
   }

   public j5 n5(s4 var1) {
      return this.n5(var1.a6());
   }

   public static j5 n5(j5 var0, s4 var1) {
      return var0.n5(var1);
   }

   private j5 n5(double var1, int var3) {
      long var4 = (long)(var1 * var3 + (var1 >= 0.0 ? 0.5 : -0.5));
      if (var4 > -315537897600000L && var4 < 315537897600000L) {
         return this.n5(var4 * 10000L);
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }

   public j5 n5(double var1) {
      return this.n5(var1, 86400000);
   }

   public j5 l6(double var1) {
      return this.n5(var1, 3600000);
   }

   public j5 k5(double var1) {
      return this.n5(var1, 1);
   }

   public j5 u3(double var1) {
      return this.n5(var1, 60000);
   }

   public j5 n5(int var1) {
      if (var1 >= -120000 && var1 <= 120000) {
         int var2 = this.u3(0);
         int var3 = this.u3(2);
         int var4 = this.u3(3);
         int var5 = var3 - 1 + var1;
         if (var5 >= 0) {
            var3 = var5 % 12 + 1;
            var2 += var5 / 12;
         } else {
            var3 = 12 + (var5 + 1) % 12;
            var2 += (var5 - 11) / 12;
         }

         if (var2 >= 1 && var2 <= 9999) {
            int var6 = n5(var2, var3);
            if (var4 > var6) {
               var4 = var6;
            }

            return a6(n5(var2, var3, var4) + this.j5() % 864000000000L | this.w1());
         } else {
            throw new IndexOutOfBoundsException("months");
         }
      } else {
         throw new ArgumentOutOfRangeException("months");
      }
   }

   public j5 a6(double var1) {
      return this.n5(var1, 1000);
   }

   public j5 n5(long var1) {
      long var3 = this.j5();
      if (var1 <= 3155378975999999999L - var3 && var1 >= 0L - var3) {
         return a6(var3 + var1 | this.w1());
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }

   public j5 l6(int var1) {
      if (var1 >= -10000 && var1 <= 10000) {
         return this.n5(var1 * 12);
      } else {
         throw new ArgumentOutOfRangeException("years");
      }
   }

   public static boolean n5(j5 var0, j5 var1) {
      return var0 != null && (var1 == null || var0.j5() > var1.j5());
   }

   public static boolean l6(j5 var0, j5 var1) {
      return var0 != null && (var1 == null || var0.j5() >= var1.j5());
   }

   public static boolean k5(j5 var0, j5 var1) {
      return var0 == null || var1 != null && var0.j5() < var1.j5();
   }

   public static boolean u3(j5 var0, j5 var1) {
      return var0 == null || var1 != null && var0.j5() <= var1.j5();
   }

   public static int a6(j5 var0, j5 var1) {
      if (var0 == var1) {
         return 0;
      }

      if (var0 == null) {
         var0 = l6.m3();
      }

      if (var1 == null) {
         var1 = l6.m3();
      }

      long var2 = var0.j5();
      long var4 = var1.j5();
      if (var2 > var4) {
         return 1;
      } else {
         return var2 < var4 ? -1 : 0;
      }
   }

   public int n5(j5 var1) {
      if (var1 == null) {
         return 1;
      } else {
         long var2 = var1.j5();
         long var4 = this.j5();
         if (var4 > var2) {
            return 1;
         } else {
            return var4 < var2 ? -1 : 0;
         }
      }
   }

   private static long n5(int var0, int var1, int var2) {
      if (var0 >= 1 && var0 <= 9999 && var1 >= 1 && var1 <= 12) {
         int[] var3 = k5(var0) ? h0 : u9;
         if (var2 >= 1 && var2 <= var3[var1] - var3[var1 - 1]) {
            int var4 = var0 - 1;
            int var5 = var4 * 365 + var4 / 4 - var4 / 100 + var4 / 400 + var3[var1 - 1] + var2 - 1;
            return var5 * 864000000000L;
         }
      }

      throw new ArgumentOutOfRangeException("Year, Month, and Day parameters describe an un-representable DateTime.");
   }

   private static long l6(int var0, int var1, int var2) {
      if (var0 >= 0 && var0 < 24 && var1 >= 0 && var1 < 60 && var2 >= 0 && var2 < 60) {
         return new s4(var0, var1, var2).a6();
      } else {
         throw new ArgumentOutOfRangeException("Hour, Minute, and Second parameters describe an un-representable DateTime.");
      }
   }

   public static int n5(int var0, int var1) {
      if (var1 >= 1 && var1 <= 12) {
         int[] var2 = k5(var0) ? h0 : u9;
         return var2[var1] - var2[var1 - 1];
      } else {
         throw new ArgumentOutOfRangeException("month", "Month must be between one and twelve.");
      }
   }

   static long u9(double var0) {
      if (!(var0 >= 2958466.0) && !(var0 <= -657435.0)) {
         long var2 = (long)(var0 * 8.64E7 + (var0 >= 0.0 ? 0.5 : -0.5));
         if (var2 < 0L) {
            var2 -= var2 % 86400000L * 2L;
         }

         var2 += 59926435200000L;
         if (var2 >= 0L && var2 < 315537897600000L) {
            return var2 * 10000L;
         } else {
            throw new ArgumentException("OleAut date did not convert to a DateTime correctly.");
         }
      } else {
         throw new ArgumentException("Not a legal OleAut date.");
      }
   }

   @Override
   public int hashCode() {
      long var1 = this.j5();
      return (int)var1 ^ (int)(var1 >> 32);
   }

   @Override
   public boolean equals(Object value) {
      return value instanceof j5 && u9(this, (j5)value);
   }

   public static boolean u9(j5 var0, j5 var1) {
      return h0(var0, var1);
   }

   public static boolean h0(j5 var0, j5 var1) {
      return a6(var0, var1) == 0;
   }

   public static boolean c8(j5 var0, j5 var1) {
      return !h0(var0, var1);
   }

   public static j5 l6(long var0) {
      if (var0 >= 0L && var0 <= 2650467743999999999L) {
         long var2 = var0 + 504911232000000000L;
         return new j5(var2, 1L);
      } else {
         throw new ArgumentOutOfRangeException("fileTime");
      }
   }

   public static j5 h0(double var0) {
      return new j5(u9(var0), 0L);
   }

   public static j5 n5(j5 var0, long var1) {
      return new j5(var0.j5(), var1);
   }

   public j5 n5() {
      long var1 = this.j5();
      return a6(var1 - var1 % 864000000000L | this.w1());
   }

   private int u3(int var1) {
      long var2 = this.j5();
      int var4 = (int)(var2 / 864000000000L);
      int var5 = var4 / 146097;
      var4 -= var5 * 146097;
      int var6 = var4 / 36524;
      if (var6 == 4) {
         var6 = 3;
      }

      var4 -= var6 * 36524;
      int var7 = var4 / 1461;
      var4 -= var7 * 1461;
      int var8 = var4 / 365;
      if (var8 == 4) {
         var8 = 3;
      }

      if (var1 == 0) {
         return var5 * 400 + var6 * 100 + var7 * 4 + var8 + 1;
      }

      var4 -= var8 * 365;
      if (var1 == 1) {
         return var4 + 1;
      }

      boolean var9 = var8 == 3 && (var7 != 24 || var6 == 3);
      int[] var10 = var9 ? h0 : u9;
      int var11 = var4 >> 6;

      while (var4 >= var10[var11]) {
         var11++;
      }

      return var1 == 2 ? var11 : var4 - var10[var11 - 1] + 1;
   }

   public int l6() {
      return this.u3(3);
   }

   public int k5() {
      return (int)((this.j5() / 864000000000L + 1L) % 7L);
   }

   public int u3() {
      return (int)(this.j5() / 36000000000L % 24L);
   }

   public long a6() {
      long var1 = this.w1();
      if (var1 == 0L) {
         return 0L;
      } else {
         return var1 == 4611686018427387904L ? 1L : 2L;
      }
   }

   public int u9() {
      return (int)(this.j5() / 10000L % 1000L);
   }

   public int h0() {
      return (int)(this.j5() / 600000000L % 60L);
   }

   public int c8() {
      return this.u3(2);
   }

   public static j5 t2() {
      return a6(k5(System.currentTimeMillis()) | 4611686018427387904L);
   }

   public static j5 s7() {
      return t2().q0();
   }

   public int x8() {
      return (int)(this.j5() / 10000000L % 60L);
   }

   public long n3() {
      return this.j5();
   }

   public static j5 y4() {
      return s7().n5();
   }

   public int e2() {
      return this.u3(0);
   }

   public static boolean k5(int var0) {
      if (var0 >= 1 && var0 <= 9999) {
         return var0 % 4 == 0 && (var0 % 100 != 0 || var0 % 400 == 0);
      } else {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   public static s4 t2(j5 var0, j5 var1) {
      return new s4(var0.j5() - var1.j5());
   }

   public s4 l6(j5 var1) {
      return t2(this, var1);
   }

   public static j5 l6(j5 var0, s4 var1) {
      long var2 = var0.j5();
      long var4 = var1.a6();
      if (var2 - 0L >= var4 && var2 - 3155378975999999999L <= var4) {
         return a6(var2 - var4 | var0.w1());
      } else {
         throw new ArgumentOutOfRangeException("t");
      }
   }

   private static double u9(long var0) {
      if (var0 == 0L) {
         return 0.0;
      }

      if (var0 < 864000000000L) {
         var0 += 599264352000000000L;
      }

      if (var0 < 31241376000000000L) {
         throw new IllegalStateException("Arg_OleAutDateInvalid");
      }

      long var2 = (var0 - 599264352000000000L) / 10000L;
      if (var2 < 0L) {
         long var4 = var2 % 86400000L;
         if (var4 != 0L) {
            var2 -= (86400000L + var4) * 2L;
         }
      }

      return var2 / 8.64E7;
   }

   public double t9() {
      return u9(this.j5());
   }

   public long z1() {
      return this.k7().t4();
   }

   public long t4() {
      long var1 = (this.w1() & Long.MIN_VALUE) != 0L ? this.k7().j5() : this.j5();
      var1 -= 504911232000000000L;
      if (var1 < 0L) {
         throw new ArgumentOutOfRangeException("Not a valid Win32 FileTime.");
      } else {
         return var1;
      }
   }

   public j5 q0() {
      if (this.a6() == 2L) {
         return this;
      } else {
         long var1 = this.r4();
         if (var1 > 3155378975999999999L) {
            return new j5(3155378975999999999L, 2L);
         } else {
            return var1 < 0L ? new j5(0L, 2L) : new j5(var1, 2L);
         }
      }
   }

   private long r4() {
      double var1 = this.j5() / 10000.0 - 6.21355968E13;
      double var3 = TimeZone.getDefault().getOffset((long)var1);
      double var5 = 6.21355968E13 + var1 + var3;
      if (var5 < 0.0) {
         var5 = 0.0;
      }

      double var7 = var5 * 10000.0;
      return (long)var7;
   }

   private long c4() {
      double var1 = this.j5() / 10000.0 - 6.21355968E13;
      double var3 = TimeZone.getDefault().getOffset((long)var1);
      double var5 = 6.21355968E13 + var1 - var3;
      if (var5 < 0.0) {
         var5 = 0.0;
      }

      double var7 = var5 * 10000.0;
      return (long)var7;
   }

   public long z3() {
      return this.j5() / 10000L - 62135596800000L;
   }

   public static Date k5(j5 var0) {
      if (var0 == null) {
         return null;
      }

      long var1;
      if (l6.equals(var0)) {
         var1 = u3;
      } else {
         long var3 = var0.z3();
         var1 = var3 - TimeZone.getDefault().getOffset(var3);
      }

      return new Date(var1);
   }

   public static long k5(long var0) {
      long var2 = 62135596800000L + var0;
      if (var2 < 0L) {
         var2 = 0L;
      }

      return var2 * 10000L;
   }

   public static j5 n5(Date var0) {
      if (var0 == null) {
         return new j5();
      }

      long var1 = var0.getTime();
      long var3 = k5(var1 + TimeZone.getDefault().getOffset(var1));
      return new j5(var3, 0L);
   }

   @Override
   public String toString() {
      return this.n5("G", (h2)null);
   }

   public String m1() {
      return this.n5("d");
   }

   public String n5(String var1) {
      return this.n5(var1, (h2)null);
   }

   @Override
   public String n5(String var1, h2 var2) {
      com.aspose.slides.internal.x7n.u3 var3 = com.aspose.slides.internal.x7n.u3.n5(var2);
      boolean var4 = var2 == null;
      if (var1 == null || d1.a6(var1, "")) {
         var1 = "G";
      }

      boolean var5 = false;
      boolean var6 = false;
      if (var1.length() == 1) {
         var4 = false;
         char var7 = var1.charAt(0);
         boolean[] var8 = new boolean[]{false};
         boolean[] var9 = new boolean[]{false};
         var1 = r4.n5(var7, var3, var8, var9);
         var5 = var8[0];
         var6 = var9[0];
         if (var7 == 'U') {
            return r4.n5(this.k7().m3(), var1, var3, var4);
         }

         if (var1 == null) {
            throw new FormatException("format is not one of the format specifier characters defined for DateTimeFormatInfo");
         }
      }

      return r4.n5(this.m3(), var1, var3, var4);
   }

   public j5 k7() {
      if (this.a6() == 1L) {
         return this;
      } else {
         long var1 = this.c4();
         if (var1 > 3155378975999999999L) {
            return new j5(3155378975999999999L, 1L);
         } else {
            return var1 < 0L ? new j5(0L, 1L) : new j5(var1, 1L);
         }
      }
   }

   private static String[] n5(com.aspose.slides.internal.x7n.u3 var0) {
      int var1 = var0.q0().indexOf(100);
      int var2 = var0.q0().indexOf(77);
      int var3 = var0.q0().indexOf(121);
      if (var1 == -1 || var2 == -1 || var3 == -1) {
         return s7;
      }

      if (var3 < var2) {
         if (var2 < var1) {
            return x8;
         } else {
            return var3 < var1 ? n3 : s7;
         }
      } else if (var1 < var2) {
         return y4;
      } else {
         return var1 < var3 ? e2 : s7;
      }
   }

   static boolean n5(String var0, h2 var1, int var2, j5[] var3, w1[] var4, boolean var5, RuntimeException[] var6) {
      var4[0] = new w1(0L, s4.k5.n3());
      if (var0 != null && var0.length() != 0) {
         if (var1 == null) {
            var1 = com.aspose.slides.internal.x7n.l6.u3();
         }

         com.aspose.slides.internal.x7n.u3 var7 = com.aspose.slides.internal.x7n.u3.n5(var1);
         String[] var8 = n5(var7);
         if (var8 == null) {
            l6.u3(var3[0]);
            return false;
         }

         boolean var9 = false;

         for (int var10 = 0; var10 < var8.length; var10++) {
            String var11 = var8[var10];
            boolean var12 = false;
            boolean[] var13 = new boolean[]{false};
            boolean[] var14 = new boolean[]{var9};
            boolean var15 = n5(var0, var11, "", false, var3, var4, var7, var2, true, var13, var14);
            var12 = var13[0];
            var9 = var14[0];
            if (var15) {
               return true;
            }

            if (var12) {
               for (int var16 = 0; var16 < t9.length; var16++) {
                  var13[0] = var12;
                  var14[0] = var9;
                  boolean var17 = n5(var0, var11, t9[var16], false, var3, var4, var7, var2, true, var13, var14);
                  var12 = var13[0];
                  var9 = var14[0];
                  if (var17) {
                     return true;
                  }
               }
            }
         }

         int var24 = var7.k7().indexOf(100);
         int var25 = var7.k7().indexOf(77);
         if (var24 != -1 && var25 != -1) {
            boolean var27 = var24 < var25;
            String[] var28 = var27 ? t4 : z1;

            for (int var29 = 0; var29 < var28.length; var29++) {
               boolean var32 = false;
               boolean[] var36 = new boolean[]{false};
               boolean[] var39 = new boolean[]{var9};
               boolean var18 = n5(var0, var28[var29], "", false, var3, var4, var7, var2, true, var36, var39);
               var32 = var36[0];
               var9 = var39[0];
               if (var18) {
                  return true;
               }
            }

            for (int var30 = 0; var30 < t9.length; var30++) {
               String var34 = t9[var30];
               boolean var37 = false;
               boolean[] var40 = new boolean[]{false};
               boolean[] var41 = new boolean[]{var9};
               boolean var19 = n5(var0, var34, "", false, var3, var4, var7, var2, false, var40, var41);
               var37 = var40[0];
               var9 = var41[0];
               if (var19) {
                  return true;
               }

               if (var37) {
                  for (int var20 = 0; var20 < var28.length; var20++) {
                     var40[0] = var37;
                     var41[0] = var9;
                     boolean var21 = n5(var0, var34, var28[var20], false, var3, var4, var7, var2, false, var40, var41);
                     var37 = var40[0];
                     var9 = var41[0];
                     if (var21) {
                        return true;
                     }
                  }

                  for (int var42 = 0; var42 < var8.length; var42++) {
                     String var43 = var8[var42];
                     if (var43.charAt(var43.length() - 1) != 'T') {
                        var40[0] = var37;
                        var41[0] = var9;
                        boolean var22 = n5(var0, var34, var43, false, var3, var4, var7, var2, false, var40, var41);
                        var37 = var40[0];
                        var9 = var41[0];
                        if (var22) {
                           return true;
                        }
                     }
                  }
               }
            }

            boolean[] var31 = new boolean[]{var9};
            boolean var35 = n5(var0, var7.s3(), var7, var2, var3, false, var31, var5, var6);
            var9 = var31[0];
            if (var35) {
               return true;
            }

            if (!var5) {
               return false;
            }

            var6[0] = new FormatException("String was not recognized as a valid DateTime.");
            return false;
         } else {
            l6.u3(var3[0]);
            if (var5) {
               var6[0] = new FormatException(d1.n5("Order of month and date is not defined by {0}", new Object[]{var7.k7()}));
            }

            return false;
         }
      } else {
         if (var5) {
            var6[0] = new FormatException("String was not recognized as a valid DateTime.");
         }

         l6.u3(var3[0]);
         return false;
      }
   }

   private static boolean n5(String var0, int var1) {
      return var1 < var0.length() && Character.isLetter(var0.charAt(var1));
   }

   private static int n5(String var0, int var1, int var2, int var3, boolean var4, boolean var5, int[] var6) {
      int var7 = 0;
      if (var5) {
         var4 = false;
      }

      if (!var4) {
         int var8 = 0;

         for (int var9 = var1; var9 < var0.length() && var9 < var3 + var1 && Character.isDigit(var0.charAt(var9)); var9++) {
            var8++;
         }

         var3 = var8;
      }

      if (var3 < var2) {
         var6[0] = -1;
         return 0;
      }

      if (var0.length() - var1 < var3) {
         var6[0] = -1;
         return 0;
      }

      for (int var11 = var1; var11 < var3 + var1; var11++) {
         char var10 = var0.charAt(var11);
         if (!Character.isDigit(var10)) {
            var6[0] = -1;
            return 0;
         }

         var7 = var7 * 10 + ((byte)(var10 - '0') & 255);
      }

      var6[0] = var3;
      return var7;
   }

   private static int n5(String var0, int var1, String[] var2, String[] var3, boolean var4, int[] var5) {
      for (int var6 = var2.length - 1; var6 >= 0; var6--) {
         if (!var4 && var3[var6].length() > var2[var6].length()) {
            if (var3[var6].length() > 0 && n5(var0, var1, 0, var3[var6], var5)) {
               return var6;
            }

            if (var2[var6].length() > 0 && n5(var0, var1, 0, var2[var6], var5)) {
               return var6;
            }
         } else {
            if (var2[var6].length() > 0 && n5(var0, var1, 0, var2[var6], var5)) {
               return var6;
            }

            if (!var4 && var3[var6].length() > 0 && n5(var0, var1, 0, var3[var6], var5)) {
               return var6;
            }
         }
      }

      var5[0] = -1;
      return -1;
   }

   private static boolean n5(String var0, int var1, int var2, String var3, int[] var4) {
      if (var2 <= 0) {
         var2 = var3.length();
      }

      if (var1 + var2 <= var0.length() && d1.n5(var0, var1, var3, 0, var2, true, com.aspose.slides.internal.x7n.l6.k5()) == 0) {
         var4[0] = var2;
         return true;
      } else {
         var4[0] = -1;
         return false;
      }
   }

   private static boolean n5(String var0, int var1, int var2, com.aspose.slides.internal.x7n.u3 var3, boolean var4, int[] var5, int[] var6) {
      var5[0] = -1;
      if (var6[0] != -1) {
         return false;
      }

      if (!n5(var0, var1)) {
         if (!"".equals(var3.y4())) {
            return false;
         }

         if (var4) {
            var6[0] = 0;
         }

         var5[0] = 0;
         return true;
      } else {
         com.aspose.slides.internal.x7n.u3 var7 = com.aspose.slides.internal.x7n.u3.w1();
         if ((var4 || !n5(var0, var1, var2, var7.e2(), var5)) && ("".equals(var3.e2()) || !n5(var0, var1, var2, var3.e2(), var5))) {
            if ((var4 || !n5(var0, var1, var2, var7.y4(), var5)) && !n5(var0, var1, var2, var3.y4(), var5)) {
               return false;
            }

            if (var4 || var5[0] != 0) {
               var6[0] = 0;
            }
         } else {
            var6[0] = 1;
         }

         return true;
      }
   }

   private static boolean n5(String var0, int var1, com.aspose.slides.internal.x7n.u3 var2, boolean var3, int[] var4) {
      return n5(var0, var1, 0, var2.z1(), var4) || !var3 && n5(var0, var1, 0, ":", var4);
   }

   private static boolean l6(String var0, int var1, com.aspose.slides.internal.x7n.u3 var2, boolean var3, int[] var4) {
      var4[0] = -1;
      if (var3 && var0.charAt(var1) != '/') {
         return false;
      } else if (!n5(var0, var1, var2, var3, var4)
         && (var1 >= var0.length() || !Character.isDigit(var0.charAt(var1)) && !Character.isLetter(var0.charAt(var1)))) {
         var4[0] = 1;
         return true;
      } else {
         return false;
      }
   }

   private static boolean n5(
      String var0,
      String[] var1,
      com.aspose.slides.internal.x7n.u3 var2,
      int var3,
      j5[] var4,
      boolean var5,
      boolean[] var6,
      boolean var7,
      RuntimeException[] var8
   ) {
      boolean var9 = false;

      for (int var10 = 0; var10 < var1.length; var10++) {
         j5 var11 = new j5();
         String var12 = var1[var10];
         if (var12 == null || d1.a6(var12, "")) {
            break;
         }

         w1 var13 = new w1();
         j5[] var14 = new j5[]{var11};
         w1[] var15 = new w1[]{var13};
         boolean[] var16 = new boolean[]{var9};
         boolean var17 = n5(var0, var1[var10], null, var5, var14, var15, var2, var3, false, var16, var6);
         var14[0].u3(var11);
         var15[0].l6(var13);
         var9 = var16[0];
         if (var17) {
            var11.u3(var4[0]);
            return true;
         }
      }

      if (var7) {
         var8[0] = new FormatException("Invalid format string");
      }

      l6.u3(var4[0]);
      return false;
   }

   private static boolean n5(
      String var0,
      String var1,
      String var2,
      boolean var3,
      j5[] var4,
      w1[] var5,
      com.aspose.slides.internal.x7n.u3 var6,
      int var7,
      boolean var8,
      boolean[] var9,
      boolean[] var10
   ) {
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      var5[0] = new w1(0L, s4.k5.n3());
      boolean var14 = !var3 && var2 != null;
      var9[0] = false;
      int var15 = 0;
      String var16 = var1;
      boolean var17 = false;
      com.aspose.slides.internal.x7n.u3 var18 = com.aspose.slides.internal.x7n.u3.w1();
      if (var16.length() == 1) {
         boolean[] var19 = new boolean[]{false};
         boolean[] var20 = new boolean[]{false};
         var16 = r4.n5(var16.charAt(0), var6, var19, var20);
         var11 = var19[0];
         var12 = var20[0];
      }

      var4[0] = new j5(0L);
      if (var16 == null) {
         return false;
      }

      if (var0 == null) {
         return false;
      }

      if ((var7 & 1) != 0) {
         var16 = d1.u3(var16, (char[])null);
         var0 = d1.u3(var0, (char[])null);
      }

      if ((var7 & 2) != 0) {
         var16 = d1.a6(var16, (char[])null);
         var0 = d1.a6(var0, (char[])null);
      }

      if (var12) {
         var6 = var18;
      }

      if ((var7 & 4) != 0) {
         var13 = true;
      }

      String var52 = var16;
      int var53 = var16.length();
      int var54 = 0;
      int var22 = 0;
      if (var53 == 0) {
         return false;
      }

      int var23 = -1;
      int var24 = -1;
      int var25 = -1;
      int var26 = -1;
      int var27 = -1;
      int var28 = -1;
      int var29 = -1;
      double var30 = -1.0;
      int var32 = -1;
      byte var33 = -1;
      int var34 = -1;
      int var35 = -1;
      boolean var36 = true;
      boolean var37 = false;

      label906:
      while (true) {
         while (var15 != var0.length()) {
            int var38 = 0;
            if (var14 && var54 + var22 == 0) {
               boolean var39 = n5(var0, var15);
               if (var39) {
                  if (var0.charAt(var15) == 'Z') {
                     var38 = 1;
                  } else {
                     int[] var40 = new int[]{0};
                     n5(var0, var15, 0, "GMT", var40);
                     var38 = var40[0];
                  }

                  if (var38 > 0 && !n5(var0, var15 + var38)) {
                     var15 += var38;
                     var11 = true;
                     continue;
                  }
               }

               int[] var68 = new int[]{var38};
               int[] var41 = new int[]{var32};
               boolean var42 = !var17 && n5(var0, var15, 0, var6, var3, var68, var41);
               var38 = var68[0];
               var32 = var41[0];
               if (var42) {
                  if (n5(var0, var15 + var38)) {
                     var32 = -1;
                  } else if (var38 > 0) {
                     var15 += var38;
                     continue;
                  }
               }

               if (!var17 && var24 == -1 && var39) {
                  var68[0] = var38;
                  var24 = n5(var0, var15, var6.h0(), var18.h0(), var3, var68);
                  var38 = var68[0];
                  if (var24 == -1) {
                     var68[0] = var38;
                     var24 = n5(var0, var15, var6.k5(), var18.k5(), var3, var68);
                     var38 = var68[0];
                  }

                  if (var24 != -1 && !n5(var0, var15 + var38)) {
                     var15 += var38;
                     continue;
                  }

                  var24 = -1;
               }

               if (com.aspose.slides.ms.System.t9.t9(var0.charAt(var15)) || var0.charAt(var15) == ',') {
                  var15++;
                  continue label906;
               }

               var38 = 0;
            }

            if (var54 + var22 < var53) {
               boolean var66 = true;
               if (var52.charAt(var54) == '\'') {
                  var22 = 1;

                  while (true) {
                     if (var54 + var22 < var53 && var52.charAt(var54 + var22) != '\'') {
                        if (var15 != var0.length() && var0.charAt(var15) == var52.charAt(var54 + var22)) {
                           var15++;
                           var22++;
                           continue;
                        }

                        return false;
                     }

                     var54 += var22 + 1;
                     var22 = 0;
                     break;
                  }
               } else if (var52.charAt(var54) == '"') {
                  var22 = 1;

                  while (true) {
                     if (var54 + var22 < var53 && var52.charAt(var54 + var22) != '"') {
                        if (var15 != var0.length() && var0.charAt(var15) == var52.charAt(var54 + var22)) {
                           var15++;
                           var22++;
                           continue;
                        }

                        return false;
                     }

                     var54 += var22 + 1;
                     var22 = 0;
                     break;
                  }
               } else if (var52.charAt(var54) == '\\') {
                  var54 += var22 + 1;
                  var22 = 0;
                  if (var54 >= var53) {
                     return false;
                  }

                  if (var0.charAt(var15) != var52.charAt(var54)) {
                     return false;
                  }

                  var15++;
                  var54++;
               } else if (var52.charAt(var54) == '%') {
                  var54++;
               } else if (com.aspose.slides.ms.System.t9.t9(var0.charAt(var15))
                  || var0.charAt(var15) == ',' && (!var3 && var52.charAt(var54) == '/' || com.aspose.slides.ms.System.t9.t9(var52.charAt(var54)))) {
                  var15++;
                  var22 = 0;
                  if (var3 && (var7 & 4) == 0) {
                     if (!com.aspose.slides.ms.System.t9.t9(var52.charAt(var54))) {
                        return false;
                     }

                     var54++;
                  } else {
                     int var101 = var15;

                     while (var101 < var0.length() && (com.aspose.slides.ms.System.t9.t9(var0.charAt(var101)) || var0.charAt(var101) == ',')) {
                        var101++;
                     }

                     var15 = var101;
                     var101 = var54;

                     while (var101 < var52.length() && (com.aspose.slides.ms.System.t9.t9(var52.charAt(var101)) || var52.charAt(var101) == ',')) {
                        var101++;
                     }

                     var54 = var101;
                     if (!var3 && var54 < var52.length() && var52.charAt(var54) == '/') {
                        int[] var112 = new int[]{0};
                        boolean var116 = !l6(var0, var15, var6, var3, var112);
                        var38 = var112[0];
                        if (var116) {
                           var54++;
                        }
                     }
                  }
               } else if (var54 + var22 + 1 < var53 && var52.charAt(var54 + var22 + 1) == var52.charAt(var54 + var22)) {
                  var22++;
               } else {
                  switch (var52.charAt(var54)) {
                     case '.':
                        if (var0.charAt(var15) == '.') {
                           var22 = 0;
                           var38 = 1;
                        } else {
                           if (var54 + 1 >= var53 || var52.charAt(var54 + 1) != 'F') {
                              return false;
                           }

                           var54++;

                           while (var54 + 1 < var53 && var52.charAt(var54 + 1) == 'F') {
                              var54++;
                           }

                           var22 = 0;
                           var38 = 0;
                        }
                        break;
                     case '/':
                        int[] var100 = new int[]{0};
                        boolean var111 = !l6(var0, var15, var6, var3, var100);
                        var38 = var100[0];
                        if (var111) {
                           return false;
                        }

                        var22 = 0;
                        break;
                     case '0':
                     case '1':
                     case '2':
                     case '3':
                     case '4':
                     case '5':
                     case '6':
                     case '7':
                     case '8':
                     case '9':
                     case ';':
                     case '<':
                     case '=':
                     case '>':
                     case '?':
                     case '@':
                     case 'A':
                     case 'B':
                     case 'C':
                     case 'D':
                     case 'I':
                     case 'J':
                     case 'L':
                     case 'N':
                     case 'O':
                     case 'P':
                     case 'Q':
                     case 'R':
                     case 'S':
                     case 'T':
                     case 'U':
                     case 'V':
                     case 'W':
                     case 'X':
                     case 'Y':
                     case '[':
                     case '\\':
                     case ']':
                     case '^':
                     case '_':
                     case '`':
                     case 'a':
                     case 'b':
                     case 'c':
                     case 'e':
                     case 'g':
                     case 'i':
                     case 'j':
                     case 'k':
                     case 'l':
                     case 'n':
                     case 'o':
                     case 'p':
                     case 'q':
                     case 'r':
                     case 'u':
                     case 'v':
                     case 'w':
                     case 'x':
                     default:
                        if (var0.charAt(var15) != var52.charAt(var54)) {
                           return false;
                        }

                        var22 = 0;
                        var38 = 1;
                        break;
                     case ':':
                        int[] var99 = new int[]{0};
                        boolean var110 = !n5(var0, var15, var6, var3, var99);
                        var38 = var99[0];
                        if (var110) {
                           return false;
                        }
                        break;
                     case 'E':
                        if (var24 != -1) {
                           return false;
                        }

                        if (var22 == 2) {
                           int[] var97 = new int[]{0};
                           var24 = n5(var0, var15, var6.k5(), var18.k5(), var3, var97);
                           var38 = var97[0];
                        } else {
                           int[] var98 = new int[]{0};
                           var24 = n5(var0, var15, var6.h0(), var18.h0(), var3, var98);
                           var38 = var98[0];
                        }
                        break;
                     case 'F':
                     case 'f':
                        if (var52.charAt(var54) == 'F') {
                           var66 = false;
                        }

                        if (var22 > 6 || var30 != -1.0) {
                           return false;
                        }

                        int var96 = 0;
                        if (!var3) {
                           for (int var108 = var15; var108 < var0.length(); var108++) {
                              char var115 = var0.charAt(var108);
                              if (!Character.isDigit(var115)) {
                                 break;
                              }

                              var96++;
                           }
                        } else {
                           var96 = var22 + 1;
                        }

                        int[] var109 = new int[]{0};
                        double var44 = n5(var0, var15, 0, var96, var66, var13, var109);
                        var38 = var109[0];
                        if (var38 == -1) {
                           return false;
                        }

                        var30 = var44 / Math.pow(10.0, var38);
                        break;
                     case 'G':
                        if (var0.charAt(var15) != 'G') {
                           return false;
                        }

                        if (var54 + 2 < var53
                           && var15 + 2 < var0.length()
                           && var52.charAt(var54 + 1) == 'M'
                           && var0.charAt(var15 + 1) == 'M'
                           && var52.charAt(var54 + 2) == 'T'
                           && var0.charAt(var15 + 2) == 'T') {
                           var11 = true;
                           var22 = 2;
                           var38 = 3;
                        } else {
                           var22 = 0;
                           var38 = 1;
                        }
                        break;
                     case 'H':
                        if (var27 != -1 || !var14 && var32 >= 0) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var94 = new int[]{0};
                           var27 = n5(var0, var15, 1, 2, false, var13, var94);
                           var38 = var94[0];
                        } else {
                           int[] var95 = new int[]{0};
                           var27 = n5(var0, var15, 1, 2, true, var13, var95);
                           var38 = var95[0];
                        }

                        if (var27 >= 24) {
                           return false;
                        }

                        var37 = true;
                        break;
                     case 'K':
                        if (var0.charAt(var15) == 'Z') {
                           var15++;
                           var11 = true;
                        } else if (var0.charAt(var15) == '+' || var0.charAt(var15) == '-') {
                           if (var33 != -1) {
                              return false;
                           }

                           if (var0.charAt(var15) == '+') {
                              var33 = 0;
                           } else if (var0.charAt(var15) == '-') {
                              var33 = 1;
                           }

                           var15++;
                           int[] var93 = new int[]{0};
                           var34 = n5(var0, var15, 0, 2, true, var13, var93);
                           var38 = var93[0];
                           var15 += var38;
                           if (var38 < 0) {
                              return false;
                           }

                           if (Character.isDigit(var0.charAt(var15))) {
                              var38 = 0;
                           } else {
                              var93[0] = var38;
                              boolean var107 = !n5(var0, var15, 0, var6.z1(), var93);
                              var38 = var93[0];
                              if (var107) {
                                 return false;
                              }
                           }

                           var15 += var38;
                           var93[0] = var38;
                           var35 = n5(var0, var15, 0, 2, true, var13, var93);
                           var38 = var93[0];
                           var22 = 2;
                           if (var38 < 0) {
                              return false;
                           }
                        }
                        break;
                     case 'M':
                        if (var25 != -1) {
                           return false;
                        }

                        if (var14) {
                           var38 = -1;
                           if (var22 == 0 || var22 == 3) {
                              int[] var86 = new int[]{-1};
                              var25 = n5(var0, var15, 1, 2, false, var13, var86);
                              var38 = var86[0];
                           }

                           if (var22 > 1 && var38 == -1) {
                              int[] var87 = new int[]{var38};
                              var25 = n5(var0, var15, var6.t2(), var18.t2(), var3, var87) + 1;
                              var38 = var87[0];
                           }

                           if (var22 > 1 && var38 == -1) {
                              int[] var88 = new int[]{var38};
                              var25 = n5(var0, var15, var6.a6(), var18.a6(), var3, var88) + 1;
                              var38 = var88[0];
                           }
                        } else if (var22 == 0) {
                           int[] var89 = new int[]{0};
                           var25 = n5(var0, var15, 1, 2, false, var13, var89);
                           var38 = var89[0];
                        } else if (var22 == 1) {
                           int[] var90 = new int[]{0};
                           var25 = n5(var0, var15, 1, 2, true, var13, var90);
                           var38 = var90[0];
                        } else if (var22 == 2) {
                           int[] var91 = new int[]{0};
                           var25 = n5(var0, var15, var6.a6(), var18.a6(), var3, var91) + 1;
                           var38 = var91[0];
                        } else {
                           int[] var92 = new int[]{0};
                           var25 = n5(var0, var15, var6.t2(), var18.t2(), var3, var92) + 1;
                           var38 = var92[0];
                        }
                        break;
                     case 'Z':
                        if (var0.charAt(var15) != 'Z') {
                           return false;
                        }

                        var22 = 0;
                        var38 = 1;
                        var11 = true;
                        break;
                     case 'd':
                        if (var22 < 2 && var23 != -1 || var22 >= 2 && var24 != -1) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var82 = new int[]{0};
                           var23 = n5(var0, var15, 1, 2, false, var13, var82);
                           var38 = var82[0];
                        } else if (var22 == 1) {
                           int[] var83 = new int[]{0};
                           var23 = n5(var0, var15, 1, 2, true, var13, var83);
                           var38 = var83[0];
                        } else if (var22 == 2) {
                           int[] var84 = new int[]{0};
                           var24 = n5(var0, var15, var6.k5(), var18.k5(), var3, var84);
                           var38 = var84[0];
                        } else {
                           int[] var85 = new int[]{0};
                           var24 = n5(var0, var15, var6.h0(), var18.h0(), var3, var85);
                           var38 = var85[0];
                        }
                        break;
                     case 'h':
                        if (var27 != -1) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var80 = new int[]{0};
                           var27 = n5(var0, var15, 1, 2, false, var13, var80);
                           var38 = var80[0];
                        } else {
                           int[] var81 = new int[]{0};
                           var27 = n5(var0, var15, 1, 2, true, var13, var81);
                           var38 = var81[0];
                        }

                        if (var27 > 12) {
                           return false;
                        }

                        if (var27 == 12) {
                           var27 = 0;
                        }
                        break;
                     case 'm':
                        if (var28 != -1) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var78 = new int[]{0};
                           var28 = n5(var0, var15, 1, 2, false, var13, var78);
                           var38 = var78[0];
                        } else {
                           int[] var79 = new int[]{0};
                           var28 = n5(var0, var15, 1, 2, true, var13, var79);
                           var38 = var79[0];
                        }

                        if (var28 >= 60) {
                           return false;
                        }
                        break;
                     case 's':
                        if (var29 != -1) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var76 = new int[]{0};
                           var29 = n5(var0, var15, 1, 2, false, var13, var76);
                           var38 = var76[0];
                        } else {
                           int[] var77 = new int[]{0};
                           var29 = n5(var0, var15, 1, 2, true, var13, var77);
                           var38 = var77[0];
                        }

                        if (var29 >= 60) {
                           return false;
                        }
                        break;
                     case 't':
                        int[] var75 = new int[]{0};
                        int[] var106 = new int[]{var32};
                        boolean var114 = !n5(var0, var15, var22 > 0 ? 0 : 1, var6, var3, var75, var106);
                        var38 = var75[0];
                        var32 = var106[0];
                        if (var114) {
                           return false;
                        }
                        break;
                     case 'y':
                        if (var26 != -1) {
                           return false;
                        }

                        if (var22 == 0) {
                           int[] var72 = new int[]{0};
                           var26 = n5(var0, var15, 1, 2, false, var13, var72);
                           var38 = var72[0];
                        } else if (var22 < 3) {
                           int[] var73 = new int[]{0};
                           var26 = n5(var0, var15, 1, 2, true, var13, var73);
                           var38 = var73[0];
                        } else {
                           int[] var74 = new int[]{0};
                           var26 = n5(var0, var15, var3 ? 4 : 3, 4, false, var13, var74);
                           var38 = var74[0];
                           if (var26 >= 1000 && var38 == 4 && !var10[0] && var0.length() > 4 + var15) {
                              int var104 = 0;
                              int[] var113 = new int[]{0};
                              int var43 = n5(var0, var15, 5, 5, false, var13, var113);
                              var104 = var113[0];
                              var10[0] = var43 > 9999;
                           }

                           var22 = 3;
                        }

                        if (var38 <= 2) {
                           var26 += var26 < 30 ? 2000 : 1900;
                        }
                        break;
                     case 'z':
                        if (var33 != -1) {
                           return false;
                        }

                        if (var0.charAt(var15) == '+') {
                           var33 = 0;
                        } else {
                           if (var0.charAt(var15) != '-') {
                              return false;
                           }

                           var33 = 1;
                        }

                        var15++;
                        if (var22 == 0) {
                           int[] var69 = new int[]{0};
                           var34 = n5(var0, var15, 1, 2, false, var13, var69);
                           var38 = var69[0];
                        } else if (var22 == 1) {
                           int[] var70 = new int[]{0};
                           var34 = n5(var0, var15, 1, 2, true, var13, var70);
                           var38 = var70[0];
                        } else {
                           int[] var71 = new int[]{0};
                           var34 = n5(var0, var15, 1, 2, true, true, var71);
                           var38 = var71[0];
                           var15 += var38;
                           if (var38 < 0) {
                              return false;
                           }

                           int var60 = 0;
                           var71[0] = var60;
                           boolean var103 = var15 < var0.length() && Character.isDigit(var0.charAt(var15)) || n5(var0, var15, var6, var3, var71);
                           var60 = var71[0];
                           if (var103) {
                              var15 += var60;
                              var71[0] = var60;
                              var35 = n5(var0, var15, 1, 2, true, var13, var71);
                              var38 = var71[0];
                              if (var38 < 0) {
                                 return false;
                              }
                           } else {
                              if (!var14) {
                                 return false;
                              }

                              var38 = 0;
                           }
                        }
                  }

                  if (var38 < 0) {
                     return false;
                  }

                  var15 += var38;
                  if (!var3 && !var14) {
                     switch (var52.charAt(var54)) {
                        case 'F':
                        case 'f':
                        case 'm':
                        case 's':
                        case 'z':
                           if (var0.length() > var15 && var0.charAt(var15) == 'Z' && (var54 + 1 == var52.length() || var52.charAt(var54 + 1) != 'Z')) {
                              var11 = true;
                              var15++;
                           }
                     }
                  }

                  var54 = var54 + var22 + 1;
                  var22 = 0;
               }
            } else {
               if (var14 && var22 == 0) {
                  var17 = var36 && var1.charAt(var1.length() - 1) == 'T';
                  if (var36 || !"".equals(var16)) {
                     var54 = 0;
                     if (var36) {
                        var16 = var2;
                     } else {
                        var16 = "";
                     }

                     var52 = var16;
                     var53 = var52.length();
                     var36 = false;
                     continue;
                  }
               }
               break;
            }
         }

         if (var54 + 1 < var53 && var52.charAt(var54) == '.' && var52.charAt(var54 + 1) == 'F') {
            var54++;

            while (var54 < var53 && var52.charAt(var54) == 'F') {
               var54++;
            }
         }

         while (var54 < var53 && var52.charAt(var54) == 'K') {
            var54++;
         }

         if (var54 < var53) {
            return false;
         }

         if (var0.length() > var15) {
            if (var15 == 0) {
               return false;
            }

            if (Character.isDigit(var0.charAt(var15)) && Character.isDigit(var0.charAt(var15 - 1))) {
               return false;
            }

            if (Character.isLetter(var0.charAt(var15)) && Character.isLetter(var0.charAt(var15 - 1))) {
               return false;
            }

            var9[0] = true;
            return false;
         }

         if (var27 == -1) {
            var27 = 0;
         }

         if (var28 == -1) {
            var28 = 0;
         }

         if (var29 == -1) {
            var29 = 0;
         }

         if (var30 == -1.0) {
            var30 = 0.0;
         }

         if (var23 == -1 && var25 == -1 && var26 == -1) {
            if ((var7 & 8) != 0) {
               var23 = 1;
               var25 = 1;
               var26 = 1;
            } else {
               var23 = y4().l6();
               var25 = y4().c8();
               var26 = y4().e2();
            }
         }

         if (var23 == -1) {
            var23 = 1;
         }

         if (var25 == -1) {
            var25 = 1;
         }

         if (var26 == -1) {
            if ((var7 & 8) != 0) {
               var26 = 1;
            } else {
               var26 = y4().e2();
            }
         }

         if (var32 == 0) {
            if (var27 >= 12 && var37 && var3) {
               return false;
            }

            if (var27 == 12) {
               var27 = 0;
            }
         } else if (var32 == 1 && var27 < 12) {
            if (var37 && var3) {
               return false;
            }

            var27 += 12;
         }

         if (var26 >= 1
            && var26 <= 9999
            && var25 >= 1
            && var25 <= 12
            && var23 >= 1
            && var23 <= n5(var26, var25)
            && var27 >= 0
            && var27 <= 23
            && var28 >= 0
            && var28 <= 59
            && var29 >= 0
            && var29 <= 59) {
            var4[0] = new j5(var26, var25, var23, var27, var28, var29, 0);
            var4[0].n5((long)(var30 * 1000.0 * 10000.0)).u3(var4[0]);
            if (var24 != -1 && var24 != var4[0].k5()) {
               return false;
            }

            if (var33 == -1) {
               if (!u9(var4[0], l6)) {
                  try {
                     var5[0] = new w1(var4[0].m3());
                  } catch (Exception var49) {
                  }
               }
            } else {
               if (var35 == -1) {
                  var35 = 0;
               }

               if (var34 == -1) {
                  var34 = 0;
               }

               if (var33 == 1) {
                  var34 = -var34;
                  var35 = -var35;
               }

               try {
                  var5[0] = new w1(var4[0].m3(), new s4(var34, var35, 0));
               } catch (Exception var48) {
               }
            }

            boolean var65 = (var7 & 16) != 0;
            if (var33 != -1) {
               long var46 = l6(var4[0], var5[0].k5()).n3();
               if (var46 < 0L) {
                  var46 += 864000000000L;
               }

               var4[0] = new j5(var46, 1L);
               if ((var7 & 128) != 0) {
                  var4[0].q0().u3(var4[0]);
               }
            } else if (var11 || (var7 & 64) != 0) {
               var4[0].c8 |= 4611686018427387904L;
            } else if ((var7 & 32) != 0) {
               var4[0].c8 |= Long.MIN_VALUE;
            }

            boolean var67 = !var65 && (var7 & 128) == 0;
            if ((int)(var4[0].c8 >> 62) != 0L) {
               if (var65) {
                  var4[0].k7().u3(var4[0]);
               } else if (var67) {
                  var4[0].q0().u3(var4[0]);
               }
            }

            return true;
         }

         return false;
      }
   }

   public static j5 l6(String var0) {
      return l6(var0, null);
   }

   public static j5 l6(String var0, h2 var1) {
      return n5(var0, var1, 7);
   }

   public static j5 n5(String var0, h2 var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      } else {
         j5 var3 = new j5();
         w1 var4 = new w1();
         RuntimeException var5 = null;
         j5[] var6 = new j5[]{var3};
         w1[] var7 = new w1[]{var4};
         RuntimeException[] var8 = new RuntimeException[]{var5};
         boolean var9 = !n5(var0, var1, var2, var6, var7, true, var8);
         var6[0].u3(var3);
         var7[0].l6(var4);
         var5 = var8[0];
         if (var9) {
            throw var5;
         } else {
            return var3;
         }
      }
   }

   public static boolean n5(String var0, j5[] var1) {
      try {
         j5 var2 = l6(var0, com.aspose.slides.internal.x7n.l6.k5());
         var1[0] = var2;
         return true;
      } catch (FormatException var3) {
         var1[0] = l6.m3();
         return false;
      }
   }

   public static boolean n5(String var0, h2 var1, int var2, j5[] var3) {
      if (var0 != null) {
         try {
            Object var4 = null;
            w1 var5 = new w1();
            w1[] var6 = new w1[]{var5};
            RuntimeException[] var7 = new RuntimeException[]{(RuntimeException)var4};
            return n5(var0, var1, var2, var3, var6, false, var7);
         } catch (Exception var8) {
         }
      }

      l6.u3(var3[0]);
      return false;
   }

   public static boolean n5(String var0, String var1, h2 var2, int var3, j5[] var4) {
      String[] var5 = new String[]{var1};
      return n5(var0, var5, var2, var3, var4);
   }

   public static boolean n5(String var0, String[] var1, h2 var2, int var3, j5[] var4) {
      try {
         com.aspose.slides.internal.x7n.u3 var5 = com.aspose.slides.internal.x7n.u3.n5(var2);
         boolean[] var6 = new boolean[]{false};
         Exception[] var7 = new Exception[]{null};
         return n5(var0, var1, var5, var3, var4, true, var6, false, var7);
      } catch (RuntimeException var8) {
         var4[0] = l6.m3();
         return false;
      }
   }

   public void u3(j5 var1) {
      var1 = var1 == null ? new j5() : var1;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
   }

   @Override
   public Object clone() {
      return this.m3();
   }

   public j5 m3() {
      j5 var1 = new j5();
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      return var1;
   }

   public String n5(h2 var1) {
      return this.n5(null, var1);
   }

   public static j5 n5(String var0, String var1, h2 var2) {
      return n5(var0, var1, var2, 0);
   }

   public static j5 n5(String var0, String var1, h2 var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("format");
      }

      String[] var4 = new String[]{var1};
      return n5(var0, var4, var2, var3);
   }

   public static j5 n5(String var0, String[] var1, h2 var2, int var3) {
      com.aspose.slides.internal.x7n.u3 var4 = com.aspose.slides.internal.x7n.u3.n5(var2);
      a6(var3);
      if (var0 == null) {
         throw new ArgumentNullException("s");
      } else if (var1 == null) {
         throw new ArgumentNullException("formats");
      } else if (var1.length == 0) {
         throw new FormatException("Format specifier was invalid.");
      } else {
         j5 var5 = new j5();
         boolean var6 = false;
         RuntimeException var7 = null;
         j5[] var8 = new j5[]{var5};
         boolean[] var9 = new boolean[]{false};
         RuntimeException[] var10 = new RuntimeException[]{var7};
         boolean var11 = !n5(var0, var1, var4, var3, var8, true, var9, true, var10);
         var8[0].u3(var5);
         var6 = var9[0];
         var7 = var10[0];
         if (var11) {
            throw var7;
         } else {
            return var5;
         }
      }
   }

   private static void a6(int var0) {
      if ((var0 & 128) == 0 || (var0 & 16) == 0 && (var0 & 32) == 0 && (var0 & 64) == 0) {
         if ((var0 & 64) != 0 && (var0 & 32) != 0) {
            throw new ArgumentException("The DateTimeStyles values AssumeLocal and AssumeUniversal cannot be used together.", "style");
         }
      } else {
         throw new ArgumentException(
            "The DateTimeStyles value RoundtripKind cannot be used with the values AssumeLocal, Asersal or AdjustToUniversal.", "style"
         );
      }
   }

   public static j5 u3(long var0) {
      switch ((int)(var0 >> 62)) {
         case 0:
            return new j5(var0, 0L);
         case 1:
            return new j5(var0 & 4611686018427387903L, 1L);
         default:
            return new j5(var0 & 4611686018427387903L, 1L).q0();
      }
   }

   public long z8() {
      return (this.c8 & Long.MIN_VALUE) != 0L ? this.k7().n3() | Long.MIN_VALUE : this.c8;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5 Clone() {
      return this.m3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5 bridgeArg0) {
      this.u3(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(j5 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
