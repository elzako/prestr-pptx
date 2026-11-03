package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d6z extends b3 {
   private l9e n5;
   private m1y l6;
   private x4t k5;
   private g7 u3;
   private r2r a6;
   private r0s u9;
   private k1i h0;
   private h6m c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "parentLabelLayout", "regionLabelLayout", "visibility", "aggregation", "binning", "geography", "statistics", "subtotals", "extLst"
   );

   public d6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d6z$1(this, var1));
   }

   public d6z() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "parentLabelLayout");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "regionLabelLayout");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "visibility");
      }

      if (this.u3 != null) {
         switch (t2.n5(this.u3.n5())) {
            case 3:
               ((p2h)this.u3.k5()).n5("cx", var2, this.u3.n5());
               break;
            case 4:
               ((d4r)this.u3.k5()).n5("cx", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "geography");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "statistics");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "subtotals");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(l9e var1) {
      this.n5 = var1;
   }

   public final void n5(x4t var1) {
      this.k5 = var1;
   }

   public final void n5(r2r var1) {
      this.a6 = var1;
   }

   public final void n5(r0s var1) {
      this.u9 = var1;
   }

   public final void n5(k1i var1) {
      this.h0 = var1;
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("AggregationOrBinning already is initialized.");
      }

      switch (t2.n5(var1)) {
         case 3:
            this.u3 = new g7("aggregation", new p2h());
            break;
         case 4:
            this.u3 = new g7("binning", new d4r());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final l9e n5() {
      return this.n5;
   }

   public final x4t l6() {
      return this.k5;
   }

   public final g7 k5() {
      return this.u3;
   }

   public final r2r u3() {
      return this.a6;
   }

   public final r0s a6() {
      return this.u9;
   }

   public final k1i u9() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return t2;
   }

   // $VF: synthetic method
   static l9e n5(d6z var0, l9e var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static m1y n5(d6z var0, m1y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x4t n5(d6z var0, x4t var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(d6z var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static r2r n5(d6z var0, r2r var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static r0s n5(d6z var0, r0s var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static k1i n5(d6z var0, k1i var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static h6m n5(d6z var0, h6m var1) {
      return var0.c8 = var1;
   }
}
