package com.aspose.slides;

class e4u {
   public static String n5(IShape var0, d9r var1) {
      if (n5(var0)) {
         return null;
      }

      IGroupShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, IGroupShape.class);
      if (var2 != null) {
         switch (var1.k5.getExportType()) {
            case 2:
               return u2p.n5(var0, var1.n5, var1.l6);
            default:
               return n2q.n5(var2, var1);
         }
      } else {
         String var3 = l6(var0, var1);
         return com.aspose.slides.ms.System.d1.n5(var3) ? var3 : var1.l6.h0(var3);
      }
   }

   private static String l6(IShape var0, d9r var1) {
      IVideoFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0, IVideoFrame.class);
      String var3 = null;
      if (var2 != null && !com.aspose.slides.ms.System.d1.n5(var2.getLinkPathLong())) {
         var3 = i4y.n5(var2, var1.l6);
         if (var3 != null) {
            return var3;
         }
      }

      IAudioFrame var4 = com.aspose.slides.internal.v6g.k5.n5(var0, IAudioFrame.class);
      if (var4 != null && !com.aspose.slides.ms.System.d1.n5(var4.getLinkPathLong())) {
         var3 = i4y.n5(var4, var1.l6);
         if (var3 != null) {
            return var3;
         }
      }

      IPictureFrame var5 = com.aspose.slides.internal.v6g.k5.n5(var0, IPictureFrame.class);
      if (var5 != null && var1.k5.getExportType() != 1) {
         IPPImage var6 = u2p.n5(var5.getPictureFormat());
         if (var6 != null) {
            var3 = u2p.n5(var6, var1.n5, var1.l6, var5.getAlternativeText());
         }

         if (var3 != null) {
            return var3;
         }
      }

      IAutoShape var12 = com.aspose.slides.internal.v6g.k5.n5(var0, IAutoShape.class);
      if (var12 != null) {
         var3 = u5.n5(var12, var1);
         if (var3 != null) {
            return var3;
         }
      }

      if (var1.l6.n5(1)) {
         ITable var7 = com.aspose.slides.internal.v6g.k5.n5(var0, ITable.class);
         if (var7 != null) {
            var3 = u6e.n5(var7, var1.l6);
            if (var3 != null) {
               return var3;
            }
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, IChart.class) && var1.k5.getExportType() == 1) {
         IChart var14 = (IChart)var0;
         n5u var8 = b8c.n5(var14.getChartData().getSeries().get_Item(0).getType());
         return var8 == null
            ? com.aspose.slides.ms.System.d1.n5("### {0} chart", new Object[]{com.aspose.slides.ms.System.s3.n5(ChartType.class, var14.getType())})
            : var8.n5(var14, var1.l6);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, ISmartArt.class) && var1.k5.getExportType() == 1) {
         ISmartArt var13 = (ISmartArt)var0;
         var3 = h1i.n5(var13, var1);
         if (var3 != null) {
            return var3;
         }
      }

      return var1.k5.getExportType() == 1 ? null : u2p.n5(var0, var1.n5, var1.l6);
   }

   private static boolean n5(IShape var0) {
      GeometryShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, GeometryShape.class);
      if (var1 != null && var1.getShapeType() == -1) {
         AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
         if (var2 == null) {
            return true;
         }

         TextFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getTextFrame(), TextFrame.class);
         return var3 == null || com.aspose.slides.ms.System.d1.n5(var3.getText());
      } else {
         return false;
      }
   }
}
