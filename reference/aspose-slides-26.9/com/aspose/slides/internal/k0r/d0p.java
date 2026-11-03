package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class d0p extends r4 {
   private static final int[] n5 = new int[]{2021, Integer.MAX_VALUE, 2022, Integer.MAX_VALUE};

   public d0p() {
      this.w1().n5(2020);
      this.w1().n5((short)5);
      this.e2().addItem(new t1z());
   }

   public d0p(int var1) {
      this.w1().n5(2020);
      this.w1().n5((short)5);
   }

   public final t1z l6() {
      return (t1z)this.k5(2021);
   }

   public final x6s n5(int var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var2), x6s.class) && ((x6s)this.e2().get_Item(var2)).h0() == var1) {
            return (x6s)this.e2().get_Item(var2).d2();
         }
      }

      return null;
   }

   public final x6s[] u3() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         x6s var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), x6s.class);
         if (var3 != null && !var3.a0()) {
            var1.addItem(var3);
         }
      }

      return var1.size() == 0 ? null : (x6s[])var1.toArray(new x6s[0]);
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
