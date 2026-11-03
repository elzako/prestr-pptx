package com.aspose.slides;

class b8c {
   public static n5u n5(int var0) {
      if (ChartTypeCharacterizer.isChartTypeBar(var0)
         || ChartTypeCharacterizer.isChartTypeColumn(var0)
         || ChartTypeCharacterizer.isChartTypeLine(var0)
         || ChartTypeCharacterizer.isChartTypeStock(var0)
         || ChartTypeCharacterizer.isChartTypeArea(var0)
         || ChartTypeCharacterizer.isChartTypePie(var0)
         || var0 == 79
         || var0 == 80) {
         return new m0t();
      } else if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(var0)) {
         return new i0t();
      } else if (var0 == 76) {
         return new k6w();
      } else if (var0 == 78) {
         return new g6();
      } else {
         return var0 != 75 && var0 != 74 ? null : new r1g();
      }
   }
}
