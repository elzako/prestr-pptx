package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class g9m extends x0q {
   final void n5(IPresentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "http://schemas.openxmlformats.org/presentationml/2006/main".equals(this.s7().y4()) && "viewPr".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.l1 var2 = new com.aspose.slides.internal.k4y.l1(this.s7());
            ((Presentation)var1).n3().n5(new a1c());
            a1c var3 = ((Presentation)var1).n3().t4();
            if (var2.t2() != null && var2.t2().n5() != null && var2.t2().n5().l6().length > 0) {
               var3.n5(new Dictionary<>());

               for (com.aspose.slides.internal.k4y.w6a var7 : var2.t2().n5().l6()) {
                  var3.l6().addItem(this.k5().x8().get_Item(this.k5().k7().n5(var7.n5()).l6().l6()), var7.l6());
               }
            }

            var3.n5(var2);
         }
      }

      this.n3();
   }

   final void l6(IPresentation var1) {
      this.y4();
      a1c var2 = ((Presentation)var1).n3().t4();
      com.aspose.slides.internal.k4y.l1 var3 = var2.n5();
      if (var3.t2() != null) {
         var3.t2().n5(null);
         Dictionary var4 = var2.l6();
         if (var4 != null) {
            Dictionary$Enumerator var5 = this.u3().k5().iterator();

            try {
               while (var5.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var5.next();
                  if (var4.containsKey(var6.getKey())) {
                     if (var3.t2().n5() == null) {
                        var3.t2().n5(new com.aspose.slides.internal.k4y.l9h());
                     }

                     com.aspose.slides.internal.k4y.w6a var7 = var3.t2().n5().n5();
                     var7.n5(this.u3().u6().l6((com.aspose.slides.internal.c8m.j8)var6.getValue()).a6());
                     var7.n5((Boolean)var4.get_Item(var6.getKey()));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      }

      var3.n5(null, this.x8(), "viewPr");
      this.e2();
   }

   public g9m(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public g9m(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
