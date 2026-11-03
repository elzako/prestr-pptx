package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class c5r extends j1w {
   public c5r(Dictionary<Byte, h2d> var1, int var2, h5p var3) {
      super(var1, var2, var3);
   }

   @Override
   protected String n5() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5((Object)this.k5().get_Item((byte)1).n5());
      this.n5(var1);
      this.n5(var1, this.a6());
      this.n5(var1, this.u9());
      return var1.toString();
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1, String var2) {
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         if (var1.l6() != 0) {
            var1.n5(" ");
         }

         var1.n5(var2);
      }
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1) {
      if (this.u3().n5().containsKey(this.t2())) {
         var1.n5((Object)(this.u3().l6().get_Item(this.u3().n5().get_Item(this.t2()).n5())));
      }
   }
}
