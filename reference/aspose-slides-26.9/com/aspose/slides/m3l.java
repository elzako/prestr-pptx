package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class m3l extends g3c {
   private List<k6a> n5 = new List<>();
   private l3d[] l6;
   private l3d[] k5;
   private l3d[] u3;
   private l3d[] a6;

   public final l3d[] k5() {
      return this.l6;
   }

   public final l3d[] u3() {
      return this.k5;
   }

   public final l3d[] a6() {
      return this.u3;
   }

   public final l3d[] u9() {
      return this.a6;
   }

   public m3l(com.aspose.slides.internal.k4y.n8z var1) {
   }

   @Override
   public void n5(k6a var1, l6s var2) {
      this.n5.addItem(var1);
      var1.n5(this);
   }

   @Override
   protected void L_() {
      this.c8();
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            this.n5(var2);
            v6s var3 = com.aspose.slides.internal.v6g.k5.n5(var2.s7(), v6s.class);
            if (var3 != null) {
               var3.c8(var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void n5(k6a var1) {
      IGenericEnumerator var2 = this.t9().iterator();

      try {
         while (var2.hasNext()) {
            l3d var3 = (l3d)var2.next();
            List var4 = var3.n5(var1);
            if (var4.size() > 0 && (var3.c8() != 21 || var3.x8() != 0.0 || var3.y4() == 1)) {
               boolean var5 = true;
               if (q3g.n5(var3.k5())) {
                  var5 = var3.y4() == 1 || var3.y4() == 2;
               }

               if (var5) {
                  double var6 = this.n5(var3, var1);
                  List$Enumerator var8 = var4.iterator();

                  try {
                     while (var8.hasNext()) {
                        k6a var9 = (k6a)var8.next();
                        double var10 = var9.n5(var3.k5());
                        if (var10 == 0.0 || var10 != var6 && var3.u3() != 1) {
                           var9.l6(var3.k5(), var6);
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
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private double n5(l3d var1, k6a var2) {
      double var3 = 0.0;
      if (var1.c8() == 21) {
         var3 = var1.x8();
      } else if (var1.h0() == 1) {
         var3 = this.n5(var2, var1.c8(), var1.u3(), var2.n5(var1));
      } else {
         l3d var5 = null;
         if (var2.m1() != null) {
            IGenericEnumerator var6 = var2.m1().t9().iterator();

            try {
               while (var6.hasNext()) {
                  l3d var7 = (l3d)var6.next();
                  if (var7 != var1
                     && var7.k5() == var1.c8()
                     && var7.u3() == var1.h0()
                     && com.aspose.slides.ms.System.d1.a6(var7.a6(), var1.t2())
                     && var7.u9() == var1.s7()
                     && (var7.y4() == 2 || var7.y4() == 1)) {
                     var5 = var7;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }

         if (var5 != null) {
            var3 = this.n5(var5, var2) * var2.n5(var1);
         } else if (q3g.n5(var1.c8())) {
            var3 = this.n5(var2, var1.c8(), 2, var2.n5(var1));
         }
      }

      return var3;
   }

   private double n5(k6a var1, int var2, int var3, double var4) {
      return (var3 == 1 ? var1.a6(var2) : var1.u9(var2)) * var4;
   }

   private List<l3d> n5(m3l$n5 var1) {
      List var2 = new List();
      IGenericEnumerator var3 = this.t9().iterator();

      try {
         while (var3.hasNext()) {
            l3d var4 = (l3d)var3.next();
            if (var1.n5(var4)) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private void c8() {
      List var1 = new List();
      List var2 = new List();
      IGenericEnumerator var3 = this.t9().iterator();

      try {
         while (var3.hasNext()) {
            l3d var4 = (l3d)var3.next();
            if (var4.c8() == 21) {
               var1.addItem(var4);
            } else {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      Dictionary var33 = n5(var2);
      if (var33.containsKey(1)) {
         List var5 = (List)var33.get_Item(1);
         n5((IGenericEnumerable<l3d>)var33.get_Item(1), var1);
      }

      List var34 = this.n5(w4a.class).t2();
      var34.addRange(this.z1().n5().t2());
      if (var33.containsKey(2)) {
         n5((IGenericEnumerable<l3d>)var33.get_Item(2), var34, var1);
      }

      if (var33.containsKey(3)) {
         n5((IGenericEnumerable<l3d>)var33.get_Item(3), var34, var1);
      }

      if (var1.size() < this.t9().n5()) {
         IGenericEnumerator var6 = this.t9().iterator();

         try {
            while (var6.hasNext()) {
               l3d var7 = (l3d)var6.next();
               if (!var1.containsItem(var7)) {
                  var1.addItem(var7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      this.a6 = this.n5(new m3l$1(this)).toArray(new l3d[0]);
      this.t9().l6();
      List$Enumerator var35 = var1.iterator();

      try {
         while (var35.hasNext()) {
            l3d var36 = (l3d)var35.next();
            if (var36.y4() != 4) {
               this.t9().n5(var36);
            } else {
               boolean var8 = false;
               List$Enumerator var9 = var1.iterator();

               try {
                  while (var9.hasNext()) {
                     l3d var10 = (l3d)var9.next();
                     if (var10 != var36
                        && var10.y4() == 3
                        && q3g.n5(var10.k5())
                        && com.aspose.slides.ms.System.d1.a6(var10.a6(), var36.a6())
                        && var10.u3() == var36.u3()
                        && var10.k5() == var36.k5()
                        && com.aspose.slides.ms.System.d1.a6(var10.t2(), var36.t2())
                        && var10.c8() == var36.c8()
                        && var10.u9() == var36.u9()) {
                        var8 = true;
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }

               if (!var8) {
                  this.t9().n5(var36);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
            var35.dispose();
         }
      }

      this.u3 = this.n5(new m3l$2(this)).toArray(new l3d[0]);
      this.k5 = this.n5(new m3l$3(this)).toArray(new l3d[0]);
      this.l6 = this.n5(new m3l$4(this)).toArray(new l3d[0]);
   }

   private static void n5(IGenericEnumerable<l3d> var0, List<l3d> var1) {
      List var2 = new List();
      List var3 = new List();
      IGenericEnumerator var4 = var0.iterator();

      try {
         while (var4.hasNext()) {
            l3d var5 = (l3d)var4.next();
            if (var5.h0() == 1) {
               var2.addItem(var5);
            } else {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.sort();
      var3.sort();
      var1.addRange(var2);
      var1.addRange(var3);
   }

   private static void n5(IGenericEnumerable<l3d> var0, IGenericEnumerable<w4a> var1, List<l3d> var2) {
      Dictionary var3 = l6(var0);
      if (var3.containsKey(com.aspose.slides.ms.System.d1.n5)) {
         n5((IGenericEnumerable<l3d>)var3.get_Item(com.aspose.slides.ms.System.d1.n5), var2);
         var3.removeItemByKey(com.aspose.slides.ms.System.d1.n5);
      }

      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            w4a var5 = (w4a)var4.next();
            if (var3.containsKey(var5.J_())) {
               n5((IGenericEnumerable<l3d>)var3.get_Item(var5.J_()), var2);
               var3.removeItemByKey(var5.J_());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static Dictionary<Integer, List<l3d>> n5(IGenericEnumerable<l3d> var0) {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            l3d var3 = (l3d)var2.next();
            List var4;
            if (!var1.containsKey(var3.u3())) {
               var4 = new List();
               var1.addItem(var3.u3(), var4);
            } else {
               var4 = (List)var1.get_Item(var3.u3());
            }

            var4.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static Dictionary<String, List<l3d>> l6(IGenericEnumerable<l3d> var0) {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            l3d var3 = (l3d)var2.next();
            List var4;
            if (!var1.containsKey(var3.a6())) {
               var4 = new List();
               var1.addItem(var3.a6(), var4);
            } else {
               var4 = (List)var1.get_Item(var3.a6());
            }

            var4.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static boolean a6(l3d var0) {
      return var0.u3() == 1 && var0.h0() == 1 && var0.c8() != 21;
   }

   private static boolean u9(l3d var0) {
      return var0.u3() == 1 && var0.h0() != 1 && var0.c8() != 21;
   }

   private static boolean h0(l3d var0) {
      return var0.u3() != 1 && var0.c8() != 21;
   }

   private static boolean c8(l3d var0) {
      return var0.y4() == 2;
   }

   // $VF: synthetic method
   static boolean n5(l3d var0) {
      return c8(var0);
   }

   // $VF: synthetic method
   static boolean l6(l3d var0) {
      return h0(var0);
   }

   // $VF: synthetic method
   static boolean k5(l3d var0) {
      return u9(var0);
   }

   // $VF: synthetic method
   static boolean u3(l3d var0) {
      return a6(var0);
   }
}
