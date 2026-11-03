package com.aspose.slides;

class n4m {
   public static void n5(IDataLabel var0, com.aspose.slides.internal.k4y.s7m var1, t5w var2) {
      if (var1 != null) {
         com.aspose.slides.internal.v6g.k5.n5(var0, DataLabel.class).l6().n5(var1.n3());
         if (var1.h0() != null) {
            var0.getDataLabelFormat().setNumberFormat(var1.h0().n5());
            var0.getDataLabelFormat().setNumberFormatLinkedToSource(var1.h0().l6() == 1);
         }

         if (var1.s7() != null) {
            var0.getDataLabelFormat().setShowCategoryName(var1.s7().l6() == 1);
            var0.getDataLabelFormat().setShowSeriesName(var1.s7().n5() == 1);
            var0.getDataLabelFormat().setShowValue(var1.s7().k5() == 1);
         }

         switch (var1.u9()) {
            case 0:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(-1);
               break;
            case 1:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(1);
               break;
            case 2:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(0);
               break;
            case 3:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(2);
               break;
            case 4:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(3);
               break;
            case 5:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(4);
               break;
            case 6:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(5);
               break;
            case 7:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(6);
               break;
            case 8:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(7);
               break;
            case 9:
               ((DataLabelFormat)var0.getDataLabelFormat()).n5(8);
         }

         if (var1.x8() != null) {
            ((DataLabelFormat)var0.getDataLabelFormat()).setSeparator(var1.x8());
         }

         if (var1.c8() != null) {
            k5r.n5(var0.getDataLabelFormat().getFormat(), var1.c8(), var2);
         }

         if (var1.t2() != null) {
            y4k.n5(var0.getDataLabelFormat().getTextFormat(), var1.t2(), var2);
         }
      }
   }

   public static void n5(IDataLabel var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.s7m> var1, long var2, IDataLabelFormat var4, g6c var5) {
      if (a6z.n5(var0, var4)) {
         com.aspose.slides.internal.k4y.s7m var6 = (com.aspose.slides.internal.k4y.s7m)var1.invoke();
         n6d var7 = ((DataLabel)var0).l6();
         var6.n5(var2);
         if (y4k.n5(var0.getTextFormat())) {
            y4k.n5(var0.getDataLabelFormat().getTextFormat(), new n4m$1(var6), var5);
         }

         k5r.n5(var0.getDataLabelFormat().getFormat(), new n4m$2(var6), var5, null, false);
         if (var0.getDataLabelFormat().getPosition() != -1) {
            switch (var0.getDataLabelFormat().getPosition()) {
               case 0:
                  var6.n5(2);
                  break;
               case 1:
                  var6.n5(1);
                  break;
               case 2:
                  var6.n5(3);
                  break;
               case 3:
                  var6.n5(4);
                  break;
               case 4:
                  var6.n5(5);
                  break;
               case 5:
                  var6.n5(6);
                  break;
               case 6:
                  var6.n5(7);
                  break;
               case 7:
                  var6.n5(8);
                  break;
               case 8:
                  var6.n5(9);
            }
         }

         com.aspose.slides.internal.k4y.e5k var8 = var6.u3();
         var8.l6((byte)(var0.getDataLabelFormat().getShowCategoryName() ? 1 : 0));
         var8.n5((byte)(var0.getDataLabelFormat().getShowSeriesName() ? 1 : 0));
         var8.k5((byte)(var0.getDataLabelFormat().getShowValue() ? 1 : 0));
         if (!"".equals(var0.getDataLabelFormat().getNumberFormat())) {
            com.aspose.slides.internal.k4y.n9v var9 = var6.n5();
            var9.n5(var0.getDataLabelFormat().getNumberFormat());
            var9.n5((byte)(var0.getDataLabelFormat().isNumberFormatLinkedToSource() ? 1 : 0));
         }

         if (!"".equals(var0.getDataLabelFormat().getSeparator())) {
            var6.n5(var0.getDataLabelFormat().getSeparator());
         }

         if (var7.l6() != null) {
            var6.n5(var7.l6());
         }
      }
   }
}
