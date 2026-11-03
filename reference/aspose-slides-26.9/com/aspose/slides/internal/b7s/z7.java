package com.aspose.slides.internal.b7s;

import com.aspose.slides.Collections.Generic.List;

public class z7 {
   private final y0 n5;
   private final List<x9> l6;
   private int k5;

   public z7(y0 var1) {
      this.n5 = var1;
      this.l6 = new List<>();
   }

   public final void n5() {
      for (int var1 = 0; var1 < this.l6.size(); var1++) {
         this.l6.get_Item(var1).n5(this.n5);
      }
   }

   public final void n5(x9 var1) {
      this.l6.addItem(var1);
   }

   public final void n5(int var1, byte[] var2, int var3, d5 var4) {
      if (var4.c8() != null) {
         this.n5(t1.n5(var4.c8()));
      }

      this.k5++;
      int var5 = var4.h0() == 0 ? 1 : var4.a6();
      this.n5(t1.n5(this.k5, var5, var4.u9(), var4.h0()));
      this.n5(new b3(var1, var2, var3, var4));
   }

   public final void n5(byte[][] var1, int[] var2, d5 var3) {
      if (var3.c8() != null) {
         this.n5(t1.n5(var3.c8()));
      }

      this.k5++;
      int var4 = var3.h0() == 0 ? 1 : var3.a6();
      this.n5(t1.n5(this.k5, var4, var3.u9(), var3.h0()));
      this.n5(new d2(var1, var2, var3));
   }
}
