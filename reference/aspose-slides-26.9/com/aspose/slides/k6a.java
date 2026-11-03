package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;

class k6a extends p6x {
   private k7t n5;
   private final List<l6s> l6;
   private final l6s k5;
   private final List<k6a> u3;
   private e4c a6 = new e4c();
   private e4c u9 = new e4c();
   private e4c h0 = new e4c();
   private w4a c8;
   private d5 t2;
   private m3l s7;
   private r9i x8;
   private Dictionary<Integer, Double> n3;
   private Dictionary<Integer, Double> y4;
   private Dictionary<Integer, Double> e2;
   private Dictionary<Integer, Double> t9;
   private double z1 = 0.0;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9("l", "r", "std", "init");

   public final k6a n5() {
      return (k6a)super.n3();
   }

   public final List<k6a> l6() {
      return this.u3;
   }

   public final k6a k5() {
      return (k6a)super.q0();
   }

   public final k6a u3() {
      return (k6a)super.z3();
   }

   public final l6s a6() {
      return this.k5;
   }

   public final List<l6s> u9() {
      return this.l6;
   }

   public final w4a h0() {
      return this.c8;
   }

   public final k7t c8() {
      return this.n5;
   }

   public final k6a t2() {
      k6a var1 = this;

      while (var1.n5() != null) {
         var1 = var1.n5();
      }

      return var1;
   }

   public final d5 s7() {
      return this.t2;
   }

   public final void n5(d5 var1) {
      this.t2 = var1;
   }

   public final m3l m1() {
      return this.s7;
   }

   public final void n5(m3l var1) {
      this.s7 = var1;
   }

   public final r9i k7() {
      return this.x8;
   }

   public final void n5(r9i var1) {
      this.x8 = var1;
   }

   public final e4c m3() {
      return this.a6;
   }

   public final e4c z8() {
      return this.u9;
   }

   public final e4c j5() {
      return this.h0;
   }

   public final void n5(e4c var1) {
      var1.l6(this.h0);
   }

   public k6a(k6a var1, w4c var2, w4a var3, l6s var4) {
      super(var1, var2);
      com.aspose.slides.internal.k4y.a6w var5 = var2.k5();
      double var6 = var5.y4();
      double var8 = var5.e2();
      this.h0 = new e4c(var6 != 0.0 ? var6 / 100000.0 : 1.0, var8 != 0.0 ? var8 / 100000.0 : 1.0);
      this.a6 = new e4c(var5.t9() / 100000.0, var5.z1() / 100000.0);
      this.u9 = new e4c(var5.t4() / 100000.0, var5.q0() / 100000.0);
      this.k5 = var4;
      this.u3 = new List<>();
      this.l6 = new List<>();
      this.n3 = new Dictionary<>();
      this.y4 = new Dictionary<>();
      this.c8 = var3;
      this.n5 = new k7t(this);
      this.c8.k5().addItem(this);
   }

   @Override
   public void n5(t6w var1) {
      List$Enumerator var2 = this.u9().iterator();

      try {
         while (var2.hasNext()) {
            l6s var3 = (l6s)var2.next();
            var1.n5(2, var3.y4(), this.y4(), this.c8.z1().l6().k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var12 = this.l6().iterator();

      try {
         while (var12.hasNext()) {
            k6a var4 = (k6a)var12.next();
            var1.n5(3, this.y4(), var4.y4(), this.c8.z1().l6().k5());
            var4.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   public final double n5(int var1) {
      return this.n3.containsKey(var1) ? this.n3.get_Item(var1) : 0.0;
   }

   public final void n5(int var1, double var2) {
      if (!this.e2.containsKey(var1)) {
         this.e2.addItem(var1, var2);
      } else if (com.aspose.slides.ms.System.q1.n5(this.e2.get_Item(var1)) > com.aspose.slides.ms.System.q1.n5(var2)) {
         this.e2.set_Item(var1, var2);
      }

      this.l6(var1, var2);
   }

   public final void l6(int var1, double var2) {
      if (this.e2.containsKey(var1) && com.aspose.slides.ms.System.q1.n5(this.e2.get_Item(var1)) < com.aspose.slides.ms.System.q1.n5(var2)) {
         var2 = this.e2.get_Item(var1);
      }

      if (this.n3.containsKey(var1)) {
         this.n3.set_Item(var1, var2);
      } else {
         this.n3.addItem(var1, var2);
      }
   }

   public final boolean l6(int var1) {
      return this.n3.containsKey(var1);
   }

   public final boolean k5(int var1) {
      return this.e2.containsKey(var1);
   }

   public final void n5(double var1, int... var3) {
      for (int var7 : var3) {
         this.n5(var1, var7);
      }
   }

   public final void n5(double var1, int var3) {
      if (!(var1 >= 1.0)) {
         k7m var4 = com.aspose.slides.internal.v6g.k5.n5(this.s7().n5(), k7m.class);
         boolean var5 = var4 != null && q3g.n5(var3);
         if (var5) {
            if (var4.k5() != 0.0) {
               this.a6(61, this.a6(61) * var1);
               this.a6(15, this.a6(15) * var1);
            } else {
               double var6 = var3 == 61 ? this.c8().s7() : this.c8().e2();
               double var8 = this.a6(var3);
               if (var8 < var6) {
                  var8 = var6;
               }

               this.a6(var3, var8 * var1);
            }
         } else {
            double var19;
            if (var3 == 61) {
               if (this.l6(61) && this.l6(63)) {
                  var19 = this.a6(var3);
                  this.a6(63, this.a6(63) * var1);
               } else {
                  var19 = this.c8().c8();
               }
            } else if (var3 == 15) {
               if (this.l6(15) && this.l6(17)) {
                  var19 = this.a6(var3);
                  this.a6(17, this.a6(17) * var1);
               } else {
                  var19 = this.c8().n3();
               }
            } else {
               var19 = this.a6(var3);
            }

            this.a6(var3, var19 * var1);
         }

         List$Enumerator var10 = this.l6().iterator();

         try {
            while (var10.hasNext()) {
               k6a var11 = (k6a)var10.next();
               if (var5) {
                  if (var4.k5() != 0.0) {
                     var11.n5(var1, 61);
                     var11.n5(var1, 15);
                  } else if (var11.s7().a6()) {
                     var11.n5(var1, var3);
                  } else if (var3 == 61 && this.c8().k5(13) != 0.0) {
                     double var22 = this.c8().k5(13);
                     var11.n5(var1 * (1.0 - (1.0 - var22) / 4.0), var3);
                  } else if (var3 == 15 && this.c8().k5(14) != 0.0) {
                     double var21 = this.c8().k5(14);
                     var11.n5(var1 * (1.0 - (1.0 - var21) / 4.0), var3);
                  } else {
                     double var12;
                     double var20;
                     if (var3 == 61) {
                        var20 = com.aspose.slides.ms.System.q1.k5(this.c8().h0() * var1, this.t9.get_Item(61));
                        var12 = var11.c8().c8();
                     } else {
                        var20 = com.aspose.slides.ms.System.q1.k5(this.c8().x8() * var1, this.t9.get_Item(15));
                        var12 = var11.c8().n3();
                     }

                     double var14 = var20 / var12;
                     if (var14 < 1.0) {
                        var11.n5(com.aspose.slides.ms.System.q1.l6(var1, var14), var3);
                     }
                  }
               } else {
                  var11.n5(var1, var3);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }
      }
   }

   public final void w1() {
      List$Enumerator var1 = this.l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            var2.w1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      Dictionary$KeyCollection$Enumerator var11 = this.t9.getKeys().iterator();

      try {
         while (var11.hasNext()) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(var11.next(), int.class);
            this.u3(var3, this.t9.get_Item(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      this.t9.clear();
   }

   public final void k5(int var1, double var2) {
      if (this.e2.containsKey(var1) && com.aspose.slides.ms.System.q1.n5(this.e2.get_Item(var1)) < com.aspose.slides.ms.System.q1.n5(var2)) {
         var2 = this.e2.get_Item(var1);
      }

      if (!this.y4.containsKey(var1)) {
         this.y4.addItem(var1, var2);
      } else {
         this.y4.set_Item(var1, var2);
      }

      if (var1 == 22 || var1 == 27) {
         this.c8().v4();
      }
   }

   public final void u3(int var1, double var2) {
      this.n5(var1, var2, false);
   }

   public final void n5(int var1, double var2, boolean var4) {
      if (!this.e2.containsKey(var1)) {
         this.e2.addItem(var1, var2);
      } else if (var4 || com.aspose.slides.ms.System.q1.n5(this.e2.get_Item(var1)) > com.aspose.slides.ms.System.q1.n5(var2)) {
         this.e2.set_Item(var1, var2);
      }

      this.k5(var1, var2);
   }

   private void a6(int var1, double var2) {
      if (!this.t9.containsKey(var1)) {
         this.t9.addItem(var1, var2);
      } else {
         this.t9.set_Item(var1, var2);
      }
   }

   public final double u3(int var1) {
      return this.e2.containsKey(var1) ? this.e2.get_Item(var1) : Double.MAX_VALUE;
   }

   public final double a6(int var1) {
      if (this.y4.containsKey(var1)) {
         return this.y4.get_Item(var1);
      }

      if (this.n3.containsKey(var1)) {
         return this.n3.get_Item(var1);
      }

      if (q3g.n5(var1)) {
         if (var1 == 61 && this.c8().c8() != 0.0) {
            return this.c8().c8();
         } else if (var1 == 15 && this.c8().n3() != 0.0) {
            return this.c8().n3();
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(this.n5().s7(), v6s.class) ? this.n5().u9(var1) : 0.0;
         }
      } else {
         switch (var1) {
            case 1:
               return this.c8().k5(1) + this.c8().n3();
            case 8:
               return this.c8().k5(0) + this.c8().c8() / 2.0;
            case 10:
               return this.c8().k5(1) + this.c8().n3() / 2.0;
            case 18:
               return this.c8().k5(0);
            case 24:
               return this.c8().k5(0) + this.c8().c8();
            case 32:
               return this.c8().k5(1);
            default:
               return 0.0;
         }
      }
   }

   public final double u9(int var1) {
      k7m var2 = com.aspose.slides.internal.v6g.k5.n5(this.t2.n5(), k7m.class);
      if (var2 != null && var2.k5() != 0.0 && q3g.n5(var1)) {
         e4c var3 = q3g.n5(var2.k5(), this.a6(61), this.a6(15)).u9();
         return var1 == 61 ? var3.n5 : var3.l6;
      } else {
         return this.a6(var1);
      }
   }

   public final double h0(int var1) {
      double var2 = Double.NaN;
      if (this.x8 != null) {
         for (j2l var7 : this.x8.u3()) {
            if (var7.a6() == var1 && var7.k5() == 1) {
               return var7.c8();
            }
         }
      }

      return var2;
   }

   public final double n5(l3d var1) {
      double var2 = var1.n3();
      if (this.x8 != null) {
         for (j2l var7 : this.x8.k5()) {
            if (var7.k5() == var1.u3()
               && com.aspose.slides.ms.System.d1.a6(var7.u3(), var1.a6())
               && var7.a6() == var1.k5()
               && var1.h0() != 1
               && var7.u9() < var2) {
               var2 = var7.u9();
            }
         }
      }

      return var2;
   }

   public final List<k6a> n5(int var1, String var2, int var3) {
      List var4 = new List();
      this.n5(this, var1, var2, var3, var4);
      return var4;
   }

   public final k6a n5(String var1) {
      List$Enumerator var2 = this.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            List$Enumerator var4 = var3.u9().iterator();

            try {
               while (var4.hasNext()) {
                  l6s var5 = (l6s)var4.next();
                  if (com.aspose.slides.ms.System.d1.a6(var5.t9(), var1)) {
                     return var3;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            k6a var15 = var3.n5(var1);
            if (var15 != null) {
               return var15;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final k6a n5(String var1, l6s var2) {
      if (!com.aspose.slides.ms.System.d1.a6(this.h0().J_(), var1) || var2 != null && this.a6() != var2) {
         List$Enumerator var3 = this.l6().iterator();

         try {
            while (var3.hasNext()) {
               k6a var4 = (k6a)var3.next();
               k6a var5 = var4.n5(var1, var2);
               if (var5 != null) {
                  return var5;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return null;
      } else {
         return this;
      }
   }

   public final List<k6a> r4() {
      List var1 = new List();
      List$Enumerator var2 = this.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (!com.aspose.slides.internal.v6g.k5.l6(var3.t2, o7p.class)) {
               var1.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final void c4() {
      this.z1 = 0.0;
      this.n3 = new Dictionary<>();
      this.y4 = new Dictionary<>();
      this.t9 = new Dictionary<>();
      this.e2 = new Dictionary<>();
      this.c8().o0();
      List$Enumerator var1 = this.l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            var2.c4();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (this.x8 != null) {
         for (j2l var5 : this.x8.u3()) {
            if (var5.k5() == 3 && q3g.l6(var5.a6())) {
               List var6 = var5.n5(this);
               List$Enumerator var7 = var6.iterator();

               try {
                  while (var7.hasNext()) {
                     k6a var8 = (k6a)var7.next();
                     var8.c8().u6();
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }
            }
         }
      }
   }

   public final void y2() {
      for (boolean var1 = this.f2(); !var1 && this.z1 < 100.0; this.z1++) {
         this.p8();
         var1 = this.f2();
      }
   }

   public final void y1() {
      List$Enumerator var1 = this.l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            e4c var3 = this.t2.k5(var2).u9();
            if (var3.n5 != 0.0 || var3.l6 != 0.0) {
               var2.l6(var3.u9()).l6(var3);
               var2.c8().n5(var3.n5, var3.l6);
               var2.c8().l6(var3.n5, var3.l6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var12 = this.l6().iterator();

      try {
         while (var12.hasNext()) {
            k6a var13 = (k6a)var12.next();
            var13.y1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   public final void a0() {
      if (this.m1() != null) {
         for (l3d var4 : this.m1().u9()) {
            if (var4.k5() == 7) {
               List var5 = var4.n5(this);
               double var6 = Double.NaN;
               List$Enumerator var8 = var5.iterator();

               try {
                  while (var8.hasNext()) {
                     k6a var9 = (k6a)var8.next();
                     o7p var10 = com.aspose.slides.internal.v6g.k5.n5(var9.s7(), o7p.class);
                     if (var10 != null) {
                        double var11 = var10.c8(var9);
                        if (!com.aspose.slides.ms.System.d2.k5(var11) && (com.aspose.slides.ms.System.d2.k5(var6) || var6 > var11)) {
                           var6 = var11;
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               if (!com.aspose.slides.ms.System.d2.k5(var6)) {
                  List$Enumerator var30 = var5.iterator();

                  try {
                     while (var30.hasNext()) {
                        k6a var31 = (k6a)var30.next();
                        var31.u3(7, var6);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                        var30.dispose();
                     }
                  }
               }
            }
         }
      }

      this.t2.l6(this);
      List$Enumerator var28 = this.l6().iterator();

      try {
         while (var28.hasNext()) {
            k6a var29 = (k6a)var28.next();
            var29.a0();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }
   }

   public final void d2() {
      this.c8().b3();
      List$Enumerator var1 = this.l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            var2.d2();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final void d5() {
      this.p8();
      this.y2();
   }

   private void p8() {
      this.d2();
      Stack var1 = new Stack();
      this.n5(var1);

      while (var1.size() != 0) {
         ((k6a)var1.pop()).y2();
      }
   }

   private boolean f2() {
      this.t2.u3(this);
      if (!this.e5()) {
         this.t2.u9(this);
         this.p8();
      }

      boolean var1 = this.t2.u9(this);
      if (!var1) {
         this.p8();
      }

      this.i1();
      boolean var2 = this.t2.n5(this);
      if (var2) {
         var2 &= this.n5(this);
      }

      if (var2) {
         var2 &= var1;
      }

      if (var2) {
         var2 = this.t2.a6(this);
      }

      return var2;
   }

   private boolean n5(k6a var1) {
      boolean var2 = true;
      if (var1.k7() != null) {
         double var3 = Double.MAX_VALUE;
         List var5 = new List();

         for (j2l var9 : var1.k7().u3()) {
            List var10 = var9.l6(var1);
            List$Enumerator var11 = var10.iterator();

            try {
               while (var11.hasNext()) {
                  k6a var12 = (k6a)var11.next();
                  if (!var5.containsItem(var12)) {
                     var5.addItem(var12);
                     h3o var13 = com.aspose.slides.internal.v6g.k5.n5(var12.s7(), h3o.class);
                     var3 = com.aspose.slides.ms.System.q1.k5(var3, var12.a6(var9.a6()));
                     var2 &= var13.n5(var12, var9.c8(), var9.c8());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }
         }

         if (!var2) {
            List$Enumerator var22 = var5.iterator();

            try {
               while (var22.hasNext()) {
                  k6a var23 = (k6a)var22.next();
                  h3o.l6(var23, var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
                  var22.dispose();
               }
            }

            return false;
         }
      }

      return var2;
   }

   private void i1() {
      if (this.s7 != null) {
         for (l3d var4 : this.s7.u9()) {
            if (q3g.n5(var4.k5())) {
               n5(var4.n5(this), var4.k5());
            }
         }
      }
   }

   private static void n5(List<k6a> var0, int var1) {
      double var2 = Double.NaN;
      List$Enumerator var4 = var0.iterator();

      try {
         while (var4.hasNext()) {
            k6a var5 = (k6a)var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5.s7(), h3o.class) && var5.c8().m1()) {
               boolean var6 = var1 == 15 ? var5.c8().y1() : var5.c8().y2();
               if (var6) {
                  double var7 = var5.a6(var1);
                  if (com.aspose.slides.ms.System.d2.k5(var2) || var2 < var7) {
                     var2 = var7;
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (!com.aspose.slides.ms.System.d2.k5(var2)) {
         List$Enumerator var17 = var0.iterator();

         try {
            while (var17.hasNext()) {
               k6a var18 = (k6a)var17.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var18.s7(), h3o.class)) {
                  double var19 = var18.a6(var1);
                  if (q3g.l6(var19, var2)) {
                     if (var1 == 15) {
                        var18.c8().u9(var2);
                     } else if (var1 == 61) {
                        var18.c8().k5(var2);
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }
      }
   }

   private boolean e5() {
      boolean var1 = true;
      if (this.s7 != null) {
         for (l3d var5 : this.s7.u9()) {
            if (q3g.l6(var5.k5())) {
               var1 &= l6(var5.n5(this), var5.k5());
            }
         }

         for (l3d var10 : this.s7.a6()) {
            if (var10.k5() == 22 && var10.c8() == 22 && var10.y4() == 2) {
               List var6 = var10.n5(this);
               var6.addRange(var10.k5(this));
               if (var6.size() > 1) {
                  var1 &= l6(var6, var10.k5());
               }
            }
         }
      }

      return var1;
   }

   private static boolean l6(List<k6a> var0, int var1) {
      boolean var2 = true;
      double var3 = Double.NaN;
      List$Enumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            k6a var6 = (k6a)var5.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var6.s7(), h3o.class) && var6.c8().m1() && !var6.c8().y1()) {
               double var7 = var6.a6(var1);
               if (com.aspose.slides.ms.System.d2.k5(var3) || var3 > var7) {
                  var3 = var7;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (!com.aspose.slides.ms.System.d2.k5(var3)) {
         List$Enumerator var20 = var0.iterator();

         try {
            while (var20.hasNext()) {
               k6a var10 = (k6a)var20.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var10.s7(), h3o.class) && var10.c8().m1()) {
                  double var11 = var10.a6(var1);
                  if (var3 < var11 && q3g.l6(var11, var3)) {
                     var10.u3(var1, var3);
                     var2 = false;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }
      }

      return var2;
   }

   public final int n5(w4a var1) {
      String var2 = var1.n5(7, this);
      switch (t4.n5(var2)) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 3;
         case 3:
         default:
            return 4;
      }
   }

   public final boolean s3() {
      return this.n5.l6() != null
         && (com.aspose.slides.internal.v6g.k5.l6(this.t2, h3o.class) || com.aspose.slides.internal.v6g.k5.l6(this.t2, b2l.class) && !this.n5.t4())
         && this.n5.c8() != 0.0
         && this.n5.n3() != 0.0;
   }

   @Override
   public String toString() {
      return this.s7().toString();
   }

   @Override
   protected List<p6x> x8() {
      List var1 = new List(this.u3.size());
      List$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void n5(k6a var1, int var2, String var3, int var4, List<k6a> var5) {
      if (var2 == 1) {
         var5.addItem(var1);
      } else if (var2 != 0) {
         List$Enumerator var6 = var1.l6().iterator();

         try {
            while (var6.hasNext()) {
               k6a var7 = (k6a)var6.next();
               if (com.aspose.slides.ms.System.d1.a6(var3, var7.h0().J_())) {
                  var5.addItem(var7);
               } else if (com.aspose.slides.ms.System.d1.n5(var3)) {
                  boolean var8 = var4 == 1;
                  if (!var8) {
                     List$Enumerator var9 = var7.u9().iterator();

                     try {
                        while (var9.hasNext()) {
                           l6s var10 = (l6s)var9.next();
                           if (var10.n5(var10.e2(), var4)) {
                              var8 = true;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                           var9.dispose();
                        }
                     }
                  }

                  if (var8) {
                     var5.addItem(var7);
                  }
               }

               if (var2 == 3) {
                  this.n5(var7, var2, var3, var4, var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   private void n5(Stack<k6a> var1) {
      List$Enumerator var2 = this.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            var1.push(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var12 = this.l6().iterator();

      try {
         while (var12.hasNext()) {
            k6a var4 = (k6a)var12.next();
            var4.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   private e4c l6(e4c var1) {
      double var2 = var1.n5;
      double var4 = var1.l6;
      e4c var6 = this.h0().z1().u3().u9();
      double var7 = this.c8().u3() + var1.n5;
      double var9 = var7 + this.c8().h0();
      if (var7 < 0.0) {
         var2 -= var7;
      } else if (var9 > var6.n5) {
         var2 -= var9 - var6.n5;
      }

      double var11 = this.c8().a6() + var1.l6;
      double var13 = var11 + this.c8().x8();
      if (var11 < 0.0) {
         var4 -= var11;
      } else if (var13 > var6.l6) {
         var4 -= var13 - var6.l6;
      }

      return new e4c(var2, var4);
   }
}
