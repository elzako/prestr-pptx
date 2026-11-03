package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.Dictionary;

public class p6 extends e5 {
   private Dictionary<String, e5> n5 = new Dictionary<>();

   public final Dictionary<String, e5> n5() {
      return this.n5;
   }

   public final void n5(w8 var1) {
      if (var1.n5() == null) {
         var1.n5(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.internal.p4.n5.n5(com.aspose.slides.internal.v6g.k5.n5(u4.class)).n5(var1.k5())));
         var1.n5(0);
      }

      if (this.n5().containsKey(var1.n5())) {
         w8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5().get_Item(var1.n5()), w8.class);
         if (var2 == null) {
            throw new j3("A property cannot be both an accessor and data");
         }

         switch (var1.k5()) {
            case 0:
               if (var1.k5() != 0) {
                  throw new j3("A property cannot be both an accessor and data");
               }

               this.n5().set_Item(var1.n5(), var1.l6());
               break;
            case 1:
               var2.l6(var1);
               break;
            case 2:
               var2.n5(var1);
         }
      } else {
         this.n5.addItem(var1.n5(), var1);
         switch (var1.k5()) {
            case 0:
               this.n5().set_Item(var1.n5(), var1);
               break;
            case 1:
               var1.l6(var1);
               break;
            case 2:
               var1.n5(var1);
         }
      }
   }

   @Override
   public void n5(j8 var1) {
      var1.n5(this);
   }
}
