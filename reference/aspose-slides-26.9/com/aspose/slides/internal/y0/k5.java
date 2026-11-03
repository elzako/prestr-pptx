package com.aspose.slides.internal.y0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a0.t2;
import com.aspose.slides.internal.p3.c4;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.f2;
import com.aspose.slides.internal.p3.i1;
import com.aspose.slides.internal.p3.j4;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.p8;
import com.aspose.slides.internal.p3.q0;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v0;
import com.aspose.slides.internal.p3.v3;
import com.aspose.slides.internal.p3.y4;
import com.aspose.slides.internal.p3.z1;
import com.aspose.slides.internal.p3.z7;
import com.aspose.slides.internal.r4.u3;
import com.aspose.slides.internal.r4.u9;
import com.aspose.slides.internal.v4.k7;
import com.aspose.slides.internal.v4.m3;
import com.aspose.slides.internal.v4.z8;
import com.aspose.slides.ms.System.q1;

public class k5 extends y4 implements c4 {
   private l6 t2;
   private l6 k7;
   private t2 m3 = null;
   private List<u9> z8 = null;
   private List<u9> j5 = null;
   private boolean w1;
   private boolean r4;
   private boolean c4;
   private boolean y2;
   private com.aspose.slides.internal.v8.u9 y1;
   private com.aspose.slides.internal.v8.u9 a0;
   private s3 d2;
   private s3 d5;
   private boolean s3 = false;

   public k5(k7 var1) {
      super(var1);
      this.n5(var1.a5());
      this.n5(var1.h2());
   }

   protected final k7 y1() {
      return (k7)this.k5;
   }

   public final void n5(z8 var1) {
      this.t2 = new l6(var1);
      this.t2.n5(this);
   }

   public final void n5(m3 var1) {
      this.k7 = new l6(var1);
      this.k7.n5(this);
   }

   @Override
   public void t4() {
      this.q0 = this.y1().e5().h0.l6(this);
      this.z3 = this.y1().e5().c8.l6(this);
   }

   private void d2() {
      this.w1 = false;
      this.r4 = false;
      this.c4 = false;
      this.y2 = false;
      this.y1 = null;
      this.a0 = null;
   }

   public final boolean a0() {
      return this.s3;
   }

   @Override
   public List<u9> n5(t1 var1, int var2) {
      this.t4 = var1.z3();
      List var3 = new List();
      if (!this.n5(var1, var3)) {
         return var3;
      }

      this.n5(var3, var1, var2);
      t1 var4 = this.n5(var1);
      this.t2.t4();

      try {
         this.s3 = true;
         this.z8 = this.t2.n5(var4, var2);
      } finally {
         this.s3 = false;
      }

      com.aspose.slides.internal.v8.u9 var5 = var4.f2();
      if (var5 == null) {
         var5 = com.aspose.slides.internal.v8.u9.n5;
      }

      com.aspose.slides.internal.v8.u9 var6 = var5;
      j4.n5(this.z8);
      var1.l6(var4.u9());
      this.d2 = var4.a6();
      var4 = this.n5(var1);
      this.k7.t4();
      this.j5 = this.k7.n5(var4, var2);
      com.aspose.slides.internal.v8.u9 var7 = var4.f2();
      if (var7 == null) {
         var7 = com.aspose.slides.internal.v8.u9.n5;
      }

      com.aspose.slides.internal.v8.u9 var8 = var7;
      var6 = var6.u9(var8.n5()).h0(var8.k5());
      var1.l6(var6);
      j4.n5(this.j5);
      var1.l6(var4.u9());
      this.d5 = var4.a6();
      List var9 = this.n5(this.z8, this.j5, var1);
      this.n5(var9, var3, true);
      this.l6(var3, var1, var2);
      this.l6(var3, var1);
      var1.n5(this.d2);
      var1.n5(this.d5);
      var1.n5(this.v0());
      var1.l6(this.h2());
      this.k5(true);
      this.d2();
      return var3;
   }

   @Override
   protected void n5(List<u9> var1, t1 var2, int var3) {
      this.l6(var1, var3);
      this.n5(var1, !this.z1);
      this.z1 = true;
      this.l6(var2);
   }

   private List<u9> n5(List<u9> var1, List<u9> var2, t1 var3) {
      List[] var4 = new List[]{new List(var1), new List(var2)};
      int[] var5 = new int[]{com.aspose.slides.internal.p3.q0.n5(var4[0]), com.aspose.slides.internal.p3.q0.n5(var4[1])};
      int[] var6 = new int[]{0, 0};
      int[] var7 = new int[]{-1, -1};
      int[] var8 = new int[]{-1, -1};
      int var9 = q1.n5(var5[0], var5[1]);
      int var10 = 0;
      s3 var11 = com.aspose.slides.internal.p3.s3.n5;
      List var12 = new List();

      int var13;
      while ((var13 = this.n5(var4, var7, var8, var6)) > 0) {
         if (var8[0] + 1 == var4[0].size()) {
            var11 = var11.n5(this.d2);
         }

         if (var8[1] + 1 == var4[1].size()) {
            var11 = var11.n5(this.d5);
         }

         int var14 = var13 + this.n5(var5, var6) - var9;
         int var15 = 0;
         int var16 = 0;
         i1 var17 = (i1)var4[0].get_Item(var8[0]);
         if (com.aspose.slides.internal.v6g.k5.l6(var17, o0.class)) {
            var15 = var17.z1();
            var16 = q1.n5(var16, var17.t4());
         }

         var17 = (i1)var4[1].get_Item(var8[1]);
         if (com.aspose.slides.internal.v6g.k5.l6(var17, o0.class)) {
            var15 = q1.n5(var15, var17.z1());
            var16 = q1.n5(var16, var17.t4());
         }

         int var18 = var13 - var10 - var14;
         var14 += var15;
         List var19 = null;

         for (int var20 = 0; var20 < var4.length; var20++) {
            for (int var21 = var7[var20]; var21 <= var8[var20]; var21++) {
               v0 var22 = (v0)var4[var20].get_Item(var21);
               if (com.aspose.slides.internal.v6g.k5.l6(var22, p8.class) && ((p8)var22).h0()) {
                  if (var19 == null) {
                     var19 = new List();
                  }

                  var19.addRange(((p8)var22).a6());
               }
            }
         }

         var10 += var18;
         k5$n5 var26 = new k5$n5(this, var7[0], var8[0], var7[1], var8[1]);
         if (var19 == null) {
            var12.addItem(new f2(var18, var26, false));
         } else {
            var12.addItem(new p8(var18, var19, new List<>(), var26, false));
         }

         if (var10 < var9) {
            s3 var27 = var11.n5(this.a5());
            int var23 = var16;
            if (var23 > -1000) {
               var23 = q1.n5(var23, var27.k5());
            }

            var12.addItem(new z1(var26, var14, var23, var27.l6(), var3));
         }
      }

      return var12;
   }

   private int n5(List<u9>[] var1, int[] var2, int[] var3, int[] var4) {
      int[] var5 = new int[]{var4[0], var4[1]};
      var2[0] = var3[0] + 1;
      var2[1] = var3[1] + 1;
      int var6 = 0;

      for (int var7 = 0; var7 < var2.length; var7++) {
         while (var3[var7] + 1 < var1[var7].size()) {
            var3[var7]++;
            i1 var8 = (i1)var1[var7].get_Item(var3[var7]);
            if (var8.y_()) {
               if (var8.t4() < 1000) {
                  break;
               }
            } else if (var8.x_()) {
               if (var3[var7] > 0) {
                  i1 var9 = (i1)var1[var7].get_Item(var3[var7] - 1);
                  if (var9.e2()) {
                     break;
                  }
               }

               var4[var7] += var8.z1();
            } else {
               var4[var7] += var8.z1();
            }
         }

         if (var3[var7] < var2[var7]) {
            var4[var7] = var5[var7];
         } else {
            var6++;
         }
      }

      if (var6 == 0) {
         return 0;
      }

      int var10;
      if (var5[0] == 0 && var5[1] == 0) {
         var10 = q1.n5(var3[0] >= var2[0] ? var4[0] : Integer.MIN_VALUE, var3[1] >= var2[1] ? var4[1] : Integer.MIN_VALUE);
      } else {
         var10 = q1.l6(var3[0] >= var2[0] ? var4[0] : Integer.MAX_VALUE, var3[1] >= var2[1] ? var4[1] : Integer.MAX_VALUE);
      }

      for (int var11 = 0; var11 < var4.length; var11++) {
         if (var4[var11] > var10) {
            var4[var11] = var5[var11];
            var3[var11] = var2[var11] - 1;
         }
      }

      return var10;
   }

   private int n5(int[] var1, int[] var2) {
      return q1.n5(var1[0] - var2[0], var1[1] - var2[1]);
   }

   @Override
   public List<u9> n5(List<u9> var1, int var2) {
      this.z8 = this.t2.n5(this.z8, var2);
      u3 var3 = new u3(var1);

      while (var3.l6()) {
         i1 var4 = (i1)var3.k5();
         j8 var5 = var4.k7().k5();
         if (var5 != null) {
            var4.n5(var5);
         } else {
            var4.n5(new j8(this));
         }
      }

      List var9 = this.k7.n5(var1, var2);
      List var6 = var9;
      var9 = new List();
      u3 var7 = new u3(var6);

      while (var7.l6()) {
         i1 var8 = (i1)var7.k5();
         var8.n5(new f0(this, var8.k7()));
         var9.addItem(var8);
      }

      return var9;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      this.c4();
      t1 var3 = new t1(0);
      j8 var4 = null;
      j8 var5 = null;
      List var6 = new List();

      while (var1.l6()) {
         j8 var7 = (j8)var1.k5();
         if (var7.a6() >= 0) {
            if (var4 == null) {
               var4 = var7;
            }

            var5 = var7;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var7, f0.class) && var7.k5() != null) {
            var6.addItem(var7.k5());
         }
      }

      this.n5(true, this.l6(var4), this.k5(var5));
      int var8 = ((k5$n5)var6.get_Item(0)).n5();
      int var9 = ((k5$n5)var6.get_Item(var6.size() - 1)).h0();
      int var10 = ((k5$n5)var6.get_Item(0)).c8();
      int var11 = ((k5$n5)var6.get_Item(var6.size() - 1)).t2();
      int var12 = com.aspose.slides.internal.p3.q0.k5(this.z8, var8);
      j4.n5(this.z8, var8, var9, var12);
      var12 = com.aspose.slides.internal.p3.q0.k5(this.j5, var10);
      j4.n5(this.j5, var10, var11, var12);
      if (var8 <= var9) {
         z7 var13 = new z7<>(this.z8, var8, var9 + 1);
         var3.n5(32, var2.l6());
         var3.n5(128, var2.k5());
         var3.n5(var2.m3());
         var3.n5(var2.q0());
         this.t2.n5(var13, var3);
      }

      if (var10 <= var11) {
         z7 var16 = new z7<>(this.j5, var10, var11 + 1);
         var3.n5(32, var2.l6());
         var3.n5(128, var2.k5());
         var3.n5(var2.m3());
         var3.n5(var2.q0());
         this.k7.n5(var16, var3);
      }

      int var17 = this.m3.c4().size();
      int var14 = ((t2)this.m3.c4().get_Item(0)).a6();
      if (var17 == 2) {
         var14 = q1.n5(var14, ((t2)this.m3.c4().get_Item(1)).a6());
      }

      this.m3.k5(var14);
      this.n5(false, this.l6(var4), this.k5(var5));
      p6.n5(this.m3, this.y1().b3(), this);
      p6.n5(this.m3, var2.m3(), this.y1, this.a0);
      this.d5();
      this.m3 = null;
      this.d2();
      this.u3(var5);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.m3 == null) {
         this.m3 = new t2();
         this.u3.n5(this.m3);
         k7 var2 = this.y1();
         p6.n5(this.m3, var2.y1());
         p6.n5(this.m3, var2.b3(), this.w1, this.r4, false, false, this);
         p6.l6(this.m3, var2.b3(), this.c4, this.y2, false, false, this);
         p6.n5(this.m3, var2.b3(), var2.e5(), this);
         p6.n5(this.m3, var2.t1(), var2.u6());
         int var3 = this.t4 - this.p3();
         this.m3.l6(var3);
         this.n5(this.m3);
      }

      return this.m3;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.m3 != null) {
         this.m3.l6((t2)var1);
      }
   }

   @Override
   public com.aspose.slides.internal.h2.f2 s3() {
      return this.y1().v4();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 p8() {
      return this.y1().z7();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 f2() {
      return this.y1().o0();
   }

   @Override
   public final void n5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (v3.n5 == var1) {
         this.y1 = var2;
      } else {
         this.a0 = var2;
      }
   }

   @Override
   public final void l6(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.w1 = true;
         } else {
            this.r4 = true;
         }
      }
   }

   @Override
   public final void k5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.c4 = true;
         } else {
            this.y2 = true;
         }
      }
   }

   @Override
   public void t9() {
      super.t9();
      this.t2.t9();
      this.k7.t9();
   }
}
