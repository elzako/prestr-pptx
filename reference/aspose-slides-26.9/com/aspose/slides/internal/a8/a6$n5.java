package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.j3.j5;
import com.aspose.slides.internal.q0.e2;
import com.aspose.slides.internal.w8.e9;
import com.aspose.slides.internal.w8.y0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

class a6$n5 {
   private com.aspose.slides.internal.w5.k5 n5;
   private e2 l6;
   private IGenericList<a6$n5$n5> k5 = new List<>();

   public a6$n5(com.aspose.slides.internal.w5.k5 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.w5.k5 n5() {
      IGenericEnumerator var1 = this.n5.y1().iterator();

      try {
         while (var1.hasNext()) {
            r4 var2 = (r4)var1.next();
            com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w5.k5.class);
            if (var3 != null && (com.aspose.slides.internal.v6g.k5.l6(var3, y0.class) || var3.a3().k7().h0() == 15)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.w5.k5 l6() {
      IGenericEnumerator var1 = this.n5.y1().iterator();

      try {
         while (var1.hasNext()) {
            r4 var2 = (r4)var1.next();
            com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w5.k5.class);
            if (var3 != null && var3.a3().k7().h0() == 9) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.w5.k5 k5() {
      IGenericEnumerator var1 = this.n5.y1().iterator();

      try {
         while (var1.hasNext()) {
            r4 var2 = (r4)var1.next();
            com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w5.k5.class);
            if (var3 != null && var3.a3().k7().h0() == 10) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   public final IGenericList<com.aspose.slides.internal.w5.k5> n5(com.aspose.slides.internal.w5.k5 var1) {
      List var2 = new List();
      com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.t4(), com.aspose.slides.internal.w5.k5.class);
      if (this.n5.a3().m1() == 1) {
         while (var3 != null) {
            var2.insertItem(0, var3);
            var3 = com.aspose.slides.internal.v6g.k5.n5(var3.m1(), com.aspose.slides.internal.w5.k5.class);
         }
      } else {
         while (var3 != null) {
            var2.addItem(var3);
            var3 = com.aspose.slides.internal.v6g.k5.n5(var3.m1(), com.aspose.slides.internal.w5.k5.class);
         }
      }

      return var2;
   }

   public final IGenericList<com.aspose.slides.internal.w5.k5> u3() {
      List var1 = new List();
      IGenericEnumerator var2 = this.n5.y1().iterator();

      try {
         while (var2.hasNext()) {
            r4 var3 = (r4)var2.next();
            com.aspose.slides.internal.w5.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.w5.k5.class);
            if (var4 != null && "TBODY".equals(var4.a6())) {
               var1.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1.size() == 0) {
         var1.addItem(this.n5);
      }

      return var1;
   }

   public final IGenericList<com.aspose.slides.internal.w5.k5> l6(com.aspose.slides.internal.w5.k5 var1) {
      List var2 = new List();

      for (com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.t4(), com.aspose.slides.internal.w5.k5.class);
         var3 != null;
         var3 = (com.aspose.slides.internal.w5.k5)var3.m1()
      ) {
         if (var3.a3().k7().h0() == 8) {
            for (com.aspose.slides.internal.w5.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.t4(), com.aspose.slides.internal.w5.k5.class);
               var4 != null;
               var4 = (com.aspose.slides.internal.w5.k5)var4.m1()
            ) {
               if (var4.a3().k7().h0() == 11) {
                  var2.addItem(var4);
               }
            }
         } else if (var3.a3().k7().h0() == 11 || d1.a6(var3.a6(), "TR")) {
            var2.addItem(var3);
         }
      }

      return var2;
   }

   public final IGenericList<e9> k5(com.aspose.slides.internal.w5.k5 var1) {
      List var2 = new List();
      if (var1 != null) {
         j5 var3 = this.n5.h0("COL");
         IGenericEnumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               e9 var5 = (e9)var4.next();
               var2.addItem(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      return var2;
   }

   public final IGenericList<com.aspose.slides.internal.w5.k5> a6() {
      List var1 = new List();

      for (com.aspose.slides.internal.w5.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6().t4(), com.aspose.slides.internal.w5.k5.class);
         var2 != null;
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.m1(), com.aspose.slides.internal.w5.k5.class)
      ) {
         if (var2.a3().k7().h0() == 11) {
            var1.addItem(var2);
         }
      }

      return var1;
   }

   public final IGenericList<com.aspose.slides.internal.w5.k5> u9() {
      List var1 = new List();

      for (com.aspose.slides.internal.w5.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5().t4(), com.aspose.slides.internal.w5.k5.class);
         var2 != null;
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.m1(), com.aspose.slides.internal.w5.k5.class)
      ) {
         if (var2.a3().k7().h0() == 11) {
            var1.addItem(var2);
         }
      }

      return var1;
   }

   public final void h0() {
      if (!this.n5.a3().f5().h0()) {
         this.l6 = this.n5.a3().f5().c8();
      }

      IGenericEnumerator var1 = this.u3().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.w5.k5 var2 = (com.aspose.slides.internal.w5.k5)var1.next();
            this.u3(var2);
            e2 var3 = this.t2();
            if (var3.l6() != 0.0F) {
               this.l6 = n5(var3, this.l6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void u3(com.aspose.slides.internal.w5.k5 var1) {
      List var2 = new List();
      IGenericEnumerator var3 = this.k5(var1).iterator();

      try {
         while (var3.hasNext()) {
            e9 var4 = (e9)var3.next();
            if (!var4.a3().f5().h0()) {
               var2.addItem(new a6$n5$n5(var4.a3().f5().c8(), true));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var18 = this.l6(var1).iterator();

      try {
         while (var18.hasNext()) {
            com.aspose.slides.internal.w5.k5 var5 = (com.aspose.slides.internal.w5.k5)var18.next();
            IGenericList var6 = this.n5(var5);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               com.aspose.slides.internal.w5.k5 var8 = (com.aspose.slides.internal.w5.k5)var6.get_Item(var7);
               e2 var9 = null;
               boolean var10 = false;
               if (var8.a3().f5().h0()) {
                  if (this.n5.a3().y0() != 0 || var7 < var2.size() && !((a6$n5$n5)var2.get_Item(var7)).l6()) {
                     var9 = this.a6(var8);
                     var10 = false;
                  }
               } else {
                  var9 = var8.a3().f5().c8();
                  var10 = true;
               }

               if (var9 != null) {
                  if (var7 >= var2.size()) {
                     var2.addItem(new a6$n5$n5(var9, var10));
                  } else {
                     var2.set_Item(var7, new a6$n5$n5(n5(((a6$n5$n5)var2.get_Item(var7)).n5(), var9), ((a6$n5$n5)var2.get_Item(var7)).l6() || var10));
                  }
               }
            }

            this.k5 = var2;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }
   }

   private static e2 n5(e2 var0, e2 var1) {
      if (var0 == var1) {
         return var0;
      }

      if (j8.l6(var0, null)) {
         return var1;
      }

      if (j8.l6(var1, null)) {
         return var0;
      }

      if (var0.n5() == var1.n5()) {
         return var0.l6() > var1.l6() ? var0 : var1;
      }

      if (var0.n5() == 1) {
         return var1;
      }

      if (var1.n5() == 1) {
         return var0;
      }

      float var2 = com.aspose.slides.internal.w3.u3.n5(com.aspose.slides.internal.w3.u3.l6(var0.toString()));
      float var3 = com.aspose.slides.internal.w3.u3.n5(com.aspose.slides.internal.w3.u3.l6(var1.toString()));
      return var2 > var3 ? var0 : var1;
   }

   private e2 a6(com.aspose.slides.internal.w5.k5 var1) {
      if (var1.y1() != null && var1.y1().n5() != 0) {
         IGenericEnumerator var2 = var1.y1().iterator();

         try {
            while (var2.hasNext()) {
               r4 var3 = (r4)var2.next();
               com.aspose.slides.internal.w5.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.w5.k5.class);
               if (var4 != null) {
                  if (!var4.a3().f5().h0()) {
                     return var4.a3().f5().c8();
                  }

                  e2 var5 = this.a6(var4);
                  if (var5 != null) {
                     return var5;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public final IGenericList<a6$n5$n5> c8() {
      return this.k5;
   }

   public final e2 t2() {
      float var1 = 0.0F;
      if (this.c8() != null) {
         for (int var2 = 0; var2 < this.c8().size(); var2++) {
            a6$n5$n5 var3 = this.c8().get_Item(var2);
            if (var3 != null && var3.n5() != null && var3.n5().n5() != 1) {
               var1 += com.aspose.slides.internal.w3.u3.n5(com.aspose.slides.internal.w3.u3.l6(var3.n5().toString()));
            }
         }
      }

      var1 = com.aspose.slides.internal.w3.u3.k5(var1);
      return new e2(var1, 4);
   }
}
