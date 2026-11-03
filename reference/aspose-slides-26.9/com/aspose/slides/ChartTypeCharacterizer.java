package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class ChartTypeCharacterizer {
   static int n5(int var0) {
      switch (var0) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 9:
         case 11:
         case 12:
         case 13:
         case 15:
         case 16:
         case 17:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 47:
         case 48:
         case 49:
         case 51:
         case 52:
         case 58:
         case 59:
         case 60:
         case 61:
            return 2;
         case 6:
         case 10:
         case 14:
         case 18:
         case 25:
         case 50:
         case 62:
         case 63:
         case 64:
         case 65:
            return 6;
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 66:
         case 67:
         case 74:
         case 75:
         case 81:
            return 0;
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
            return 4;
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 68:
         case 69:
            return 5;
         case 70:
         case 71:
         case 72:
            return 3;
         case 73:
         default:
            throw new IndexOutOfRangeException();
         case 76:
         case 78:
         case 79:
            return 7;
         case 77:
            return 8;
         case 80:
            return 1;
      }
   }

   static int l6(int var0) {
      switch (var0) {
         case 76:
            return 0;
         case 77:
         case 78:
         default:
            return 150;
         case 79:
            return 50;
         case 80:
            return 6;
      }
   }

   static String k5(int var0) {
      switch (var0) {
         case 0:
            return "both Horizontal and Vertical axes are not needed (Series axis also not needed)";
         case 1:
         default:
            throw new ArgumentOutOfRangeException("compositionType");
         case 2:
            return "Horizontal axis - Category, Vertical axis - Value, Series axis - not needed";
         case 3:
            return "Horizontal axis - Radar Category, Vertical axis - Radar Value, Series axis - not needed";
         case 4:
            return "Horizontal axis - Value, Vertical axis - Category, Series axis - not needed";
         case 5:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"Horizontal axis - Value or Category, Vertical axis - Value or Category, ", "Series axis - not needed"});
         case 6:
            return "Horizontal axis - Value, Vertical axis - Category, Series axis - is needed";
      }
   }

   static boolean u3(int var0) {
      switch (var0) {
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
            return true;
         default:
            return false;
      }
   }

   public static boolean isBar3DChart(int chartType) {
      switch (chartType) {
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
            return true;
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 34:
         case 35:
         default:
            return false;
      }
   }

   public static boolean is2DChart(int chartType) {
      int var1 = x8(chartType);
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 52:
         case 53:
         case 55:
         case 56:
         case 57:
         case 58:
         case 60:
            return true;
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 54:
         case 59:
         default:
            return false;
      }
   }

   public static boolean is3DChart(int chartType) {
      if (chartType == 73) {
         return false;
      }

      int var1 = x8(chartType);
      switch (var1) {
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeColumn(int chartType) {
      switch (chartType) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeLine(int chartType) {
      switch (chartType) {
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
            return true;
         default:
            return false;
      }
   }

   static boolean a6(int var0) {
      switch (var0) {
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 70:
         case 71:
            return true;
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         default:
            return false;
      }
   }

   static boolean u9(int var0) {
      switch (var0) {
         case 49:
         case 52:
            return true;
         default:
            return false;
      }
   }

   static boolean h0(int var0) {
      switch (var0) {
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 70:
         case 71:
            return true;
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         default:
            return false;
      }
   }

   static boolean c8(int var0) {
      switch (var0) {
         case 1:
         case 4:
         case 8:
         case 12:
         case 16:
         case 20:
         case 23:
         case 35:
         case 36:
         case 39:
         case 42:
         case 45:
         case 48:
         case 51:
            return true;
         case 2:
         case 3:
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 13:
         case 14:
         case 15:
         case 17:
         case 18:
         case 19:
         case 21:
         case 22:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 37:
         case 38:
         case 40:
         case 41:
         case 43:
         case 44:
         case 46:
         case 47:
         case 49:
         case 50:
         default:
            return false;
      }
   }

   static boolean t2(int var0) {
      switch (var0) {
         case 48:
         case 51:
            return true;
         default:
            return false;
      }
   }

   static boolean s7(int var0) {
      switch (var0) {
         case 2:
         case 5:
         case 9:
         case 13:
         case 17:
         case 21:
         case 24:
         case 32:
         case 37:
         case 40:
         case 43:
         case 46:
         case 49:
         case 52:
            return true;
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         case 20:
         case 22:
         case 23:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 33:
         case 34:
         case 35:
         case 36:
         case 38:
         case 39:
         case 41:
         case 42:
         case 44:
         case 45:
         case 47:
         case 48:
         case 50:
         case 51:
         default:
            return false;
      }
   }

   public static boolean isChartTypePie(int chartType) {
      switch (chartType) {
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeBar(int chartType) {
      switch (chartType) {
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeArea(int chartType) {
      switch (chartType) {
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeScatter(int chartType) {
      switch (chartType) {
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeStock(int chartType) {
      switch (chartType) {
         case 58:
         case 59:
         case 60:
         case 61:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeSurface(int chartType) {
      switch (chartType) {
         case 62:
         case 63:
         case 64:
         case 65:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeDoughnut(int chartType) {
      switch (chartType) {
         case 66:
         case 67:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeBubble(int chartType) {
      switch (chartType) {
         case 68:
         case 69:
            return true;
         default:
            return false;
      }
   }

   public static boolean isChartTypeRadar(int chartType) {
      switch (chartType) {
         case 70:
         case 71:
         case 72:
            return true;
         default:
            return false;
      }
   }

   static int x8(int var0) {
      switch (var0) {
         case 0:
            return 10;
         case 1:
            return 11;
         case 2:
            return 12;
         case 3:
         case 7:
         case 11:
         case 15:
            return 30;
         case 4:
            return 35;
         case 5:
            return 31;
         case 6:
         case 10:
         case 14:
         case 18:
            return 29;
         case 8:
            return 37;
         case 9:
            return 33;
         case 12:
            return 36;
         case 13:
            return 32;
         case 16:
            return 38;
         case 17:
            return 34;
         case 19:
         case 22:
            return 13;
         case 20:
         case 23:
            return 14;
         case 21:
         case 24:
            return 15;
         case 25:
            return 27;
         case 26:
         case 29:
            return 3;
         case 27:
         case 30:
            return 28;
         case 28:
            return 1;
         case 31:
            return 0;
         case 32:
            return 9;
         case 33:
         case 38:
         case 41:
         case 44:
            return 39;
         case 34:
            return 7;
         case 35:
            return 8;
         case 36:
            return 40;
         case 37:
            return 44;
         case 39:
            return 42;
         case 40:
            return 46;
         case 42:
            return 41;
         case 43:
            return 45;
         case 45:
            return 43;
         case 46:
            return 47;
         case 47:
            return 4;
         case 48:
            return 6;
         case 49:
            return 5;
         case 50:
            return 24;
         case 51:
            return 25;
         case 52:
            return 26;
         case 53:
         case 56:
         case 57:
            return 22;
         case 54:
         case 55:
            return 23;
         case 58:
            return 18;
         case 59:
            return 19;
         case 60:
            return 20;
         case 61:
            return 21;
         case 62:
            return 50;
         case 63:
            return 51;
         case 64:
            return 48;
         case 65:
            return 49;
         case 66:
         case 67:
            return 2;
         case 68:
         case 69:
            return 52;
         case 70:
         case 71:
            return 16;
         case 72:
            return 17;
         case 73:
         default:
            throw new IndexOutOfRangeException();
         case 74:
            return 58;
         case 75:
            return 60;
         case 76:
            return 53;
         case 77:
            return 54;
         case 78:
            return 55;
         case 79:
            return 56;
         case 80:
            return 57;
         case 81:
            return 59;
      }
   }

   static boolean n5(IChartSeries var0, IChartSeriesGroup var1) {
      int var2 = x8(var0.getType());
      int var3 = var1.getType();
      return var2 == var3 && var0.getPlotOnSecondAxis() == var1.getPlotOnSecondAxis();
   }

   public static boolean isSeriesUsesXValueCoordinate(int seriesType) {
      switch (x8(seriesType)) {
         case 22:
         case 23:
         case 52:
            return true;
         default:
            return false;
      }
   }

   public static boolean isSeriesUsesYValueCoordinate(int seriesType) {
      switch (x8(seriesType)) {
         case 22:
         case 23:
         case 52:
            return true;
         default:
            return false;
      }
   }

   public static boolean isSeriesUsesValueCoordinate(int seriesType) {
      switch (x8(seriesType)) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 53:
         case 55:
         case 56:
         case 57:
            return true;
         case 22:
         case 23:
         case 52:
         case 54:
         default:
            return false;
      }
   }

   public static boolean isSeriesUsesBubbleSizeCoordinate(int seriesType) {
      switch (x8(seriesType)) {
         case 52:
            return true;
         default:
            return false;
      }
   }

   static boolean n3(int var0) {
      switch (x8(var0)) {
         case 58:
         case 60:
            return true;
         default:
            return false;
      }
   }

   public static boolean hasSeriesTrendLines(int seriesType) {
      switch (seriesType) {
         case 0:
         case 19:
         case 20:
         case 22:
         case 23:
         case 34:
         case 47:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 68:
         case 69:
            return true;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 21:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         default:
            return false;
      }
   }

   public static boolean isErrorBarsXAllowed(int seriesType) {
      switch (x8(seriesType)) {
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 22:
         case 23:
         case 52:
            return true;
         default:
            return false;
      }
   }

   public static boolean isErrorBarsYAllowed(int seriesType) {
      switch (x8(seriesType)) {
         case 4:
         case 5:
         case 6:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 27:
         case 52:
            return true;
         case 7:
         case 8:
         case 9:
         case 16:
         case 17:
         case 24:
         case 25:
         case 26:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         default:
            return false;
      }
   }

   static boolean n5(Chart var0) {
      return is3DChart(var0.getType()) || var0.getType() == 70 || var0.getType() == 72 || var0.getType() == 71;
   }

   static boolean y4(int var0) {
      switch (var0) {
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 68:
         case 69:
            return true;
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         default:
            return false;
      }
   }

   static boolean e2(int var0) {
      switch (var0) {
         case 76:
         case 77:
         case 78:
            return true;
         default:
            return false;
      }
   }

   static int t9(int var0) {
      if (isChartTypePie(var0)) {
         return 0;
      } else if (isChartTypeArea(var0)) {
         return 1;
      } else if (isChartTypeBar(var0) || isChartTypeColumn(var0)) {
         return 2;
      } else if (isChartTypeLine(var0)) {
         return 3;
      } else {
         return isChartTypeScatter(var0) ? 4 : 5;
      }
   }
}
