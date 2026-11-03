package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class k5y {
   private final d9r n5;
   private List<c1k> l6;
   private final IShapeCollection k5;

   public k5y(d9r var1, IShapeCollection var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = new List<>();
      this.n5();
   }

   public final String n5(j9u var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            c1k var4 = (c1k)var3.next();
            String var5 = var4.n5(var1);
            if (!com.aspose.slides.ms.System.d1.a6(var5, com.aspose.slides.ms.System.d1.n5)) {
               var2.n5(this.n5.l6.u3(var5));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2.toString();
   }

   private float n5(IShape var1) {
      return var1.getWidth() * var1.getHeight();
   }

   private void n5() {
      switch (this.n5.k5.getExportType()) {
         case 2:
            List var8 = this.n5(this.k5);

            for (int var9 = 0; var9 < var8.size(); var9++) {
               k5l var3 = null;

               for (int var4 = var9 + 1; var4 < var8.size(); var4++) {
                  if (this.n5((IShape)var8.get_Item(var9), (IShape)var8.get_Item(var4))) {
                     if (var3 == null) {
                        var3 = new k5l(this.n5, (IShape)var8.get_Item(var9));
                     }

                     var3.n5((IShape)var8.get_Item(var4));
                     var8.removeItem(var8.get_Item(var4));
                     var4--;
                  }
               }

               if (var3 == null) {
                  this.l6.addItem(new h1t((IShape)var8.get_Item(var9), this.n5));
               } else {
                  this.l6.addItem(var3);
               }
            }
            break;
         default:
            IGenericEnumerator var1 = this.k5.iterator();

            try {
               while (var1.hasNext()) {
                  IShape var2 = (IShape)var1.next();
                  this.l6.addItem(new h1t(var2, this.n5));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
                  var1.dispose();
               }
            }
      }

      this.l6();
   }

   private boolean n5(IShape var1, IShape var2) {
      return var1.getX() > var2.getX()
         && var1.getY() > var2.getY()
         && var1.getY() + var1.getHeight() < var2.getY() + var2.getHeight()
         && var1.getX() + var1.getWidth() < var2.getX() + var2.getWidth();
   }

   private List<IShape> n5(IShapeCollection var1) {
      List var2 = new List<>(var1);

      for (int var3 = 0; var3 < var1.size() - 1; var3++) {
         for (int var4 = var3 + 1; var4 < var1.size(); var4++) {
            if (this.n5(var1.get_Item(var3)) < this.n5(var1.get_Item(var4))) {
               IShape var5 = (IShape)var2.get_Item(var4);
               var2.set_Item(var4, var2.get_Item(var3));
               var2.set_Item(var3, var5);
            }
         }
      }

      return var2;
   }

   private void l6() {
      List var1 = new List<>(this.l6);

      for (int var2 = 0; var2 < this.l6.size() - 1; var2++) {
         for (int var3 = var2 + 1; var3 < this.l6.size(); var3++) {
            if (((c1k)var1.get_Item(var2)).l6() > ((c1k)var1.get_Item(var3)).l6()
               || com.aspose.slides.ms.System.n1.l6(((c1k)var1.get_Item(var2)).l6(), ((c1k)var1.get_Item(var3)).l6())
                  && ((c1k)var1.get_Item(var2)).n5() > ((c1k)var1.get_Item(var3)).n5()) {
               c1k var4 = (c1k)var1.get_Item(var3);
               var1.set_Item(var3, var1.get_Item(var2));
               var1.set_Item(var2, var4);
            }
         }
      }

      this.l6 = var1;
   }
}
