package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class d1w {
   public static MathMatrix n5(com.aspose.slides.internal.k4y.e8a var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      int var2 = var0.k5().length;
      int var3 = 1;
      List var4 = new List();
      if (var0.l6() != null) {
         com.aspose.slides.internal.k4y.l3t var5 = var0.l6();
         if (var5.t2() != null) {
            var3 = 0;
            com.aspose.slides.internal.k4y.l5w var6 = var5.t2();
            com.aspose.slides.internal.k4y.d8r[] var7 = var6.l6();

            for (com.aspose.slides.internal.k4y.d8r var11 : var7) {
               if (var11.l6() != null && var11.l6().n5() != null) {
                  byte var12 = var11.l6().n5().n5();
                  int var13 = var11.l6().l6() != null ? w2p.t2(var11.l6().l6().n5()) : 2;
                  var3 += var12 & 255;

                  for (int var14 = 0; var14 < (var12 & 255); var14++) {
                     var4.addItem(var13);
                  }
               } else {
                  var3++;
                  var4.addItem(2);
               }
            }
         }
      }

      MathMatrix var20 = new MathMatrix(var2, var3);
      int var21 = 0;
      List$Enumerator var22 = var4.iterator();

      try {
         while (var22.hasNext()) {
            int var23 = com.aspose.slides.internal.v6g.k5.u3(var22.next(), int.class);
            var20.setColumnAlignment(var21++, var23);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      if (var0.l6() != null) {
         com.aspose.slides.internal.k4y.l3t var24 = var0.l6();
         if (var24.l6() != null) {
            var20.setBaseJustification(w2p.h0(var24.l6().n5()));
         }

         if (var24.k5() != null) {
            var20.setHidePlaceholders(o5b.n5(var24.k5()));
         }

         if (var24.u3() != null) {
            var20.setRowGapRule(var24.u3().n5() & 255);
         }

         if (var24.u9() != null) {
            var20.setRowGap(var24.u9().n5());
         }

         if (var24.a6() != null) {
            var20.setColumnGapRule(var24.a6().n5() & 255);
         }

         if (var24.c8() != null) {
            var20.setColumnGap(var24.c8().n5());
         }

         if (var24.h0() != null) {
            var20.setMinColumnWidth(var24.h0().n5());
         }

         l0u.n5(var20.n5, var24.s7(), var1);
      }

      int var25 = 0;

      for (com.aspose.slides.internal.k4y.k6w var29 : var0.k5()) {
         int var30 = 0;

         for (com.aspose.slides.internal.k4y.s0m var17 : var29.l6()) {
            var20.set_Item(var25, var30, b6l.n5(var17, var1));
            var30++;
         }

         var25++;
      }

      return var20;
   }

   public static void n5(MathMatrix var0, com.aspose.slides.internal.k4y.e8a var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("matrix");
      }

      if (var1 == null) {
         throw new ArgumentNullException("elementData");
      }

      com.aspose.slides.internal.k4y.l3t var3 = new com.aspose.slides.internal.k4y.l3t();
      var1.n5(var3);
      com.aspose.slides.internal.k4y.l5w var4 = new com.aspose.slides.internal.k4y.l5w();
      var3.n5(var4);
      int var5 = 0;

      while (var5 < var0.getColumnCount()) {
         int var6 = var0.getColumnAlignment(var5++);
         int var7 = 1;

         while (var5 < var0.getColumnCount() && var0.getColumnAlignment(var5) == var6) {
            var7++;
            var5++;
         }

         com.aspose.slides.internal.k4y.d8r var8 = var4.n5();
         com.aspose.slides.internal.k4y.o9d var9 = var8.n5();
         com.aspose.slides.internal.k4y.f6p var10 = new com.aspose.slides.internal.k4y.f6p();
         var10.n5((byte)var7);
         var9.n5(var10);
         com.aspose.slides.internal.k4y.y6e var11 = new com.aspose.slides.internal.k4y.y6e();
         var11.n5(w2p.s7(var6));
         var9.n5(var11);
      }

      MathMatrix var13 = new MathMatrix(1, 1);
      if (var0.getBaseJustification() != var13.getBaseJustification()) {
         com.aspose.slides.internal.k4y.r3n var14 = new com.aspose.slides.internal.k4y.r3n();
         var14.n5(w2p.c8(var0.getBaseJustification()));
         var3.n5(var14);
      }

      if (var0.getHidePlaceholders() != var13.getHidePlaceholders()) {
         var3.n5(o5b.n5(var0.getHidePlaceholders()));
      }

      if (var0.getRowGapRule() != var13.getRowGapRule()) {
         com.aspose.slides.internal.k4y.q6z var15 = new com.aspose.slides.internal.k4y.q6z();
         var15.n5((byte)var0.getRowGapRule());
         var3.n5(var15);
      }

      if ((var0.getRowGap() & 4294967295L) != (var13.getRowGap() & 4294967295L)) {
         com.aspose.slides.internal.k4y.i6m var16 = new com.aspose.slides.internal.k4y.i6m();
         var16.n5(var0.getRowGap());
         var3.n5(var16);
      }

      if (var0.getColumnGapRule() != var13.getColumnGapRule()) {
         com.aspose.slides.internal.k4y.q6z var17 = new com.aspose.slides.internal.k4y.q6z();
         var17.n5((byte)var0.getColumnGapRule());
         var3.l6(var17);
      }

      if ((var0.getColumnGap() & 4294967295L) != (var13.getColumnGap() & 4294967295L)) {
         com.aspose.slides.internal.k4y.i6m var18 = new com.aspose.slides.internal.k4y.i6m();
         var18.n5(var0.getColumnGap());
         var3.k5(var18);
      }

      if ((var0.getMinColumnWidth() & 4294967295L) != (var13.getMinColumnWidth() & 4294967295L)) {
         com.aspose.slides.internal.k4y.i6m var19 = new com.aspose.slides.internal.k4y.i6m();
         var19.n5(var0.getMinColumnWidth());
         var3.l6(var19);
      }

      l0u.n5(var0.n5, new d1w$1(var3), var2);

      for (int var20 = 0; var20 < var0.getRowCount(); var20++) {
         com.aspose.slides.internal.k4y.k6w var21 = var1.n5();

         for (int var12 = 0; var12 < var0.getColumnCount(); var12++) {
            com.aspose.slides.internal.k4y.s0m var22 = var21.n5();
            b6l.n5(var22, m0g.l6(var0.get_Item(var20, var12)), var2);
         }
      }
   }
}
