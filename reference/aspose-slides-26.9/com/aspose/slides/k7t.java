package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class k7t implements Comparable<k7t> {
   private k6a n5;
   private SmartArtShape l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private double h0 = Double.NaN;
   private double c8 = Double.NaN;
   private double t2 = Double.NaN;
   private double s7 = Double.NaN;
   private int x8;
   private int n3;
   private double y4;
   private boolean e2;
   private boolean t9;
   private int z1;
   private double t4;
   private double q0;
   private double z3 = Double.NaN;
   private double m1 = Double.NaN;
   private double k7 = Double.NaN;
   private double m3 = Double.NaN;
   private double z8 = Double.NaN;
   private boolean j5 = false;
   private boolean w1 = false;
   private boolean r4 = false;
   private double c4;
   private List<k7t> y2;
   private byte y1;
   private byte a0;
   private Dictionary<Integer, Double> d2;
   private k7t d5;

   public final k6a n5() {
      return this.n5;
   }

   public final SmartArtShape l6() {
      return this.l6;
   }

   public final double k5() {
      return this.y4;
   }

   public final double u3() {
      return this.k5;
   }

   public final void n5(double var1) {
      this.k5 = var1;
      List$Enumerator var3 = this.n5.l6().iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            var4.c8().n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.t1();
   }

   public final double a6() {
      return this.u3;
   }

   public final void l6(double var1) {
      this.u3 = var1;
      List$Enumerator var3 = this.n5.l6().iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            var4.c8().l6(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.t1();
   }

   public final e4c u9() {
      k6a var1 = this.n5().n5();
      return var1 != null ? new e4c(this.k5 - var1.c8().k5, this.u3 - var1.c8().u3) : new e4c(this.k5, this.u3);
   }

   public final void n5(e4c var1) {
      e4c var2 = this.u9().u9();
      this.n5(var1.n5 - var2.n5, var1.l6 - var2.l6);
   }

   public final double h0() {
      return this.c8() * this.n5().j5().n5;
   }

   public final double c8() {
      return this.a6;
   }

   public final void k5(double var1) {
      this.a6 = var1;
      double var3 = this.m3();
      double var5 = this.z8();
      this.t1();
   }

   public final double t2() {
      if (this.n5.n5() == null) {
         return this.n5.h0().z1().l6().getWidth();
      } else {
         return com.aspose.slides.ms.System.d2.k5(this.h0) ? this.c8() : com.aspose.slides.ms.System.q1.l6(this.c8(), this.h0);
      }
   }

   public final void u3(double var1) {
      this.h0 = var1;
   }

   public final double s7() {
      return com.aspose.slides.ms.System.d2.k5(this.t2) ? this.c8() : this.t2;
   }

   public final void a6(double var1) {
      this.t2 = var1;
   }

   public final double x8() {
      return this.n3() * this.n5().j5().l6;
   }

   public final double n3() {
      return this.u9;
   }

   public final void u9(double var1) {
      this.u9 = var1;
      this.t1();
   }

   public final double y4() {
      if (this.n5.n5() == null) {
         return this.n5.h0().z1().l6().getHeight();
      } else {
         return com.aspose.slides.ms.System.d2.k5(this.c8) ? this.n3() : com.aspose.slides.ms.System.q1.l6(this.n3(), this.c8);
      }
   }

   public final void h0(double var1) {
      this.c8 = var1;
   }

   public final double e2() {
      return com.aspose.slides.ms.System.d2.k5(this.s7) ? this.n3() : this.s7;
   }

   public final void c8(double var1) {
      this.s7 = var1;
   }

   public final int t9() {
      return this.x8;
   }

   public final int z1() {
      return this.n3;
   }

   public final void n5(int var1) {
      this.n3 = var1;
   }

   public final boolean t4() {
      return this.e2;
   }

   public final boolean q0() {
      return this.t9;
   }

   public final boolean z3() {
      o7p var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5.s7(), o7p.class);
      return var1 != null && !var1.k5();
   }

   public final boolean m1() {
      return this.n5.u9().size() > 0
         && this.l6() != null
         && this.l6().k5() != null
         && (!com.aspose.slides.ms.System.d1.a6(this.l6().k5().getText(), com.aspose.slides.ms.System.d1.n5) || this.l6().k5().getParagraphs().getCount() > 1);
   }

   public final int k7() {
      return this.z1;
   }

   public final void l6(int var1) {
      this.z1 = var1;
   }

   public final double m3() {
      return this.t4 == 0.0 ? this.h0() : this.t4;
   }

   public final double z8() {
      return this.q0 == 0.0 ? this.x8() : this.q0;
   }

   public final double j5() {
      return this.k7;
   }

   public final void t2(double var1) {
      this.k7 = var1;
   }

   public final double w1() {
      return this.m3;
   }

   public final void s7(double var1) {
      this.m3 = var1;
   }

   public final double r4() {
      return com.aspose.slides.ms.System.d2.k5(this.z3) ? this.m3() : this.z3;
   }

   public final double c4() {
      return com.aspose.slides.ms.System.d2.k5(this.m1) ? this.z8() : this.m1;
   }

   public final boolean y2() {
      return this.w1;
   }

   public final void n5(boolean var1) {
      this.w1 = var1;
   }

   public final boolean y1() {
      return this.r4;
   }

   public final void l6(boolean var1) {
      this.r4 = var1;
   }

   public final boolean a0() {
      return this.r4 || this.w1;
   }

   public final byte d2() {
      return this.a0;
   }

   public final void n5(byte var1) {
      this.a0 = var1;
   }

   public final byte d5() {
      return this.y1;
   }

   public final void l6(byte var1) {
      this.y1 = var1;
   }

   public final k7t s3() {
      return this.d5;
   }

   public k7t(k6a var1) {
      this.n5 = var1;
      this.z1 = 0;
      this.y2 = new List<>();
      this.a0 = -1;
      this.y1 = -1;
      this.d2 = new Dictionary<>();
   }

   public final void n5(AutoShape var1) {
      if (this.l6 != null) {
         this.l6.n5(var1);
      }
   }

   public final void n5(SmartArt var1, f2f var2) {
      this.x8 = var2.c8();
      this.y4 = var2.u9() % 360.0;
      if (this.y4 < 0.0) {
         this.y4 += 360.0;
      }

      this.e2 = var2.a6();
      this.t9 = var2.t2();
      if (this.l6 == null) {
         this.l6 = new SmartArtShape(var1, this);
         this.l6.x8().k5(this.n5.t9());
         if (this.n5.y4().u9() != -1) {
            this.l6.n5(this.n5.y4().u9());
            if (this.l6.getShapeType() == 8) {
               this.l6.e2().l6()[0].n5(false);
            }
         } else if (!var2.u3()) {
            this.l6.n5(var2.k5());
            if (var2.s7() != null) {
               u3k var3 = this.l6.e2().n5().t2();
               Dictionary var4 = n5(var3.u3(), var3.n5().length);

               for (com.aspose.slides.internal.k4y.w6u var8 : var2.s7()) {
                  int var9 = (int)var8.n5() - 1;
                  if (this.l6.getAdjustments().size() > var9) {
                     if (var4.containsKey(var9) && (Boolean)var4.get_Item(var9)) {
                        this.l6.getAdjustments().get_Item(var9).setAngleValue((float)(var8.l6() < 0.0 ? 360.0 + var8.l6() : var8.l6()));
                     } else {
                        this.l6.getAdjustments().get_Item(var9).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var8.l6() * 100000.0, 14));
                     }
                  }
               }
            }
         }

         this.n3(this.y4);
      }
   }

   public final e4c k5(boolean var1) {
      double var2 = 0.0;
      double var4 = 0.0;
      List$Enumerator var6 = this.n5.l6().iterator();

      try {
         while (var6.hasNext()) {
            k6a var7 = (k6a)var6.next();
            double var8 = var1 ? var7.c8().h0() : var7.c8().s7();
            double var10 = var1 ? var7.c8().x8() : var7.c8().e2();
            if (var4 < var8) {
               var4 = var8;
            }

            if (var2 < var10) {
               var2 = var10;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return new e4c(var4, var2);
   }

   public final u6x p8() {
      List var1 = this.n5.r4();
      if (var1.size() > 0) {
         double var2 = -Double.MAX_VALUE;
         double var4 = -Double.MAX_VALUE;
         double var6 = Double.MAX_VALUE;
         double var8 = Double.MAX_VALUE;
         boolean var10 = false;
         List$Enumerator var11 = var1.iterator();

         try {
            while (var11.hasNext()) {
               k6a var12 = (k6a)var11.next();
               u6x var13 = var12.c8().e5().z1();
               if (var13.t2() != 0.0 && var13.s7() != 0.0) {
                  var6 = com.aspose.slides.ms.System.q1.k5(var6, var13.n5());
                  var8 = com.aspose.slides.ms.System.q1.k5(var8, var13.l6());
                  var2 = com.aspose.slides.ms.System.q1.l6(var2, var13.k5());
                  var4 = com.aspose.slides.ms.System.q1.l6(var4, var13.u3());
                  var10 = true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }

         if (var10) {
            return new u6x(var6, var8, var2, var4);
         }
      }

      return new u6x();
   }

   public final u6x[] f2() {
      List var1 = new List();
      n5(this.n5.a6(), this.n5, var1);
      return (u6x[])var1.toArray(new u6x[0]);
   }

   public final u6x[] i1() {
      List var1 = new List();
      n5((p6x)null, this.n5, var1);
      return (u6x[])var1.toArray(new u6x[0]);
   }

   public final u6x e5() {
      e4c var1 = this.n5().j5().u9();
      u6x var2 = new u6x(this.u3(), this.a6(), this.u3() + this.c8(), this.a6() + this.n3());
      if (var1.n5 == 1.0 && var1.l6 == 1.0) {
         return var2;
      }

      double var3 = this.h0();
      double var5 = this.x8();
      return new u6x(var2.n5(), var2.l6(), var2.n5() + var3, var2.l6() + var5);
   }

   public final void n5(double var1, double var3) {
      if (var1 != 0.0 || var3 != 0.0) {
         this.k5 += var1;
         this.u3 += var3;
         List$Enumerator var5 = this.n5.l6().iterator();

         try {
            while (var5.hasNext()) {
               k6a var6 = (k6a)var5.next();
               var6.c8().n5(var1, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         this.t1();
      }
   }

   public final void l6(double var1, double var3) {
      if (var1 != 0.0 || var3 != 0.0) {
         List$Enumerator var5 = this.y2.iterator();

         try {
            while (var5.hasNext()) {
               k7t var6 = (k7t)var5.next();
               var6.n5(var1, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   public final void b3() {
      this.k5 = this.u3 = 0.0;
      this.t1();
   }

   public final void o0() {
      if (this.l6 != null) {
         this.l6.n5((TextFrame)null);
      }

      this.a6 = this.u9 = 0.0;
      this.h0 = this.c8 = Double.NaN;
      this.t2 = this.s7 = Double.NaN;
      this.z3 = this.m1 = Double.NaN;
      this.j5 = this.w1 = this.r4 = false;
      this.b3();
      this.y2.clear();
      this.d2.clear();
   }

   public final void x8(double var1) {
      this.n3(var1);
      this.t1();
   }

   public final void z7() {
      u6x var1 = this.p8().z1();
      this.a6 = var1.t2();
      this.u9 = var1.s7();
      this.k5 = var1.n5();
      this.u3 = var1.l6();
      this.t1();
   }

   public final void v4() {
      this.m1 = this.z8();
      this.z3 = this.m3();
   }

   public final void u6() {
      this.j5 = true;
      List$Enumerator var1 = this.n5().l6().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            var2.c8().u6();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final double k5(int var1) {
      return this.d2.containsKey(var1) ? this.d2.get_Item(var1) : 0.0;
   }

   public final void n5(int var1, double var2) {
      if (this.d2.containsKey(var1)) {
         this.d2.set_Item(var1, var2);
      } else {
         this.d2.addItem(var1, var2);
      }
   }

   public final boolean n5(k7t var1) {
      return this.y2.containsItem(var1);
   }

   public final void l6(k7t var1) {
      this.y2.addItem(var1);
      var1.d5 = this;
   }

   public final void n5(o4f var1) {
      h3o var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5().s7(), h3o.class);
      if (var2 != null) {
         this.z1 = ((o5t)var2.n5()).k5();
         float var3 = com.aspose.slides.ms.System.n1.k5(var1.k5()) ? 0.0F : var1.k5();
         this.c4 = var3;
         if (this.n5.y4().k5().s7() != 0) {
            this.c4 = (var3 - this.n5.y4().k5().s7() / 60000.0F) % 360.0F;
         }

         com.aspose.slides.internal.k4y.e8b var4 = this.l6.x8().h0();
         if (var4 != null) {
            e4c var5 = var1.n5().u9();
            e4c var6 = e4c.n5(var5, var1.l6()).u9();
            u6x var7 = new u6x(var5.n5, var5.l6, var6.n5, var6.l6);
            float var8 = 0.0F;
            float[] var9 = new float[]{0.0F};
            u6x var10 = this.n5(var7.z1(), var3, var1.a6() == 1, var9).z1();
            var8 = var9[0];
            var4.h0().l6(var10.s7());
            var4.h0().n5(var10.t2());
            var4.u9().n5(var10.n5() + com.aspose.slides.ms.System.q1.k5(var10.t2(), 0.0));
            var4.u9().l6(var10.l6() + com.aspose.slides.ms.System.q1.k5(var10.s7(), 0.0));
            float var11 = 0.0F;
            if (this.l6.k5() != null) {
               var11 = this.l6.k5().s7().getRotationAngle();
            }

            if (!com.aspose.slides.ms.System.n1.k5(var11)) {
               var4.n5(var3 + var11);
            } else if (var4.k5() == 0.0F || var4.k5() == var3) {
               var4.n5(var8);
            }
         }
      } else {
         x4t var12 = x4t.n5.n5();
         if (this.l6.x8().h0() != null) {
            e4c var13 = new e4c();
            e4c var14 = new e4c();
            e4c[] var15 = new e4c[]{var13};
            e4c[] var16 = new e4c[]{var14};
            x4t[] var18 = new x4t[]{var12};
            z5b.n5(this.l6.x8().h0(), var15, var16, var18);
            var15[0].l6(var13);
            var16[0].l6(var14);
            var18[0].n5(var12);
            if (var12.l6 == 0.0F) {
               this.l6.x8().h0().n5(-var1.k5());
            }
         }
      }
   }

   public final int k5(k7t var1) {
      int var2 = this.t9() + this.z1();
      int var3 = var1.t9() + var1.z1();
      if (var2 == var3) {
         if (this.t9() > var1.t9()) {
            return 1;
         } else if (this.t9() < var1.t9()) {
            return -1;
         } else if (this.z1() == var1.z1()) {
            return 0;
         } else {
            return this.z1() > var1.z1() ? 1 : -1;
         }
      } else if (var2 < 0 && var3 < 0 && this.z3() && var1.z3()) {
         return var2 < var3 ? 1 : -1;
      } else {
         return var2 > var3 ? 1 : -1;
      }
   }

   private u6x n5(u6x var1) {
      if (this.y4 != 0.0) {
         u6x var2 = new u6x();
         u6x[] var3 = new u6x[]{var2};
         e4c var4 = q3g.n5(new e4c(var1.t2(), var1.s7()), this.y4, var3).u9();
         var3[0].u3(var2);
         double var5 = (this.h0() - var2.t2()) / 2.0 - var2.n5();
         double var7 = (this.x8() - var2.s7()) / 2.0 - var2.l6();
         double var9 = var1.n5() + var5;
         double var11 = var1.l6() + var7;
         return new u6x(var9, var11, var9 + var4.n5, var11 + var4.l6);
      } else {
         return var1;
      }
   }

   private u6x n5(u6x var1, double var2, boolean var4, float[] var5) {
      com.aspose.slides.internal.o9b.y1 var6 = this.l6.e2().n5(d2k.k5.u3(), new d2k((float)var1.t2(), (float)var1.s7())).y4();
      com.aspose.slides.internal.w0.c8 var7 = new com.aspose.slides.internal.w0.c8();
      e4c var8 = var1.x8().u9();
      var7.n5((float)var2, new com.aspose.slides.internal.o9b.w1((float)var8.n5, (float)var8.l6));
      double var9 = var4 ? var1.s7() - var6.k5() : 0.0;
      com.aspose.slides.internal.o9b.w1 var11 = var7.n5(
            new com.aspose.slides.internal.o9b.w1(
               (float)(var1.n5() + var6.x8() + var6.s7() / 2.0F), (float)(var1.l6() + var6.n3() + var6.k5() / 2.0F + (float)var9)
            )
         )
         .u3();
      double var12 = var6.k5() / 2.0F;
      double var14 = var6.s7() / 2.0F;
      var2 = this.c4 % 360.0;
      var5[0] = 0.0F;
      if (this.k7() == 2) {
         var5[0] = var2 > 90.0 && var2 < 270.0 ? 180.0F : 0.0F;
      } else {
         if (var2 > 45.0 && var2 < 135.0) {
            var12 = var14;
            var14 = var6.k5() / 2.0F;
            var5[0] = 270.0F;
         } else if (var2 >= 135.0 && var2 <= 225.0) {
            var5[0] = 180.0F;
         } else if (var2 > 225.0 && var2 < 315.0) {
            var12 = var14;
            var14 = var6.k5() / 2.0F;
            var5[0] = 90.0F;
         }

         if (var4 && (var2 >= 0.0 && var2 <= 45.0 || var2 >= 315.0)) {
            var5[0] += 180.0F;
         }
      }

      return new u6x(var11.l6() - var14, var11.k5() - var12, var11.l6() + var14, var11.k5() + var12);
   }

   private void t1() {
      if (this.l6 != null) {
         o4f var1 = this.l6.R_();
         u6x var2 = this.n5(this.e5().z1()).z1();
         var1.n5(new e4c(var2.n5(), var2.l6()));
         this.l6.k5(new e4c(var2.t2(), var2.s7()));
         if (this.n5.y4().k5().n3() != -1) {
            var1.n5(this.n5.y4().k5().n3());
         }

         if (this.n5.y4().k5().x8() != -1) {
            var1.l6(this.n5.y4().k5().x8());
         }

         if (this.l6.k5() != null && this.k7() != 0) {
            double var3 = !com.aspose.slides.ms.System.d2.k5(var1.k5()) ? var1.k5() % 360.0F : 0.0;
            if (var3 < 0.0) {
               var3 += 360.0;
            }

            float var5 = 0.0F;
            u6x var6 = new u6x();
            if (this.j5) {
               double var7 = this.c8();
               double var9 = this.n3();
               TextFrameFormat var11 = this.l6.k5().n5;
               double var12;
               switch (var11.getAnchoringType()) {
                  case -1:
                  case 1:
                  case 3:
                  case 4:
                  default:
                     var12 = (this.x8() - var9) / 2.0;
                     break;
                  case 0:
                     var12 = 0.0;
                     break;
                  case 2:
                     var12 = this.x8() - var9;
               }

               float[] var14 = new float[]{0.0F};
               this.n5(this.n5(new u6x(this.u3(), this.a6() + var12, this.u3() + var7, this.a6() + var12 + var9)).z1(), var3, var1.a6() == 1, var14).u3(var6);
               var5 = var14[0];
            } else {
               float[] var15 = new float[]{0.0F};
               this.n5(var2.z1(), var3, var1.a6() == 1, var15).u3(var6);
               var5 = var15[0];
            }

            if (this.l6.x8().h0() == null) {
               this.l6.x8().n5(new com.aspose.slides.internal.k4y.e8b());
               this.l6.x8().h0().l6();
               this.l6.x8().h0().n5();
            }

            com.aspose.slides.internal.k4y.e8b var17 = this.l6.x8().h0();
            var17.h0().n5(var6.t2());
            var17.h0().l6(var6.s7());
            var17.u9().n5(var6.n5());
            var17.u9().l6(var6.l6());
            var17.n5(var5);
            this.t4 = var6.t2();
            this.q0 = var6.s7();
         }
      }
   }

   private void n3(double var1) {
      if (this.l6 != null) {
         this.c4 = var1;
         if (this.n5.y4().k5().s7() != 0) {
            double var3 = this.n5.y4().k5().s7() / 60000.0;
            var1 = (var3 + var1) % 360.0;
         }

         boolean var5 = this.n5.y4().k5().n3() == 1;
         boolean var6 = this.n5.y4().k5().x8() == 1;
         if (var5 ^ var6) {
            var1 = (360.0 - var1) % 360.0;
         }

         this.l6.n5(var1);
      }
   }

   private static void n5(l6s var0, k6a var1, List<u6x> var2) {
      if (var0 == var1.a6() || var0.l6().containsItem(var1.a6())) {
         if (var1.s3()) {
            var2.addItem(var1.c8().e5().z1());
         }

         List$Enumerator var3 = var1.l6().iterator();

         try {
            while (var3.hasNext()) {
               k6a var4 = (k6a)var3.next();
               n5(var0, var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   private static void n5(p6x var0, k6a var1, List<u6x> var2) {
      if (var1.s3() && (var0 == null || var1.a6() == var0)) {
         var2.addItem(var1.c8().e5().z1());
      }

      List$Enumerator var3 = var1.l6().iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            n5(var0, var4, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static Dictionary<Integer, Boolean> n5(r8e[] var0, int var1) {
      Dictionary var2 = new Dictionary();

      for (r8e var6 : var0) {
         if (var6.u9() == 11) {
            int var7 = (int)(var6.u3() - 27273042316901L);
            if (var7 > var1) {
               var7 = (int)(-27273042329612L - var6.u3() - 1L);
               if (var0.length > var7 && var7 > 0) {
                  var7 = (int)(var0[var7].k5() - 27273042316901L);
               }
            }

            boolean var8 = com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.d1.u9(var6.n5()), "ang");
            var2.addItem(var7, var8);
         }
      }

      return var2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(k7t bridgeArg0) {
      return this.k5(bridgeArg0);
   }

}
