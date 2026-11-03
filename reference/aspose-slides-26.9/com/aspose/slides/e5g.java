package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class e5g extends g3c {
   private z5z n5;
   private e5g l6;

   @Override
   public String J_() {
      return this.u3().n5();
   }

   public final z5z k5() {
      return this.n5;
   }

   public e5g(v8v var1, com.aspose.slides.internal.k4y.c5z var2) {
      this.n5 = new z5z(var2);
   }

   @Override
   public void n5(k6a var1, l6s var2) {
      if (!com.aspose.slides.ms.System.d1.n5(this.u3().l6())) {
         if (this.l6 == null) {
            e5g var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5(this.z1().n5(), this.u3().l6()), e5g.class);
            if (var3 != null) {
               this.l6 = (e5g)var3.n5(this);
            }
         }

         if (this.l6 != null) {
            this.l6.n5(var1, var2);
         }
      } else {
         List var16 = var2.n5(this.k5(), true);
         List$Enumerator var4 = var16.iterator();

         try {
            while (var4.hasNext()) {
               l6s var5 = (l6s)var4.next();
               IGenericEnumerator var6 = this.t9().iterator();

               try {
                  while (var6.hasNext()) {
                     g3c var7 = (g3c)var6.next();
                     var7.n5(var1, var5);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   private com.aspose.slides.internal.k4y.c5z u3() {
      return (com.aspose.slides.internal.k4y.c5z)this.q0();
   }
}
