package com.aspose.slides;

public final class ChartPortionFormat extends BasePortionFormat implements IChartPortionFormat {
   private IChartComponent n5;
   private d2n l6;

   ChartPortionFormat(r0g parent) {
      super(parent);
      IChartComponent[] var2 = new IChartComponent[]{this.n5};
      d0u.n5(IChartComponent.class, parent, var2);
      this.n5 = var2[0];
   }

   @Override
   Object M_() {
      return new g2x(this.getParent_Immediate(), this.u3(), this.a6(), this.c8(), this.t2(), this.u9(), this.h0(), this.y4());
   }

   final g2x t9() {
      return (g2x)this.m1();
   }

   final IChartComponent z1() {
      return this.n5;
   }

   @Override
   public long getVersion() {
      long var1 = this.z3() ? this.t9().d5() : 1L;
      long var3 = 0L;
      TextFrame var5 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(this.z1(), ChartTitle.class)) {
         var5 = (TextFrame)com.aspose.slides.internal.v6g.k5.n5(this.z1(), ChartTitle.class).getTextFrameForOverriding();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.z1(), Trendline.class)) {
         var5 = (TextFrame)com.aspose.slides.internal.v6g.k5.n5(this.z1(), Trendline.class).getTextFrameForOverriding();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.z1(), DataLabelFormat.class)
         && com.aspose.slides.internal.v6g.k5.l6(((DataLabelFormat)this.z1()).getParent_Immediate(), DataLabel.class)) {
         var5 = (TextFrame)com.aspose.slides.internal.v6g.k5.n5(((DataLabelFormat)this.z1()).getParent_Immediate(), DataLabel.class)
            .getTextFrameForOverriding();
      }

      if (var5 != null && var5.getParagraphs().getCount() > 0) {
         var3 = ((PortionFormat)var5.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat()).getVersion();
         if (var5.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
            var3 = (var3 & 4294967295L)
                  + (((PortionFormat)var5.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat()).getVersion() & 4294967295L)
               & 4294967295L;
         }
      }

      return (var1 & 4294967295L) + (var3 & 4294967295L) & 4294967295L;
   }

   final d2n t4() {
      if (this.l6 == null) {
         d2n var1 = d2n.u3(this);
         if (var1 != null) {
            return var1;
         }

         this.l6 = new d2n(this);
      }

      this.l6.n5(d2n.class);
      return this.l6;
   }

   final boolean q0() {
      return this.z3() ? this.t9().f2() : true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   g2x l6() {
      return this.t9();
   }

}
