package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class l1b extends p6r {
   @Override
   public void n5(List<Integer> var1, f3c var2) {
      for (int var3 = 0; var3 < var1.size(); var3++) {
         long var4 = (this.n5 & 4294967295L) + ((Integer)var1.get_Item(var3) & 65535) & 4294967295L;
         var2.n5(var4);
         int var6 = var2.n3() & 65535;
         switch (this.l6) {
            case 1:
               if (var6 == 1) {
                  this.a6.addItem(n5(new p7x(var4, var6), var2));
               } else if (var6 == 2) {
                  this.a6.addItem(n5(new o6t(var4, var6), var2));
               } else {
                  this.a6.addItem(p6r.n5(new c9b(var4, var6), var2));
               }
               break;
            case 2:
            default:
               this.a6.addItem(p6r.n5(new c9b(var4, var6), var2));
               break;
            case 3:
               this.a6.addItem(n5(new c7f(var4, var6), var2));
               break;
            case 4:
               this.a6.addItem(n5(new j8m(var4, var6), var2));
               break;
            case 5:
               if (var6 == 2) {
                  this.a6.addItem(n5(new c1x(var4, var6), var2));
               } else {
                  this.a6.addItem(p6r.n5(new c9b(var4, var6), var2));
               }
               break;
            case 6:
               if (var6 == 2) {
                  this.a6.addItem(n5(new n2z(var4, var6), var2));
               }

               if (var6 == 3) {
                  this.a6.addItem(n5(new l8r(var4, var6), var2));
               } else {
                  this.a6.addItem(p6r.n5(new c9b(var4, var6), var2));
               }
         }
      }
   }
}
