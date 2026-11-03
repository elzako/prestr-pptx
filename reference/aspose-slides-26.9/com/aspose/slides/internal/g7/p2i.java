package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class p2i extends f1s {
   private r9 l6;
   private int k5;
   private List<Integer> u3 = new List<>();

   public p2i(long var1, long var3) {
      super(var1, var3);
   }

   public final int l6() {
      return this.k5 & 65535;
   }

   public final int[] k5() {
      return t2.l6(this.u3);
   }

   public final r9 u3() {
      return this.l6;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6 = new k2(var1.n3() & 65535);
      this.k5 = var1.n3();

      for (int var2 = 0; var2 < (this.k5 & 65535) - 1; var2++) {
         this.u3.addItem(var1.n3());
      }
   }
}
