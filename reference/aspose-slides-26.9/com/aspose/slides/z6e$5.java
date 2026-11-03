package com.aspose.slides;

final class z6e$5 extends com.aspose.slides.ms.System.g7<IChartDataPoint> {
   // $VF: synthetic field
   final int[] n5;

   z6e$5(int[] var1) {
      this.n5 = var1;
   }

   public boolean n5(IChartDataPoint var1) {
      return (var1.getIndex() & 4294967295L) == this.n5[0];
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean invoke(IChartDataPoint bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
