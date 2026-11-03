package com.aspose.slides;

public class Marker implements IMarker, r0g {
   private r0g u3;
   private ChartSeries a6;
   private x2v u9 = new x2v();
   int n5;
   int l6 = -1;
   Format k5;

   @Override
   public final int getSymbol() {
      return this.l6;
   }

   @Override
   public final void setSymbol(int value) {
      if (this.l6 != value) {
         this.l6 = value;
         this.a6.a6();
      }
   }

   @Override
   public final IFormat getFormat() {
      if (this.k5 == null) {
         this.k5 = new Format(this);
      }

      return this.k5;
   }

   @Override
   public final int getSize() {
      return this.n5;
   }

   @Override
   public final void setSize(int value) {
      this.n5 = value;
   }

   Marker(r0g parentImmediate, ChartSeries parentSeries) {
      this.u3 = parentImmediate;
      this.a6 = parentSeries;
   }

   final x2v n5() {
      return this.u9;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }
}
