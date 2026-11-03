package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class r7n extends k0t {
   private int k5;
   private List<Integer> u3 = new List<>();

   public r7n(long var1, String var3) {
      super(var1, var3);
   }

   public final int k5() {
      return this.k5;
   }

   public final Integer[] u3() {
      return this.u3.toArray(new Integer[0]);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n3();
      this.k5 = var1.n3();
      int var2 = var1.n3();
      this.u3.setCapacity(var2 & 65535);

      for (int var3 = 0; var3 < (var2 & 65535); var3++) {
         this.u3.addItem(var1.n3());
      }
   }
}
