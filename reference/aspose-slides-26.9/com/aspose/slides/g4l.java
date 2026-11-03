package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

final class g4l {
   private List<com.aspose.slides.internal.k4y.h7x> k5 = new List<>();
   private ChartDataWorkbook u3;
   long n5;
   long l6;
   private com.aspose.slides.internal.k4y.l0k a6;

   g4l(ChartDataWorkbook var1) {
      this.u3 = var1;
   }

   public void n5() {
      this.n5 = 0L;
      this.l6 = 0L;
      this.k5.clear();
   }

   public int l6() {
      return this.k5.size();
   }

   public String n5(int var1) {
      com.aspose.slides.internal.k4y.h7x var2 = this.k5.get_Item(var1);
      String var3 = var2.n5();
      if (var3 != null) {
         return var3;
      }

      if (var2.l6().length <= 0) {
         throw new NotImplementedException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"SharedString with index ", com.aspose.slides.ms.System.a3.l6(var1), " has unknown type"})
         );
      }

      for (com.aspose.slides.internal.k4y.c5f var7 : var2.l6()) {
         var3 = com.aspose.slides.ms.System.d1.n5(var3, var7.l6());
      }

      return var3;
   }

   com.aspose.slides.internal.k4y.l0k k5() {
      return this.a6;
   }

   void n5(com.aspose.slides.internal.k4y.l0k var1) {
      this.a6 = var1;
   }

   int n5(String var1) {
      com.aspose.slides.internal.k4y.h7x var2 = new com.aspose.slides.internal.k4y.h7x();
      var2.n5(var1);
      this.k5.addItem(var2);
      return this.k5.size() - 1;
   }

   int n5(com.aspose.slides.internal.k4y.h7x var1) {
      this.k5.addItem(var1);
      return this.k5.size() - 1;
   }

   com.aspose.slides.internal.k4y.h7x l6(int var1) {
      return this.k5.get_Item(var1);
   }
}
