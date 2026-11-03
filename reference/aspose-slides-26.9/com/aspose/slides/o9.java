package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class o9 extends a0p {
   private a0 l6;
   private f3h k5;
   private int u3;

   o9(a0 var1, f3h var2, int var3) {
      super(var2);
      this.k5 = var2;
      this.l6 = var1;
      this.u3 = var3;
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

      if (var3.getShowCategoryName()) {
         var1.addItem(this.n3());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.y4());
      }

      String var5 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, " "}),(String[])( var1.toArray(new String[0])));
   }

   protected final String h0() {
      return this.l6.s7().k5().getName().toString();
   }

   private String n3() {
      n1g var1 = this.k5.n5();
      x4 var2 = this.k5.n5().l6().get_Item(this.l6.s7().n5(this.l6));
      DataLabel var3 = this.k5.l6();
      IDataLabelFormat var4 = var3.getDataLabelFormat();
      String var5 = var4.getNumberFormat();
      if (!f6z.l6.containsItem(var5) && !com.aspose.slides.ms.System.d1.n5(var5)) {
         return n5(var2.l6(), var5);
      }

      l5 var6 = var1.q0();
      return p4.n5(var2.l6(), var6);
   }

   private String y4() {
      switch (this.u3) {
         case 0:
            return com.aspose.slides.ms.System.d2.u9(this.l6.m1());
         case 1:
            return com.aspose.slides.ms.System.d2.u9(this.l6.z3());
         case 2:
            return com.aspose.slides.ms.System.d2.u9(this.l6.q0());
         case 3:
            return com.aspose.slides.ms.System.d2.u9(this.l6.t4());
         case 4:
            return com.aspose.slides.ms.System.d2.u9(this.l6.t9());
         case 5:
            return com.aspose.slides.ms.System.d2.u9(this.l6.z1());
         default:
            throw new NotImplementedException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unsupported value: ", com.aspose.slides.ms.System.s3.n5(a9.class, this.u3)}));
      }
   }
}
