package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1x.h2;
import com.aspose.slides.internal.e1x.t1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.v4;
import com.aspose.slides.ms.System.q1;

public class r4 extends n3 implements p8 {
   private com.aspose.slides.internal.w0.s7 n5;
   private com.aspose.slides.internal.w0.l6 l6;
   private r4 k5;
   private com.aspose.slides.internal.w0.c8 u3;
   private int a6 = 0;
   private m1 u9;
   private int h0 = 13;
   private e2 c8;

   public r4() {
   }

   public r4(com.aspose.slides.internal.w0.s7 var1) {
      this.n5 = var1;
   }

   public final void n5(String var1, String var2, byte[] var3) {
      this.c8 = new e2(var1, var2, var3);
   }

   public final e2 n5() {
      return this.c8;
   }

   public final com.aspose.slides.internal.w0.s7 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.w0.s7 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.w0.l6 k5() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.w0.l6 var1) {
      this.l6 = var1;
   }

   @Override
   public final r4 a6() {
      return this.k5;
   }

   public final void n5(r4 var1) {
      this.k5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.w0.c8 u3() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final int h0() {
      return this.a6;
   }

   public final void k5(int var1) {
      this.a6 = var1;
   }

   public final boolean x8() {
      if (this.t2() == 0) {
         return false;
      }

      m3 var1 = this.n5(this.t2() - 1);
      c4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, c4.class);
      if (var2 != null) {
         return var2.n5();
      }

      r4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, r4.class);
      return var3 != null ? var3.x8() : false;
   }

   public final m1 n3() {
      return this.u9;
   }

   public final void n5(m1 var1) {
      this.u9 = var1;
   }

   public static r4 n5(com.aspose.slides.internal.o9b.w1[] var0, boolean var1) {
      r4 var2 = new r4();
      var2.n5(c4.n5(var0, var1));
      return var2;
   }

   public static r4 n5(com.aspose.slides.internal.o9b.y1 var0) {
      r4 var1 = new r4();
      var1.n5(c4.n5(var0.y4()));
      return var1;
   }

   public static r4 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      r4 var2 = new r4();
      var2.n5(c4.n5(var0.u3(), var1.u3()));
      return var2;
   }

   public static r4 n5(z1 var0) {
      return n5(var0.x8(), var0.l6(), var0.u9(), var0.c8(), var0.t4());
   }

   public static r4 n5(
      String var0, com.aspose.slides.internal.p1s.l6 var1, com.aspose.slides.internal.w0.l6 var2, com.aspose.slides.internal.w0.s7 var3, float var4
   ) {
      com.aspose.slides.internal.p1s.l6 var5 = var1;
      if (!n5(var5, var0) || com.aspose.slides.internal.n2d.z3.n5() == 2 && var1.n5().u9().contains(".ttc")) {
         var5 = l6(var5, var0);
      }

      float var6 = 20480.0F;
      float var7 = var5.c8() / 20480.0F;
      if (var3 != null
         && com.aspose.slides.internal.v6g.k5.l6(var3.u9(), com.aspose.slides.internal.w0.n3.class)
         && ((com.aspose.slides.internal.w0.n3)var3.u9()).l6().u9()) {
         var3 = null;
      }

      if (var3 != null && var3.l6() != 1.0F) {
         var3.n5(var3.l6() / var7);
      }

      com.aspose.slides.internal.e1x.i1 var8 = var5.n5();
      v4 var9 = new v4(var8, false);
      var9.n5(var0);
      Dictionary var10 = var9.n5();
      float var11 = 0.0F;
      r4 var12 = new r4();
      r4 var13 = new r4();
      var13.n5(new com.aspose.slides.internal.w0.c8());
      var13.u3().n5(var7, var7, 0);
      var13.u3().l6(var11, 20480.0F, 0);
      int var14 = Integer.MIN_VALUE;

      for (int var15 = 0; var15 < var0.length(); var15++) {
         char var16 = var0.charAt(var15);
         if (!n5(var16)) {
            int var17 = var9.n5(var16);
            if (var17 != -1) {
               int var18 = var8.h0().l6(var16).l6();
               if (var14 != Integer.MIN_VALUE) {
                  var11 += (float)var8.n5(var14 & 4294967295L, var18 & 4294967295L) * 20480.0F / var8.t2();
               }

               n5(var13, (t1)var10.get_Item(var17), var11);
               var14 = var18;
            }
         }

         var11 += var8.h0().l6(var16).k5() * 20480.0F / var8.t2();
         if (q1.n5(var4) > 0.005) {
            var11 += var4 / var7;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.w0.y4.class)) {
         var13.l6(var13.u3());
         var13.n5((com.aspose.slides.internal.w0.c8)null);
      }

      var13.n5(var2);
      var13.n5(var3);
      var12.n5(var13);
      var12.n5(var2);
      var12.n5(var3);
      return var12;
   }

   public static boolean n5(com.aspose.slides.internal.p1s.l6 var0, String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         u6 var4 = var0.n5().h0().l6(var3);
         if (var4.equals(var0.n5().h0().l6())) {
            return false;
         }
      }

      return true;
   }

   public static com.aspose.slides.internal.p1s.l6 l6(com.aspose.slides.internal.p1s.l6 var0, String var1) {
      String[] var2 = new String[]{
         "Arial Unicode MS",
         "Arial",
         "Calibri",
         "MS PGothic",
         "MS Gothic",
         "Times New Roman",
         "Cambria Math",
         "SimSun",
         "Segoe UI",
         "Microsoft YaHei",
         "Gulim",
         "Helvetica",
         "Helv",
         "DejaVu Sans",
         "Liberation Serif",
         "FreeSans"
      };

      for (String var6 : var2) {
         com.aspose.slides.internal.p1s.l6 var7 = com.aspose.slides.internal.e1x.x8.u3().n5(var6, var0.c8(), var0.l6());
         if (var7 != null && var7.n5().u3().contains(var6) && n5(var7, var1)) {
            return var7;
         }
      }

      return com.aspose.slides.internal.e1x.x8.u3().n5(com.aspose.slides.internal.e1x.x8.u3().k5().n5(), var0.c8(), var0.l6());
   }

   private static boolean n5(char var0) {
      return var0 == ' ' || var0 == 8203 || var0 == 8204 || var0 == 8205 || var0 == '\ufeff' || var0 == 160;
   }

   public static r4 n5(t1 var0) {
      r4 var1 = new r4();
      c4 var2 = new c4();
      var0.n5(var0.a6().n5(0));
      var0.u9().n5(true);
      h2 var3 = var0.u9();
      var2.n5(new y2(new float[]{var0.u9().n5(), -var0.u9().l6()}));

      for (int var4 = 1; var4 <= var0.a6().n5(); var4++) {
         h2 var5 = var4 < var0.a6().n5() && !var3.u3() ? var0.a6().n5(var4) : var0.l6(var0.a6().n5(var4));
         if (!var5.k5() && !var5.a6()) {
            h2 var6 = var4 + 1 < var0.a6().n5() && !var5.u3() ? var0.a6().n5(var4 + 1) : var0.l6(var0.a6().n5(var4 + 1));
            if (var6.k5()) {
               var2.n5(
                  new a6(
                     new com.aspose.slides.internal.o9b.w1(var3.n5(), -var3.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.n5(), -var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var6.n5(), -var6.l6())
                  )
               );
               var3 = var5;
               var5 = var6;
               var4++;
            } else {
               int var7 = com.aspose.slides.internal.n2d.t4.n5((var6.n5() - var5.n5()) / 2.0F);
               int var8 = com.aspose.slides.internal.n2d.t4.n5((var6.l6() - var5.l6()) / 2.0F);
               h2 var9 = new h2(var7, var8, var5.n5() + var7, var5.l6() + var8, true, false);
               var2.n5(
                  new a6(
                     new com.aspose.slides.internal.o9b.w1(var3.n5(), -var3.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.n5(), -var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var9.n5(), -var9.l6())
                  )
               );
               var3 = var5;
               var5 = var9;
            }
         } else {
            var2.n5(new y2(new float[]{var5.n5(), -var5.l6()}));
         }

         if (var3.u3()) {
            var2 = n5(var2, var1);
            if (var4 < var0.a6().n5()) {
               var5 = var0.a6().n5(var4);
            }
         }

         var3 = var5;
      }

      if (var0.u9() != null) {
         var2.n5(new y2(new float[]{var0.u9().n5(), -var0.u9().l6()}));
      }

      n5(var2, var1);
      return var1;
   }

   public static void n5(r4 var0, t1 var1, float var2) {
      c4 var3 = new c4();
      var1.n5(var1.a6().n5(0));
      var1.u9().n5(true);
      h2 var4 = var1.u9();
      var3.n5(new y2(new float[]{var1.u9().n5() + var2, -var1.u9().l6()}));

      for (int var5 = 1; var5 <= var1.a6().n5(); var5++) {
         h2 var6 = var5 < var1.a6().n5() && !var4.u3() ? var1.a6().n5(var5) : var1.l6(var1.a6().n5(var5));
         if (!var6.k5() && !var6.a6()) {
            h2 var7 = var5 + 1 < var1.a6().n5() && !var6.u3() ? var1.a6().n5(var5 + 1) : var1.l6(var1.a6().n5(var5 + 1));
            if (var7.k5()) {
               var3.n5(
                  new a6(
                     new com.aspose.slides.internal.o9b.w1(var4.n5() + var2, -var4.l6()),
                     new com.aspose.slides.internal.o9b.w1(var6.n5() + var2, -var6.l6()),
                     new com.aspose.slides.internal.o9b.w1(var7.n5() + var2, -var7.l6())
                  )
               );
               var4 = var6;
               var6 = var7;
               var5++;
            } else {
               int var8 = com.aspose.slides.internal.n2d.t4.n5((var7.n5() - var6.n5()) / 2.0F);
               int var9 = com.aspose.slides.internal.n2d.t4.n5((var7.l6() - var6.l6()) / 2.0F);
               h2 var10 = new h2(var8, var9, var6.n5() + var8, var6.l6() + var9, true, false);
               var3.n5(
                  new a6(
                     new com.aspose.slides.internal.o9b.w1(var4.n5() + var2, -var4.l6()),
                     new com.aspose.slides.internal.o9b.w1(var6.n5() + var2, -var6.l6()),
                     new com.aspose.slides.internal.o9b.w1(var10.n5() + var2, -var10.l6())
                  )
               );
               var4 = var6;
               var6 = var10;
            }
         } else {
            var3.n5(new y2(new float[]{var6.n5() + var2, -var6.l6()}));
         }

         if (var4.u3()) {
            var3 = n5(var3, var0);
            if (var5 < var1.a6().n5()) {
               var6 = var1.a6().n5(var5);
            }
         }

         var4 = var6;
      }

      if (var1.u9() != null) {
         var3.n5(new y2(new float[]{var1.u9().n5() + var2, -var1.u9().l6()}));
      }

      n5(var3, var0);
   }

   private static c4 n5(c4 var0, r4 var1) {
      var0.n5(true);
      var1.n5(var0);
      return new c4();
   }

   public final void l6(com.aspose.slides.internal.w0.c8 var1) {
      for (int var2 = 0; var2 < this.t2(); var2++) {
         c4 var3 = (c4)this.n5(var2);
         var3.n5(var1);
      }
   }

   public final r4 y4() {
      r4 var1 = new r4();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.k5(this.a6);

      for (int var2 = 0; var2 < this.t2(); var2++) {
         c4 var3 = (c4)this.n5(var2);
         var1.n5(var3.l6());
      }

      return var1;
   }
}
