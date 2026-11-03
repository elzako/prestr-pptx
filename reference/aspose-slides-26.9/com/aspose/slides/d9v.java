package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;

class d9v extends k3h {
   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3, t5w var4, boolean var5) {
      this.l6(var1, var2, var3);
      com.aspose.slides.internal.k4y.a8e var6 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l0u.class)) {
         var6 = (com.aspose.slides.internal.k4y.a8e)((com.aspose.slides.internal.k4y.l0u)var2).a6().l6();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l6s.class)) {
         var6 = (com.aspose.slides.internal.k4y.a8e)((com.aspose.slides.internal.k4y.l6s)var2).a6().l6();
      }

      if (var6 != null) {
         for (com.aspose.slides.internal.k4y.o8r var10 : var6.a6()) {
            ISingleCellChartValue var11 = n5(var1.getDataPoints().getOrCreateDataPointByIdx(var10.n5()), var3);
            if (!"#N/A".equals(var10.k5())) {
               if (com.aspose.slides.internal.v6g.k5.l6(var11, IDoubleChartValue.class)) {
                  ((IDoubleChartValue)var11).setAsLiteralDouble(com.aspose.slides.ms.System.z3.n3(var10.k5(), com.aspose.slides.internal.x7n.l6.k5()));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var11, IStringOrDoubleChartValue.class)) {
                  ((IStringOrDoubleChartValue)var11).setAsLiteralDouble(com.aspose.slides.ms.System.z3.n3(var10.k5(), com.aspose.slides.internal.x7n.l6.k5()));
               }
            }
         }
      } else {
         throw new NullReferenceException("DataElement couldn't be empty.");
      }
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.m3 var2) {
      throw new NotImplementedException();
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l0u.class)) {
         this.n5(var1.getDataPoints(), (com.aspose.slides.internal.k4y.a8e)((com.aspose.slides.internal.k4y.l0u)var2).n5("numLit").l6(), var3);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l6s.class)) {
            throw new Exception();
         }

         this.n5(var1.getDataPoints(), (com.aspose.slides.internal.k4y.a8e)((com.aspose.slides.internal.k4y.l6s)var2).n5("numLit").l6(), var3);
      }
   }

   private void n5(IChartDataPointCollection var1, com.aspose.slides.internal.k4y.a8e var2, int var3) {
      var2.n5("General");
      int var4 = 0;

      for (int var5 = 0; var5 < var1.size(); var5++) {
         ISingleCellChartValue var6 = n5(var1.get_Item(var5), var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var6, DoubleChartValue.class)) {
            DoubleChartValue var7 = (DoubleChartValue)var6;
            if (!DoubleChartValue.n5(var7, false, false)) {
               com.aspose.slides.internal.k4y.o8r var8 = var2.l6();
               var8.n5(var5 & 4294967295L);
               var8.l6(DoubleChartValue.n5(var7));
               var4++;
            }
         } else {
            StringOrDoubleChartValue var9 = (StringOrDoubleChartValue)var6;
            if (!StringOrDoubleChartValue.n5(var9, false)) {
               com.aspose.slides.internal.k4y.o8r var10 = var2.l6();
               var10.n5(var5 & 4294967295L);
               var10.l6(StringOrDoubleChartValue.n5(var9));
               var4++;
            }
         }
      }

      var2.n5().n5(var4 & 4294967295L);
   }
}
