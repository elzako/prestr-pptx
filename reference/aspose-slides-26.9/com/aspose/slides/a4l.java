package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class a4l extends g4a {
   public a4l(InkActions var1) {
      super(var1);
   }

   public final InkActions n5() {
      return (InkActions)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      Ink var4 = new Ink(this.n5().x9());
      var4.x8().addItem(this.n5().u9());
      var4.setRawFrame(this.n5().getRawFrame());
      List$Enumerator var5 = this.n5().x8().iterator();

      try {
         while (var5.hasNext()) {
            m3z var6 = (m3z)var5.next();
            List$Enumerator var7 = var6.l6().iterator();

            try {
               while (var7.hasNext()) {
                  u2l var8 = (u2l)var7.next();
                  List$Enumerator var9 = var8.k5().iterator();

                  try {
                     while (var9.hasNext()) {
                        Ink var10 = (Ink)var9.next();
                        if (!var10.n5().isEmpty()) {
                           var4.n5().addItem(var10.n5().get_Item(0));
                        }

                        if (!var10.k5().isEmpty()) {
                           var4.k5().addItem(var10.k5().get_Item(0));
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                        var9.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      var4.e5().n5(var1, var2, var3);
   }
}
