package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d8r extends d5 {
   @Override
   public boolean n5(int var1) {
      return var1 == 29 || var1 == 30;
   }

   @Override
   public void n5(k6a var1, double var2) {
      var1.n5(var2, 30, 29, 28, 4);
   }

   @Override
   public boolean n5(k6a var1, e4c var2) {
      double var3 = var2.n5 / var1.c8().c8();
      double var5 = var2.l6 / var1.c8().n3();
      double var7 = com.aspose.slides.ms.System.q1.k5(var3, var5);
      if (!n5(var7)) {
         return false;
      }

      List$Enumerator var9 = var1.l6().iterator();

      try {
         while (var9.hasNext()) {
            k6a var10 = (k6a)var9.next();
            var10.n5(var7, 61, 15);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      var1.n5(var7, 30, 29, 28, 4);
      return true;
   }

   @Override
   public boolean n5(k6a var1) {
      if (this.c8().k5() != 0) {
         List var2 = var1.r4();
         if (var2.size() > 0) {
            double var3 = var1.a6(29);
            boolean var5 = this.c8().k5() == 4 || this.c8().k5() == 1;
            boolean var6 = this.c8().a6() == 4 || this.c8().a6() == 1;
            if (this.c8().a6() != 0 && var5 != var6) {
               double var10 = var1.a6(28);
               e4c var12 = this.n5(var2, var3, var10).u9();
               var1.c8().n5(4, var12.n5);
               var1.c8().n5(5, var12.l6);
            } else {
               int var7 = var1.n5(this.u9());
               boolean var8 = var7 == 3 || var7 == 4;
               e4c var9 = var1.c8().k5(true).u9();
               n5(var2, this.c8().k5(), this.c8().u3(), var9.n5, var9.l6);
               if (var8) {
                  this.l6(var2, var3);
               } else {
                  this.n5(var2, var3);
               }
            }

            var1.c8().z7();
            l6(var1, this.c8().n5(), this.c8().l6());
         }
      }

      return true;
   }

   private e4c n5(IGenericList<k6a> var1, double var2, double var4) {
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      double var12 = 0.0;
      int var14 = var1.size();
      int var15 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var1.size() / 2.0), 14);
      List var16 = new List(var15);
      List var17 = new List(var15);

      for (int var18 = 0; var18 < var14; var18++) {
         k6a var19 = (k6a)var1.get_Item(var18);
         double var20 = var19.c8().h0();
         double var22 = var19.c8().x8();
         if (var18 % 2 == 0) {
            if (var6 < var20) {
               var6 = var20;
            }

            if (var8 < var22) {
               var8 = var22;
            }

            var16.addItem(var19);
         } else {
            if (var10 < var20) {
               var10 = var20;
            }

            if (var12 < var22) {
               var12 = var22;
            }

            var17.addItem(var19);
         }
      }

      int var46 = 0;
      double var24 = 0.0;
      double var26 = 0.0;
      e4c[] var28 = (e4c[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(e4c.class), var14));

      while (var46 < var14) {
         double var29 = 0.0;
         double var31 = 0.0;
         int var33 = var46;

         for (int var34 = 0; var34 < 2 && var33 < var14; var33++) {
            k7t var35 = ((k6a)var1.get_Item(var33)).c8();
            if (var31 < var35.h0()) {
               var31 = var35.h0();
            }

            if (var29 < var35.x8()) {
               var29 = var35.x8();
            }

            var34++;
         }

         for (int var50 = 0; var50 < 2 && var46 < var14; var50++) {
            k7t var51 = ((k6a)var1.get_Item(var46)).c8();
            double var36 = var50 == 0 ? var6 : var10;
            double var38 = var50 == 0 ? var8 : var12;
            switch (this.c8().k5()) {
               case 1:
                  var26 -= var38;
                  var28[var46] = new e4c(var24, var26);
                  var26 -= var4;
                  break;
               case 2:
                  var28[var46] = new e4c(var24, var26);
                  var24 += var36 + var4;
                  break;
               case 3:
                  var24 -= var36;
                  var28[var46] = new e4c(var24, var26);
                  var24 -= var4;
                  break;
               case 4:
                  var28[var46] = new e4c(var24, var26);
                  var26 += var38 + var4;
            }

            var46++;
         }

         switch (this.c8().a6()) {
            case 1:
               var24 = 0.0;
               var26 -= var2 + var29;
               break;
            case 2:
               var26 = 0.0;
               var24 += var2 + var31;
               break;
            case 3:
               var26 = 0.0;
               var24 -= var2 + var31;
               break;
            case 4:
               var24 = 0.0;
               var26 += var2 + var29;
         }
      }

      u6x var40 = l6w.n5(var28).z1();

      for (int var41 = 0; var41 < var14; var41++) {
         e4c var42 = var28[var41].u9();
         ((k6a)var1.get_Item(var41)).c8().n5(var42.n5 - var40.n5(), var42.l6 - var40.l6());
      }

      n5(var16, this.c8().a6(), this.c8().u3(), var6, var8);
      n5(var17, this.c8().a6(), this.c8().u3(), var10, var12);
      List var53 = new List();

      for (int var54 = 0; var54 + 1 < var14; var54 += 2) {
         k6a var43 = (k6a)var1.get_Item(var54);
         k6a var49 = (k6a)var1.get_Item(var54 + 1);
         var53.clear();
         var53.addItem(var43);
         var53.addItem(var49);
         double var44 = com.aspose.slides.ms.System.q1.l6(var43.c8().h0(), var49.c8().h0());
         double var52 = com.aspose.slides.ms.System.q1.l6(var43.c8().x8(), var49.c8().x8());
         n5(var53, this.c8().k5(), this.c8().u9(), var44, var52);
      }

      switch (this.c8().k5()) {
         case 0:
         default:
            return e4c.k5;
         case 1:
            return new e4c(0.0, var12 + var4 / 2.0);
         case 2:
            return new e4c(var6 + var4 / 2.0, 0.0);
         case 3:
            return new e4c(var10 + var4 / 2.0, 0.0);
         case 4:
            return new e4c(0.0, var8 + var4 / 2.0);
      }
   }

   private void n5(IGenericList<k6a> var1, double var2) {
      int var4 = this.c8().k5();
      double var5 = 0.0;
      double var7 = 0.0;
      boolean var9 = var4 == 1 || var4 == 3;

      for (int var10 = var9 ? var1.size() - 1 : 0; var9 ? var10 >= 0 : var10 < var1.size(); var10 += var9 ? -1 : 1) {
         k7t var11 = ((k6a)var1.get_Item(var10)).c8();
         switch (var4) {
            case 1:
            case 4:
               var11.n5(var5, var7);
               var7 += var11.x8() + var2;
               break;
            case 2:
            case 3:
               var11.n5(var5, var7);
               var5 += var11.h0() + var2;
         }
      }
   }

   private void l6(IGenericList<k6a> var1, double var2) {
      List var4 = new List();
      double var5 = 0.0;
      double var7 = 0.0;
      int var9 = this.c8().k5();
      boolean var10 = var9 == 4 || var9 == 1;
      boolean var11 = var9 == 1 || var9 == 3;
      int var12 = var11 ? -1 : 1;

      for (int var13 = var11 ? var1.size() - 1 : 0; var11 ? var13 >= 0 : var13 < var1.size(); var13 += var12) {
         k6a var14 = (k6a)var1.get_Item(var13);
         var14.c8().n5(var5, var7);
         if (var11 ? var13 + var12 >= 0 : var13 + var12 < var1.size()) {
            var4.addRange(com.aspose.slides.ms.System.u3.n5(var14.c8().i1()));
            if (var10) {
               var7 = var2 + n5(var4, com.aspose.slides.ms.System.u3.n5(((k6a)var1.get_Item(var13 + var12)).c8().i1()));
            } else {
               var5 = var2 + l6(var4, com.aspose.slides.ms.System.u3.n5(((k6a)var1.get_Item(var13 + var12)).c8().i1()));
            }
         }
      }
   }

   private static void n5(IGenericList<k6a> var0, int var1, int var2, double var3, double var5) {
      boolean var7 = var1 == 4 || var1 == 1;
      boolean var8 = var1 == 2 || var1 == 3;
      if (var7 && var2 == 4) {
         IGenericEnumerator var19 = var0.iterator();

         try {
            while (var19.hasNext()) {
               k6a var20 = (k6a)var19.next();
               var20.c8().n5(var3 - var20.c8().h0(), 0.0);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               var19.dispose();
            }
         }
      } else if (var8 && var2 == 2) {
         IGenericEnumerator var9 = var0.iterator();

         try {
            while (var9.hasNext()) {
               k6a var10 = (k6a)var9.next();
               var10.c8().n5(0.0, var5 - var10.c8().x8());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }
      }
   }

   private static double n5(IGenericEnumerable<u6x> var0, IGenericEnumerable<u6x> var1) {
      double var2 = -Double.MAX_VALUE;
      boolean var4 = false;
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            u6x var6 = (u6x)var5.next();
            IGenericEnumerator var7 = var0.iterator();

            try {
               while (var7.hasNext()) {
                  u6x var8 = (u6x)var7.next();
                  if (var6.n5() >= var8.n5() && var6.n5() <= var8.k5() || var6.k5() >= var8.n5() && var6.k5() <= var8.k5()) {
                     double var9 = var8.u3() - var6.l6();
                     var2 = com.aspose.slides.ms.System.q1.l6(var2, var9);
                     var4 = true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4 ? var2 : 0.0;
   }

   private static double l6(IGenericEnumerable<u6x> var0, IGenericEnumerable<u6x> var1) {
      double var2 = -Double.MAX_VALUE;
      boolean var4 = false;
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            u6x var6 = (u6x)var5.next();
            IGenericEnumerator var7 = var0.iterator();

            try {
               while (var7.hasNext()) {
                  u6x var8 = (u6x)var7.next();
                  if (var6.l6() >= var8.l6() && var6.l6() <= var8.u3() || var6.u3() >= var8.l6() && var6.u3() <= var8.u3()) {
                     double var9 = var8.k5() - var6.n5();
                     var2 = com.aspose.slides.ms.System.q1.l6(var2, var9);
                     var4 = true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4 ? var2 : 0.0;
   }

   private o9d c8() {
      return (o9d)this.n5();
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(e4c.class, new d8r$1());
   }
}
