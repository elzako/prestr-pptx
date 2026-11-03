package com.aspose.slides;

public class ChartLinesFormat implements IChartLinesFormat, r0g {
   private final o3i n5;
   private final LineFormat l6;
   private final EffectFormat k5;
   private final r0g u3;

   @Override
   public final ILineFormat getLine() {
      return this.l6;
   }

   @Override
   public final IEffectFormat getEffect() {
      return this.k5;
   }

   ChartLinesFormat(r0g parentImmediate) {
      this.u3 = parentImmediate;
      this.n5 = new o3i();
      this.l6 = new LineFormat(this);
      this.k5 = new EffectFormat(this);
   }

   final o3i n5() {
      return this.n5;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }
}
