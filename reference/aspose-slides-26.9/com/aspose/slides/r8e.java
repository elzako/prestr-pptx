package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

final class r8e {
   static final com.aspose.slides.internal.n8e.e2 n5 = new com.aspose.slides.internal.n8e.e2(
      "*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val"
   );
   static final int[] l6 = new int[]{3, 3, 3, 3, 1, 2, 3, 2, 2, 2, 3, 3, 3, 2, 1, 2, 1};
   private byte u3;
   private long a6;
   private long u9;
   private long h0;
   String k5;
   private boolean c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val"
   );

   public r8e(String var1, String var2, Dictionary<String, Integer> var3, List<r8e> var4) {
      this.k5 = var1;
      int var5 = 0;
      byte[] var6 = new byte[]{this.u3};
      int[] var7 = new int[]{0};
      long[] var8 = new long[]{this.a6};
      long[] var9 = new long[]{this.u9};
      long[] var10 = new long[]{this.h0};
      n5(var2, var3, var4, var6, var7, var8, var9, var10);
      this.u3 = var6[0];
      var5 = var7[0];
      this.a6 = var8[0];
      this.u9 = var9[0];
      this.h0 = var10[0];
   }

   public r8e(String var1, byte var2, long var3, long var5, long var7) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = var5;
      this.h0 = var7;
   }

   public r8e(String var1, byte var2, long var3, long var5, long var7, boolean var9) {
      this(var1, var2, var3, var5, var7);
      this.c8 = var9;
   }

   static void n5(String var0, Dictionary<String, Integer> var1, List<r8e> var2, byte[] var3, int[] var4, long[] var5, long[] var6, long[] var7) {
      int var8 = 0;
      int var9 = var0.length();

      while (var8 < var9 && var0.charAt(var8) != ' ') {
         var8++;
      }

      int var10 = n5.n5(com.aspose.slides.ms.System.d1.l6(var0, 0, var8));
      var3[0] = (byte)var10;
      var4[0] = l6[var10];
      int[] var11 = new int[]{var8};
      var5[0] = n5(var0, var1, var2, var11);
      var8 = var11[0];
      if (var4[0] > 1) {
         var11[0] = var8;
         var6[0] = n5(var0, var1, var2, var11);
         var8 = var11[0];
         if (var4[0] > 2) {
            var11[0] = var8;
            var7[0] = n5(var0, var1, var2, var11);
            var8 = var11[0];
         } else {
            var7[0] = 0L;
         }
      } else {
         var6[0] = var7[0] = 0L;
      }
   }

   private static long n5(String var0, Dictionary<String, Integer> var1, List<r8e> var2, int[] var3) {
      int var4 = var0.length();

      while (var3[0] < var4 && var0.charAt(var3[0]) == ' ') {
         var3[0]++;
      }

      int var5 = var3[0];

      while (var3[0] < var4 && var0.charAt(var3[0]) != ' ') {
         var3[0]++;
      }

      return u3k.n5(com.aspose.slides.ms.System.d1.l6(var0, var5, var3[0] - var5), var1, var2);
   }

   public final String n5() {
      return this.k5;
   }

   public final boolean l6() {
      return this.c8;
   }

   public final long k5() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final long u3() {
      return this.u9;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final long a6() {
      return this.h0;
   }

   public final void k5(long var1) {
      this.h0 = var1;
   }

   public final byte u9() {
      return this.u3;
   }

   public final String n5(r8e[] var1, y2[] var2, String[] var3) {
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5(32);
      switch (t2.n5(n5.n5(this.u3 & 255))) {
         case 0:
            var4.n5("{0}*{1}/{2}",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 1:
            var4.n5("{0}+{1}-{2}",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 2:
            var4.n5("{0}+{1}/{2}",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 3:
            var4.n5("if({0},{1},{2})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 4:
            var4.n5("abs({0})",new Object[]{ u3k.n5(this.a6, var1, var2, var3)});
            break;
         case 5:
            var4.n5("atan2({0},{1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 6:
            var4.n5("{0}*(cos(atan({2} / {1}))",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 7:
            var4.n5("{0}*cos({1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 8:
            var4.n5("max({0},{1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 9:
            var4.n5("min({0},{1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 10:
            var4.n5("sqrt({0}*{0} + {1}{1} + {2}{2})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 11:
            var4.n5("if({0},{1},{2})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 12:
            var4.n5("{0}*(sin(atan({2} / {1}))",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3), u3k.n5(this.h0, var1, var2, var3)});
            break;
         case 13:
            var4.n5("{0}*sin({1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 14:
            var4.n5("sqrt({0})",new Object[]{ u3k.n5(this.a6, var1, var2, var3)});
            break;
         case 15:
            var4.n5("{0}*tan({1})",new Object[]{ u3k.n5(this.a6, var1, var2, var3), u3k.n5(this.u9, var1, var2, var3)});
            break;
         case 16:
            var4.n5("{0}",new Object[]{ u3k.n5(this.a6, var1, var2, var3)});
            break;
         default:
            var4.n5("0");
      }

      return var4.toString();
   }
}
