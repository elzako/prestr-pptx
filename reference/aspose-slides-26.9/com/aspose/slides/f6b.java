package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class f6b extends d5 {
   @Override
   public boolean n5(int var1) {
      return var1 == 30;
   }

   @Override
   public void n5(k6a var1, double var2) {
      var1.n5(var2, 30);
   }

   @Override
   public boolean a6(k6a var1) {
      boolean var2 = true;
      if (var1.m1() != null) {
         for (l3d var6 : var1.m1().u3()) {
            k6a var7 = var6.l6(var1);
            if (var7 != null && h0(var7)) {
               double var8 = var1.n5(var6);
               double var10 = var7.u9(var6.c8()) * var8;
               if (q3g.n5(var6.c8()) && var8 < 0.0) {
                  int var12 = var6.k5() == 61 ? 10 : 11;
                  double var13 = var7.c8().k5(var12);
                  if (var13 != 0.0) {
                     var10 = var13 * var8;
                  }
               }

               double var15 = var7.n5(var6.c8()) * var8;
               if (n5(var10, var15)) {
                  double var17 = var1.a6(var6.k5());
                  if (var6.y4() == 2 && n5(var10, var17) && this.n5(var6.k5())) {
                     var1.k5(var6.k5(), var10);
                     var2 &= var1.a6(var6.k5()) != var10;
                  }
               }
            }
         }
      }

      return var2;
   }

   @Override
   public boolean n5(k6a var1) {
      List var2 = new List();
      List$Enumerator var3 = var1.l6().iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            if (var4.a6().e2() == 1) {
               var2.addItem(new f6b$l6(this.n5(var4, var1.l6()), var4));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2.size() != 0) {
         double var6 = var1.a6(30);
         e4c var8 = new e4c(var1.a6(61), var1.a6(15));
         if (this.c8().c8()) {
            var8.n5 = com.aspose.slides.ms.System.q1.l6(1.0, var1.a6(61) - var1.a6(3) - var1.a6(14));
         } else {
            var8.l6 = com.aspose.slides.ms.System.q1.l6(1.0, var1.a6(15) - var1.a6(3) - var1.a6(14));
         }

         f6b$n5 var9 = new f6b$n5();
         switch (this.c8().k5()) {
            case 0:
            default:
               this.n5(var2, var8.u9(), var6, var1.a6(0)).n5(var9);
               break;
            case 1:
               this.l6(var2, var8.u9(), var6, var1.a6(0)).n5(var9);
               break;
            case 2:
               this.n5(var2, var8.u9(), var6, var1.a6(0), com.aspose.slides.ms.System.q1.n5(1, this.c8().u3())).n5(var9);
         }

         var1.c8().k5(var9.l6());
         var1.c8().u9(var9.k5());
         if (this.c8().c8()) {
            var1.c8().u3(com.aspose.slides.ms.System.q1.l6(1.0, var1.a6(61) - var1.a6(3) - var1.a6(14)));
            var1.c8().h0(var1.a6(15));
         } else {
            var1.c8().u3(var1.a6(61));
            var1.c8().h0(com.aspose.slides.ms.System.q1.l6(1.0, var1.a6(15) - var1.a6(3) - var1.a6(14)));
         }

         l6(var1, this.c8().n5(), this.c8().l6());
         List$Enumerator var10 = var2.iterator();

         try {
            while (var10.hasNext()) {
               f6b$l6 var11 = (f6b$l6)var10.next();
               var11.h0().c8().n5(new e4c(var11.n5(), var11.l6()));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         if (n5(var9.n5())) {
            var1.n5(var9.n5(), 30);
            List$Enumerator var26 = var2.iterator();

            try {
               while (var26.hasNext()) {
                  f6b$l6 var12 = (f6b$l6)var26.next();
                  var12.k5(var9.n5());
                  var12.t2();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
                  var26.dispose();
               }
            }

            var1.w1();
            return false;
         }
      }

      return true;
   }

   private k6a n5(k6a var1, List<k6a> var2) {
      if (var1.a6().e2() == 1) {
         l6s var3 = var1.a6().c8();
         if (var3 != null) {
            List$Enumerator var4 = var2.iterator();

            try {
               while (var4.hasNext()) {
                  k6a var5 = (k6a)var4.next();
                  if (var5.a6() == var3) {
                     return var5;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      }

      return null;
   }

   private f6b$n5 n5(List<f6b$l6> var1, e4c var2, double var3, double var5) {
      int var7 = 1;
      int var8 = 1;
      double var9 = 1.0;
      int var11 = var1.size();

      while (var11 > 0) {
         var11 = var1.size() - 1;
         var7 = 1;
         var8 = 1;
         if (var9 != 1.0) {
            List$Enumerator var12 = var1.iterator();

            try {
               while (var12.hasNext()) {
                  f6b$l6 var13 = (f6b$l6)var12.next();
                  var13.k5(var9);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }

         double var15 = var3 * var9;
         e4c var14 = this.n5(var1, var7, var8, var15, var5).u9();
         if (this.c8().c8()) {
            while (var11 > 0 && var14.n5 <= var2.n5) {
               this.n5(var1, var7, var8 + 1, var15, var5).l6(var14);
               if (var14.n5 <= var2.n5) {
                  var8++;
                  var11--;
               }
            }

            while (var11 > 0 && var14.l6 <= var2.l6) {
               this.n5(var1, var7 + 1, var8, var15, var5).l6(var14);
               if (var14.l6 <= var2.l6) {
                  var7++;
                  var11 -= var8;
               }
            }
         } else {
            while (var11 > 0 && var14.l6 <= var2.l6) {
               this.n5(var1, var7 + 1, var8, var15, var5).l6(var14);
               if (var14.l6 <= var2.l6) {
                  var7++;
                  var11--;
               }
            }

            while (var11 > 0 && var14.n5 <= var2.n5) {
               this.n5(var1, var7, var8 + 1, var15, var5).l6(var14);
               if (var14.n5 <= var2.n5) {
                  var8++;
                  var11 -= var7;
               }
            }
         }

         if (var11 > 0) {
            e4c var17 = this.n5(var1, var7, var8 + 1, var15, var5).u9();
            e4c var18 = this.n5(var1, var7 + 1, var8, var15, var5).u9();
            double var19 = com.aspose.slides.ms.System.q1.k5(var2.l6 / var18.l6, var2.n5 / var18.n5);
            double var21 = com.aspose.slides.ms.System.q1.k5(var2.l6 / var17.l6, var2.n5 / var17.n5);
            var9 *= com.aspose.slides.ms.System.q1.l6(var19, var21);
         }
      }

      List$Enumerator var30 = var1.iterator();

      try {
         while (var30.hasNext()) {
            f6b$l6 var31 = (f6b$l6)var30.next();
            var31.c8();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      return this.n5(var1, var7, var8, var3, var5, var2.u9());
   }

   private f6b$n5 l6(List<f6b$l6> var1, e4c var2, double var3, double var5) {
      int var7 = 1;
      int var8 = 1;

      while (var7 * var8 < var1.size()) {
         if (this.c8().c8()) {
            if (var8 > var7) {
               var7++;
            } else {
               var8++;
            }
         } else if (var7 > var8) {
            var8++;
         } else {
            var7++;
         }
      }

      return this.n5(var1, var7, var8, var3, var5, var2.u9());
   }

   private f6b$n5 n5(List<f6b$l6> var1, e4c var2, double var3, double var5, int var7) {
      int var8 = com.aspose.slides.ms.System.q1.l6(var7, var1.size());
      int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var1.size() / var7), 14);
      int var10 = this.c8().c8() ? var9 : var8;
      int var11 = this.c8().c8() ? var8 : var9;
      return this.n5(var1, var10, var11, var3, var5, var2.u9());
   }

   private f6b$n5 n5(List<f6b$l6> var1, int var2, int var3, double var4, double var6, e4c var8) {
      e4c var9 = this.n5(var1, var2, var3, var4, var6).u9();
      double var10 = com.aspose.slides.ms.System.q1.k5(1.0, com.aspose.slides.ms.System.q1.k5(var8.l6 / var9.l6, var8.n5 / var9.n5));
      return new f6b$n5(var3, var2, var10, var9.u9());
   }

   private e4c n5(List<f6b$l6> var1, int var2, int var3, double var4, double var6) {
      if (this.c8().a6()) {
         var6 = 0.0;
      }

      return this.c8().c8()
         ? this.l6(var1, var2, var3, var4, var6 * (((f6b$l6)var1.get_Item(0)).k5() + ((f6b$l6)var1.get_Item(0)).a6()))
         : this.k5(var1, var2, var3, var4, var6 * (((f6b$l6)var1.get_Item(0)).u3() + ((f6b$l6)var1.get_Item(0)).u9()));
   }

   private e4c l6(List<f6b$l6> var1, int var2, int var3, double var4, double var6) {
      boolean var8 = this.c8().h0() == 0 || this.c8().h0() == 2;
      boolean var9 = this.c8().h0() == 0 || this.c8().h0() == 1;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = 0.0;
      double var18 = 0.0;
      double var20 = Double.MAX_VALUE;
      double var22 = Double.MAX_VALUE;
      int var24 = 0;

      for (int var25 = 0; var25 < var2 && var24 < var1.size(); var25++) {
         boolean var26 = var25 % 2 == 0;
         boolean var27 = !this.c8().u9() && !var26 ? !var8 : var8;
         double var28 = 0.0;
         double var30 = 0.0;
         int var32 = var24;

         for (int var33 = 0; var33 < var3 && var24 < var1.size(); var33++) {
            double var34 = ((f6b$l6)var1.get_Item(var24)).k5() + (var33 < var3 - 1 ? ((f6b$l6)var1.get_Item(var24)).a6() : 0.0);
            var30 += var34;
            var28 = com.aspose.slides.ms.System.q1.l6(var28, ((f6b$l6)var1.get_Item(var24)).u3());
            ((f6b$l6)var1.get_Item(var24)).n5(var16);
            ((f6b$l6)var1.get_Item(var24)).l6(var18);
            if (var16 < var20) {
               var20 = var16;
            }

            if (var18 < var22) {
               var22 = var18;
            }

            if (var27) {
               var16 += var34;
            } else {
               if (var33 < var3 - 1) {
                  var16 -= ((f6b$l6)var1.get_Item(var24)).a6();
               }

               if (var24 + 1 < var1.size()) {
                  var16 -= ((f6b$l6)var1.get_Item(var24 + 1)).k5();
               }
            }

            var24++;
         }

         this.n5(var1, var32, var3, var28);
         if (var25 != var2 - 1) {
            var28 += var4;
         }

         if (var9) {
            var18 += var28;
         } else {
            if (var25 != var2 - 1) {
               var18 -= var4;
            }

            var18 -= n5(var1, var24, var3);
         }

         var12 += var28;
         if (var30 + var14 > var10) {
            var10 = var30 + var14;
         }

         if (this.c8().u9()) {
            var16 -= var27 ? var30 : -var30;
         } else if (var24 < var1.size()) {
            var16 -= (var27 ? 1 : -1) * ((f6b$l6)var1.get_Item(var24)).k5();
         }

         if (this.c8().a6()) {
            int var45 = com.aspose.slides.ms.System.q1.l6(var3, var1.size() - var24);
            double var46 = k5(var1, var24, var45);
            double var36 = (var27 ? 1 : -1) * (var30 - var46) / 2.0;
            var16 += this.c8().u9() ? var36 : -var36;
         } else {
            double var38 = var27 ? var6 : -var6;
            var16 += this.c8().u9() ? var38 : -var38;
            if (this.c8().u9()) {
               var14 += var6;
            } else {
               var14 = var6;
            }
         }
      }

      List$Enumerator var43 = var1.iterator();

      try {
         while (var43.hasNext()) {
            f6b$l6 var44 = (f6b$l6)var43.next();
            var44.n5(var44.n5() - var20);
            var44.l6(var44.l6() - var22);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      return new e4c(var10, var12);
   }

   private e4c k5(List<f6b$l6> var1, int var2, int var3, double var4, double var6) {
      boolean var8 = this.c8().h0() == 0 || this.c8().h0() == 2;
      boolean var9 = this.c8().h0() == 0 || this.c8().h0() == 1;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = 0.0;
      double var18 = 0.0;
      double var20 = Double.MAX_VALUE;
      double var22 = Double.MAX_VALUE;
      int var24 = 0;

      for (int var25 = 0; var25 < var3 && var24 < var1.size(); var25++) {
         boolean var26 = var25 % 2 == 0;
         boolean var27 = !this.c8().u9() && !var26 ? !var9 : var9;
         double var28 = 0.0;
         double var30 = 0.0;
         int var32 = var24;

         for (int var33 = 0; var33 < var2 && var24 < var1.size(); var33++) {
            double var34 = ((f6b$l6)var1.get_Item(var24)).u3() + (var33 < var2 - 1 ? ((f6b$l6)var1.get_Item(var24)).u9() : 0.0);
            var30 += var34;
            var28 = com.aspose.slides.ms.System.q1.l6(var28, ((f6b$l6)var1.get_Item(var24)).k5());
            ((f6b$l6)var1.get_Item(var24)).n5(var16);
            ((f6b$l6)var1.get_Item(var24)).l6(var18);
            if (var16 < var20) {
               var20 = var16;
            }

            if (var18 < var22) {
               var22 = var18;
            }

            if (var27) {
               var18 += var34;
            } else {
               if (var33 < var2 - 1) {
                  var18 -= ((f6b$l6)var1.get_Item(var24)).u9();
               }

               if (var24 + 1 < var1.size()) {
                  var18 -= ((f6b$l6)var1.get_Item(var24 + 1)).u3();
               }
            }

            var24++;
         }

         this.l6(var1, var32, var2, var28);
         if (var25 != var3 - 1) {
            var28 += var4;
         }

         if (var8) {
            var16 += var28;
         } else {
            if (var25 != var3 - 1) {
               var16 -= var4;
            }

            var16 -= l6(var1, var24, var3);
         }

         var10 += var28;
         if (var30 + var14 > var12) {
            var12 = var30 + var14;
         }

         if (this.c8().u9()) {
            var18 -= var27 ? var30 : -var30;
         } else if (var24 < var1.size()) {
            var18 -= (var27 ? 1 : -1) * ((f6b$l6)var1.get_Item(var24)).u3();
         }

         if (this.c8().a6()) {
            int var45 = com.aspose.slides.ms.System.q1.l6(var2, var1.size() - var24);
            double var46 = u3(var1, var24, var45);
            double var36 = (var27 ? 1 : -1) * (var30 - var46) / 2.0;
            var18 += this.c8().u9() ? var36 : -var36;
         } else {
            double var38 = var27 ? var6 : -var6;
            var18 += this.c8().u9() ? var38 : -var38;
            if (this.c8().u9()) {
               var14 += var6;
            } else {
               var14 = var6;
            }
         }
      }

      List$Enumerator var43 = var1.iterator();

      try {
         while (var43.hasNext()) {
            f6b$l6 var44 = (f6b$l6)var43.next();
            var44.n5(var44.n5() - var20);
            var44.l6(var44.l6() - var22);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
            var43.dispose();
         }
      }

      return new e4c(var10, var12);
   }

   private void n5(List<f6b$l6> var1, int var2, int var3, double var4) {
      for (int var6 = 0; var6 < var3 && var2 < var1.size(); var6++) {
         double var7 = 0.0;
         if (this.c8().s7() == 3) {
            var7 = var4 - ((f6b$l6)var1.get_Item(var2)).u3();
         } else if (this.c8().s7() == 2) {
            var7 = (var4 - ((f6b$l6)var1.get_Item(var2)).u3()) / 2.0;
         }

         ((f6b$l6)var1.get_Item(var2)).l6(((f6b$l6)var1.get_Item(var2)).l6() + var7);
         var2++;
      }
   }

   private void l6(List<f6b$l6> var1, int var2, int var3, double var4) {
      for (int var6 = 0; var6 < var3 && var2 < var1.size(); var6++) {
         double var7 = 0.0;
         if (this.c8().t2() == 3) {
            var7 = var4 - ((f6b$l6)var1.get_Item(var2)).k5();
         } else if (this.c8().t2() == 2) {
            var7 = (var4 - ((f6b$l6)var1.get_Item(var2)).k5()) / 2.0;
         }

         ((f6b$l6)var1.get_Item(var2)).n5(((f6b$l6)var1.get_Item(var2)).n5() + var7);
         var2++;
      }
   }

   private static double n5(List<f6b$l6> var0, int var1, int var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2 && var1 < var0.size(); var5++) {
         if (((f6b$l6)var0.get_Item(var1)).u3() > var3) {
            var3 = ((f6b$l6)var0.get_Item(var1)).u3();
         }

         var1++;
      }

      return var3;
   }

   private static double l6(List<f6b$l6> var0, int var1, int var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2 && var1 < var0.size(); var5++) {
         if (((f6b$l6)var0.get_Item(var1)).k5() > var3) {
            var3 = ((f6b$l6)var0.get_Item(var1)).k5();
         }

         var1++;
      }

      return var3;
   }

   private static double k5(List<f6b$l6> var0, int var1, int var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2 && var1 < var0.size(); var5++) {
         var3 += ((f6b$l6)var0.get_Item(var1)).k5() + (var5 < var2 - 1 ? ((f6b$l6)var0.get_Item(var1)).a6() : 0.0);
         var1++;
      }

      return var3;
   }

   private static double u3(List<f6b$l6> var0, int var1, int var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2 && var1 < var0.size(); var5++) {
         var3 += ((f6b$l6)var0.get_Item(var1)).u3() + (var5 < var2 - 1 ? ((f6b$l6)var0.get_Item(var1)).u9() : 0.0);
         var1++;
      }

      return var3;
   }

   private s4b c8() {
      return (s4b)this.n5();
   }
}
