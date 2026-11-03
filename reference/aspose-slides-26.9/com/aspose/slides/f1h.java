package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class f1h extends g3c {
   private List<y8b> n5 = new List<>();
   private List<d2z> l6 = new List<>();
   private d2z k5;

   @Override
   public String J_() {
      return ((com.aspose.slides.internal.k4y.i9l)this.q0()).n5();
   }

   public f1h(v8v var1, com.aspose.slides.internal.k4y.i9l var2) {
      for (com.aspose.slides.internal.k4y.k3i var6 : var2.l6()) {
         this.n5.addItem(new y8b(var6, this));
         d2z var7 = new d2z();
         List$Enumerator var8 = var6.x8().iterator();

         try {
            while (var8.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var9 = (com.aspose.slides.internal.k4y.g7)var8.next();
               g3c var10 = n5(var1, var9.l6(), this);
               if (var10 != null) {
                  var7.n5(var10);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }

         this.l6.addItem(var7);
      }

      this.k5 = new d2z();
      List$Enumerator var19 = var2.k5().n5().iterator();

      try {
         while (var19.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var20 = (com.aspose.slides.internal.k4y.g7)var19.next();
            g3c var21 = n5(var1, var20.l6(), this);
            if (var21 != null) {
               this.k5.n5(var21);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }
   }

   @Override
   public void n5(k6a var1, l6s var2) {
      d2z var3 = this.n5(var2, var1);
      if (var3 != null) {
         IGenericEnumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               g3c var5 = (g3c)var4.next();
               var5.n5(var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   @Override
   public d2z n5(l6s var1, k6a var2) {
      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         if (this.n5.get_Item(var3).n5(var1, var2)) {
            return this.l6.get_Item(var3);
         }
      }

      return this.k5;
   }

   @Override
   protected boolean K_() {
      return true;
   }
}
