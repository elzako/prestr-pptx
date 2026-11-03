package com.aspose.slides.internal.k0r;

public class c2 {
   public static w8 n5(q5 var0) {
      return n5(var0, 1);
   }

   public static w8 n5(q5 var0, int var1) {
      if (var0 != null) {
         w8 var2;
         if (var1 == 1) {
            var2 = var0.a6() != null ? var0.a6().l6() : null;
         } else {
            var2 = var0.h0() != null ? var0.h0().l6() : null;
         }

         if (var2 != null) {
            return var2;
         }
      }

      return null;
   }

   public static q1 l6(q5 var0, int var1) {
      w8 var2 = n5(var0);
      if (var2 != null) {
         q1 var3 = var2.n5(var1);
         return var3 instanceof q1 ? var3 : null;
      } else {
         return null;
      }
   }

   public static z5 k5(q5 var0, int var1) {
      q1 var2 = l6(var0, var1);
      return var2 instanceof z5 ? (z5)var2 : null;
   }

   public static z5 n5(q5 var0, q5 var1, int var2) {
      q1 var3 = l6(var0, var2);
      if (var3 == null && var1 != null) {
         q1 var4 = l6(var1, var2);
         return var4 instanceof z5 ? (z5)var4 : null;
      } else {
         return var3 instanceof z5 ? (z5)var3 : null;
      }
   }

   public static v8 l6(q5 var0, q5 var1, int var2) {
      q1 var3 = l6(var0, var2);
      if (var3 == null && var1 != null) {
         q1 var5 = l6(var1, var2);
         return var5 instanceof v8 ? (v8)var5 : null;
      } else {
         q1 var4 = l6(var0, var2);
         return var4 instanceof v8 ? (v8)var4 : null;
      }
   }

   public static int n5(q5 var0, q5 var1, int var2, int var3) {
      w8 var4 = n5(var0);
      q1 var5 = null;
      if (var4 != null) {
         var5 = var4.n5(var2);
      }

      if (var5 == null && var1 != null) {
         var4 = n5(var1);
         if (var4 != null) {
            var5 = var4.n5(var2);
         }
      }

      return var5 != null ? (int)(((z5)var5).j5() & 4294967295L) : var3;
   }

   public static long n5(q5 var0, q5 var1, int var2, long var3) {
      w8 var5 = n5(var0);
      q1 var6 = null;
      if (var5 != null) {
         var6 = var5.n5(var2);
      }

      if (var6 == null && var1 != null) {
         var5 = n5(var1);
         if (var5 != null) {
            var6 = var5.n5(var2);
         }
      }

      return var6 != null ? ((z5)var6).j5() & 4294967295L : var3 & 4294967295L;
   }
}
