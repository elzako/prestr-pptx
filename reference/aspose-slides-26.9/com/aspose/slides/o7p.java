package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o7p extends d5 {
   @Override
   public boolean a6() {
      return false;
   }

   @Override
   public boolean k5() {
      return this.c8().a6() == 1;
   }

   @Override
   public boolean n5(k6a var1) {
      var1.c8().k5(var1.a6(61));
      var1.c8().u9(var1.a6(15));
      return true;
   }

   @Override
   public void l6(k6a var1) {
      k7t var2 = null;
      k7t var3 = null;
      k7t[] var4 = new k7t[]{var2};
      k7t[] var5 = new k7t[]{var3};
      n5(var1, this.c8(), var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      if (var2 != null && var3 != null) {
         u6x var6 = this.n5(var1, var2, var3).z1();
         double var7 = var1.a6(7);
         if (var7 != 0.0 && var7 < var6.n3()) {
            e4c var9 = var6.x8().u9();
            e4c var10 = new e4c(var6.a6() - var9.n5, var6.u9() - var9.l6);
            e4c var11 = new e4c(var6.h0() - var9.n5, var6.c8() - var9.l6);
            double var12 = var6.n3() / 2.0;
            e4c.n5(var10, var12).l6(var10);
            e4c.n5(var11, var12).l6(var11);
            double var14 = var7 / 2.0;
            var6 = new u6x(var9.n5 + var10.n5 * var14, var9.l6 + var10.l6 * var14, var9.n5 + var11.n5 * var14, var9.l6 + var11.l6 * var14);
         } else {
            var1.k5(7, var6.n3());
         }

         this.u3(var1);
         k7t var22 = var1.c8();
         var22.x8(0.0);
         var22.l6().R_().n5((byte)-1);
         var22.l6().R_().l6((byte)-1);
         y8 var23 = this.n5(var1, var6.z1());
         int var24 = var1.c8().l6().getShapeType();
         u6x var16 = new u6x();
         if (this.c8().c8() == 0) {
            this.n5(var1, var23).u3(var16);
         } else if (this.c8().c8() == 1) {
            this.n5(var1, var23, var2, var3).u3(var16);
         } else if (this.c8().c8() == 2 || this.c8().c8() == 3) {
            e4c var17 = this.n5(this.s7(var2.n5()).c8()).u9();
            this.n5(var1, var23, var17.u9()).u3(var16);
         }

         if (var24 != -1) {
            var22.l6().n5(var24);
         }

         var22.n5(var16.n5() + (var22.c8() - var22.h0()) / 2.0);
         var22.l6(var16.l6() + (var22.n3() - var22.x8()) / 2.0);
         var22.k5(var16.t2());
         var22.u9(var16.s7());
         e4c var26 = e4c.n5(var1.m3(), var1.z8()).u9();
         double var25 = var26.n5 * var22.c8();
         double var18 = var26.l6 * var22.n3();
         var22.n5(var25, var18);
         var22.l6(var25, var18);
      }
   }

   @Override
   public e4c k5(k6a var1) {
      return e4c.k5;
   }

   public final double c8(k6a var1) {
      k7t var2 = null;
      k7t var3 = null;
      k7t[] var4 = new k7t[]{var2};
      k7t[] var5 = new k7t[]{var3};
      n5(var1, this.c8(), var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return var2 != null && var3 != null ? this.n5(var1, var2, var3).n3() : Double.NaN;
   }

   private u6x n5(k6a var1, y8 var2) {
      u6x var3 = new u6x();
      if (this.c8().a6() == 1) {
         l6w.l6(var1.c8().l6(), var2).u3(var3);
      } else {
         l6w.n5(var1.c8().l6(), var2).u3(var3);
         if (this.c8().s7()) {
            var1.c8().n5((byte)5);
         }

         if (this.c8().x8()) {
            var1.c8().l6((byte)5);
         }
      }

      var1.c8().x8(q3g.k5(var2.s7().y4() + var1.c8().k5()));
      return var3;
   }

   private u6x n5(k6a var1, y8 var2, k7t var3, k7t var4) {
      u6x var5 = var2.s7().z1();
      e4c[] var6 = l6w.n5(var1, var5.z1(), var3, var4, this.c8().t2());
      double var7 = var2.u9();
      double var9 = var2.h0();
      u6x var11 = new u6x(var6[0].n5, var6[0].l6, var6[1].n5, var6[1].l6);
      e4c var12 = var11.e2().u9();
      var6[0] = new e4c(
         var6[0].n5 - var12.n5 * com.aspose.slides.ms.System.q1.k5(var7, var11.n3()),
         var6[0].l6 - var12.l6 * com.aspose.slides.ms.System.q1.k5(var7, var11.n3())
      );
      int var13 = var6.length - 1;
      u6x var14 = new u6x(var6[var13].n5, var6[var13].l6, var6[var13 - 1].n5, var6[var13 - 1].l6);
      e4c var15 = var14.e2().u9();
      var6[var13] = new e4c(
         var6[var13].n5 - var15.n5 * com.aspose.slides.ms.System.q1.k5(var9, var14.n3()),
         var6[var13].l6 - var15.l6 * com.aspose.slides.ms.System.q1.k5(var9, var14.n3())
      );
      if (this.c8().s7()) {
         var1.c8().n5((byte)5);
      }

      if (this.c8().x8()) {
         var1.c8().l6((byte)5);
      }

      l6w.n5(var1.c8().l6(), new e4c(var5.n5(), var5.l6()), var6);
      return l6w.n5(var6);
   }

   private u6x n5(k6a var1, y8 var2, e4c var3) {
      double var4 = var1.l6(12) ? var1.a6(12) : var2.s7().n3();
      s0 var6 = new s0(var4, var2.s7().z1(), var2.u9(), var2.h0(), this.c8().c8() == 3, var3.u9());
      u6x var7 = new u6x();
      if (this.c8().a6() == 0) {
         l6w.n5(var1.c8().l6(), var6.c8()).u3(var7);
         if (var6.h0() ? this.c8().x8() : this.c8().s7()) {
            var1.c8().n5((byte)5);
         }

         if (var6.h0() ? this.c8().s7() : this.c8().x8()) {
            var1.c8().l6((byte)5);
         }
      } else {
         l6w.n5(var1.c8().l6(), var6.c8(), var2).u3(var7);
      }

      return var7;
   }

   private u6x n5(k6a var1, k7t var2, k7t var3) {
      u6x var4 = new u6x(0.0, 0.0, Double.MAX_VALUE, Double.MAX_VALUE);

      for (int var8 : this.c8().u9()) {
         for (int var12 : this.c8().h0()) {
            u6x var13 = this.n5(var1, var2, var3, var8, var12).z1();
            if (var13.n3() < var4.n3()) {
               var13.u3(var4);
            }
         }
      }

      return var4;
   }

   private u6x n5(k6a var1, k7t var2, k7t var3, int var4, int var5) {
      if (var4 == 10 && var5 == 10) {
         k7t var44 = this.s7(var2.n5()).c8();
         u6x var45 = var44.e5().z1();
         e4c var46 = this.n5(var44).u9();
         double var9 = var1.l6(12) ? var1.a6(12) : var45.n3();
         u6x var11 = var2.e5().z1();
         u6x var12 = var3.e5().z1();
         double var13 = new u6x(var46.u9(), var11.x8().u9()).y4();
         double var15 = new u6x(var46.u9(), var12.x8().u9()).y4();
         double var17 = var15 - var13;
         if (var17 < 0.0) {
            var17 += 360.0;
         }

         double var19 = 360.0 - var13;
         var15 = var17 % 360.0;
         double var21 = com.aspose.slides.ms.System.q1.n5(var9) / 2.0;
         List var23 = this.n5(var46.u9(), var21, var11.z1());
         List var24 = this.n5(var46.u9(), var21, var12.z1());
         e4c var25 = this.n5(var1, var2, 4, var12.x8().u9()).u9();
         e4c var26 = this.n5(var1, var3, 4, var11.x8().u9()).u9();
         if (var2.n5().y4().k5().m1() == 0 && var2.n5().y4().k5().z3() == 0 && var3.n5().y4().k5().m1() == 0 && var3.n5().y4().k5().z3() == 0) {
            float var27 = -1.0E-5F;
            List$Enumerator var28 = var23.iterator();

            try {
               while (var28.hasNext()) {
                  e4c var29 = (e4c)var28.next();
                  double var30 = (new u6x(var46.u9(), var29.u9()).y4() + var19) % 360.0;
                  if (var15 - var30 > -1.0E-5F && var30 >= -1.0E-5F) {
                     var29.l6(var25);
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                  var28.dispose();
               }
            }

            List$Enumerator var48 = var24.iterator();

            try {
               while (var48.hasNext()) {
                  e4c var33 = (e4c)var48.next();
                  double var34 = (new u6x(var46.u9(), var33.u9()).y4() + var19) % 360.0;
                  if (var15 - var34 > -1.0E-5F && var34 >= -1.0E-5F) {
                     var33.l6(var26);
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
                  var48.dispose();
               }
            }
         }

         return new u6x(var25.n5, var25.l6, var26.n5, var26.l6);
      } else {
         e4c var6 = this.n5(var1, var2, var4, var3.e5().x8().u9()).u9();
         e4c var7 = this.n5(var1, var3, var5, var2.e5().x8().u9()).u9();
         e4c var8 = this.n5(var1, var2, var4, var7.u9()).u9();
         e4c var37 = this.n5(var1, var3, var5, var6.u9()).u9();
         return new u6x(var8.n5, var8.l6, var37.n5, var37.l6);
      }
   }

   private e4c n5(k6a var1, k7t var2, int var3, e4c var4) {
      u6x var5 = var2.e5().z1();
      switch (var3) {
         case 0:
            return var2.l6() != null && var2.l6().getShapeType() == 35 ? q3g.l6(var5.z1(), var4.u9()) : q3g.n5(var5.z1(), var4.u9());
         case 1:
            return new e4c(var5.x8().n5, var5.u3());
         case 2:
            return new e4c(var5.n5(), var5.u3());
         case 3:
            return new e4c(var5.k5(), var5.u3());
         case 4:
            return var5.x8();
         case 5:
            return new e4c(var5.n5(), var5.x8().l6);
         case 6:
            return new e4c(var5.k5(), var5.x8().l6);
         case 7:
            return new e4c(var5.x8().n5, var5.l6());
         case 8:
            return new e4c(var5.n5(), var5.l6());
         case 9:
            return new e4c(var5.k5(), var5.l6());
         default:
            return e4c.k5;
      }
   }

   private static void n5(k6a var0, a3p var1, k7t[] var2, k7t[] var3) {
      var2[0] = null;
      var3[0] = null;
      String var4 = var1.k5();
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         k6a var5 = l6(var0, var4);
         if (var5 != null) {
            var2[0] = var5.c8();
         }
      }

      if (var2[0] == null && var0.a6().e2() == 5) {
         if (var0.a6().n5().e2() == 3) {
            var2[0] = var0.t2().c8();
         } else {
            var2[0] = var0.t2().n5(var0.a6().n5().t9()).c8();
         }
      }

      if (var2[0] == null) {
         l6s var8 = var0.a6().t2();
         k6a var6 = var0.k5();
         if (var6 == null && var0.n5() != null) {
            var6 = var0.n5().l6().get_Item(var0.n5().l6().size() - 1);
         }

         while (var6 != null && var6 != var0) {
            if (var6.a6() == var8 && var6.u9().size() > 0) {
               var2[0] = var6.c8();
               break;
            }

            var6 = var6.k5();
            if (var6 == null && var0.n5() != null) {
               var6 = var0.n5().l6().get_Item(var0.n5().l6().size() - 1);
            }
         }
      }

      String var9 = var1.u3();
      if (!com.aspose.slides.ms.System.d1.n5(var9)) {
         k6a var10 = n5(var0, var9);
         if (var10 != null) {
            var3[0] = var10.c8();
         }
      }

      if (var3[0] == null) {
         k6a var11 = var0.u3();
         if (var11 == null && var0.n5() != null) {
            var11 = var0.n5().l6().get_Item(0);
         }

         while (var11 != null && var11 != var0) {
            k6a var7 = t2(var11);
            if (var7 != null) {
               var3[0] = var7.c8();
               break;
            }

            var11 = var11.u3();
            if (var11 == null && var0.n5() != null) {
               var11 = var0.n5().l6().get_Item(0);
            }
         }
      }
   }

   private static k6a n5(k6a var0, String var1) {
      l6s var2 = var0.a6().s7();
      k6a var3 = var0.n5(var1, var2);
      if (var3 != null) {
         return var3;
      }

      k6a var4 = var0.u3();

      while (var4 != null && var4 != var0) {
         var3 = var4.n5(var1, null);
         if (var3 != null) {
            return var3;
         }

         var4 = var4.u3();
         if (var4 == null && var0.n5() != null) {
            var4 = var0.n5().l6().get_Item(0);
         }
      }

      return var0.t2().n5(var1, var2);
   }

   private static k6a l6(k6a var0, String var1) {
      l6s var2 = var0.a6().t2();
      k6a var3 = var0.n5(var1, var2);
      if (var3 != null) {
         return var3;
      }

      if (var0.a6().e2() == 6) {
         for (k6a var4 = var0.k5(); var4 != null; var4 = var4.k5()) {
            var3 = var4.n5(var1, null);
            if (var3 != null) {
               return var3;
            }
         }
      } else {
         for (k6a var14 = var0.n5(); var14 != null; var14 = var14.n5()) {
            var3 = var14.n5(var1, var2);
            if (var3 != null) {
               return var3;
            }
         }

         k6a var15 = var0.n5();

         for (int var5 = var2.z1(); var15 != null && var5 - 1 <= var15.a6().z1(); var15 = var15.n5()) {
            List$Enumerator var6 = var15.l6().iterator();

            try {
               while (var6.hasNext()) {
                  k6a var7 = (k6a)var6.next();
                  if (com.aspose.slides.ms.System.d1.a6(var7.h0().J_(), var1) && var5 == var7.a6().z1()) {
                     return var7;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }

      return null;
   }

   private static k6a t2(k6a var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0.s7(), h3o.class) && var0.u9().size() > 0) {
         return var0;
      }

      List$Enumerator var1 = var0.l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            k6a var3 = t2(var2);
            if (var3 != null) {
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

   private List<e4c> n5(e4c var1, double var2, u6x var4) {
      List var5 = new List();
      e4c[] var6 = var4.t9();
      e4c var7 = var6[0].u9();

      for (int var8 = 1; var8 <= var6.length; var8++) {
         e4c var9 = (var8 < var6.length ? var6[var8] : var6[0]).u9();
         e4c var10 = new e4c();
         e4c[] var11 = new e4c[]{var10};
         boolean var12 = q3g.n5(var1.u9(), var2, var7.u9(), var9.u9(), var11);
         var11[0].l6(var10);
         if (var12) {
            var5.addItem(var10.u9());
         }

         var11[0] = var10;
         boolean var13 = q3g.n5(var1.u9(), var2, var9.u9(), var7.u9(), var11);
         var11[0].l6(var10);
         if (var13) {
            var5.addItem(var10.u9());
         }

         var9.l6(var7);
      }

      return var5;
   }

   private y8 n5(k6a var1, u6x var2) {
      y8 var3 = new y8(var2.z1());
      double var4 = var1.l6(3) ? var1.a6(3) : var2.n3() * 0.22;
      double var6 = var1.l6(14) ? var1.a6(14) : var2.n3() * 0.25;
      var3.n5(var1.l6(31) ? var1.a6(31) / 2.0 : var1.a6(15) * 0.3);
      var1.k5(31, var3.k5());
      this.u3(var1);
      if (var1.l6(16)) {
         var3.l6(com.aspose.slides.ms.System.q1.l6(var3.k5(), var1.a6(16) / 2.0));
         if (this.c8().c8() == 3) {
            var3.l6(var3.u3() + (var3.u3() - var3.k5()));
         }
      } else {
         var3.l6(com.aspose.slides.ms.System.q1.l6(var3.k5(), var1.a6(15) * (this.c8().c8() == 0 ? 0.5 : 0.75)));
      }

      if (var1.l6(62)) {
         var3.k5(var1.a6(62));
      } else {
         double var8 = com.aspose.slides.ms.System.q1.l6(0.0, var1.a6(7) - var4 - var6);
         double var10 = var1.a6(15);
         double var12 = this.c8().c8() == 3 ? var10 : com.aspose.slides.ms.System.q1.k5(var8, var10);
         var3.k5((var12 != 0.0 ? var12 : var8) * 0.5);
      }

      var3.n5(this.c8().s7());
      var3.l6(this.c8().x8());
      var3.u3(var4);
      var3.a6(var6);
      return var3;
   }

   private e4c n5(k7t var1) {
      u6x var2 = var1.e5().z1();
      double var3 = var1.k5(6);
      if (var3 == 0.0) {
         var3 = var2.x8().n5;
      }

      double var5 = var1.k5(7);
      if (var5 == 0.0) {
         var5 = var2.x8().l6;
      }

      return new e4c(var3, var5);
   }

   private k6a s7(k6a var1) {
      for (k6a var2 = var1.n5(); var2 != null; var2 = var2.n5()) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.s7(), b5x.class)) {
            return var2;
         }
      }

      return var1.t2();
   }

   private a3p c8() {
      return (a3p)this.n5();
   }
}
