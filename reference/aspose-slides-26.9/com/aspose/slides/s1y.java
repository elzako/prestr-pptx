package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class s1y extends a0p {
   private a0 l6;
   private f3h k5;

   s1y(a0 var1, f3h var2) {
      super(var2);
      this.k5 = var2;
      this.l6 = var1;
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = this.k5.l6();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4 = com.aspose.slides.internal.x7n.l6.l6().e2().z3();
      if (var3.getShowSeriesName()) {
         var1.addItem(this.h0());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.n3());
      }

      String var5 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, " "}),(String[])( var1.toArray(new String[0])));
   }

   protected final String h0() {
      return this.l6.s7().k5().getName().toString();
   }

   private String n3() {
      DataLabel var1 = this.k5.l6();
      return n5(this.l6.n3(), var1.getDataLabelFormat().getNumberFormat());
   }
}
