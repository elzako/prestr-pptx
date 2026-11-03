package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class r9i extends g3c {
   private List<k6a> n5 = new List<>();
   private j2l[] l6;
   private j2l[] k5;

   public final j2l[] k5() {
      if (this.k5 == null) {
         List var1 = new List();
         IGenericEnumerator var2 = this.t9().iterator();

         try {
            while (var2.hasNext()) {
               j2l var3 = (j2l)var2.next();
               if (!com.aspose.slides.ms.System.d2.k5(var3.u9())) {
                  var1.addItem(var3);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.k5 = (j2l[])var1.toArray(new j2l[0]);
      }

      return this.k5;
   }

   public final j2l[] u3() {
      if (this.l6 == null) {
         List var1 = new List();
         IGenericEnumerator var2 = this.t9().iterator();

         try {
            while (var2.hasNext()) {
               j2l var3 = (j2l)var2.next();
               if (!com.aspose.slides.ms.System.d2.k5(var3.c8())) {
                  boolean var4 = false;

                  for (int var5 = 0; var5 < var1.size(); var5++) {
                     j2l var6 = (j2l)var1.get_Item(var5);
                     if (var6.k5() == var3.k5() && com.aspose.slides.ms.System.d1.a6(var6.u3(), var3.u3()) && var6.a6() == var3.a6()) {
                        var4 = true;
                        if (var3.c8() < var6.c8()) {
                           var1.set_Item(var5, var3);
                        }
                        break;
                     }
                  }

                  if (!var4) {
                     var1.addItem(var3);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.l6 = (j2l[])var1.toArray(new j2l[0]);
      }

      return this.l6;
   }

   public r9i(com.aspose.slides.internal.k4y.k5r var1) {
   }

   @Override
   public void n5(k6a var1, l6s var2) {
      this.n5.addItem(var1);
      var1.n5(this);
   }
}
