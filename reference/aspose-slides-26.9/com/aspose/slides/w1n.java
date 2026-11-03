package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class w1n {
   public static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.x1i var1, com.aspose.slides.internal.k4y.w2p var2) {
      List var3 = x4a.n5(var1, var2.l6());
      if (var3 != null) {
         com.aspose.slides.internal.k4y.a9k var4 = l6(var3);
         if (var4 == null) {
            com.aspose.slides.internal.k4y.o8n var5 = n5(var3);
            if (var5 == null) {
               return;
            }

            n5(var0, var5);
         } else {
            n5(var0, var4);
         }
      }
   }

   private static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.o8n var1) {
      var0.setUseCells(true);
      var0.n5(var1.u3().n5());
      var0.clear();
      int var2 = 0;

      for (int var3 = 0; var3 < var1.a6().length; var3++) {
         if ((var1.a6()[var3].l6() & 4294967295L) > 0L) {
            var2++;
         }
      }

      int var9 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         var9 = com.aspose.slides.ms.System.q1.n5(var9, (int)var1.a6()[var4].l6());
      }

      for (int var10 = 0; var10 < var9; var10++) {
         ChartCategory var5 = var0.n5((Object)null);

         for (int var6 = 1; var6 < var2; var6++) {
            var5.k5().n5(var6, null);
         }
      }

      for (int var11 = 0; var11 < var2; var11++) {
         for (com.aspose.slides.internal.k4y.t7d var8 : var1.a6()[var11].u3()) {
            ((ChartCategory)var0.get_Item((int)var8.n5())).k5().n5(var11, var8.l6());
         }
      }
   }

   private static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.a9k var1) {
      var0.setUseCells(true);
      var0.n5(var1.u3().n5());
      var0.clear();
      int var2 = 0;

      for (int var3 = 0; var3 < var1.a6().length; var3++) {
         if ((var1.a6()[var3].l6() & 4294967295L) > 0L) {
            var2++;
         }
      }

      int var9 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         var9 = com.aspose.slides.ms.System.q1.n5(var9, (int)var1.a6()[var4].l6());
      }

      for (int var10 = 0; var10 < var9; var10++) {
         ChartCategory var5 = var0.n5((Object)null);

         for (int var6 = 1; var6 < var2; var6++) {
            var5.k5().n5(var6, null);
         }
      }

      for (int var11 = 0; var11 < var2; var11++) {
         for (com.aspose.slides.internal.k4y.i0c var8 : var1.a6()[var11].k5()) {
            ((ChartCategory)var0.get_Item((int)var8.n5())).k5().n5(var11, var8.l6());
         }
      }

      if (((ChartCategory)var0.get_Item(0)).k5().n5() == 0) {
         ((ChartCategory)var0.get_Item(0)).k5().n5(0, null);
      }
   }

   static com.aspose.slides.internal.k4y.o8n n5(IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var0) {
      IGenericEnumerator var1 = var0.iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var2 = (com.aspose.slides.internal.k4y.g7)var1.next();
            com.aspose.slides.internal.k4y.o8n var3 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.o8n.class);
            if (var3 != null && var3.k5() == 5) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   static com.aspose.slides.internal.k4y.a9k l6(IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var0) {
      IGenericEnumerator var1 = var0.iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var2 = (com.aspose.slides.internal.k4y.g7)var1.next();
            com.aspose.slides.internal.k4y.a9k var3 = com.aspose.slides.internal.v6g.k5.n5(var2.l6(), com.aspose.slides.internal.k4y.a9k.class);
            if (var3 != null && var3.k5() == 1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.g1i var1) {
      if (var0.size() != 0) {
         if (var0.l6()) {
            l6(var0, (com.aspose.slides.internal.k4y.o8n)var1.n5("numDim").l6());
         } else {
            l6(var0, (com.aspose.slides.internal.k4y.a9k)var1.n5("strDim").l6());
         }
      }
   }

   private static void l6(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.o8n var1) {
      var1.n5(5);
      com.aspose.slides.internal.k4y.f2z var2 = new com.aspose.slides.internal.k4y.f2z();
      var2.n5(var0.a6());
      var1.n5(var2);

      for (int var3 = 0; var3 < var0.getGroupingLevelCount(); var3++) {
         com.aspose.slides.internal.k4y.w0r var4 = var1.l6();
         var4.n5(var0.size() & 4294967295L);

         for (int var5 = 0; var5 < var0.size(); var5++) {
            IChartDataCell var6 = var0.get_Item(var5).getGroupingLevels().get_Item(var3);
            if (var6 != null && var6.getValue() != null) {
               com.aspose.slides.internal.k4y.t7d var7 = var4.n5();
               var7.n5(var5 & 4294967295L);
               var7.n5(com.aspose.slides.ms.System.z3.t9(var6.getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            }
         }
      }
   }

   private static void l6(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.a9k var1) {
      var1.n5(1);
      com.aspose.slides.internal.k4y.f2z var2 = new com.aspose.slides.internal.k4y.f2z();
      var2.n5(var0.a6());
      var1.n5(var2);

      for (int var3 = 0; var3 < var0.getGroupingLevelCount(); var3++) {
         com.aspose.slides.internal.k4y.p4u var4 = var1.l6();
         var4.n5(var0.size() & 4294967295L);

         for (int var5 = 0; var5 < var0.size(); var5++) {
            IChartDataCell var6 = var0.get_Item(var5).getGroupingLevels().get_Item(var3);
            if (var6 != null && var6.getValue() != null) {
               com.aspose.slides.internal.k4y.i0c var7 = var4.n5();
               var7.n5(var5 & 4294967295L);
               var7.n5(com.aspose.slides.ms.System.z3.t9(var6.getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            }
         }
      }
   }
}
