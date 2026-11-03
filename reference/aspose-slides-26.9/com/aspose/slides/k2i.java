package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class k2i extends v6g {
   private List<x0g> n5 = new List<>();
   private e1o l6;

   k2i(e1o var1) {
      this.l6 = var1;
   }

   @Override
   protected void n5(z5 var1) {
      List var2 = this.u3();
      this.n5.addItem(new z9o(this.l6, (String)var2.get_Item(0)));
      this.n5.addItem(new p4d(this.l6, (String)var2.get_Item(1)));
      this.n5.addItem(new z9o(this.l6, (String)var2.get_Item(2)));
      this.n5(this.n5.get_Item(0));
      this.n5(this.n5.get_Item(1));
      this.n5(this.n5.get_Item(2));
      this.n5.get_Item(0).n3(var1);
      this.n5.get_Item(1).n3(var1);
      this.n5.get_Item(2).n3(var1);
      this.u3(com.aspose.slides.ms.System.q1.n5((float)(this.n5.get_Item(0).d5()), (float)(this.n5.get_Item(2).d5())));
      this.k5(this.n5.get_Item(0).d2() + this.n5.get_Item(1).d2() + this.n5.get_Item(2).d2());
   }

   @Override
   protected void l6(z5 var1) {
      this.n5.get_Item(1).a6(this.n5.get_Item(0).d2());
      this.n5.get_Item(2).a6(this.n5.get_Item(1).b3() + this.n5.get_Item(1).d2());

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   private List<String> u3() {
      List var1 = new List();
      if (this.l6.h0().k5().getDisplayRSquaredValue()) {
         String var2 = "";
         var2 = com.aspose.slides.ms.System.d1.n5(var2, "R");
         var1.addItem(var2);
         var1.addItem("2");
         boolean var3 = true;
         String var4 = "0.0000";
         if (!"".equals(this.l6.h0().k5().n5().l6().n5()) && !"General".equals(this.l6.h0().k5().n5().l6().n5())) {
            var4 = this.l6.h0().k5().n5().l6().n5();
            var3 = false;
         }

         var2 = " = ";
         String var5 = com.aspose.slides.ms.System.d2.n5(this.l6.s7(), var4);
         if (var3) {
            if (com.aspose.slides.ms.System.d2.n5(var5) == 0.0) {
               String[] var6 = com.aspose.slides.ms.System.d1.n5(var5, 'E');
               if (var6.length > 1) {
                  var5 = com.aspose.slides.ms.System.d1.n5(new String[]{d0n.n5(var6[0]), "E"});

                  for (int var7 = 1; var7 < var6.length; var7++) {
                     var5 = com.aspose.slides.ms.System.d1.n5(var5, var6[var7]);
                  }
               }
            } else {
               var5 = d0n.n5(var5);
            }
         }

         var2 = com.aspose.slides.ms.System.d1.n5(var2, var5);
         var1.addItem(var2);
      }

      return var1;
   }
}
