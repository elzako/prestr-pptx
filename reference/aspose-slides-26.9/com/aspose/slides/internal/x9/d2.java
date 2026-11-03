package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.g7;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.i9;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v0;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.internal.p3.w2;
import com.aspose.slides.internal.p3.z7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class d2 extends w1 implements com.aspose.slides.internal.p3.r4 {
   public com.aspose.slides.internal.v4.h0 t2;
   public boolean s7;
   private com.aspose.slides.internal.p3.k7 m1;
   public int x8 = -1;
   private int k7 = -1;
   private int m3 = 70;
   private int z8;
   private int j5;
   private com.aspose.slides.internal.f2.k5 w1;
   private com.aspose.slides.internal.f2.k5 r4;
   private com.aspose.slides.internal.h2.x8 c4;
   private com.aspose.slides.internal.f2.u3 y2;
   public int n3 = 161;
   private int y1;
   private com.aspose.slides.internal.f2.k5 a0;
   private int d2;
   private int d5;
   private k5 s3;
   public List<v4> y4;
   public d5 z1;
   private d5[] p8;
   public int t4 = 0;
   private boolean f2;
   public int q0 = 12000;
   private int i1 = 0;
   public boolean z3 = false;

   public final int y1() {
      return this.d2;
   }

   public final int a0() {
      return this.d5;
   }

   public d2(com.aspose.slides.internal.v4.h0 var1, com.aspose.slides.internal.f2.k5 var2, int var3, int var4) {
      super(var1);
      this.t2 = var1;
      this.u9 = null;
      this.a0 = var2;
      this.d2 = var3;
      this.d5 = var4;
   }

   @Override
   public void t4() {
      this.k7 = this.t2.d2();
      this.m3 = this.t2.z6();
      this.z8 = this.t2.e9();
      this.w1 = this.t2.o5();
      this.r4 = this.t2.s0();
      this.c4 = this.t2.v4();
      this.y2 = this.t2.a5();
      this.n3 = this.t2.v8();
      if (this.t2.w2() == 97) {
         this.n3 = this.t2.w2();
      }

      this.y1 = this.t2.i9();
      this.j5 = this.k5(this.m3);
      this.s7 = this == this.h0().r4().get_Item(0);
      this.m1 = new com.aspose.slides.internal.p3.k7(this);
   }

   private int k5(int var1) {
      return this.m3 != 70 && this.z8 == 70 ? 0 : this.m3;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      if (this.s3 == null) {
         com.aspose.slides.internal.v0.h0 var3 = this.t2.n_().c_();
         com.aspose.slides.internal.v0.s7[] var4 = this.t2.z7().n5(var3);
         com.aspose.slides.internal.v0.u3 var5 = var3.n5(var4[0], this.t2.z7().n5.l6(this), this.t2.z7().l6());
         this.s3 = new k5(var5, this.a0.l6(this), var1.y1());
      }

      var1.n5(this.s3);
      this.t4 = var1.z3();
      if (this.y4 == null) {
         this.y4 = new List<>();
         this.l6(var1);
      }

      if (this.y4.size() == 0) {
         this.k5(true);
         return null;
      }

      int var12 = 0;
      int var13 = 0;
      com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3<>(this.y4);
      boolean var6 = this.n3 != 93;

      while (var14.l6()) {
         v4 var7 = (v4)var14.k5();
         com.aspose.slides.internal.r4.u3 var8 = new com.aspose.slides.internal.r4.u3<>(var7);

         while (var8.l6()) {
            v0 var9 = (v0)var8.k5();
            if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.p3.p8.class)) {
               com.aspose.slides.internal.v8.u9 var10 = ((com.aspose.slides.internal.p3.p8)var9).n3();
               if (var10 != null) {
                  var13 = var10.k5();
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.p3.i1.class)) {
               var13 += ((com.aspose.slides.internal.p3.i1)var9).z1();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var9, g7.class)) {
               var13 += ((g7)var9).s7().l6();
            }

            if (var6 && com.aspose.slides.internal.v6g.k5.l6(var9, c4.class)) {
               if (var12 == 0) {
                  var12 = ((c4)var9).z1();
               } else {
                  var12 = q1.n5(var12, ((c4)var9).z1());
               }

               while (var8.l6()) {
                  com.aspose.slides.internal.r4.u9 var17 = (com.aspose.slides.internal.r4.u9)var8.k5();
                  if (com.aspose.slides.internal.v6g.k5.l6(var17, c4.class)) {
                     c4 var11 = com.aspose.slides.internal.v6g.k5.n5(var17, c4.class);
                     var12 += var11.z1();
                     var13 += var11.z1();
                  } else {
                     if (!com.aspose.slides.internal.v6g.k5.l6(var17, o0.class) || !com.aspose.slides.internal.v6g.k5.n5(var17, o0.class).h0() || !var8.l6()) {
                        var8.a6();
                        break;
                     }

                     var13 += ((o0)var17).z1();
                     var17 = (com.aspose.slides.internal.r4.u9)var8.k5();
                     if (com.aspose.slides.internal.v6g.k5.l6(var17, com.aspose.slides.internal.p3.e5.class)) {
                        var13 += ((com.aspose.slides.internal.p3.e5)var17).z1();
                     } else {
                        if (!com.aspose.slides.internal.v6g.k5.l6(var17, c4.class)) {
                           var8.a6();
                           break;
                        }

                        var8.a6();
                     }
                  }
               }
            }
         }
      }

      if (!var6) {
         var12 = var13;
      }

      if (var13 < var12) {
         var13 = var12;
      }

      com.aspose.slides.internal.v8.u9 var15 = var1.f2();
      if (var15 != null) {
         var15 = var15.u9(var12).h0(var13);
      } else {
         var15 = com.aspose.slides.internal.v8.u9.n5(var12, var13, var13);
      }

      var1.l6(var15);
      return this.n5(var1.k7(), var1);
   }

   public final List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, h2 var3) {
      int var4 = var3.n5();
      v4 var5 = this.y4.get_Item(var4);
      var5.removeRange(0, var3.a6() + 1);
      com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(var5);

      while (var6.l6() && !((com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var6.k5()).n5()).e2()) {
         var6.n5();
      }

      if (!var6.l6()) {
         this.y4.removeAt(var4);
      }

      if (this.y4.size() == 0) {
         this.k5(true);
         return null;
      } else {
         this.t4 = var1.z3();
         return this.n5(var1.k7(), var1);
      }
   }

   private void l6(t1 var1) {
      t1 var2 = new t1(var1);
      boolean var3 = false;
      d2$l6 var4 = null;
      int var5 = -1;
      int var6 = this.t4;

      j5 var7;
      while ((var7 = (j5)this.q0()) != null) {
         m1 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, m1.class);
         if (var8 != null && this.z3()) {
            e5 var9 = com.aspose.slides.internal.v6g.k5.n5(this.m1(), e5.class);
            this.k7();
            if (var9 != null) {
               var8.k5(this.d2);
               var8.u3(this.d5);
            }
         }

         List var19 = var7.n5(var2, this.j5);
         com.aspose.slides.internal.v8.u9 var10 = var1.f2();
         if (var10 != null) {
            var10 = var10.u9(var2.f2().n5()).h0(var2.f2().k5());
         } else {
            var10 = this.t9.f2();
         }

         var1.l6(var10);
         if (var19 != null && var19.size() != 0) {
            int var11 = -1;
            k7 var12 = com.aspose.slides.internal.v6g.k5.n5(var7, k7.class);
            if (var12 != null) {
               com.aspose.slides.internal.f2.k5 var13 = var12.s3();
               if (var13 != null && var13.a6() != 9) {
                  var11 = com.aspose.slides.internal.v6g.k5.u3(var13.n5(), 14);
               }
            }

            if (var4 != null) {
               v4 var21 = (v4)var19.get_Item(0);
               if (!var21.c8() || var11 != -1) {
                  var4.u9();
                  var4 = null;
                  var3 = false;
               }

               if (var4 != null) {
                  com.aspose.slides.internal.p3.i1 var14 = (com.aspose.slides.internal.p3.i1)var21.get_Item(0);
                  if (var14.e2() && !var14.t9() && var3) {
                     var4.a6();
                  }
               }
            }

            com.aspose.slides.internal.r4.u3 var22 = new com.aspose.slides.internal.r4.u3(var19);
            int var23 = var6;

            while (var22.l6()) {
               v4 var15 = ((com.aspose.slides.internal.r4.u9)var22.k5()).l6();
               if (this.e2()) {
                  com.aspose.slides.internal.r4.u3 var16 = new com.aspose.slides.internal.r4.u3<>(var15);

                  while (var16.l6()) {
                     v0 var17 = ((com.aspose.slides.internal.r4.u9)var16.k5()).n5();
                     int var18 = 0;
                     if (com.aspose.slides.internal.v6g.k5.l6(var17, com.aspose.slides.internal.p3.i1.class)) {
                        var18 = ((com.aspose.slides.internal.p3.i1)var17).z1();
                     } else if (com.aspose.slides.internal.v6g.k5.l6(var17, g7.class)) {
                        var18 = ((g7)var17).s7().l6();
                     }

                     this.t4 += var18;
                     var23 += var18;
                  }
               }

               if (var15.c8()) {
                  v0 var24 = var15.s7();
                  var3 = var24.e2() && !((com.aspose.slides.internal.p3.i1)var24).t9() && ((com.aspose.slides.internal.p3.i1)var24).z1() != 0;
                  if (var4 == null) {
                     var4 = new d2$l6(this, this.m3, this.z8, this.w1.l6(this), this.r4.l6(this), this);
                     var4.a6 = var11;
                     var4.t2();
                  }

                  t9 var25 = com.aspose.slides.internal.v6g.k5.n5(var7, t9.class);
                  if (var25 != null) {
                     var25.d2().x8(var4.size());
                  } else {
                     var4.addRange(var15);
                  }

                  if (var24.y_() && ((o0)var24).t4() == -1000 && var25 == null) {
                     var4.x8();
                     if (!var4.n3()) {
                        var4.addItem(new com.aspose.slides.internal.p3.e5(this.t4, 0, this.t4, null, true));
                     }

                     var4.u9();
                     var4 = null;
                     var3 = false;
                  }
               } else {
                  this.y4.addItem(var15);
               }
            }

            if (this.e2()) {
               if (var11 != -1) {
                  var5 = q1.n5(var5, var11);
               } else {
                  var5 = q1.n5(var5, var23);
               }
            }
         }
      }

      if (var4 != null) {
         var4.u9();
      }

      if (this.e2()) {
         var1.l6(var5);
      }
   }

   private List<com.aspose.slides.internal.r4.u9> n5(int var1, t1 var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3<>(this.y4);
      this.p8 = new d5[this.y4.size()];

      for (int var4 = 0; var3.l6(); var4++) {
         v4 var5 = (v4)var3.k5();
         d5 var6;
         if (!var5.c8()) {
            var6 = new d5();
         } else {
            var6 = this.n5(var2, var1, (d2$l6)var5, !var3.l6(), var5.k5);
         }

         this.p8[var4] = var6;
      }

      this.k5(true);
      return this.l6(var1, var2);
   }

   private d5 n5(t1 var1, int var2, d2$l6 var3, boolean var4, int var5) {
      this.z1 = new d5();
      double var6 = 1.0;
      a0 var8 = new a0(
         var2,
         this.m3,
         this.z8,
         this.w1.l6(this),
         var3.u3.l6(),
         this.a0.l6(this),
         this.d2,
         this.d5,
         this.y4.indexOf(var3) == 0,
         this.y2.a6() == 89 ? 0 : this.y2.u3(),
         this,
         this.m1
      );
      var8.q0 = var1;
      var8.l6(var5 != -1 ? q1.l6(this.t4, var5) : this.t4);
      boolean var9 = this.n3 != 93;
      boolean var10 = var9 && this.c4.u3.a6() == 149;
      if (var10 && !this.f2) {
         this.f2 = var4;
         this.n5(var3);
      }

      int var11 = var9 ? 1 : 2;
      com.aspose.slides.internal.y1.u3 var12 = this.y4().q_();
      boolean var13 = var12.k5();
      int var14 = var8.n5(var3, var6, var13, var11);
      if (var14 == 0 || var2 == 70) {
         if (var14 > 0) {
            var8.q0();
            this.z1.n5(false);
         }

         if (var10 && var11 != 2) {
            var11 = 0;
         } else {
            var6 = 5.0;
         }

         var14 = var8.n5(var3, var6, var13, var11);
         if (var14 == 0) {
            var6 = 20.0;
            var8.n5(var3, var6, true, var11);
         }

         this.z1.n5();
      }

      return this.z1;
   }

   private List<com.aspose.slides.internal.r4.u9> l6(int var1, t1 var2) {
      List var3 = new List();
      int var4 = -1;

      for (int var5 = 0; var5 < this.y4.size(); var5++) {
         if (var5 > 0) {
            com.aspose.slides.internal.p3.s3 var6 = this.a5();
            var3.addItem(new com.aspose.slides.internal.p3.z1(new j8(this), var6.k5(), var6.l6(), var2));
         }

         d5 var16 = this.p8[var5];
         v4 var7 = this.y4.get_Item(var5);
         if (!var7.c8()) {
            List var18 = new List();
            com.aspose.slides.internal.r4.u3 var19 = new com.aspose.slides.internal.r4.u3<>(var7);

            while (var19.l6()) {
               v0 var21 = ((com.aspose.slides.internal.r4.u9)var19.k5()).n5();
               if (var21.m3() != this) {
                  var21.n5(this.n5(new f0(this, var21.k7())));
               }

               var18.addItem(var21);
            }

            var3.addRange(var18);
         } else if (var7.c8() && var1 == 70) {
            h2 var17 = new h2(this, var5);
            this.n5(var3, var16, var17);
         } else {
            int var8 = 0;

            for (int var9 = 0; var9 < var16.a6(); var9++) {
               if (var3.size() > 0 && var9 > 0 && var9 >= this.t2.a3() && var9 <= var16.a6() - this.t2.p3()) {
                  com.aspose.slides.internal.p3.s3 var10 = this.a5();
                  var3.addItem(new com.aspose.slides.internal.p3.z1(new h2(this, var5, var4), var10.k5(), var10.l6(), var2));
               }

               var4 = ((d2$n5)var16.k5(var9)).n5();
               List var20 = new List();
               List var11 = new List();
               com.aspose.slides.internal.r4.u3 var12 = new com.aspose.slides.internal.r4.u3<>(var7, var8);

               while (var12.u9() <= var4) {
                  com.aspose.slides.internal.p3.i1 var13 = (com.aspose.slides.internal.p3.i1)var12.k5();
                  if (com.aspose.slides.internal.v6g.k5.l6(var13, c4.class) && ((c4)var13).x8()) {
                     if (((c4)var13).n3()) {
                        var20.addItem(((c4)var13).s7());
                     } else {
                        var11.addItem(((c4)var13).h0());
                     }
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var13, com.aspose.slides.internal.p3.p8.class)) {
                     var20.addRange(((com.aspose.slides.internal.p3.p8)var13).a6());
                     var11.addRange(((com.aspose.slides.internal.p3.p8)var13).u9());
                  }
               }

               var8 = var4 + 1;
               d2$n5 var22 = (d2$n5)var16.k5(var9);
               com.aspose.slides.internal.v8.u9 var14;
               if (var1 == 70) {
                  var14 = com.aspose.slides.internal.v8.u9.n5(var22.x8 - var22.a6 - var22.k5, var22.x8 - var22.a6, var22.x8 - var22.a6 + var22.u3);
               } else if (var1 == 23) {
                  var14 = com.aspose.slides.internal.v8.u9.n5(var22.x8 - 2 * var22.c8);
               } else if (var1 == 39) {
                  var14 = com.aspose.slides.internal.v8.u9.n5(var22.x8 - var22.c8);
               } else {
                  var14 = com.aspose.slides.internal.v8.u9.n5(var22.x8 - var22.a6 + var22.c8);
               }

               com.aspose.slides.internal.p3.p8 var15 = new com.aspose.slides.internal.p3.p8(var22.s7 + var22.n3 + var22.y4, var20, var11, var22, false);
               var15.n5(var14);
               var3.addItem(var15);
            }
         }
      }

      return var3;
   }

   private void n5(List<com.aspose.slides.internal.r4.u9> var1, d5 var2, j8 var3) {
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.t2.a3();
      int var10 = this.t2.p3();
      List var11 = new List();
      if (this.t2.a3() + this.t2.p3() <= var2.l6()) {
         var4 = var2.l6() - (this.t2.a3() + this.t2.p3());
         var5 = var2.u3() - var2.k5();
         var7 = var2.k5() - var2.l6();
      } else if (this.t2.a3() + this.t2.p3() <= var2.k5()) {
         var5 = var2.u3() - var2.k5();
         var7 = var2.k5() - (this.t2.a3() + this.t2.p3());
         var8 = this.t2.a3() + this.t2.p3() - var2.l6();
      } else if (this.t2.a3() + this.t2.p3() <= var2.u3()) {
         var5 = var2.u3() - (this.t2.a3() + this.t2.p3());
         var6 = this.t2.a3() + this.t2.p3() - var2.k5();
         var8 = var2.k5() - var2.l6();
         var9 -= var6;
      } else {
         var6 = var2.u3() - var2.k5();
         var8 = var2.k5() - var2.l6();
         var9 = var2.k5();
         var10 = 0;
      }

      if (var10 == 0 || var6 <= 0 && var8 <= 0) {
         if (var10 != 0) {
            var11.addItem(new o0(0, 0, false, var3, false));
         }
      } else {
         var11.addItem(new o0(0, 1000, false, var3, false));
         var11.addItem(new com.aspose.slides.internal.p3.e5(0, -var6 * this.q0, -var8 * this.q0, com.aspose.slides.internal.p3.u9.u3, var3, false));
         var11.addItem(new o0(var6 * this.q0, 0, false, var3, false));
         var11.addItem(new com.aspose.slides.internal.p3.e5(0, var6 * this.q0, var8 * this.q0, com.aspose.slides.internal.p3.u9.u3, var3, false));
      }

      var1.addItem(new com.aspose.slides.internal.p3.f2(var9 * this.q0, var3, var10 == 0 && var6 == 0 && var8 == 0));
      if (var6 > 0 || var8 > 0) {
         var1.addItem(new o0(0, 1000, false, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.e5(0, var6 * this.q0, var8 * this.q0, com.aspose.slides.internal.p3.u9.u3, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.f2(0, var3, var10 == 0));
      }

      for (int var12 = 0; var12 < var5; var12++) {
         var1.addRange(var11);
         var1.addItem(new com.aspose.slides.internal.p3.f2(0, var3, false));
         var1.addItem(new o0(0, 1000, false, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.e5(0, this.q0, 0, com.aspose.slides.internal.p3.u9.u3, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.f2(0, var3, false));
      }

      for (int var13 = 0; var13 < var7; var13++) {
         var1.addRange(var11);
         var1.addItem(new com.aspose.slides.internal.p3.f2(this.q0, var3, false));
         var1.addItem(new o0(0, 1000, false, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.e5(0, 0, this.q0, com.aspose.slides.internal.p3.u9.u3, var3, false));
         var1.addItem(new com.aspose.slides.internal.p3.f2(0, var3, false));
      }

      for (int var14 = 0; var14 < var4; var14++) {
         var1.addRange(var11);
         var1.addItem(new com.aspose.slides.internal.p3.f2(this.q0, var3, false));
      }

      if (var10 > 0) {
         var1.addRange(var11);
         var1.addItem(new com.aspose.slides.internal.p3.f2(var10 * this.q0, var3, true));
      }
   }

   @Override
   public final boolean v4() {
      return ((com.aspose.slides.internal.p3.r4)this.h0()).v4();
   }

   @Override
   public final com.aspose.slides.internal.p3.s3 a5() {
      return ((com.aspose.slides.internal.p3.r4)this.h0()).a5();
   }

   @Override
   public final boolean u6() {
      return !this.p8().n5();
   }

   @Override
   public final boolean t1() {
      return !this.s3().n5();
   }

   public final com.aspose.slides.internal.p3.s3 s3() {
      return com.aspose.slides.internal.p3.s3.n5;
   }

   public final com.aspose.slides.internal.p3.s3 p8() {
      return com.aspose.slides.internal.p3.s3.n5;
   }

   @Override
   public final int n5(int var1, com.aspose.slides.internal.p3.i1 var2) {
      h2 var3 = (h2)var2.k7();
      int var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3((double)var1 / this.q0 + (var1 > 0 ? -0.4 : 0.4)), 14);
      d5 var5 = this.p8[var3.n5()];
      var4 = var5.u3(var4);
      return var4 * this.q0;
   }

   @Override
   public final void n5(com.aspose.slides.internal.p3.e5 var1) {
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      return this.n5(var1, var2);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      List var3 = new List();

      for (int var4 = 0; var4 < this.y4.size(); var4++) {
         d5 var5 = this.p8[var4];

         for (int var6 = 0; var6 < var5.a6(); var6++) {
            if (!((com.aspose.slides.internal.p3.r4)this.u3).v4() && var6 >= this.t2.a3() && var6 <= var5.a6() - this.t2.p3()) {
               var3.addItem(new o0(0, 0, false, new j8(this), false));
            }

            d2$n5 var7 = (d2$n5)var5.k5(var6);
            com.aspose.slides.internal.v8.u9 var8;
            if (var2 == 70) {
               var8 = com.aspose.slides.internal.v8.u9.n5(var7.x8 - var7.a6 - var7.k5, var7.x8 - var7.a6, var7.x8 - var7.a6 + var7.u3);
            } else if (var2 == 23) {
               var8 = com.aspose.slides.internal.v8.u9.n5(var7.x8 - 2 * var7.c8);
            } else if (var2 == 39) {
               var8 = com.aspose.slides.internal.v8.u9.n5(var7.x8 - var7.c8);
            } else {
               var8 = com.aspose.slides.internal.v8.u9.n5(var7.x8 - var7.a6 + var7.c8);
            }

            var3.addItem(new com.aspose.slides.internal.p3.p8(var7.s7, var8, var7.h0 != 0.0 ? var7.x8 - var7.a6 : 0, var7, false));
         }
      }

      return var3;
   }

   private void n5(d2$l6 var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(var1, var1.n5);
      List var3 = new List();
      j5 var4 = null;

      while (var2.l6()) {
         com.aspose.slides.internal.p3.i1 var5 = (com.aspose.slides.internal.p3.i1)var2.k5();
         if (var5.m3() != var4) {
            var4 = (j5)var5.m3();
            if (var4 == null) {
               break;
            }

            var3.addItem(new d2$k5(var4, var2.h0()));
         } else if (var4 == null) {
            break;
         }

         if (var5.e2() && !var5.t9()) {
            int var6 = 1;
            int var7 = 0;
            a5 var8 = new a5();
            var8.n5(var4.a6(var5.k7()));

            while (var2.l6()) {
               com.aspose.slides.internal.p3.i1 var9 = (com.aspose.slides.internal.p3.i1)var2.k5();
               if (var9.e2() && !var9.t9()) {
                  if (var4 != var9.m3()) {
                     var4 = (j5)var9.m3();
                     var3.addItem(new d2$k5(var4, var2.h0()));
                  }

                  var6++;
                  var8.n5(var4.a6(var9.k7()));
               } else {
                  if (!var9.t9()) {
                     var2.a6();
                     break;
                  }

                  if (var4 != var9.m3()) {
                     var4 = (j5)var9.m3();
                     var3.addItem(new d2$k5(var4, var2.h0()));
                  }

                  var7++;
               }
            }

            q0 var10 = this.n5(var8);
            if (var10 != null) {
               com.aspose.slides.internal.p3.i1 var11 = null;

               for (int var12 = 0; var12 < var6 + var7; var12++) {
                  var2.a6();
               }

               for (int var14 = 0; var14 < var6 + var7; var14++) {
                  var11 = (com.aspose.slides.internal.p3.i1)var2.k5();
                  if (var11.e2() && !var11.t9()) {
                     ((j5)var11.m3()).n5(var11.k7(), var10);
                  }
               }
            }
         }
      }

      this.n5(var1, var3);
   }

   private void n5(d2$l6 var1, List<d2$k5> var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var2);
      int var4 = 0;

      while (var3.l6()) {
         d2$k5 var5 = (d2$k5)var3.k5();
         int var6 = var5.l6;
         int var8;
         if (var3.l6()) {
            d2$k5 var7 = (d2$k5)var3.k5();
            var8 = var7.l6;
            var3.a6();
         } else {
            var8 = var1.size() - var1.l6 - var4;
         }

         List var10 = var1.getRange(var6 + var4, var8 - var6);
         if (var5.n5.l6(var10)) {
            List var9 = var5.n5.n5(var10, this.j5);
            var1.getRange(var6 + var4, var8 + var4).clear();
            var1.insertRange(var6 + var4, var9);
            var4 += var9.size() - (var8 - var6);
         }
      }

      var2.clear();
   }

   @Override
   protected boolean a6(boolean var1) {
      return true;
   }

   @Override
   protected boolean u9(boolean var1) {
      return true;
   }

   private q0 n5(a5 var1) {
      return null;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      while (var1.l6()) {
         j8 var3 = (j8)var1.k5();
         boolean var4 = !var1.l6();
         if (com.aspose.slides.internal.v6g.k5.l6(var3, d2$n5.class)) {
            this.n5(var2, (d2$n5)var3, var4);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, f0.class) && var3.w_()) {
            this.n5(var2, var3, var4);
         }
      }

      this.k5((com.aspose.slides.internal.a0.l6)null);
   }

   private void n5(t1 var1, d2$n5 var2, boolean var3) {
      v4 var4 = this.y4.get_Item(var2.n5);
      int var5 = var2.l6;
      int var6 = var2.n5();
      com.aspose.slides.internal.a0.k7 var7 = new com.aspose.slides.internal.a0.k7(var2.n5() < var4.size() - 1 ? this.m3 : this.z8, var2.a6, var2.u3, var2.k5);
      if (var2.c8 != 0) {
         var7.n5(27, var2.c8);
      }

      if (var2.t2 != 0) {
         var7.n5(28, var2.t2);
      }

      var7.k5(var2.s7);
      var7.l6(var2.x8);
      var7.u3(this.k7);
      var7.n5(29, var2.n3);
      var7.n5(30, var2.y4);
      this.s3.n5(var2.s7, var2.e2);
      if (com.aspose.slides.internal.v6g.k5.l6(var4, d2$l6.class)) {
         d2$l6 var8 = (d2$l6)var4;
         var5 += var5 == 0 ? var8.n5 : 0;
         if (var6 == var8.size() - 1) {
            var6 -= var8.l6;
            var7.l6(var7.l6() - this.r4.l6(this));
         }
      }

      com.aspose.slides.internal.r4.u3 var23 = new com.aspose.slides.internal.r4.u3<>(var4, var6);
      com.aspose.slides.internal.p3.i1 var9 = (com.aspose.slides.internal.p3.i1)var23.k5();
      com.aspose.slides.internal.p3.y2 var10 = var9.m3();
      if (var9.x_() && (this.y1 == 63 || this.y1 == 60 || this.y1 == 62)) {
         var6--;
         var23.a6();
         if (var23.u3()) {
            var10 = ((com.aspose.slides.internal.p3.i1)var23.a6()).m3();
         }
      }

      if (this.y1 == 63 || this.y1 == 60 || this.y1 == 61) {
         var23 = new com.aspose.slides.internal.r4.u3<>(var4, var5);

         while (var23.l6() && !((com.aspose.slides.internal.p3.i1)var23.k5()).e2()) {
            var5++;
         }
      }

      z7 var11 = new z7<>(var4, var5, var6 + 1);
      t1 var12 = new t1(0);
      var12.n5(this.s3);
      var12.n5(var2.u9);
      var12.l6(var2.h0);
      var12.n5(new i9(true));
      var12.l6(new i9(false));
      var12.n5(256, true);
      this.k5(var7);
      this.n5(var12);

      com.aspose.slides.internal.p3.y2 var13;
      while ((var13 = var11.u9()) != null) {
         var12.n5(128, var13 == var10);
         var13.n5(var11, var12);
         var12.n5(var12.e2());
         var12.l6(new i9(false));
      }

      com.aspose.slides.internal.p3.x8 var14 = com.aspose.slides.internal.v6g.k5.n5(this.u3, com.aspose.slides.internal.p3.x8.class);
      int var15 = 0;
      if (var14 != null) {
         var15 = var14.y1();
      }

      this.n5(var7, var15 - 1);
      int var16 = 0;
      List$Enumerator var17 = com.aspose.slides.internal.x9.z1.l6().a6().iterator();

      try {
         while (var17.hasNext()) {
            com.aspose.slides.internal.p3.z3 var18 = (com.aspose.slides.internal.p3.z3)var17.next();
            if (var18 != null && var18.j3() && !var18.j9() && var18.v8() > 0) {
               var16 = q1.n5(var16, var18.j8() + var18.e9());
               if (var7.m3().size() > 0) {
                  var18.n3(var18.v8() - 1);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }

      List var25 = var7.m3();
      if (var25.size() > 0 && !this.z3) {
         com.aspose.slides.internal.d2.x8 var19 = com.aspose.slides.internal.v6g.k5.n5(var7.m3().get_Item(0), com.aspose.slides.internal.d2.x8.class);
         if (var19 == null || !com.aspose.slides.internal.v6g.k5.l6(var19.m3(), com.aspose.slides.internal.d2.t2.class)) {
            com.aspose.slides.internal.j9.y4 var20 = this.u3(this);
            if (var20 == null || var20.d2() == 0) {
               var7.t2(var16);
            }
         }
      }

      if (var1.d2() > 0 && (!var1.k5() || !var3)) {
         var7.k5(var7.e_() + var1.d2());
      }

      var7.r4();
      if (var7.h0() >= 0) {
         com.aspose.slides.internal.d5.k5.n5(var7);
      }

      this.u3.l6(var7);
   }

   private com.aspose.slides.internal.j9.y4 u3(com.aspose.slides.internal.p3.y2 var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.j9.y4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j9.y4.class);
      return var2 != null ? var2 : this.u3(var1.h0());
   }

   private void n5(com.aspose.slides.internal.a0.k7 var1, int var2) {
      List var3 = this.m1.s7();
      if (var3 != null) {
         List$Enumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               t9 var5 = (t9)var4.next();
               com.aspose.slides.internal.p3.z3 var6 = var5.d2();
               if (var6 != null && var6.d2() != null && (!var6.y0() || this.y4() == var6.i1())) {
                  if (!var6.j9()) {
                     if (var6.v3() != 0 && var2 < var6.v3()
                        || var5.h0() != this && !com.aspose.slides.internal.v6g.k5.l6(var5.h0(), com.aspose.slides.internal.p3.t2.class) && !var5.a0()) {
                        continue;
                     }
                  } else {
                     com.aspose.slides.internal.j9.y4 var7 = this.u3(this);
                     if (var7 != var5.h0()) {
                        continue;
                     }
                  }

                  com.aspose.slides.internal.a0.t2 var24 = com.aspose.slides.internal.v6g.k5.n5(var6.d2(), com.aspose.slides.internal.a0.t2.class);
                  if (var24 != null) {
                     com.aspose.slides.internal.d2.t2 var8 = new com.aspose.slides.internal.d2.t2();
                     if (com.aspose.slides.internal.v6g.k5.l6(var6.d2(), com.aspose.slides.internal.a0.t2.class)) {
                        var8.n5(var6.d2());
                     }

                     com.aspose.slides.internal.x9.z1.l6().a6().addItem(var6);
                     com.aspose.slides.internal.a0.t2 var9 = com.aspose.slides.internal.v6g.k5.l6(var24, com.aspose.slides.internal.a0.x8.class)
                        ? com.aspose.slides.internal.v6g.k5.n5(var24.c4().get_Item(0), com.aspose.slides.internal.a0.t2.class)
                        : var24;
                     int var10 = var6.j8();
                     if (var6.j9()) {
                        var10 -= var6.e9();
                     }

                     var10 -= var24.m3() - var24.n3();
                     var9.n5(var10, true, true);
                     var9.l6(var6.w2(), true, true);
                     if (var6.j3() || var6.n1()) {
                        var9.l6(true);
                        var9.s7(var6.e9());
                     }

                     if (var24.a6) {
                        List var11 = var24.c4();
                        com.aspose.slides.internal.a0.k7 var12 = com.aspose.slides.internal.v6g.k5.n5(
                           var11.get_Item(var11.size() - 1), com.aspose.slides.internal.a0.k7.class
                        );
                        if (var12 != null) {
                           List$Enumerator var13 = var12.m3().iterator();

                           try {
                              while (var13.hasNext()) {
                                 com.aspose.slides.internal.d2.t2 var14 = (com.aspose.slides.internal.d2.t2)var13.next();
                                 com.aspose.slides.internal.a0.t2 var15 = var14.m1();
                                 var15.x8(var15.r4() + var10);
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                                 var13.dispose();
                              }
                           }
                        }
                     }

                     var1.n5(var8);
                  }

                  var6.k5((com.aspose.slides.internal.a0.l6)null);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   private void n5(t1 var1, j8 var2, boolean var3) {
      List var4 = new List(1);
      j8 var5 = var2.k5();
      var4.addItem(var5);
      com.aspose.slides.internal.p3.y2 var6 = null;
      if (var3) {
         var6 = var5.u3();
      }

      com.aspose.slides.internal.a0.k7 var7 = new com.aspose.slides.internal.a0.k7();
      this.k5(var7);
      t1 var8 = new t1(0);
      var8.n5(this.s3);
      this.n5(var8);
      w2 var9 = new w2(new com.aspose.slides.internal.r4.u3(var4));
      t1 var10 = new t1(0);
      var10.n5(new i9(true));
      var10.l6(new i9(false));
      var10.n5(256, true);

      com.aspose.slides.internal.p3.y2 var11;
      while ((var11 = var9.u9()) != null) {
         var10.n5(128, var1.k5() && var11 == var6);
         var10.n5(var1.q0());
         var11.n5(var9, var10);
         var10.n5(var10.e2());
         var10.l6(new i9(false));
      }

      var7.w1();
      if (var7.h0() >= 0) {
         com.aspose.slides.internal.d5.k5.n5(var7);
      }

      this.u3.l6(var7);
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d2.c8.class)) {
         com.aspose.slides.internal.a0.l6 var2 = this.i1();
         if (this.e5().y4()) {
            this.n5(var2, this.e5().n3().n5(false), this.e5().m3());
         }

         var2.n5(var1);
      }
   }

   @Override
   public boolean x8() {
      return true;
   }

   @Override
   public boolean n3() {
      return true;
   }

   @Override
   public boolean z1() {
      return true;
   }
}
