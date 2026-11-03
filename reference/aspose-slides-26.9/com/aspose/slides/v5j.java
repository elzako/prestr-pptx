package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;

class v5j implements b5v {
   private ChartDataWorksheet n5;

   @Override
   public final n6y n5() {
      return this.n5.u3().l6();
   }

   @Override
   public final String l6() {
      return this.n5.getName();
   }

   public v5j(ChartDataWorksheet var1) {
      this.n5 = var1;
   }

   @Override
   public final r6t n5(int var1, int var2) {
      ChartDataCell var3 = this.n5.l6().l6(var1 - 1, var2 - 1);
      return com.aspose.slides.internal.v6g.k5.n5(var3, ChartDataCell.class).t2();
   }

   @Override
   public final r6t l6(int var1, int var2) {
      ChartDataCell var3 = this.n5.l6().n5(var1 - 1, var2 - 1);
      return var3 != null ? com.aspose.slides.internal.v6g.k5.n5(var3, ChartDataCell.class).t2() : null;
   }

   @Override
   public final IGenericList<r6t> n5(int var1, int var2, int var3, int var4) {
      IGenericList var5 = this.n5.l6().n5(var1 - 1, var2 - 1, var3 - 1, var4 - 1);
      r6t[] var6 = new r6t[var5.size()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = ((ChartDataCell)var5.get_Item(var7)).t2();
      }

      return com.aspose.slides.ms.System.u3.n5(var6);
   }

   @Override
   public final c6u n5(a1h var1) {
      u7j var2 = new u7j(this.n5.u9());
      return var1.n5(var2);
   }
}
