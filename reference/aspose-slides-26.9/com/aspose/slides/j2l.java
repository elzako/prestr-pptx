package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class j2l extends g3c {
   private double n5;

   public final int k5() {
      return this.t2().l6();
   }

   public final String u3() {
      return this.t2().k5();
   }

   public final int a6() {
      return this.t2().n5();
   }

   public final double u9() {
      return this.t2().u9();
   }

   public final double c8() {
      return this.n5;
   }

   public j2l(com.aspose.slides.internal.k4y.c2m var1) {
      this.n5 = var1.a6();
      if (!com.aspose.slides.ms.System.d2.k5(this.n5) && !com.aspose.slides.ms.System.d2.l6(this.n5) && var1.n5() != 23 && var1.n5() != 0) {
         this.n5 = q3g.n5(this.n5);
      }
   }

   public final List<k6a> n5(k6a var1) {
      return var1.n5(this.t2().l6(), this.t2().k5(), this.t2().u3());
   }

   public final List<k6a> l6(k6a var1) {
      List var2 = new List();
      if (this.k5() != 1 && q3g.l6(this.a6())) {
         List var3 = this.n5(var1);
         List$Enumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               k6a var5 = (k6a)var4.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var5.s7(), h3o.class)) {
                  var2.addItem(var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         List var47 = new List();
         List$Enumerator var6 = var2.iterator();

         try {
            while (var6.hasNext()) {
               k6a var7 = (k6a)var6.next();
               List$Enumerator var8 = var7.u9().iterator();

               try {
                  while (var8.hasNext()) {
                     l6s var9 = (l6s)var8.next();
                     List var10 = new List();
                     this.n5(var10, var9.l6());
                     List$Enumerator var11 = var10.iterator();

                     try {
                        while (var11.hasNext()) {
                           l6s var12 = (l6s)var11.next();
                           if (!var47.containsItem(var12)) {
                              var47.addItem(var12);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                           var11.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         List$Enumerator var48 = var47.iterator();

         try {
            while (var48.hasNext()) {
               l6s var49 = (l6s)var48.next();
               k6a var50 = var1.n5(var49.t9());
               if (var50 != null && com.aspose.slides.internal.v6g.k5.l6(var50.s7(), h3o.class) && !var2.containsItem(var50)) {
                  var2.addItem(var50);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
               var48.dispose();
            }
         }
      }

      return var2;
   }

   private void n5(List<l6s> var1, List<l6s> var2) {
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            l6s var4 = (l6s)var3.next();
            var1.addItem(var4);
            this.n5(var1, var4.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.k4y.c2m t2() {
      return (com.aspose.slides.internal.k4y.c2m)this.q0();
   }
}
