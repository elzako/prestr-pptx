package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class j9 extends t4 {
   private y2 q0;
   private z6 z3;
   private a0 m1;
   private List<l6$l6> k7 = null;
   private a3 m3;
   private a3 z8;
   private int j5 = 5000;
   private int w1 = 10000;
   private int r4 = 10000;
   private int c4 = -1;
   private int y2 = -1;
   private boolean y1 = false;
   private boolean a0 = false;
   private boolean d2 = false;
   private int d5;
   private t4$k5 s3;
   private int p8 = 9;
   private t4$k5 f2;

   public j9(
      y2 var1,
      z6 var2,
      a0 var3,
      int var4,
      int var5,
      com.aspose.slides.internal.v8.u9 var6,
      com.aspose.slides.internal.v8.u9 var7,
      boolean var8,
      boolean var9,
      boolean var10
   ) {
      super(var4, var5, true, var8, 0);
      this.q0 = var1;
      this.z3 = var2;
      this.m1 = var3;
      this.z1 = new j9$n5(this);
      this.m3 = new a3((com.aspose.slides.internal.v8.u9)var6.clone());
      this.z8 = new a3((com.aspose.slides.internal.v8.u9)var7.clone());
      this.a0 = var9;
      this.d2 = var10;
   }

   @Override
   protected void u9() {
      super.u9();
      this.m3.n5();
      this.z8.n5();
   }

   @Override
   protected t4$k5 n5(t4$k5 var1) {
      if (this.f2 != null && this.p8 != 9) {
         t4$k5 var2 = this.f2;
         this.f2 = null;

         while (!this.z3.u3(var2.l6 - 1)) {
            var2 = this.n5(var2.n5, var2.l6 + 1, 1, 0, 0, 0, 0.0, 0, 0, 0, 0.0, var2);
         }

         return var2;
      } else {
         return super.n5(var1);
      }
   }

   @Override
   protected t4$k5 n5(t4$k5 var1, t4$k5 var2) {
      if (var1 != null && var2 != null) {
         if (this.z3 != null) {
            if (this.z3.u3(var1.l6 - 1) && !this.z3.u3(var2.l6 - 1)) {
               return var1;
            }

            if (this.z3.u3(var2.l6 - 1) && !this.z3.u3(var1.l6 - 1)) {
               return var2;
            }
         }

         return super.n5(var1, var2);
      } else {
         return var1 == null ? var2 : var1;
      }
   }

   @Override
   public t4$k5 n5(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9, int var10, int var11, double var12, t4$k5 var14) {
      return new b3(var1, var2, var3, var4, var5, var6, this.m3.l6(), this.z8.l6(), var7, var9, var10, var11, var12, var14);
   }

   @Override
   protected t4$k5 n5(int var1, int var2, int var3, int var4, int var5, int var6) {
      return new b3(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         ((j9$n5)this.z1).c8(var3),
         ((j9$n5)this.z1).t2(var3),
         this.z1.u3(var3),
         this.z1.a6(var3),
         this.z1.u9(var3),
         this.z1.h0(var3),
         this.z1.l6(var3),
         this.z1.k5(var3)
      );
   }

   @Override
   protected void n5(f2 var1) {
      super.n5(var1);
      p8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, p8.class);
      if (var2 != null && var2.h0()) {
         List var3 = var2.s7();
         List var4 = new List();
         var4.addRange(var3);
         var3.clear();
         this.m3.n5(var4);
      }
   }

   @Override
   protected void n5(o0 var1, int var2, int var3) {
      super.n5(var1, var2, var3);
      if (var1.t4() == 1000) {
         int var4 = var1.t2();
         if (var4 == 104 || var4 == 28) {
            this.n5(var1, var2);
         }
      }
   }

   @Override
   protected int n5(t4$k5 var1, int var2) {
      int var3 = super.n5(var1, var2);
      this.m3.u9();
      this.z8.u9();
      if (this.m3.a6() || this.z8.a6()) {
         for (int var4 = var2; var4 >= var1.n5; var4--) {
            i1 var5 = this.u3(var4);
            if (com.aspose.slides.internal.v6g.k5.l6(var5, p8.class) && ((p8)var5).h0()) {
               this.m3.l6(((p8)var5).s7());
            }

            p8 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, p8.class);
            if (var6 != null && var6.t2()) {
               this.z8.l6(var6.x8());
            }
         }
      }

      return var3;
   }

   @Override
   protected void n5(i1 var1, int var2) {
      if (var1.y_()) {
         int var3 = ((o0)var1).t2();
         switch (var3) {
            case 9:
               this.p8 = var3;
               break;
            case 28:
               if (this.p8 != var3) {
                  this.f2 = this.h0();
               }

               this.p8 = var3;
               break;
            case 104:
               if (this.p8 != var3) {
                  this.f2 = this.h0();
               }

               this.p8 = var3;
         }
      }

      super.n5(var1, var2);
      this.m3.u9();
      this.z8.u9();
   }

   @Override
   protected boolean n5(i1 var1, int var2, int var3) {
      if (var1.y_() && this.z3 != null) {
         o0 var4 = (o0)var1;
         if (var4.t4() <= 0) {
            return true;
         }

         int var5 = var4.t2();
         switch (var5) {
            case 9:
               return true;
            case 28:
            case 75:
               return var4.t4() < 1000;
            case 104:
               return var4.t4() < 1000 || !this.z3.u3(var2 - 1);
            default:
               return var4.t4() < 1000;
         }
      } else {
         return true;
      }
   }

   @Override
   protected int n5(t4$k5 var1, i1 var2, int var3, int var4, boolean[] var5) {
      b3 var6 = (b3)var1;
      int var7 = this.y4 - var6.u3;
      if (var2.y_()) {
         var7 += var2.z1();
      }

      if (this.m3.a6()) {
         this.m3.n5(var6.t9);
         int var8 = this.m3.u3() - var6.t9.k5();
         if (var8 > 0) {
            var7 += this.m3.k5().k5;
            if (var7 + var8 <= this.n5(var1.l6, var3, var5)) {
               var7 += var8;
               this.m3.x8();
            } else {
               boolean var9 = this.n5(this.m3, var6.n5, var3);
               int var10;
               if ((var9 || this.m3.h0()) && (var10 = this.m3.n5(var6.t9, this.x8() - var7, var9)) > 0) {
                  var7 += var10;
               } else {
                  var7 += var8;
                  this.m3.x8();
               }
            }
         }
      }

      if (this.z8.a6()) {
         this.z8.n5(var6.z1);
         int var12 = this.z8.u3() - var6.z1.k5();
         if (var12 > 0 && this.x8() - var7 - this.z8.k5().k5 > 0) {
            int var14 = this.z8.n5(var6.z1, this.x8() - var7 - this.z8.k5().k5);
            if (var14 > 0) {
               var7 += this.z8.k5().k5 + var14;
            }
         }
      }

      int var13 = this.n5(var1.l6, var3, var5) - var7;
      return this.a0 && var13 < 0 ? 0 : var13;
   }

   private boolean n5(a3 var1, int var2, int var3) {
      return this.n5(var2, var3) && var1.c8();
   }

   private boolean n5(int var1, int var2) {
      if (this.c4 == -1 || (var1 < this.c4 || var2 != this.y2 || !this.y1) && (var1 > this.c4 || var2 < this.y2 || this.y1)) {
         int var3 = var1 + 1;

         while (!this.u3.n5(var3).e2()) {
            var3++;
         }

         while (var3 < var2 && (!this.u3.n5(var3).x_() || !this.u3.n5(var3 - 1).e2()) && (!this.u3.n5(var3).y_() || ((i1)this.u3.n5(var3)).t4() >= 1000)) {
            var3++;
         }

         this.c4 = var1;
         this.y2 = var2;
         this.y1 = var3 == var2;
      }

      return this.y1;
   }

   @Override
   protected double k5(t4$k5 var1, int var2) {
      b3 var3 = (b3)var1;
      if (var2 > 0) {
         int var5 = this.e2 - var1.a6;
         if (var3.t9.k5() < this.m3.u3()) {
            var5 += this.m3.k5().u3 - this.m3.k5().k5;
         }

         if (var3.z1.k5() < this.z8.u3()) {
            var5 += this.z8.k5().u3 - this.z8.k5().k5;
         }

         return var5 > 0 ? (double)var2 / var5 : 1000.0;
      } else if (var2 < 0) {
         int var4 = this.t9 - var1.u9;
         if (var3.t9.k5() < this.m3.u3()) {
            var4 += this.m3.k5().k5 - this.m3.k5().l6;
         }

         if (var3.z1.k5() < this.z8.u3()) {
            var4 += this.z8.k5().k5 - this.z8.k5().l6;
         }

         return var4 > 0 ? (double)var2 / var4 : -1000.0;
      } else {
         return 0.0;
      }
   }

   @Override
   protected double n5(t4$k5 var1, i1 var2, int var3, double var4) {
      double var6 = 0.0;
      double var8 = q1.n5(var4);
      if (var8 > 1.0) {
         var8 = 1.0;
      }

      var8 = 1.0 + 100.0 * var8 * var8 * var8;
      if (var2.y_()) {
         double var10 = var2.t4();
         if (var10 >= 0.0) {
            var8 += var10;
            var6 = var8 * var8;
         } else if (!var2.c8()) {
            var6 = var8 * var8 - var10 * var10;
         } else {
            var6 = var8 * var8;
         }
      } else {
         var6 = var8 * var8;
      }

      if (var2.y_() && ((o0)var2).h0() && this.u3(var1.n5).y_() && ((o0)this.u3(var1.n5)).h0()) {
         var6 += this.n5;
      }

      if (q1.n5(var3 - var1.k5) > 1) {
         var6 += this.l6;
      }

      if (this.m3.a6()) {
         var6 += this.m3.t2() * this.w1;
         if (this.m3.s7()) {
            var6 += this.j5;
         }
      }

      if (this.z8.a6()) {
         var6 += this.z8.t2() * this.r4;
      }

      return var6 + var1.x8;
   }

   @Override
   protected void s7() {
      for (int var1 = this.n5(); var1 < this.n3; var1++) {
         for (b3 var2 = (b3)this.a6(var1); var2 != null; var2 = (b3)var2.y4) {
            if (var2.t9.k5() < this.m3.u3()) {
               this.m3.n5(var2, this, this.x8());
            }

            if (var2.z1.k5() < this.z8.u3()) {
               this.z8.l6(var2, this, this.x8());
            }
         }
      }
   }

   public final List<l6$l6> t9() {
      return this.k7;
   }

   public final void n5(l6$l6 var1) {
      if (this.k7 == null) {
         this.k7 = new List<>();
      }

      this.k7.insertItem(0, var1);
   }

   public final void z1() {
      if (this.k7 != null && this.k7.size() != 0) {
         this.k7.removeRange(0, this.k7.size() - 1);
      }
   }

   @Override
   public void n5(int var1, double var2) {
   }

   @Override
   public void n5(t4$k5 var1, v4 var2, int var3) {
      int var4 = var1.s7;
      if (var4 + var1.c8 < 0 && !this.a0 && this.m1 != null) {
         this.m1.n5(var1.l6 - 1, -var4, this.t4());
      }

      boolean var5 = var1.l6 < var3;
      int var6 = var5 ? this.h0 : this.c8;
      double var7 = var1.h0;
      if (var7 < 0.0) {
         var4 = 0;
      } else if (var7 <= 1.0 && var5) {
         var4 = 0;
      } else if (var7 > 1.0) {
         var7 = 1.0;
         var4 -= var1.t2;
      } else if (var6 != 70) {
         var7 = 0.0;
      } else {
         var4 = 0;
      }

      int var9 = ((b3)var1.n3).t9.a6();
      int var10 = ((b3)var1.n3).t9.u3();
      if (var9 == -1) {
         var9++;
         var10 = 0;
      } else if (this.m3.n5(var9) != null && var10 == this.m3.n5(var9).size() - 1) {
         var9++;
         var10 = 0;
      } else {
         var10++;
      }

      int var11 = ((b3)var1.n3).z1.a6() + 1;
      b3 var12 = (b3)var1;
      this.n5(new l6$l6(this.q0, var1.n5, var9, var10, var12.t9.a6(), var12.t9.u3(), var11, var12.z1.a6(), var7, var4));
   }

   @Override
   protected int n3() {
      t4$k5 var1 = null;

      for (int var2 = this.n5(); var2 < this.n3; var2++) {
         for (t4$k5 var3 = this.a6(var2); var3 != null; var3 = var3.y4) {
            if (!this.d2 || var3.l6 <= 1 || var1 == null || q1.n5(var1.s7) >= var1.c8) {
               var1 = this.n5(var1, var3);
            }

            if (var3 != var1) {
               this.l6(var2, var3);
            }
         }
      }

      return var1.l6;
   }

   public final List<com.aspose.slides.internal.r4.u9> u9(int var1) {
      return this.m3.n5(var1);
   }

   public final List<com.aspose.slides.internal.r4.u9> h0(int var1) {
      return this.z8.n5(var1);
   }

   public final com.aspose.slides.internal.e5.t9 t4() {
      return this.q0.y4();
   }

   @Override
   protected int n5(int var1, int var2, boolean[] var3) {
      int var4;
      if (this.z3 != null) {
         var4 = this.z3.l6(var1);
      } else {
         var4 = super.n5(var1, var2, var3);
      }

      return var4;
   }

   @Override
   public int u3() {
      return this.d5;
   }

   @Override
   protected int a6() {
      this.l6(this.s3, this.u3, this.s3.l6 + 1);
      this.s7 = null;
      return this.s3.l6;
   }

   @Override
   public void n5(int var1, t4$k5 var2) {
      if (var2.n5 >= this.u3.size() - 1 || var1 <= 0 || (this.d5 = this.c8(var1 - 1)) == 0) {
         if (var2.n5 == this.u3.size() - 1) {
            this.d5 = 0;
         }

         super.n5(var1, var2);
      } else if (this.s3 == null || var2.x8 < this.s3.x8) {
         this.s3 = var2;
      }
   }

   public final t4$k5 q0() {
      return this.s3;
   }

   private int c8(int var1) {
      return this.z3 == null ? 0 : this.z3.k5(var1);
   }

   // $VF: synthetic method
   static a3 n5(j9 var0) {
      return var0.m3;
   }

   // $VF: synthetic method
   static a3 l6(j9 var0) {
      return var0.z8;
   }
}
