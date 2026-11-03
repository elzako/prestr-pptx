package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class r1g extends n5u {
   @Override
   public String n5(IChart var1, s8z var2) {
      String var3 = var2.k5();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5(com.aspose.slides.ms.System.d1.n5("### {0} chart{1}",new Object[]{ com.aspose.slides.ms.System.s3.n5(ChartType.class, var1.getType()), var3}));
      if (var1.hasTitle() && var1.getChartTitle() != null && var1.getChartTitle().getTextFrameForOverriding() != null) {
         String var5 = var1.getChartTitle().getTextFrameForOverriding().getText();
         var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Chart title: ", n5(var5), var3}));
      }

      IChartCategoryCollection var19 = var1.getChartData().getCategories();
      IChartSeriesCollection var6 = var1.getChartData().getSeries();
      IChartDataPointCollection var7 = var6.size() > 0 ? var6.get_Item(0).getDataPoints() : null;
      int var8 = var19.getGroupingLevelCount();
      List var9 = new List();
      String[] var10 = new String[0];

      for (int var11 = 0; var11 < var19.size(); var11++) {
         IChartCategory var12 = var19.get_Item(var11);
         IChartCategoryLevelsManager var13 = var12.getGroupingLevels();
         int var14 = var8 - 1;
         if (var14 < 0) {
            var14 = 0;
         }

         String[] var15 = new String[var14];

         for (int var16 = 1; var16 <= var14; var16++) {
            String var17 = n5(var13, var16);
            int var18 = var14 - var16;
            if (!com.aspose.slides.ms.System.d1.n5(var17)) {
               var15[var18] = var17;
            } else if (var18 < var10.length - 1) {
               var15[var18] = var10[var18];
            } else {
               var15[var18] = "";
            }
         }

         String var26 = n5(var13, 0);
         if (com.aspose.slides.ms.System.d1.n5(var26)) {
            var26 = com.aspose.slides.ms.System.z3.t9(var12.getValue(), com.aspose.slides.internal.x7n.l6.k5());
         }

         String[] var28 = new String[var15.length + 1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var15)), com.aspose.slides.ms.System.u3.n5((Object)(var28)), var15.length);
         var28[var28.length - 1] = var26;
         var9.addItem(var28);
         var10 = var28;
      }

      String[] var20 = new String[0];

      for (int var21 = 0; var21 < var9.size(); var21++) {
         String[] var22 = (String[])var9.get_Item(var21);

         for (int var23 = 0; var23 < var22.length - 1; var23++) {
            if (!n5(var20, var22, var23)) {
               var4.n5(n5(var23));
               var4.n5("- ");
               var4.n5(n5(var22[var23]));
               var4.n5(var3);
            }
         }

         int var24 = var22.length - 1;
         String var25 = "";
         if (var7 != null && var21 < var7.size()) {
            IChartDataPoint var27 = var7.get_Item(var21);
            if (var27 != null && var27.getValue() != null && var27.getSizeValue().getData() != null) {
               var25 = com.aspose.slides.ms.System.z3.t9(var27.getSizeValue().getData(), com.aspose.slides.internal.x7n.l6.k5());
            }
         }

         var4.n5(n5(var24));
         var4.n5("- ");
         var4.n5(n5(var22[var24]));
         var4.n5(": ");
         var4.n5(n5(var25));
         var4.n5(var3);
         var20 = var22;
      }

      return var4.toString();
   }

   private static boolean n5(String[] var0, String[] var1, int var2) {
      for (int var3 = 0; var3 <= var2; var3++) {
         if (var3 >= var0.length || var3 >= var1.length) {
            return false;
         }

         if (!com.aspose.slides.ms.System.d1.u3(var0[var3], var1[var3], (short)4)) {
            return false;
         }
      }

      return true;
   }

   private static String n5(int var0) {
      return com.aspose.slides.ms.System.d1.n5(' ', var0 * 2);
   }

   private static String n5(IChartCategoryLevelsManager var0, int var1) {
      if (var0 == null) {
         return "";
      }

      IChartDataCell var2 = var0.get_Item(var1);
      return var2 != null && var2.getValue() != null ? com.aspose.slides.ms.System.z3.t9(var2.getValue(), com.aspose.slides.internal.x7n.l6.k5()) : "";
   }
}
