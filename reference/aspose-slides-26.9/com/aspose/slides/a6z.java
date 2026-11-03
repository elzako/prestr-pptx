package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class a6z {
   public static void n5(IDataLabel var0, com.aspose.slides.internal.k4y.l9a var1, t5w var2) {
      if (var1 != null) {
         l6(var0, var1, var2);
         if (var1.y2() != null && ((com.aspose.slides.internal.k4y.c8q)var1.y2().l6()).n5()) {
            var0.hide();
         }

         DataLabelFormat var3 = (DataLabelFormat)var0.getDataLabelFormat();
         if (var1.t4() != null) {
            var3.setNumberFormat(var1.t4().n5());
            var3.setNumberFormatLinkedToSource(var1.t4().l6() == 1);
         }

         if (var1.q0() != null) {
            if (var1.q0().u9() != null) {
               e4c var4 = new e4c();
               e4c var5 = new e4c();
               x4t var6 = new x4t();
               e4c[] var7 = new e4c[]{var4};
               e4c[] var8 = new e4c[]{var5};
               x4t[] var9 = new x4t[]{var6};
               z5b.n5(var1.q0().u9(), var7, var8, var9);
               var7[0].l6(var4);
               var8[0].l6(var5);
               var9[0].n5(var6);
               if (!com.aspose.slides.ms.System.d2.k5(var4.n5)
                  && !com.aspose.slides.ms.System.d2.k5(var4.l6)
                  && !com.aspose.slides.ms.System.d2.k5(var5.n5)
                  && !com.aspose.slides.ms.System.d2.k5(var5.l6)) {
                  if (com.aspose.slides.ms.System.n1.k5(var0.getX())) {
                     var0.setX((float)var4.n5);
                  }

                  if (com.aspose.slides.ms.System.n1.k5(var0.getY())) {
                     var0.setY((float)var4.l6);
                  }

                  if (com.aspose.slides.ms.System.n1.k5(var0.getWidth())) {
                     var0.setWidth((float)var5.n5);
                  }

                  if (com.aspose.slides.ms.System.n1.k5(var0.getHeight())) {
                     var0.setHeight((float)var5.l6);
                  }
               }
            }

            k5r.n5(var3.getFormat(), var1.q0(), var2);
            if (var1.q0().c8() == null && var1.q0().t2() == null && var1.q0().s7() == null && var1.q0().x8() == null && var1.q0().y4() == null) {
               var3.l6(true);
            }
         }

         com.aspose.slides.ms.System.o5 var10 = n5(var0, var1).k5();
         if (var10.l6()) {
            var3.n5(((Integer)var10.n5()).intValue());
         }

         if (!var10.l6()) {
            int var11 = var3.a6();
            if (var11 == 2 || var11 == 6 && !var3.getShowLeaderLines()) {
               var3.n5(1);
            }
         }

         if (var1.k7() != null) {
            var3.setShowLegendKey(var1.k7().n5());
         }

         if (var1.m3() != null) {
            boolean var12 = var3.getShowValue();
            var3.setShowValue(var1.m3().n5());
            if (var3.u3() && !var12 && var3.getShowValue() && w8d.l6(((DataLabel)var0).c8().getNumberFormatOfValues())) {
               var3.setNumberFormat(((DataLabel)var0).c8().getNumberFormatOfValues());
            }
         }

         if (var1.z8() != null) {
            var3.setShowCategoryName(var1.z8().n5());
         }

         if (var1.j5() != null) {
            var3.setShowSeriesName(var1.j5().n5());
         }

         if (var1.w1() != null) {
            var3.setShowPercentage(var1.w1().n5());
         }

         if (var1.r4() != null) {
            var3.setShowBubbleSize(var1.r4().n5());
         }

         if (var1.c4() != null) {
            var3.setSeparator(var1.c4());
         }
      }
   }

   private static void l6(IDataLabel var0, com.aspose.slides.internal.k4y.l9a var1, t5w var2) {
      n6d var3 = ((DataLabel)var0).l6();
      com.aspose.slides.internal.k4y.c4z var4 = new com.aspose.slides.internal.k4y.c4z(var1.y1());
      if (var1.t9() != null) {
         c4f.n5(var3, var4.u3());
         c4f.n5(var3, var1.t9());
      }

      w5s.n5(var0, var1.z1(), var1.z3(), var2);
      var3.n5(var4.h0().toArray(new com.aspose.slides.internal.k4y.z6y[0]));
      if (var4.c8() != null) {
         if (var4.n5(var4.c8())) {
            var0.getDataLabelFormat().setShowLabelAsDataCallout(false);
         } else if (var4.k5() != null) {
            var0.getDataLabelFormat().setShowLabelAsDataCallout(true);
            n5v.n5(((DataLabel)var0).t2(), var4.k5(), var2);
         }
      } else {
         var0.getDataLabelFormat().setShowLabelAsDataCallout(false);
      }

      if (var4.u3() != null) {
         c4f.n5(var3, var4.u3());
      }

      if (var4.a6() != null) {
         var3.n5(var4.a6());
      }

      if (var4.u9() != null && var4.u9().n5()) {
         var0.getDataLabelFormat().setShowLabelValueFromCell(true);
      } else {
         var0.getDataLabelFormat().setShowLabelValueFromCell(false);
      }
   }

   public static void n5(IDataLabel var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l9a> var1, long var2, IDataLabelFormat var4, g6c var5) {
      if (n5(var0, var4)) {
         com.aspose.slides.internal.k4y.l9a var6 = (com.aspose.slides.internal.k4y.l9a)var1.invoke();
         n6d var7 = ((DataLabel)var0).l6();
         var6.e2().n5(var2);
         IDataLabelCollection var8 = com.aspose.slides.internal.v6g.k5.n5(var0, DataLabel.class).c8().getLabels();
         if (!((DataLabelFormat)var0.getDataLabelFormat()).u3() && !com.aspose.slides.ms.System.d1.n5(var0.getDataLabelFormat().getNumberFormat())) {
            var6.k5().n5(var0.getDataLabelFormat().getNumberFormat());
            var6.t4().n5((byte)(var0.getDataLabelFormat().isNumberFormatLinkedToSource() ? 1 : 0));
            if (!y4k.n5(var0.getTextFormat()) && !y4k.n5(var0)) {
               y4k.n5(var8.getDefaultDataLabelFormat().getTextFormat(), new a6z$1(var6), var5);
            }
         }

         k5r.n5(var0.getDataLabelFormat().getFormat(), new a6z$2(var6), var5, var0, false);
         if (var6.q0() == null && ((DataLabelFormat)var0.getDataLabelFormat()).h0()) {
            var6.u3();
         }

         if (var0.getDataLabelFormat().getPosition() != -1) {
            var6.u9().n5(var0.getDataLabelFormat().getPosition());
         }

         var6.h0().n5(var0.getDataLabelFormat().getShowLegendKey());
         var6.c8().n5(var0.getDataLabelFormat().getShowValue());
         var6.t2().n5(var0.getDataLabelFormat().getShowCategoryName());
         var6.s7().n5(var0.getDataLabelFormat().getShowSeriesName());
         var6.x8().n5(var0.getDataLabelFormat().getShowPercentage());
         var6.n3().n5(var0.getDataLabelFormat().getShowBubbleSize());
         if (!"".equals(var0.getDataLabelFormat().getSeparator())) {
            var6.l6(var0.getDataLabelFormat().getSeparator());
         }

         c4f.n5(var7, new a6z$3(var6));
         if (((DataLabel)var0).h0() != null) {
            IGenericEnumerator var9 = var0.getTextFrameForOverriding().getParagraphs().iterator();

            try {
               while (var9.hasNext()) {
                  IParagraph var10 = (IParagraph)var9.next();
                  ((ParagraphFormat)var10.getParagraphFormat()).t2().n5(true);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }

         w5s.n5(var0, new a6z$4(var6), new a6z$5(var6), var5);
         if (var6.t4() == null && var6.q0() == null && var6.m1() == null && var6.c4() == null && var6.t9() == null && var6.z1() == null && !var0.isVisible()) {
            var6.n5("delete");
            var6.n5((com.aspose.slides.internal.k4y.c8q)null);
            var6.l6((com.aspose.slides.internal.k4y.c8q)null);
            var6.k5(null);
            var6.u3(null);
            var6.a6(null);
            var6.u9(null);
         }

         if (var6.y1() == null) {
            var6.y4();
         }

         boolean var14 = !com.aspose.slides.ms.System.n1.k5(var0.getWidth()) && !com.aspose.slides.ms.System.n1.k5(var0.getHeight());
         com.aspose.slides.internal.k4y.b9y var15 = null;
         if (var8.getDefaultDataLabelFormat().getShowLabelAsDataCallout() != var0.getDataLabelFormat().getShowLabelAsDataCallout()) {
            if (var0.getDataLabelFormat().getShowLabelAsDataCallout()) {
               var15 = new com.aspose.slides.internal.k4y.b9y();
               n5v.n5(((DataLabel)var0).t2(), var15, var5);
            }

            if (var6.z3() == null) {
               y4k.l6(var8.getDefaultDataLabelFormat().getTextFormat(), new a6z$6(var6), var5);
            }
         }

         com.aspose.slides.internal.k4y.c4z var11 = new com.aspose.slides.internal.k4y.c4z(null);
         var11.n5(var0, var15, var14, var7.k5(), com.aspose.slides.internal.v6g.k5.n5(var0, DataLabel.class).l6().n5(), var6.y1());
      }
   }

   static boolean n5(IDataLabel var0, IDataLabelFormat var1) {
      boolean var2 = false;
      DataLabel var3 = (DataLabel)var0;
      n6d var4 = var3.k5();
      DataLabelFormat var5 = (DataLabelFormat)var0.getDataLabelFormat();
      PVIObject var6 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataLabelFormat(), PVIObject.class);
      if (var6.z3()) {
         var2 = n5(var5, var1);
      }

      return var2
         || var4 != null && c4f.n5(var4)
         || var4 != null && var4.k5() != null
         || var5.u9() != null && y4k.n5(var5.u9()) && !y4k.n5(var5.u9().getPortionFormat(), var1.getTextFormat().getPortionFormat())
         || var3.h0() != null && w5s.n5(var3.h0());
   }

   private static boolean n5(DataLabelFormat var0, IDataLabelFormat var1) {
      return !var0.getFormat().getEffect().equals(var1.getFormat().getEffect())
         || !var0.getFormat().getEffect3D().equals(var1.getFormat().getEffect3D())
         || !var0.getFormat().getFill().equals(var1.getFormat().getFill())
         || !var0.getFormat().getLine().equals(var1.getFormat().getLine())
         || var0.isNumberFormatLinkedToSource() != var1.isNumberFormatLinkedToSource()
         || !com.aspose.slides.ms.System.d1.a6(var0.getNumberFormat(), var1.getNumberFormat())
         || var0.getPosition() != var1.getPosition()
         || !com.aspose.slides.ms.System.d1.a6(var0.getSeparator(), var1.getSeparator())
         || var0.getShowBubbleSize() != var1.getShowBubbleSize()
         || var0.getShowCategoryName() != var1.getShowCategoryName()
         || var0.getShowLegendKey() != var1.getShowLegendKey()
         || var0.getShowPercentage() != var1.getShowPercentage()
         || var0.getShowSeriesName() != var1.getShowSeriesName()
         || var0.getShowValue() != var1.getShowValue()
         || var0.getShowLabelAsDataCallout() != var1.getShowLabelAsDataCallout()
         || var0.getShowLabelValueFromCell() != var1.getShowLabelValueFromCell();
   }

   private static com.aspose.slides.ms.System.o5<Integer> n5(IDataLabel var0, com.aspose.slides.internal.k4y.l9a var1) {
      if (var0 == null) {
         throw new ArgumentNullException("dataLabel");
      } else if (var1 == null) {
         throw new ArgumentNullException("dLblElementData");
      } else if (var1.m1() != null) {
         return new com.aspose.slides.ms.System.o5<>(var1.m1().n5());
      } else if (ChartTypeCharacterizer.is3DChart(var0.getChart().getType())) {
         return new com.aspose.slides.ms.System.o5<>();
      } else if (ChartTypeCharacterizer.u3(var0.getChart().getType())) {
         return new com.aspose.slides.ms.System.o5<>();
      } else if (var1.t9() == null) {
         return new com.aspose.slides.ms.System.o5<>();
      } else if (var1.t9().l6() == null) {
         return new com.aspose.slides.ms.System.o5<>();
      } else if (var1.t9().l6().x8() == null) {
         return new com.aspose.slides.ms.System.o5<>();
      } else {
         return var1.t9().l6().n3() == null ? new com.aspose.slides.ms.System.o5<>() : new com.aspose.slides.ms.System.o5<>(-1);
      }
   }
}
