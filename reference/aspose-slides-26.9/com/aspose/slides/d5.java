package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class d5 extends g3c {
   private s3 n5;
   private List<k6a> l6;
   private w4a k5;

   public static d5 n5(com.aspose.slides.internal.k4y.p5i var0) {
      d5 var1;
      switch (var0.n5()) {
         case 0:
            var1 = new v6s();
            break;
         case 1:
            var1 = new o7p();
            break;
         case 2:
            var1 = new b5x();
            break;
         case 3:
            var1 = new d8r();
            break;
         case 4:
            var1 = new l5w();
            break;
         case 5:
            var1 = new x3z();
            break;
         case 6:
            var1 = new r1l();
            break;
         case 7:
            var1 = new f6b();
            break;
         case 8:
            var1 = new b2l();
            break;
         case 9:
            var1 = new h3o();
            break;
         default:
            throw new PptxException("Unsuppotred SmartArt layout algorithm");
      }

      var1.n5 = s3.n5(var0);
      return var1;
   }

   public final s3 n5() {
      return this.n5;
   }

   public boolean l6() {
      return false;
   }

   public boolean k5() {
      return true;
   }

   public boolean u3() {
      return false;
   }

   public boolean a6() {
      return !this.u3();
   }

   public final w4a u9() {
      if (this.k5 == null) {
         this.k5 = this.n5(w4a.class);
      }

      return this.k5;
   }

   public final List<k6a> h0() {
      if (this.l6 == null) {
         this.l6 = new List<>();
      }

      return this.l6;
   }

   public abstract boolean n5(k6a var1);

   public void l6(k6a var1) {
   }

   public boolean n5(k6a var1, e4c var2) {
      double var3 = var2.n5 / var1.c8().s7();
      double var5 = var2.l6 / var1.c8().e2();
      List$Enumerator var7 = var1.l6().iterator();

      try {
         while (var7.hasNext()) {
            k6a var8 = (k6a)var7.next();
            if (n5(var3)) {
               var8.n5(var3, 61);
            }

            if (n5(var5)) {
               var8.n5(var5, 15);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return n5(var3) || n5(var5);
   }

   public void n5(k6a var1, double var2) {
   }

   public e4c k5(k6a var1) {
      e4c var2 = e4c.n5(var1.m3(), var1.z8()).u9();
      return new e4c(var2.n5 * var1.c8().c8(), var2.l6 * var1.c8().n3());
   }

   public boolean n5(int var1) {
      return false;
   }

   public boolean u3(k6a var1) {
      boolean var2 = false;
      if (var1.m1() != null) {
         p5w var3 = new p5w();

         for (l3d var7 : var1.m1().k5()) {
            double var8 = var1.n5(var7);
            double var10 = var1.a6(var7.c8()) * var8;
            double var12 = var1.n5(var7.c8()) * var8;
            if (n5(var10, var12) && !n5(var1, var7.k5())) {
               w2v var14 = var3.n5(var1, var7.k5());
               switch (var7.y4()) {
                  case 0:
                  case 1:
                  case 2:
                  default:
                     var14.k5(var10);
                     break;
                  case 3:
                     var14.n5(var10);
                     break;
                  case 4:
                     var14.l6(var10);
               }

               var1.k5(var7.k5(), var14.k5());
               var2 = true;
            }
         }
      }

      return var2;
   }

   private static boolean n5(k6a var0, int var1) {
      if (!q3g.n5(var1)) {
         for (k6a var2 = var0.n5(); var2 != null; var2 = var2.n5()) {
            if (n5(var1, var2, var0)) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean n5(int var0, k6a var1, k6a var2) {
      if (var1.m1() != null) {
         for (l3d var6 : var1.m1().a6()) {
            if (var6.k5() == var0 && var6.n5(var1).containsItem(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a6(k6a var1) {
      boolean var2 = true;
      if (var1.m1() != null) {
         for (l3d var6 : var1.m1().u3()) {
            k6a var7 = var6.l6(var1);
            if (var7 != null && h0(var7)) {
               double var8 = var1.n5(var6);
               double var10 = var7.u9(var6.c8()) * var8;
               double var12 = var7.n5(var6.c8()) * var8;
               if (n5(var10, var12)) {
                  double var14 = var1.a6(var6.k5());
                  if (var6.y4() == 2 && n5(var10, var14) && this.n5(var6.k5())) {
                     var1.k5(var6.k5(), var10);
                     var2 &= var1.a6(var6.k5()) != var10;
                  }
               }
            }
         }
      }

      return var2;
   }

   public boolean u9(k6a var1) {
      boolean var2 = true;
      if (var1.m1() != null) {
         p5w var3 = new p5w();

         for (l3d var7 : var1.m1().a6()) {
            k6a var8 = var7.l6(var1);
            if (var8 != null && h0(var8)) {
               List var9 = var7.n5(var1);
               List$Enumerator var10 = var9.iterator();

               try {
                  while (var10.hasNext()) {
                     k6a var11 = (k6a)var10.next();
                     double var12 = var1.n5(var7);
                     double var14 = var8.a6(var7.c8()) * var12;
                     double var16 = var8.n5(var7.c8()) * var12;
                     if (n5(var14, var16) || var7.y4() == 4) {
                        double var18 = var11.a6(var7.k5());
                        if (n5(var14, var18)) {
                           w2v var20 = var3.n5(var11, var7.k5());
                           switch (var7.y4()) {
                              case 0:
                              case 1:
                              default:
                                 if ((var7.u3() != 3 || !q3g.n5(var7.k5()) || !q3g.n5(var7.c8()))
                                    && var7.h0() != 1
                                    && (com.aspose.slides.ms.System.q1.n5(var18) > com.aspose.slides.ms.System.q1.n5(var14) || var18 == 0.0)) {
                                    var20.k5(var14);
                                 }
                                 break;
                              case 2:
                                 var20.k5(var14);
                                 break;
                              case 3:
                                 var20.n5(var14);
                                 break;
                              case 4:
                                 var20.l6(var14);
                           }

                           if (!n5(var20.k5(), var14)) {
                              var11.k5(var7.k5(), var20.k5());
                              var2 &= var11.a6(var7.k5()) != var14;
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }
            }
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      String var1 = this.u9() != null ? this.u9().J_() : com.aspose.slides.ms.System.d1.n5;
      return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.j8.n5(this).s7(), " - ", var1});
   }

   protected static boolean n5(double var0) {
      return var0 < 0.9999;
   }

   protected static boolean n5(double var0, double var2) {
      return q3g.l6(var0, var2);
   }

   protected static e4c n5(k6a var0, int var1, int var2) {
      k7t var3 = var0.c8();
      e4c var4 = new e4c(var3.h0(), var3.x8());
      e4c var5 = new e4c(var3.s7(), var3.e2());
      e4c var6 = new e4c(var3.t2(), var3.y4());
      double var7 = 0.0;
      double var9 = 0.0;
      if (var6.n5 >= var5.n5) {
         if (var1 == 2) {
            var7 = (var6.n5 - var4.n5) / 2.0;
         } else if (var1 == 3) {
            var7 = var6.n5 - var4.n5;
         }
      }

      if (var6.l6 >= var5.l6) {
         if (var2 == 2) {
            var9 = (var6.l6 - var4.l6) / 2.0;
         } else if (var2 == 3) {
            var9 = var6.l6 - var4.l6;
         }
      }

      return new e4c(var7, var9);
   }

   protected static void l6(k6a var0, int var1, int var2) {
      e4c var3 = n5(var0, var1, var2).u9();
      e4c var4 = new e4c(var1 == 0 ? var0.c8().u3() : var3.n5, var2 == 0 ? var0.c8().a6() : var3.l6);
      var0.c8().n5(var4.u9());
   }

   protected static boolean h0(k6a var0) {
      return var0.s3() ? true : var0.l6().size() > 0 && (var0.c8().c8() != 0.0 || var0.a6(61) != 0.0) && (var0.c8().n3() != 0.0 || var0.a6(15) != 0.0);
   }
}
