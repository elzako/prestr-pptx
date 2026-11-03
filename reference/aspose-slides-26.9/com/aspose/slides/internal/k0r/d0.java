package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public abstract class d0 extends r4 {
   public d0() {
      this.w1().n5(5000);
      this.w1().n5((short)0);
   }

   final void n5(int var1) {
      z4 var2 = null;
      switch (var1) {
         case 0:
            this.l6(true);
            var2 = new b3();
            var2.n5(var1);
            break;
         case 1:
         case 2:
            var2 = new m6n();
            var2.n5(var1);
      }

      this.e2().addItem(var2);
   }

   public final h3[] c8() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         Object var3 = this.e2().get_Item(var2);
         h3 var4 = var3 instanceof h3 ? (h3)var3 : null;
         if (var4 != null) {
            var1.addItem(var4);
         }
      }

      h3[] var5 = new h3[var1.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = (h3)var1.get_Item(var6);
      }

      return var5;
   }

   public final z4[] t2() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         z4 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), z4.class);
         if (var3 != null && var3.e2().size() > 1 && com.aspose.slides.internal.v6g.k5.l6(var3.e2().get_Item(1), u9.class)) {
            var1.addItem(var3);
         }
      }

      return (z4[])var1.toArray(new z4[0]);
   }

   final z4 n5(String var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if ((this.e2().get_Item(var2).r4() & 65535) == 5002) {
            z4 var3 = (z4)this.e2().get_Item(var2);
            if (var3.e2().size() > 0
               && (var3.e2().get_Item(0).r4() & 65535) == 4026
               && com.aspose.slides.ms.System.d1.a6(((z1)var3.e2().get_Item(0)).l6(), var1)) {
               return (z4)this.e2().get_Item(var2);
            }
         }
      }

      return null;
   }
}
