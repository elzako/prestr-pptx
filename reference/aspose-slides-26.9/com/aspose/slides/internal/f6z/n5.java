package com.aspose.slides.internal.f6z;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.p1s.l6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class n5 {
   private static final char[] n5 = new char[]{' ', '\t', '\n', '\r'};

   public static String n5(com.aspose.slides.internal.i0e.n5 var0, String var1, l6 var2, y1 var3) {
      if (d1.n5(var1)) {
         return var1;
      }

      if (var2 == null) {
         throw new ArgumentNullException("font");
      }

      if (var0.n5(var1, var2).l6() <= var3.s7()) {
         return var1;
      }

      switch (var0.n5().a6()) {
         case 0:
            return var1;
         case 1:
         default:
            return u3(var1, var2, var3.y4(), var0);
         case 2:
            return a6(var1, var2, var3.y4(), var0);
         case 3:
            return n5(var1, var2, var3.y4(), var0);
         case 4:
            return l6(var1, var2, var3.y4(), var0);
         case 5:
            return k5(var1, var2, var3.y4(), var0);
      }
   }

   private static String n5(String[] var0, int var1, String var2) {
      a5 var3 = new a5();

      for (int var4 = 0; var4 < var1; var4++) {
         var3.n5(var0[var4]);
         if (var3.l6() < var2.length()) {
            var3.n5(var2.charAt(var3.l6()));
         }
      }

      return var3.toString();
   }

   private static String n5(String var0, l6 var1, y1 var2, com.aspose.slides.internal.i0e.n5 var3) {
      if (d1.n5(var0)) {
         return var0;
      }

      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("textMeasurer");
      }

      int var4 = 0;
      int var5 = var0.length() - 1;
      String var6 = d1.n5;
      f2 var7 = new f2();

      while (var5 - var4 > 1) {
         int var8 = var4 + (var5 - var4) / 2;
         var6 = d1.n5(new Object[]{d1.l6(var0, 0, var8 + 1), '…'});
         var3.n5(var6, var1).l6(var7);
         if (var7.l6() < var2.s7()) {
            var4 = var8;
         } else {
            var5 = var8;
         }
      }

      var6 = d1.n5(new Object[]{d1.l6(var0, 0, var4 + 1), '…'});
      var3.n5(var6, var1).l6(var7);
      if (var7.l6() > var2.s7()) {
         var6 = t9.q0('…');
         var3.n5(var6, var1).l6(var7);
         if (var7.l6() > var2.s7()) {
            var6 = d1.n5;
         }
      }

      return var6;
   }

   private static String l6(String var0, l6 var1, y1 var2, com.aspose.slides.internal.i0e.n5 var3) {
      if (d1.n5(var0)) {
         return var0;
      }

      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("textMeasurer");
      }

      String[] var4 = d1.u9(var0, n5);
      int var5 = 0;
      int var6 = var4.length - 1;
      String var7 = d1.n5;
      f2 var8 = new f2();

      while (var6 - var5 > 1) {
         int var9 = var5 + (var6 - var5) / 2;
         var7 = d1.n5(new Object[]{n5(var4, var9 + 1, var0), '…'});
         var3.n5(var7, var1).l6(var8);
         if (var8.l6() < var2.s7()) {
            var5 = var9;
         } else {
            var6 = var9;
         }
      }

      var7 = d1.n5(new Object[]{n5(var4, var5 + 1, var0), '…'});
      var3.n5(var7, var1).l6(var8);
      if (var8.l6() > var2.s7()) {
         var7 = t9.q0('…');
         var3.n5(var7, var1).l6(var8);
         if (var8.l6() > var2.s7()) {
            var7 = d1.n5;
         }
      }

      return var7;
   }

   private static String k5(String var0, l6 var1, y1 var2, com.aspose.slides.internal.i0e.n5 var3) {
      if (d1.n5(var0)) {
         return var0;
      }

      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("textMeasurer");
      }

      f2 var4 = new f2();
      if (var0.length() < 3) {
         String var10 = t9.q0('…');
         var3.n5(var10, var1).l6(var4);
         if (var4.l6() > var2.s7()) {
            var10 = d1.n5;
         }

         return var10;
      } else {
         int var6 = 0;
         int var7 = (var0.length() - 1) / 2;

         while (var7 - var6 > 1) {
            int var8 = var6 + (var7 - var6) / 2;
            String var5 = d1.n5(new Object[]{d1.l6(var0, 0, var8 + 1), '…', d1.k5(var0, var0.length() - 1 - var8)});
            var3.n5(var5, var1).l6(var4);
            if (var4.l6() < var2.s7()) {
               var6 = var8;
            } else {
               var7 = var8;
            }
         }

         String var9 = d1.n5(new Object[]{d1.l6(var0, 0, var6 + 1), '…', d1.k5(var0, var0.length() - 1 - var6)});
         var3.n5(var9, var1).l6(var4);
         if (var4.l6() > var2.s7()) {
            var9 = t9.q0('…');
            var3.n5(var9, var1).l6(var4);
            if (var4.l6() > var2.s7()) {
               var9 = d1.n5;
            }
         }

         return var9;
      }
   }

   private static String u3(String var0, l6 var1, y1 var2, com.aspose.slides.internal.i0e.n5 var3) {
      if (d1.n5(var0)) {
         return var0;
      }

      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("textMeasurer");
      }

      int var4 = 0;
      int var5 = var0.length() - 1;
      String var6 = d1.n5;
      f2 var7 = new f2();

      while (var5 - var4 > 1) {
         int var8 = var4 + (var5 - var4) / 2;
         var6 = d1.l6(var0, 0, var8 + 1);
         var3.n5(var6, var1).l6(var7);
         if (var7.l6() < var2.s7()) {
            var4 = var8;
         } else {
            var5 = var8;
         }
      }

      var6 = d1.l6(var0, 0, var4 + 1);
      var3.n5(var6, var1).l6(var7);
      if (var7.l6() > var2.s7()) {
         var6 = d1.n5;
      }

      return var6;
   }

   private static String a6(String var0, l6 var1, y1 var2, com.aspose.slides.internal.i0e.n5 var3) {
      if (d1.n5(var0)) {
         return var0;
      }

      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var3 == null) {
         throw new ArgumentNullException("textMeasurer");
      }

      String[] var4 = d1.u9(var0, n5);
      int var5 = 0;
      int var6 = var4.length - 1;
      String var7 = d1.n5;
      f2 var8 = new f2();

      while (var6 - var5 > 1) {
         int var9 = var5 + (var6 - var5) / 2;
         var7 = n5(var4, var9 + 1, var0);
         var3.n5(var7, var1).l6(var8);
         if (var8.l6() < var2.s7()) {
            var5 = var9;
         } else {
            var6 = var9;
         }
      }

      var7 = n5(var4, var5 + 1, var0);
      var3.n5(var7, var1).l6(var8);
      if (var8.l6() > var2.s7()) {
         var7 = d1.n5;
      }

      return var7;
   }
}
