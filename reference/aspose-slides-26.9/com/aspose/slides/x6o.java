package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class x6o implements d4x {
   private n6y n5;
   private Dictionary<String, IGenericList<l3>> l6;

   public x6o(n6y var1) {
      this.n5 = var1;
      this.l6 = new Dictionary<>();
   }

   @Override
   public final void n5(String var1, y9w var2, IGenericList<a1h> var3) {
      List var4 = null;
      if (var3 != null) {
         var4 = new List();
         IGenericEnumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               a1h var6 = (a1h)var5.next();
               var4.addItem(var6.n5(var2));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      l3 var10 = this.u3(var1, var2);
      if (var10 != null) {
         this.n5(var1, var10, var4);
      } else {
         l3 var11 = new l3(var2, var4);
         if (this.l6.containsKey(var1)) {
            this.l6.get_Item(var1).addItem(var11);
         } else {
            List var7 = new List();
            var7.addItem(var11);
            this.l6.addItem(var1, var7);
         }
      }
   }

   @Override
   public final void n5(String var1, y9w var2) {
      if (this.l6.containsKey(var1)) {
         IGenericList var3 = this.l6.get_Item(var1);
         l3 var4 = null;
         IGenericEnumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               l3 var6 = (l3)var5.next();
               if (var6.n5().u3(var2)) {
                  var4 = var6;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (var4 != null) {
            var3.removeItem(var4);
         }
      }
   }

   @Override
   public final void l6(String var1, y9w var2) {
      if (this.l6.containsKey(var1)) {
         IGenericList var3 = this.l6.get_Item(var1);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            l3 var5 = (l3)var3.get_Item(var4);
            if (!var5.n5().u3(var2)) {
               b5v var6 = this.n5.n5(var1);
               r6t var7 = var6.l6(var5.n5().l6().l6(), var5.n5().k5().l6());
               IGenericEnumerator var8 = var5.l6().iterator();

               try {
                  while (var8.hasNext()) {
                     a1h var9 = (a1h)var8.next();
                     if (com.aspose.slides.internal.v6g.k5.l6(var9, y9w.class)) {
                        y9w var10 = (y9w)var9;
                        if (var10.l6().l6() == var2.l6().l6() && var10.k5().l6() == var2.k5().l6() && com.aspose.slides.ms.System.d1.a6(var10.n5(), var2.n5())) {
                           this.n5(var7);
                        }
                     } else if (var9.k5(var2)) {
                        this.n5(var7);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         }
      }
   }

   @Override
   public final void k5(String var1, y9w var2) {
      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d1.n5(var1));
      com.aspose.slides.internal.f8y.n5.n5(var2 != null && var2.u3());
      if (this.l6.containsKey(var1)) {
         IGenericList var3 = this.l6.get_Item(var1);
         IGenericEnumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               l3 var5 = (l3)var4.next();
               if (!var5.n5().u3(var2)) {
                  b5v var6 = this.n5.n5(var1);
                  r6t var7 = var6.l6(var5.n5().l6().l6(), var5.n5().k5().l6());
                  IGenericEnumerator var8 = var5.l6().iterator();

                  try {
                     while (var8.hasNext()) {
                        a1h var9 = (a1h)var8.next();
                        if (com.aspose.slides.internal.v6g.k5.l6(var9, y9w.class)) {
                           y9w var10 = (y9w)var9;
                           if (var10.l6().l6() == var2.l6().l6()
                              && var10.k5().l6() == var2.k5().l6()
                              && com.aspose.slides.ms.System.d1.a6(var10.n5(), var2.n5())) {
                              this.l6(var7);
                           } else if (var9.k5(var2)) {
                              this.l6(var7);
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                        var8.dispose();
                     }
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

   @Override
   public final void n5(String var1) {
      if (this.l6.containsKey(var1)) {
         this.l6.removeItemByKey(var1);
      }
   }

   private l3 u3(String var1, y9w var2) {
      if (!this.l6.containsKey(var1)) {
         return null;
      }

      IGenericList var3 = this.l6.get_Item(var1);
      IGenericEnumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            l3 var5 = (l3)var4.next();
            if (var5.n5().u3(var2)) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   private void n5(String var1, l3 var2, IGenericList<a1h> var3) {
      if (var3 != null && var3.size() != 0) {
         var2.n5(var3);
      } else {
         this.l6.get_Item(var1).removeItem(var2);
      }
   }

   private void n5(r6t var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, p5c.class)) {
         p5c var2 = (p5c)var1;
         var2.q0();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, t4z.class)) {
         t4z var3 = (t4z)var1;
         var3.z1().q0();
      }
   }

   private void l6(r6t var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, p5c.class)) {
         p5c var2 = (p5c)var1;
         var2.z3();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, t4z.class)) {
         t4z var3 = (t4z)var1;
         var3.z1().z3();
      }
   }
}
