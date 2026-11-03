package com.aspose.slides;

class k4s {
   private boolean n5 = false;
   private int l6;
   private int k5;
   private int u3;
   private ChartData a6;

   public k4s(r0g var1) {
      this.a6 = w8d.n5(ChartData.class, var1);
      if (var1 != null) {
         ChartData[] var2 = new ChartData[]{this.a6};
         this.a6 = var2[0];
      }
   }

   public k4s(IChartDataCell var1, r0g var2) {
      this.a6 = w8d.n5(ChartData.class, var2);
      if (var1 == null) {
         this.n5 = false;
      } else {
         this.l6 = var1.getColumn();
         this.k5 = var1.getRow();
         this.u3 = var1.getChartDataWorksheet().getIndex();
         this.n5 = true;
      }

      if (var2 != null) {
         ChartData[] var3 = new ChartData[]{this.a6};
         this.a6 = var3[0];
      }
   }

   public final IChartDataCell n5() {
      if (this.a6 != null) {
         this.a6.l6().n5();
      }

      return this.a6 != null && this.n5 ? this.a6.getChartDataWorkbook().getCell(this.u3, this.k5, this.l6) : null;
   }

   public final void n5(IChartDataCell var1) {
      if (var1 == null) {
         this.n5 = false;
      } else {
         this.l6 = var1.getColumn();
         this.k5 = var1.getRow();
         this.u3 = var1.getChartDataWorksheet().getIndex();
         this.n5 = true;
      }
   }
}
