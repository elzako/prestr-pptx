package com.aspose.slides.internal.d5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.Collections.Generic.Stack$Enumerator;
import com.aspose.slides.internal.a0.k7;
import com.aspose.slides.internal.t1.t2;
import com.aspose.slides.ms.System.IDisposable;

public class k5 {
   public static void n5(t2 var0) {
      List var1 = n5(var0.n5(new Stack<>()));
      n5(var1);
   }

   public static void n5(k7 var0) {
      List var1 = n5(var0.m3(), new List<>());

      for (int var2 = 0; var2 < var1.size(); var2++) {
         a6 var3 = (a6)var1.get_Item(var2);
         if (var3.u3() && var3.l6() == -1) {
            int[] var4 = var3.k5();
            if (var4 != null) {
               for (int var5 = 0; var5 < var4.length; var5++) {
                  var4[var5] = 0;
               }

               var3.n5(var4);
            }
         }
      }

      var1 = l6(var1);
      int[] var8 = n5(var1, (int[])null);
      int var9 = var8[0];
      int var10 = var8[1];
      if (var10 > 0) {
         int var11 = var10;

         for (int var6 = (var9 & 1) == 0 ? var9 + 1 : var9; var11 >= var6; var11--) {
            var1 = n5(var1, var11);
         }
      }

      boolean var12 = true;
      n5(var1, var12);
      n5(var0, k5(var1));
   }

   private static void n5(List<u3> var0) {
      com.aspose.slides.internal.r4.u3 var1 = new com.aspose.slides.internal.r4.u3(var0);

      while (var1.l6()) {
         u3 var2 = (u3)var1.k5();
         var2.k5();
      }
   }

   private static List<a6> n5(List<com.aspose.slides.internal.d2.c8> var0, List<a6> var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var0);

      while (var2.l6()) {
         com.aspose.slides.internal.d2.c8 var3 = (com.aspose.slides.internal.d2.c8)var2.k5();
         var1 = var3.l6(var1);
      }

      return var1;
   }

   private static List<a6> l6(List<a6> var0) {
      List var1 = new List();
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var0);

      while (var2.l6()) {
         a6 var3 = (a6)var2.k5();
         if (var3.u3()) {
            var1.addItem(var3);
         } else {
            var1.addRange(var3.a6());
         }
      }

      if (!var1.equals(var0)) {
         var0 = var1;
      }

      return var0;
   }

   private static int[] n5(List<a6> var0, int[] var1) {
      if (var1 == null) {
         var1 = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
      }

      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var0);

      while (var2.l6()) {
         a6 var3 = (a6)var2.k5();
         var3.l6(var1);
      }

      return var1;
   }

   private static List<a6> n5(List<a6> var0, int var1) {
      List var2 = new List();
      int var3 = 0;

      for (int var4 = var0.size(); var3 < var4; var3++) {
         a6 var5 = (a6)var0.get_Item(var3);
         if (var5.l6() < var1) {
            var2.addItem(var5);
         } else {
            int var6 = var3;

            int var7;
            for (var7 = var6; var7 < var4; var7++) {
               a6 var8 = (a6)var0.get_Item(var7);
               if (var8.l6() < var1) {
                  break;
               }
            }

            if (var6 < var7) {
               var2.addRange(n5(var0, var6, var7));
            }

            var3 = var7 - 1;
         }
      }

      if (!var2.equals(var0)) {
         var0 = var2;
      }

      return var0;
   }

   private static List<a6> n5(List<a6> var0, int var1, int var2) {
      int var3 = var2 - var1;
      List var4 = new List(var3);
      if (var3 > 0) {
         for (int var5 = 0; var5 < var3; var5++) {
            int var6 = var3 - var5 - 1;
            a6 var7 = (a6)var0.get_Item(var1 + var6);
            var7.h0();
            var4.addItem(var7);
         }
      }

      return var4;
   }

   private static void n5(List<a6> var0, boolean var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var0);

      while (var2.l6()) {
         a6 var3 = (a6)var2.k5();
         var3.n5(var1);
      }
   }

   private static List<a6> k5(List<a6> var0) {
      return var0;
   }

   private static void n5(k7 var0, List<a6> var1) {
      List var2 = var1.convertAll(new k5$1());
      var0.l6(u3(var2));
   }

   private static List<com.aspose.slides.internal.d2.c8> u3(List<com.aspose.slides.internal.d2.c8> var0) {
      return new h0(var0).n5();
   }

   private static List<u3> n5(Stack<u3> var0) {
      List var1 = new List();
      Stack$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            u3 var3 = (u3)var2.next();
            if (!var3.l6()) {
               var1.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
