package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class h3r extends r4 {
   private static final int[] n5 = new int[]{1022, Integer.MAX_VALUE, 1021, Integer.MAX_VALUE, 1019, 7};

   h3r() {
      this.w1().n5(1018);
   }

   final void l6() {
      r6i var1 = new r6i();
      var1.l6();
      var1.w1().n5((byte)0);
      var1.w1().n5((short)0);
      this.e2().addItem(var1);
      r1x var2 = new r1x();
      var2.n5(0);
      var2.w1().n5((byte)0);
      var2.w1().n5((short)0);
      this.e2().addItem(var2);
      n2 var3 = new n2();
      var3.l6(0);
      var3.w1().n5((byte)0);
      this.e2().addItem(var3);
      var3 = new n2();
      var3.l6(1);
      var3.w1().n5((byte)0);
      this.e2().addItem(var3);
   }

   public final r1x u3() {
      return (r1x)this.k5(1021);
   }

   public final n2[] a6() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         n2 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), n2.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return (n2[])var1.toArray(new n2[0]);
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
