package com.aspose.slides;

abstract class n5u {
   public abstract String n5(IChart var1, s8z var2);

   protected static String n5(String var0) {
      if (var0 == null) {
         return "";
      }

      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\\", "\\\\");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "|", "\\|");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\r\n", "<br>");
      var0 = com.aspose.slides.ms.System.d1.n5(var0, "\n", "<br>");
      return com.aspose.slides.ms.System.d1.n5(var0, "\r", "<br>");
   }

   protected static String n5(IChartCategory var0, IChart var1) {
      Object var2 = var0.getValue();
      if (var2 == null) {
         return "";
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, String.class)) {
         return (String)var2;
      }

      ChartCategory var3 = com.aspose.slides.internal.v6g.k5.n5(var0, ChartCategory.class);
      String var4 = var3 != null && var3.n5() != null && !com.aspose.slides.ms.System.d1.n5(var3.l6())
         ? var3.l6()
         : var1.getAxes().getHorizontalAxis().getNumberFormat();
      return !com.aspose.slides.ms.System.d1.n5(var4) && !"General".equals(var4)
         ? f6z.n5(var2, var4, false)
         : com.aspose.slides.ms.System.z3.t9(var2, com.aspose.slides.internal.x7n.l6.k5());
   }
}
