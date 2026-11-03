package com.aspose.slides.internal.k0r;

public class p0 extends r4 {
   public p0() {
      this.w1().n5(com.aspose.slides.internal.v6g.k5.k5(4014, 9));
   }

   public t9p n5(long var1, short var3) {
      int var4 = 0;
      var3 = (short)((var3 & '\ufff0') >> 4);

      while (var4 < this.e2().size()) {
         Object var5 = this.e2().get_Item(var4);
         s1 var6 = var5 instanceof s1 ? (s1)var5 : null;
         if (var6 != null) {
            if (var6.l6() == var1 && var6.w1().k5() == var3 && var4 < this.e2().size() - 1) {
               Object var7 = this.e2().get_Item(var4 + 1);
               return var7 instanceof t9p ? (t9p)var7 : null;
            }

            var4++;
         }

         var4++;
      }

      return null;
   }
}
