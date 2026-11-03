package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;

public class n7 {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private v2 l6 = new v2();
   private v2 k5 = new v2();
   private double u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private List<com.aspose.slides.internal.o9b.w1> c8 = null;
   private List<Integer> t2 = null;
   private boolean s7 = true;

   public n7() {
      this.k5();
      this.l6();
   }

   public n7(int var1) {
      this.k5();
      this.l6();
   }

   public n7(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      this.k5();
      this.l6();
      if (var1.l6().y4().getCurrentPoint() != null) {
         com.aspose.slides.internal.o9b.w1[] var3 = var1.a6();
         byte[] var4 = var1.u9();

         for (int var5 = 0; var5 < var3.length; var5++) {
            com.aspose.slides.internal.o9b.w1 var6 = var3[var5].u3();
            this.t2.addItem(var4[var5] & 255);
            this.c8.addItem(new com.aspose.slides.internal.o9b.w1(var6.l6() * var2, var6.k5() * var2));
         }
      }
   }

   public final void n5() {
      this.l6();
   }

   public final void l6() {
      this.c8 = new List<>();
      this.t2 = new List<>();
      this.h0 = false;
   }

   public final void k5() {
      this.l6 = new v2(0.0, 0.0);
      this.k5 = new v2(1.0, 1.0);
      this.u3 = 0.0;
      this.n5(false, false);
      this.n5 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.n5(var1.l6(), var1.k5(), var2.l6(), var2.k5());
   }

   public final void n5(double var1, double var3, double var5, double var7) {
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var1, (float)var3));
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var5, (float)var7));
      this.x8();
      this.t2.addItem(1);
   }

   public final void n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      this.n5(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3.l6(), var3.k5(), var4.l6(), var4.k5());
   }

   public final void n5(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15) {
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var1, (float)var3));
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var5, (float)var7));
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var9, (float)var11));
      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)var13, (float)var15));
      this.x8();
      this.t2.addItem(3);
      this.t2.addItem(3);
      this.t2.addItem(3);
   }

   public final com.aspose.slides.internal.o9b.w1 n5(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.n5(var1, var3, var5, var7, var9, var11, (byte)2);
   }

   public final void u3() {
      this.h0 = false;
      if (this.t2.size() > 0) {
         this.t2.set_Item(this.t2.size() - 1, this.t2.get_Item(this.t2.size() - 1) | 128);
      }
   }

   public final void a6() {
      com.aspose.slides.internal.o9b.w1 var1 = new com.aspose.slides.internal.o9b.w1((float)(this.n5.l6() * this.k5.n5()), (float)(this.n5.k5() * this.k5.l6()));
      byte var2 = (byte)(this.a6 ? -1 : 1);
      byte var3 = (byte)(this.u9 ? -1 : 1);
      double var4 = com.aspose.slides.ms.System.q1.c8(this.u3 * Math.PI / 180.0);
      double var6 = com.aspose.slides.ms.System.q1.h0(this.u3 * Math.PI / 180.0);
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();

      for (int var9 = 0; var9 < this.c8.size(); var9++) {
         this.c8.get_Item(var9).n5(var8);
         var8.n5((float)(this.n5.l6() + (var8.l6() - this.n5.l6()) * this.k5.n5() * var2));
         var8.l6((float)(this.n5.k5() + (var8.k5() - this.n5.k5()) * this.k5.l6() * var3));
         if (com.aspose.slides.ms.System.q1.n5(this.u3) > 1.0E-6) {
            float var10 = var8.l6() - this.n5.l6();
            float var11 = var8.k5() - this.n5.k5();
            var8.n5((float)(this.n5.l6() + var10 * var4 - var11 * var6));
            var8.l6((float)(this.n5.k5() + var10 * var6 + var11 * var4));
         }

         var8.n5(var8.l6() + (float)(this.l6.n5() + (var1.l6() - this.n5.l6())));
         var8.l6(var8.k5() + (float)(this.l6.l6() + (var1.k5() - this.n5.k5())));
         this.c8.set_Item(var9, var8.u3());
      }
   }

   public final void u9() {
   }

   public final void h0() {
      int var1 = this.c8.size();
      if (var1 >= 1) {
         List var2 = new List();
         List var3 = new List();
         com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
         int var5 = 0;
         boolean var6 = false;

         while (var5 < var1) {
            if ((this.t2.get_Item(var5) & 3) < 3) {
               var2.addItem(this.c8.get_Item(var5).u3());
               var3.addItem(this.t2.get_Item(var5));
               this.c8.get_Item(var5).n5(var4);
               var5++;
            } else {
               var6 = true;
               if (var5 + 2 < var1) {
                  i1 var7 = new i1();
                  var7.n5(this.s7);
                  List[] var8 = new List[]{var2};
                  var7.n5(var4.u3(), this.c8.get_Item(var5).u3(), this.c8.get_Item(var5 + 1).u3(), this.c8.get_Item(var5 + 2).u3(), var8);
                  var2 = var8[0];
                  this.c8.get_Item(var5 + 2).n5(var4);

                  while (var3.size() < var2.size()) {
                     var3.addItem(1);
                  }

                  if ((this.t2.get_Item(var5 + 2) & 128) == 128) {
                     var3.set_Item(var3.size() - 1, 129);
                  }
               }

               var5 += 3;
            }
         }

         if (var6) {
            this.c8.clear();
            this.t2.clear();
            this.c8 = var2;
            this.t2 = var3;
         }
      }
   }

   public final void n5(double var1, double var3, boolean var5) {
      if (var5) {
         v2.n5(this.l6, new v2(var1, var3)).k5(this.l6);
      } else {
         this.l6 = new v2(var1, var3);
      }
   }

   public final void l6(double var1, double var3, boolean var5) {
      if (var5) {
         this.k5 = new v2(this.k5.n5() * var1, this.k5.l6() * var3);
      } else {
         this.k5 = new v2(var1, var3);
      }
   }

   public final void n5(boolean var1, boolean var2) {
      this.a6 = var1;
      this.u9 = var2;
   }

   private com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1, double var2, double var4, com.aspose.slides.internal.o9b.w1 var6, double var7, double var9
   ) {
      double var11 = 0.0;
      double var13 = 0.0;
      if (com.aspose.slides.ms.System.q1.n5(var4) <= com.aspose.slides.ms.System.q1.n5(var2)
         && com.aspose.slides.ms.System.q1.n5(var4) < com.aspose.slides.ms.System.q1.n5(var9)) {
         var13 = (var2 * var9 * var1.k5() - var7 * var4 * var6.k5() + var4 * var9 * (var6.l6() - var1.l6())) / (var2 * var9 - var7 * var4);
         return new com.aspose.slides.internal.o9b.w1((float)(var7 * (var13 - var6.k5()) / var9 + var6.l6()), (float)var13);
      } else if (com.aspose.slides.ms.System.q1.n5(var9) <= com.aspose.slides.ms.System.q1.n5(var7)
         && com.aspose.slides.ms.System.q1.n5(var9) < com.aspose.slides.ms.System.q1.n5(var4)) {
         var13 = (var2 * var9 * var1.k5() - var7 * var4 * var6.k5() + var4 * var9 * (var6.l6() - var1.l6())) / (var2 * var9 - var7 * var4);
         return new com.aspose.slides.internal.o9b.w1((float)(var2 * (var13 - var1.k5()) / var4 + var1.l6()), (float)var13);
      } else if (com.aspose.slides.ms.System.q1.n5(var2) <= com.aspose.slides.ms.System.q1.n5(var4)
         && com.aspose.slides.ms.System.q1.n5(var2) < com.aspose.slides.ms.System.q1.n5(var7)) {
         var11 = (var2 * var9 * var6.l6() - var7 * var4 * var1.l6() + var7 * var2 * (var1.k5() - var6.k5())) / (var2 * var9 - var7 * var4);
         return new com.aspose.slides.internal.o9b.w1((float)var11, (float)(var9 * (var11 - var6.l6()) / var7 + var6.k5()));
      } else if (com.aspose.slides.ms.System.q1.n5(var7) <= com.aspose.slides.ms.System.q1.n5(var9)
         && com.aspose.slides.ms.System.q1.n5(var7) < com.aspose.slides.ms.System.q1.n5(var2)) {
         var11 = (var2 * var9 * var6.l6() - var7 * var4 * var1.l6() + var7 * var2 * (var1.k5() - var6.k5())) / (var2 * var9 - var7 * var4);
         return new com.aspose.slides.internal.o9b.w1((float)var11, (float)(var4 * (var11 - var1.l6()) / var2 + var1.k5()));
      } else {
         return new com.aspose.slides.internal.o9b.w1((var1.l6() + var6.l6()) / 2.0F, (var1.k5() + var6.k5()) / 2.0F);
      }
   }

   private com.aspose.slides.internal.o9b.w1[] l6(double var1, double var3, double var5, double var7) {
      com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      double var10 = var5 * Math.PI / 180.0;
      double var12 = (var5 + var7) * Math.PI / 180.0;
      double var14 = var1 * var1;
      double var16 = var3 * var3;
      double var18 = 1.0 - var16 / var14;
      double var20 = com.aspose.slides.ms.System.q1.c8(var10);
      double var22 = com.aspose.slides.ms.System.q1.z3(var16 / (1.0 - var18 * var20 * var20));
      var9[0] = new com.aspose.slides.internal.o9b.w1((float)(var22 * var20), (float)(var22 * com.aspose.slides.ms.System.q1.h0(var10)));
      var20 = com.aspose.slides.ms.System.q1.c8(var12);
      var22 = com.aspose.slides.ms.System.q1.z3(var16 / (1.0 - var18 * var20 * var20));
      var9[3] = new com.aspose.slides.internal.o9b.w1((float)(var22 * var20), (float)(var22 * com.aspose.slides.ms.System.q1.h0(var12)));
      com.aspose.slides.internal.o9b.w1 var24 = new com.aspose.slides.internal.o9b.w1(
         (var9[0].l6() + var9[3].l6()) / 2.0F, (var9[0].k5() + var9[3].k5()) / 2.0F
      );
      double var25 = com.aspose.slides.ms.System.q1.z3(com.aspose.slides.ms.System.q1.a6(var3 * var24.l6() / var1, 2.0) + var24.k5() * var24.k5());
      new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var27;
      if (com.aspose.slides.ms.System.q1.n5(var25) < 1.0E-10) {
         var27 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
      } else {
         var27 = new com.aspose.slides.internal.o9b.w1(
            (float)(var24.l6() + 4.0 * (var24.l6() * var3 / var25 - var24.l6()) / 3.0),
            (float)(var24.k5() + 4.0 * (var24.k5() * var3 / var25 - var24.k5()) / 3.0)
         );
      }

      com.aspose.slides.internal.o9b.w1 var28 = new com.aspose.slides.internal.o9b.w1(
         (float)(var9[0].l6() - var9[0].k5() * var1 / var3), (float)(var9[0].k5() + var9[0].l6() * var3 / var1)
      );
      com.aspose.slides.internal.o9b.w1 var29 = new com.aspose.slides.internal.o9b.w1(
         (float)(var9[3].l6() + var9[3].k5() * var1 / var3), (float)(var9[3].k5() - var9[3].l6() * var3 / var1)
      );
      this.n5(var9[0].u3(), var28.l6() - var9[0].l6(), var28.k5() - var9[0].k5(), var27.u3(), var9[3].l6() - var9[0].l6(), var9[3].k5() - var9[0].k5())
         .n5(var9[1]);
      this.n5(var9[3].u3(), var29.l6() - var9[3].l6(), var29.k5() - var9[3].k5(), var27.u3(), var9[3].l6() - var9[0].l6(), var9[3].k5() - var9[0].k5())
         .n5(var9[2]);
      return var9;
   }

   private void x8() {
      if (this.h0) {
         this.t2.addItem(1);
      } else {
         this.h0 = true;
         this.t2.addItem(0);
      }
   }

   private com.aspose.slides.internal.o9b.w1[] k5(double var1, double var3, double var5, double var7) {
      double var9 = var5;
      boolean var11 = true;

      while (var9 > 360.0) {
         var9 -= 360.0;
      }

      while (var9 < -360.0) {
         var9 += 360.0;
      }

      List var12 = new List();
      int var13 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var7), 14) / 90;
      if (var13 * 90 < com.aspose.slides.ms.System.q1.n5(var7)) {
         var13++;
      }

      double var14 = var7 / var13;

      for (int var16 = 0; var16 < var13; var16++) {
         com.aspose.slides.internal.o9b.w1[] var17 = this.l6(var1, var3, var9 + var16 * var14, var14);
         if (var11) {
            var12.addItem(var17[0].u3());
            var11 = false;
         }

         for (byte var18 = 1; (var18 & 255) < 4; var18++) {
            var12.addItem(var17[var18 & 0xFF].u3());
         }
      }

      return (com.aspose.slides.internal.o9b.w1[])var12.toArray(new com.aspose.slides.internal.o9b.w1[0]);
   }

   private com.aspose.slides.internal.o9b.w1 n5(double var1, double var3, double var5, double var7, double var9, double var11, byte var13) {
      com.aspose.slides.internal.o9b.w1 var14 = new com.aspose.slides.internal.o9b.w1((float)var1, (float)var3);
      com.aspose.slides.internal.o9b.w1[] var15 = this.k5(com.aspose.slides.ms.System.q1.n5(var5), com.aspose.slides.ms.System.q1.n5(var7), var9, var11);
      if (var15.length < 4) {
         return var14;
      }

      com.aspose.slides.internal.o9b.w1 var16 = new com.aspose.slides.internal.o9b.w1(var15[0].l6(), var15[0].k5());
      com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1(var15[var15.length - 1].l6(), var15[var15.length - 1].k5());
      double var18 = var1 + var5;
      double var20 = var3 + var7;
      switch (var13) {
         case 1:
            var18 = var1 - var17.l6();
            var20 = var3 - var17.k5();
            var14 = new com.aspose.slides.internal.o9b.w1((float)(var16.l6() + var18), (float)(var16.k5() + var20));
            break;
         case 2:
            var18 = var1 - var16.l6();
            var20 = var3 - var16.k5();
            var14 = new com.aspose.slides.internal.o9b.w1((float)(var17.l6() + var18), (float)(var17.k5() + var20));
      }

      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)(var16.l6() + var18), (float)(var16.k5() + var20)));
      this.x8();

      for (int var22 = 1; var22 + 1 < var15.length; var22++) {
         this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)(var15[var22].l6() + var18), (float)(var15[var22].k5() + var20)));
         this.t2.addItem(3);
      }

      this.c8.addItem(new com.aspose.slides.internal.o9b.w1((float)(var17.l6() + var18), (float)(var17.k5() + var20)));
      if (com.aspose.slides.ms.System.q1.n5(var11) >= 360.0) {
         this.t2.addItem(131);
      } else {
         this.t2.addItem(3);
      }

      return var14;
   }

   public final com.aspose.slides.internal.o9b.w1[] c8() {
      return (com.aspose.slides.internal.o9b.w1[])this.c8.toArray(new com.aspose.slides.internal.o9b.w1[0]);
   }

   public final int[] t2() {
      return com.aspose.slides.internal.n8e.v4.k5(this.t2);
   }

   public final int s7() {
      return this.c8.size();
   }
}
