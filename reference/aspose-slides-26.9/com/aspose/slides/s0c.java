package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class s0c extends x0q {
   final void n5(ICustomXmlPart var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "datastoreItem".equals(this.s7().n3())) {
            List var2 = new List();
            com.aspose.slides.internal.k4y.z1o var3 = new com.aspose.slides.internal.k4y.z1o(this.s7());
            if (var3.k5() != null && var3.k5().l6() != null) {
               for (com.aspose.slides.internal.k4y.j1e var7 : var3.k5().l6()) {
                  var2.addItem(var7.n5());
               }
            }

            ((CustomXmlPart)var1).n5(var3.l6().k5());
            ((CustomXmlPart)var1).n5((String[])var2.toArray(new String[0]));
         }
      }

      this.n3();
   }

   final void l6(ICustomXmlPart var1) {
      this.y4();
      com.aspose.slides.internal.k4y.z1o var2 = new com.aspose.slides.internal.k4y.z1o();
      var2.n5(((CustomXmlPart)var1).n5().k5());
      if (var2.k5() == null) {
         var2.n5();
      }

      for (String var6 : var1.getNamespaceSchemas()) {
         var2.k5().n5().n5(var6);
      }

      var2.n5(null, this.x8(), "datastoreItem");
      this.e2();
   }

   public s0c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public s0c(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
