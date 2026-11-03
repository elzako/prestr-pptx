package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

public class h0 extends u6 {
   private j9 u3;

   private g7 k5(j4 var1) {
      return this.u3.w1().n5((double)(var1.k5()));
   }

   private g7 x8(j4 var1, g7[] var2) {
      var1.n5(com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14));
      return var2[0];
   }

   public final g7 n5(u3 var1, g7[] var2) {
      u3 var3 = this.u3.e2().h0();

      for (int var4 = 0; var4 < var1.k5(); var4++) {
         y1 var5 = (y1)var1.n5(com.aspose.slides.ms.System.a3.l6(var4));
         if (i1.k5(var5)) {
            var3.n5(com.aspose.slides.ms.System.a3.l6(var4), this.u3.c4().s7());
         } else {
            u6 var6 = com.aspose.slides.internal.v6g.k5.n5(var5.n5("toString"), u6.class);
            if (var6 != null) {
               this.u3.s7().n5(var6, var5, var2);
               var3.n5(com.aspose.slides.ms.System.a3.l6(var4), this.u3.s7().h0());
            } else {
               var3.n5(com.aspose.slides.ms.System.a3.l6(var4), this.u3.c4().s7());
            }
         }
      }

      return this.u3.c4().u9(var3.toString());
   }

   public final g7 l6(u3 var1, g7[] var2) {
      u3 var3 = this.u3.e2().h0();

      for (int var4 = 0; var4 < var1.k5(); var4++) {
         y1 var5 = (y1)var1.n5(com.aspose.slides.ms.System.a3.l6(var4));
         this.u3.s7().n5((u6)var5.n5("toLocaleString"), var5, var2);
         var3.n5(com.aspose.slides.ms.System.a3.l6(var4), this.u3.s7().h0());
      }

      return this.u3.c4().u9(var3.toString());
   }

   public final g7 n5(j4 var1, g7[] var2) {
      return ((u3)var1).n5(this.u3, var2);
   }

   public final g7 l6(j4 var1, g7[] var2) {
      return ((u3)var1).n5(this.u3, var2.length > 0 ? var2[0] : l5.n5);
   }

   public static g7 k5(j4 var0, g7[] var1) {
      long var2 = com.aspose.slides.ms.System.z3.c8(var0.k5());
      if ((var2 & 4294967295L) == 0L) {
         return l5.n5;
      }

      String var4 = com.aspose.slides.ms.System.l4.l6((var2 & 4294967295L) - 1L & 4294967295L);
      g7 var5 = var0.n5(var4);
      var0.l6(var4);
      var0.n5(var0.k5() - 1);
      return var5;
   }

   public final g7 n5(y1 var1, g7[] var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1.n5("length").l6(), 14);

      for (g7 var7 : var2) {
         var1.n5(this.u3.w1().n5((double)(var3)), var7);
         var3++;
      }

      return this.u3.w1().n5((double)(var3));
   }

   public static g7 u3(j4 var0, g7[] var1) {
      int var2 = var0.k5();
      int var3 = var2 / 2;

      for (int var4 = 0; var4 != var3; var4++) {
         int var5 = var2 - var4 - 1;
         String var6 = com.aspose.slides.ms.System.a3.l6(var5);
         String var7 = com.aspose.slides.ms.System.a3.l6(var4);
         g7 var8 = null;
         g7 var9 = null;
         g7[] var10 = new g7[]{var8};
         boolean var11 = var0.n5(var7, var10);
         var8 = var10[0];
         g7[] var12 = new g7[]{var9};
         boolean var13 = var0.n5(var6, var12);
         var9 = var12[0];
         if (var11) {
            var0.n5(var6, var8);
         } else {
            var0.l6(var6);
         }

         if (var13) {
            var0.n5(var7, var9);
         } else {
            var0.l6(var7);
         }
      }

      return var0;
   }

   public static g7 l6(y1 var0, g7[] var1) {
      if (var0.k5() == 0) {
         return l5.n5;
      }

      g7 var2 = var0.n5(com.aspose.slides.ms.System.a3.l6(0));

      for (int var3 = 1; var3 < var0.k5(); var3++) {
         g7 var4 = null;
         String var5 = com.aspose.slides.ms.System.a3.l6(var3);
         String var6 = com.aspose.slides.ms.System.a3.l6(var3 - 1);
         g7[] var7 = new g7[]{var4};
         boolean var8 = var0.n5(var5, var7);
         var4 = var7[0];
         if (var8) {
            var0.n5(var6, var4);
         } else {
            var0.l6(var6);
         }
      }

      var0.l6(com.aspose.slides.ms.System.a3.l6(var0.k5() - 1));
      var0.n5(var0.k5() - 1);
      return var2;
   }

   public final g7 a6(j4 var1, g7[] var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14);
      int var4 = var1.k5();
      if (var2.length > 1) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var2[1].l6(), 14);
      }

      if (var3 < 0) {
         var3 += var1.k5();
      }

      if (var4 < 0) {
         var4 += var1.k5();
      }

      if (var3 > var1.k5()) {
         var3 = var1.k5();
      }

      if (var4 > var1.k5()) {
         var4 = var1.k5();
      }

      u3 var5 = this.u3.e2().h0();

      for (int var6 = var3; var6 < var4; var6++) {
         this.n5((y1)var5, new g7[]{var1.n5((g7)this.u3.w1().n5((double)(var6)))});
      }

      return var5;
   }

   public final g7 u9(j4 var1, g7[] var2) {
      if (var1.k5() <= 1) {
         return var1;
      }

      u6 var3 = null;
      if (var2.length > 0) {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var2[0], u6.class);
      }

      List var4 = new List();
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.n5("length").l6(), 14);

      for (int var6 = 0; var6 < var5; var6++) {
         var4.addItem(var1.n5(com.aspose.slides.ms.System.a3.l6(var6)));
      }

      if (var3 == null) {
         var3 = new m3(this.u3);
      }

      try {
         var4.sort(new k7(this.u3.s7(), var3));
      } catch (Exception var7) {
         if (com.aspose.slides.internal.v6g.k5.l6(var7.getInnerException(), n1.class)) {
            throw (Exception)var7.getInnerException();
         }

         throw var7;
      }

      for (int var8 = 0; var8 < var5; var8++) {
         var1.n5(com.aspose.slides.ms.System.a3.l6(var8), (g7)var4.get_Item(var8));
      }

      return var1;
   }

   public final g7 h0(j4 var1, g7[] var2) {
      u3 var3 = this.u3.e2().h0();
      int var4 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
      int var5 = var4 < 0 ? com.aspose.slides.ms.System.q1.n5(var1.k5() + var4, 0) : com.aspose.slides.ms.System.q1.l6(var4, var1.k5());
      int var6 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.z3.h0(var2[1].l6()), 0), var1.k5() - var5);
      int var7 = var1.k5();

      for (int var8 = 0; var8 < var6; var8++) {
         String var9 = com.aspose.slides.ms.System.a3.l6(var4 + var8);
         g7 var10 = null;
         g7[] var11 = new g7[]{var10};
         boolean var12 = var1.n5(var9, var11);
         var10 = var11[0];
         if (var12) {
            var3.n5(var8, var10);
         }
      }

      List var15 = new List();

      for (int var16 = 0; var16 < var2.length; var16++) {
         var15.addItem(var2[var16]);
      }

      var15.removeAt(0);
      var15.removeAt(0);
      if (var15.size() < var6) {
         for (int var17 = var5; var17 < var7 - var6; var17++) {
            g7 var22 = null;
            String var26 = com.aspose.slides.ms.System.a3.l6(var17 + var6);
            String var28 = com.aspose.slides.ms.System.a3.l6(var17 + var15.size());
            g7[] var13 = new g7[]{var22};
            boolean var14 = var1.n5(var26, var13);
            var22 = var13[0];
            if (var14) {
               var1.n5(var28, var22);
            } else {
               var1.l6(var28);
            }
         }

         for (int var18 = var1.k5(); var18 > var7 - var6 + var15.size(); var18--) {
            var1.l6(com.aspose.slides.ms.System.a3.l6(var18 - 1));
         }

         var1.n5(var7 - var6 + var15.size());
      } else {
         for (int var19 = var7 - var6; var19 > var5; var19--) {
            g7 var24 = null;
            String var27 = com.aspose.slides.ms.System.a3.l6(var19 + var6 - 1);
            String var29 = com.aspose.slides.ms.System.a3.l6(var19 + var15.size() - 1);
            g7[] var30 = new g7[]{var24};
            boolean var31 = var1.n5(var27, var30);
            var24 = var30[0];
            if (var31) {
               var1.n5(var29, var24);
            } else {
               var1.l6(var29);
            }
         }
      }

      for (int var20 = 0; var20 < var15.size(); var20++) {
         var1.n5(com.aspose.slides.ms.System.a3.l6(var20), (g7)var15.get_Item(var20));
      }

      return var3;
   }

   public final g7 c8(j4 var1, g7[] var2) {
      for (int var3 = var1.k5(); var3 > 0; var3--) {
         g7 var4 = null;
         String var5 = com.aspose.slides.ms.System.a3.l6(var3 - 1);
         String var6 = com.aspose.slides.ms.System.a3.l6(var3 + var2.length - 1);
         g7[] var7 = new g7[]{var4};
         boolean var8 = var1.n5(var5, var7);
         var4 = var7[0];
         if (var8) {
            var1.n5(var6, var4);
         } else {
            var1.l6(var6);
         }
      }

      List var9 = new List<>(com.aspose.slides.ms.System.u3.n5(var2));

      for (int var11 = 0; var9.size() > 0; var11++) {
         g7 var12 = (g7)var9.get_Item(0);
         var9.removeAt(0);
         var1.n5(com.aspose.slides.ms.System.a3.l6(var11), var12);
      }

      return this.u3.w1().n5((double)(var1.k5()));
   }

   public final g7 t2(j4 var1, g7[] var2) {
      if (var2.length == 0) {
         return this.u3.w1().n5(-1.0);
      }

      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1.n5("length").l6(), 14);
      if (var3 == 0) {
         return this.u3.w1().n5(-1.0);
      }

      int var4 = 0;
      if (var2.length > 1) {
         var4 = com.aspose.slides.ms.System.z3.h0(var2[1].l6());
      }

      if (var4 >= var3) {
         return this.u3.w1().n5(-1.0);
      }

      g7 var5 = var2[0];
      int var6;
      if (var4 >= 0) {
         var6 = var4;
      } else {
         var6 = var3 - com.aspose.slides.ms.System.q1.n5(var4);
      }

      while (var6 < var3) {
         g7 var7 = null;
         g7[] var8 = new g7[]{var7};
         boolean var9 = var1.n5(com.aspose.slides.ms.System.a3.l6(var6), var8);
         var7 = var8[0];
         if (var9 && var7.equals(var5)) {
            return this.u3.w1().n5((double)(var6));
         }

         var6++;
      }

      return this.u3.w1().n5(-1.0);
   }

   public final g7 s7(j4 var1, g7[] var2) {
      if (var2.length == 0) {
         return this.u3.w1().n5(-1.0);
      }

      int var3 = var1.k5();
      if (var3 == 0) {
         return this.u3.w1().n5(-1.0);
      }

      int var4 = var3;
      if (var2.length > 1) {
         var4 = com.aspose.slides.ms.System.z3.h0(var2[1].l6());
      }

      g7 var5 = var2[0];
      int var6;
      if (var4 >= 0) {
         var6 = com.aspose.slides.ms.System.q1.l6(var4, var3 - 1);
      } else {
         var6 = var3 - com.aspose.slides.ms.System.q1.n5(var4 - 1);
      }

      while (var6 >= 0) {
         g7 var7 = null;
         g7[] var8 = new g7[]{var7};
         boolean var9 = var1.n5(com.aspose.slides.ms.System.a3.l6(var6), var8);
         var7 = var8[0];
         if (var9 && var7.equals(var5)) {
            return this.u3.w1().n5((double)(var6));
         }

         var6--;
      }

      return this.u3.w1().n5(-1.0);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("get_length".equals(this.n5)) {
         var4 = this.k5(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class));
      } else if ("set_length".equals(this.n5)) {
         var4 = this.x8(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("toString".equals(this.n5)) {
         var4 = this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, u3.class), var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.l6(com.aspose.slides.internal.v6g.k5.n5(var2, u3.class), var3);
      } else if ("concat".equals(this.n5)) {
         var4 = this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("join".equals(this.n5)) {
         var4 = this.l6(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("pop".equals(this.n5)) {
         var4 = k5(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("push".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("reverse".equals(this.n5)) {
         var4 = u3(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("shift".equals(this.n5)) {
         var4 = l6(var2, var3);
      } else if ("slice".equals(this.n5)) {
         var4 = this.a6(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("sort".equals(this.n5)) {
         var4 = this.u9(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("splice".equals(this.n5)) {
         var4 = this.h0(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("unshift".equals(this.n5)) {
         var4 = this.c8(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else if ("indexOf".equals(this.n5)) {
         var4 = this.t2(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      } else {
         if (!"lastIndexOf".equals(this.n5)) {
            throw new j3("unknown array function");
         }

         var4 = this.s7(com.aspose.slides.internal.v6g.k5.n5(var2, j4.class), var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public h0(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
