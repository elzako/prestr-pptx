package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.i1;
import com.aspose.slides.internal.p3.j5;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p8;
import com.aspose.slides.internal.p3.q0;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class n5 {
   private com.aspose.slides.internal.u6.y4 n5;
   private List<com.aspose.slides.internal.r4.u9> l6;
   private com.aspose.slides.internal.r4.h0<com.aspose.slides.internal.r4.u9> k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   private boolean z1;
   private s3 t4;
   private int q0 = 0;
   private n5$k5 z3;
   private n5$k5 m1;
   private n5$k5 k7;

   public static int n5(i1 var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, n5$l6.class)) {
         return ((n5$l6)var0).l6;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, n5$n5.class) ? 0 : var0.z1();
      }
   }

   public n5(com.aspose.slides.internal.u6.y4 var1, com.aspose.slides.internal.u6.a6 var2, int var3, int var4, y4 var5) {
      this.n5 = var1;
      com.aspose.slides.internal.h2.t2 var6 = var1.u9().x9();
      c8 var7 = var1.e2();
      this.c8 = var6.k5(false, var7);
      this.t2 = var6.k5(true, var7);
      this.s7 = var6.u3(false, var7);
      this.x8 = var6.u3(true, var7);
      this.n3 = this.c8 + var1.n5(0, 0);
      this.y4 = this.t2 + var1.n5(0, 2);
      this.e2 = this.s7 + var1.a6(0);
      this.t9 = this.x8 + var1.l6(0, 2);
      this.l6 = var1.t9();
      this.n5(var1.u9().u6().n5(var5), var2.a6());
      this.k5 = new com.aspose.slides.internal.r4.u3<>(this.l6);
      this.h0 = -1;
      this.u9 = var4 + com.aspose.slides.internal.p3.q0.n5(this.l6);
      this.u3 = var3 + var1.u9().v4() - 1;
      this.t4 = s3.n5;
      this.a6 = this.u9 - var4;
      this.k7 = new n5$k5(var4);
      this.z3 = new n5$k5(this.k7);
      this.s7();
      this.m1 = new n5$k5(this.k7);
      if (this.k7.l6 < this.l6.size() - 1) {
         this.s7();
      }
   }

   private void n5(com.aspose.slides.internal.v8.u9 var1, com.aspose.slides.internal.v8.u9 var2) {
      int var3 = q1.n5(var1.n5(), var2.n5());
      if (var3 > 0) {
         com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3<>(this.l6);
         int var5 = 0;
         boolean var6 = false;

         while (var4.l6() && var5 < var3) {
            i1 var7 = (i1)var4.k5();
            if (var7.e2()) {
               var6 = true;
               var5 += var7.z1();
            } else if (var7.x_()) {
               if (var6) {
                  this.l6.insertItem(var4.u9() - 1, new n5$l6(var3 - var5));
               }

               var6 = false;
               var5 += var7.z1();
            } else {
               var6 = false;
               if (var5 + var7.z1() < var3) {
                  var4.n5(new n5$l6((o0)var7, var3 - var5));
               }
            }
         }
      }

      int var8 = q1.n5(var3, q1.n5(var1.l6(), var2.l6()));
      if (this.n5.t4() < var8) {
         this.l6.addItem(new n5$n5(var8 - this.n5.t4()));
      }
   }

   public final com.aspose.slides.internal.u6.y4 n5() {
      return this.n5;
   }

   public final boolean n5(int var1) {
      return var1 == this.u3;
   }

   public final int l6() {
      return this.x8() && this.m1.l6 == this.l6.size() - 1 ? 0 : this.y4 + this.a6 + this.e2;
   }

   private void s7() {
      this.k7.a6 = 0;
      this.k7.u9 = 0;
      this.k7.t2 = 0;
      this.k7.c8 = 9;
      if (this.k7.h0 != null) {
         this.k7.h0.clear();
      }

      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;

      while (!var1 && this.k5.l6()) {
         i1 var4 = (i1)this.k5.k5();
         if (var4.y_()) {
            var2 = false;
            if (var4.t4() < 1000 || ((o0)var4).t2() == 104) {
               var1 = true;
               o0 var5 = (o0)var4;
               this.k7.a6 = var5.z1();
               this.k7.u9 = var5.t4();
               if (var5.c8()) {
                  this.k7.c8 = var5.t2();
               }
            }
         } else if (var4.x_()) {
            if (var2) {
               var1 = true;
            } else {
               this.k7.k5 = this.k7.k5 + var4.z1();
               if (!var3) {
                  this.k7.t2 = this.k7.t2 + var4.z1();
               }
            }

            var2 = false;
         } else {
            if (com.aspose.slides.internal.v6g.k5.l6(var4, p8.class) && ((p8)var4).h0()) {
               if (this.k7.h0 == null) {
                  this.k7.h0 = new List<>();
               }

               this.k7.h0.addRange(((p8)var4).a6());
            }

            var2 = true;
            var3 = true;
            this.k7.k5 = this.k7.k5 + var4.z1();
         }
      }

      this.k7.l6 = this.k5.u9() - 1;
      this.k7.u3 = this.n3 + this.k7.k5 + this.k7.a6 + this.t9;
   }

   public final int k5() {
      return this.m1.u3;
   }

   public final int u3() {
      return this.n3 + this.u9 + this.s7 + this.n5.a6(1);
   }

   private void h0(int var1) {
      if (this.m1.l6 < this.l6.size() - 1) {
         while (this.k7.u3 <= var1 && this.m1.c8 == 9) {
            int var2 = this.m1.t2;
            this.m1.n5(this.k7);
            this.m1.t2 = var2;
            if (this.k7.l6 >= this.l6.size() - 1) {
               break;
            }

            this.s7();
         }
      }
   }

   public final void l6(int var1) {
      this.h0(var1);
   }

   public final void k5(int var1) {
      this.h0(var1);
   }

   public final int a6() {
      if (this.x8()) {
         this.z3.n5(this.m1);
         if (this.m1.l6 >= this.l6.size() - 1) {
            this.m1.n5 = this.l6.size();
            return -1;
         }

         this.m1.n5(this.k7);
         this.m1.n5 = this.z3.l6 + 1;
         this.k7.n5 = this.m1.n5;
         if (this.k7.l6 < this.l6.size() - 1) {
            this.s7();
         }
      }

      return this.m1.u3;
   }

   private boolean x8() {
      return this.h0 == this.m1.k5;
   }

   public final int u3(int var1) {
      if (this.m1.u3 <= var1) {
         this.h0 = this.m1.k5;
         this.a6 = this.u9 - this.h0 - this.k7.t2;
         return this.m1.c8;
      } else {
         return 9;
      }
   }

   public final void u9() {
      this.q0++;
      this.m1.u3 = this.m1.u3 - this.t9;
      this.k7.u3 = this.k7.u3 - this.t9;
      this.t9 = this.x8 + this.n5.l6(this.q0, 2);
      this.m1.u3 = this.m1.u3 + this.t9;
      this.k7.u3 = this.k7.u3 + this.t9;
   }

   public final void a6(int var1) {
      if (this.n5(var1)) {
         this.m1.u3 = this.m1.u3 - this.t9;
         this.t9 = this.s7 + this.n5.a6(1);
         this.m1.u3 = this.m1.u3 + this.t9;
         this.z1 = true;
      } else {
         this.y4 = this.t2 + this.n5.n5(this.q0 + 1, 2);
      }
   }

   public final boolean u9(int var1) {
      return this.m1.u3 <= var1 && this.m1.l6 == this.l6.size() - 1;
   }

   public final l6 h0() {
      if (this.m1.l6 + 1 == this.l6.size()) {
         this.t4 = this.n5.w1();
      }

      int var1;
      if (this.m1.n5 == 0) {
         var1 = this.n5.n5(0, 1) + this.c8;
      } else {
         var1 = this.y4;
      }

      int var2 = this.m1.k5 - this.m1.t2 - this.z3.k5;
      return this.x8() && this.m1.n5 != this.l6.size()
         ? new l6(this.n5, this.m1.n5, this.m1.l6, this.z1, this.m1.t2, var2, this.m1.a6, this.n3, var1, this.e2, this.t9)
         : new l6(this.n5, this.m1.n5, this.z3.l6, this.z1, 0, 0, this.z3.a6, this.n3, var1, this.e2, this.t9);
   }

   public final void n5(List<j5> var1) {
      if (this.x8() && this.m1.h0 != null) {
         var1.addRange(this.m1.h0);
         this.m1.h0.clear();
      }
   }

   public final s3 c8() {
      return this.t4;
   }

   public final int t2() {
      return this.x8() ? this.m1.u9 : this.z3.u9;
   }

   @Override
   public final String toString() {
      return d1.n5("Cell ", a3.l6(this.n5.z3() + 1), ".", a3.l6(this.n5.m1() + 1));
   }
}
