package com.aspose.slides.internal.n3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.m3.j9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.s3;

public abstract class c8 extends z3 {
   private final c8$l6 n5 = new c8$l6(null);
   private final c8$k5 l6 = new c8$k5(null);
   private final c8$n5 k5 = new c8$n5(null);
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "linear-gradient", "radial-gradient", "repeating-linear-gradient", "repeating-radial-gradient", "left", "top", "bottom", "right"
   );

   @Override
   protected com.aspose.slides.internal.k5.u9 l6(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      String var3 = d1.a6(var1.h0());
      var3 = d1.l6(var3, 0, var3.length() - 1);
      switch (u3.n5(var3)) {
         case 0:
            return this.n5(var3, var1, var2);
         case 1:
         case 2:
         case 3:
         default:
            throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
      }
   }

   private com.aspose.slides.internal.k5.u9 n5(String var1, com.aspose.slides.internal.z8.y4 var2, com.aspose.slides.internal.h0.h0 var3) {
      com.aspose.slides.internal.z8.y4 var4 = var2.c8();
      if (var4 == null) {
         throw this.k5(var1);
      }

      List var5 = new List();
      int var6 = 0;
      o5 var7 = new o5();
      Object var8 = null;
      o5[] var9 = new o5[]{var7};
      com.aspose.slides.internal.y4.c8[] var10 = new com.aspose.slides.internal.y4.c8[]{(com.aspose.slides.internal.y4.c8)var8};
      var4 = this.n5(var1, var4, var3, var9, var10);
      var7 = var9[0];
      com.aspose.slides.internal.y4.c8 var15 = var10[0];
      if (var7.l6()) {
         var5.addItem(new com.aspose.slides.internal.y4.t9(s3.n5(j9.class, ((Integer)var7.n5()).intValue())));
         var5.addItem(var15);
         var4 = var4.k5();
      } else {
         var5.addItem(new com.aspose.slides.internal.y4.t9(s3.n5(j9.class, 4L)));
         var5.addItem(new com.aspose.slides.internal.y4.c8(180.0F, (short)11));
      }

      while (var4 != null) {
         Object var11 = null;
         com.aspose.slides.internal.y4.k5[] var12 = new com.aspose.slides.internal.y4.k5[]{(com.aspose.slides.internal.y4.k5)var11};
         var4 = this.n5(var1, var4, var3, var12);
         com.aspose.slides.internal.y4.k5 var16 = var12[0];
         if (var16 != null) {
            var5.addItem(var16);
            var6++;
         }

         if (var4 != null) {
            var4 = var4.k5();
         }
      }

      if (var6 < 2) {
         throw this.k5(var1);
      } else {
         return new com.aspose.slides.internal.y4.t2(var1, (com.aspose.slides.internal.k5.u9[])var5.toArray(new com.aspose.slides.internal.k5.u9[0]));
      }
   }

   private com.aspose.slides.internal.z8.y4 n5(
      String var1, com.aspose.slides.internal.z8.y4 var2, com.aspose.slides.internal.h0.h0 var3, o5<Integer>[] var4, com.aspose.slides.internal.y4.c8[] var5
   ) {
      var4[0] = new o5();
      var5[0] = null;

      try {
         var5[0] = (com.aspose.slides.internal.y4.c8)this.k5.n5(var2, var3);
         var4[0] = new o5<>(4);
         var2 = var2.k5();
      } catch (com.aspose.slides.internal.z8.u3 var14) {
      }

      if (var5[0] == null && var2.n5() == 47) {
         o5 var6 = new o5();
         o5 var7 = new o5();
         o5 var8 = new o5();
         String[] var9 = d1.n5(var2.t2(), new char[]{' '}, (short)1);

         for (String var13 : var9) {
            switch (u3.n5(d1.a6(var13))) {
               case 4:
                  var7 = new o5<>(true);
                  break;
               case 5:
                  var8 = new o5<>(true);
                  break;
               case 6:
                  var8 = new o5<>(false);
                  break;
               case 7:
                  var7 = new o5<>(false);
            }
         }

         var2 = var2.k5();
         if (var7.l6() && var8.l6()) {
            if ((Boolean)var7.n5() && (Boolean)var8.n5()) {
               var4[0] = new o5<>(0);
            } else if (!(Boolean)var7.n5() && (Boolean)var8.n5()) {
               var4[0] = new o5<>(1);
            } else if ((Boolean)var7.n5() && !(Boolean)var8.n5()) {
               var4[0] = new o5<>(2);
            } else if (!(Boolean)var7.n5() && !(Boolean)var8.n5()) {
               var4[0] = new o5<>(3);
            }
         } else if (var7.l6()) {
            var6 = new o5<>(((Boolean)var7.n5()).booleanValue() ? 270.0F : 90.0F);
            var4[0] = new o5<>(4);
         } else if (var8.l6()) {
            var6 = new o5<>(((Boolean)var8.n5()).booleanValue() ? 0.0F : 180.0F);
            var4[0] = new o5<>(4);
         }

         if (var6.l6()) {
            var5[0] = new com.aspose.slides.internal.y4.c8((Float)var6.n5(), (short)11);
         }
      }

      return var2;
   }

   private com.aspose.slides.internal.z8.y4 n5(
      String var1, com.aspose.slides.internal.z8.y4 var2, com.aspose.slides.internal.h0.h0 var3, com.aspose.slides.internal.y4.k5[] var4
   ) {
      var4[0] = null;
      com.aspose.slides.internal.k5.u3 var5 = null;
      com.aspose.slides.internal.k5.u3 var6 = null;

      try {
         var5 = (com.aspose.slides.internal.k5.u3)this.n5.n5(var2, var3);
         var2 = var2.k5();
      } catch (com.aspose.slides.internal.z8.u3 var9) {
         return var2;
      }

      try {
         if (var2 != null) {
            var6 = (com.aspose.slides.internal.k5.u3)this.l6.n5(var2, var3);
            var2 = var2.k5();
         }
      } catch (com.aspose.slides.internal.z8.u3 var8) {
      }

      var4[0] = com.aspose.slides.internal.y4.k5.n5(var5, var6);
      return var2;
   }
}
