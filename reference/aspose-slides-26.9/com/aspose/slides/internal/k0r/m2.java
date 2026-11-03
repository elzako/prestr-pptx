package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class m2 extends h0 {
   private static final int[] n5 = new int[]{4013, Integer.MAX_VALUE};

   public final j8m[] l6() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         j8m var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), j8m.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return (j8m[])var1.toArray(new j8m[0]);
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
