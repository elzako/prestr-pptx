package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b3.y2;
import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.h2.f2;
import com.aspose.slides.internal.h2.j5;
import com.aspose.slides.internal.h2.k7;
import com.aspose.slides.internal.p3.c4;
import com.aspose.slides.internal.p3.e5;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.i1;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.m3;
import com.aspose.slides.internal.p3.n1;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v0;
import com.aspose.slides.internal.p3.v3;
import com.aspose.slides.internal.p3.w1;
import com.aspose.slides.internal.u6.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class y4 extends com.aspose.slides.internal.p3.y4 implements c4 {
   private t2 k7;
   private a6 m3 = null;
   public com.aspose.slides.internal.a0.t2 t2;
   private double z8;
   private boolean j5 = true;
   private boolean w1;
   private boolean r4;
   private boolean c4;
   private boolean y2;
   private com.aspose.slides.internal.v8.u9 y1;
   private com.aspose.slides.internal.v8.u9 a0;
   private int d2;
   private int d5;
   private List<y4$n5> s3;
   private j8 p8;
   private int f2 = 0;

   public y4(z1 var1) {
      super(var1);
      this.m3 = new a6(var1);
   }

   public final z1 y1() {
      return (z1)this.k5;
   }

   public final a6 a0() {
      return this.m3;
   }

   @Override
   public void t4() {
      this.q0 = this.y1().p3().h0.l6(this);
      this.z3 = this.y1().p3().c8.l6(this);
      if (this.y1().s0()) {
         this.d2 = this.y1().v8().s7().c8().l6(this) / 2;
         this.d5 = this.y1().v8().t2().c8().l6(this) / 2;
      } else {
         this.d2 = 0;
         this.d5 = 0;
      }

      if (!this.y1().o0() && this.y1().a3().u3(this).a6() != 9) {
         this.j5 = false;
      }
   }

   private void x9() {
      this.w1 = false;
      this.r4 = false;
      this.c4 = false;
      this.y2 = false;
      this.y1 = null;
      this.a0 = null;
   }

   public final int d2() {
      return this.f2;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      int var3 = this.z8().w1().x8().k7();
      n1 var4 = new n1(1, 1, var1, var2, this);
      m3 var5 = var4.n5(0, 1, var3);
      if (var5.l6() != var3 || var5.n5() != 0) {
         this.f2 = var5.n5();
      }

      List var6 = new List();
      this.t4 = var1.z3();
      if (this.y1().a3().u3(this).a6() != 9) {
         int var7 = this.y1().a3().u3(this).c8().l6(this);
         this.u3(var7);
      } else {
         if (!this.y1().o0()) {
            w1 var13 = com.aspose.slides.internal.p3.n3.n5(this.y1().q_().m1());
            var13.n5(this, this.y1().m_());
         }

         this.o0();
      }

      int var14 = this.m3.n5((com.aspose.slides.internal.f2.u9)this);
      if (!this.j5 && var14 > this.c8()) {
         this.u3(var14);
      }

      int var8 = this.t4 - this.p3();
      if (this.c8() > var8) {
         w1 var9 = com.aspose.slides.internal.p3.n3.n5(this.y1().q_().m1());
         var9.n5(this, this.y1().t9(), this.c8(), var1.z3(), this.y1().m_());
      }

      if (!this.y1().o0() && this.z8 == 0.0) {
         this.z8 = this.m3.n5(this);
      }

      if (!this.z1) {
         this.l6(var6, var2);
      }

      if (this.y1().s0()) {
         this.n5(var6, !this.z1);
         this.z1 = true;
         this.l6(var1);
      }

      if (this.y1().o0()) {
         this.l6(var1, var2);
      }

      this.k7 = new t2(this);
      t1 var10 = new t1(0);
      var10.l6(var1.z3());
      var10.n5(var1);
      List var15 = this.k7.n5(var10, var2);
      com.aspose.slides.internal.r4.u3 var11 = new com.aspose.slides.internal.r4.u3(var15);

      while (var11.l6()) {
         v0 var12 = (v0)var11.k5();
         this.n5(var12.k7());
      }

      this.n5(var15, var6);
      if (this.y1().a3().u3(this).a6() == 9 || this.c8() < this.a0().n5((com.aspose.slides.internal.f2.u9)this)) {
         this.a6(this.a0().n5((com.aspose.slides.internal.f2.u9)this));
      }

      var1.l6(this.h2());
      var1.l6(var10.u9());
      var1.n5(this.v0());
      var1.n5(var10.a6());
      if (this.y1().s0()) {
         this.l6(var6, true);
      }

      this.k5(var6, var2);
      if (!var1.u3()) {
         int var16 = com.aspose.slides.internal.v3.n5.n5(this.y1().t1(), var10.d5());
         if (var16 != 9) {
            var6.insertItem(0, new com.aspose.slides.internal.p3.z1(this.b3(), 0, -1000, var16, var1));
         }
      }

      int var17 = com.aspose.slides.internal.v3.n5.n5(this.y1().u6(), var10.s3());
      if (var17 != 9) {
         var6.addItem(new com.aspose.slides.internal.p3.z1(this.b3(), 0, -1000, var17, var1));
      }

      this.k5(true);
      this.x9();
      return var6;
   }

   private void l6(t1 var1, int var2) {
      y4$l6 var3 = this.y0();

      try {
         int var4 = this.a0().n5();
         if (var4 != 0) {
            boolean var5 = this.y1().a3().u3(this).a6() != 9;
            int var6;
            if (var5) {
               var6 = this.y1().a3().u3(this).c8().l6(this);
            } else {
               var6 = var1.z3();
            }

            this.k7 = new t2(this);
            t1 var7 = new t1(0);
            var7.l6(var6);
            var7.n5(var1);
            this.k7.n5(var7, var2);
            List var8 = new List();
            int var9 = 0;
            if (var3.l6()) {
               this.a0().l6(this);
               int var10 = this.a0().k5(this);
               if (var5 && !this.a0().u3(this) && var6 != var10) {
                  this.a0().l6(this, var6);
                  this.m3 = new a6(this.y1());
                  return;
               }

               int var11 = this.a0().k5(this, var6);
               boolean var12 = this.m3.a6(this);
               if (var6 > var10 + var11 && var12) {
                  this.m3.u3(this, var6);
               }

               var10 = this.a0().k5(this);
               var6 -= var10;

               for (int var13 = 1; var13 <= var4; var13++) {
                  com.aspose.slides.internal.u6.m3 var14 = this.a0().n5(var13);
                  if (!var14.i1().k5() || var14.i1().l6(this) == 0) {
                     com.aspose.slides.internal.h2.t1 var15 = com.aspose.slides.internal.v6g.k5.n5(var14.i1(), com.aspose.slides.internal.h2.t1.class);
                     if (var15 != null) {
                        int var16;
                        int var17 = var16 = com.aspose.slides.internal.v6g.k5.u3(var15.e2() / 100.0 * var6, 14);
                        com.aspose.slides.internal.v8.u9 var18 = var14.b3();
                        int var19 = 0;
                        if (var18 != null) {
                           if (var18.n5() > var17) {
                              var17 = var18.l6();
                           }

                           var16 = var18.k5() > var17 ? var18.k5() : var17;
                           var19 = var18.n5();
                        }

                        var14.n5(com.aspose.slides.internal.v8.u9.n5(var19, var17, var16));
                     }

                     com.aspose.slides.internal.v8.u9 var48 = var14.b3();
                     if (var48 != null) {
                        if (!var48.c8() && var48.l6() == -1) {
                           int var46 = com.aspose.slides.internal.v6g.k5.u3(1.0F / var4 * var7.z3(), 13);
                           var14.n5(com.aspose.slides.internal.v8.u9.n5(var46));
                        }

                        var8.addItem(var14);
                        var9 += var14.b3().l6();
                     } else if (var14.c8 == 0) {
                        var14.n5(com.aspose.slides.internal.h2.j5.n5(0.0));
                     }
                  }
               }
            } else {
               int var32 = 0;
               int var35 = 0;

               for (int var36 = 1; var36 <= var4; var36++) {
                  com.aspose.slides.internal.u6.m3 var38 = this.a0().n5(var36);
                  if (var38.b3() == null) {
                     var38.n5(com.aspose.slides.internal.v8.u9.n5(var38.c8));
                  }

                  var32 += var38.b3().n5() + var38.s7;
                  var35 += var38.b3().l6() + var38.s7;
               }

               if (this.y1().a3().u3(this).a6() != 9 && !com.aspose.slides.internal.v6g.k5.l6(this.y1().a3().u3(this), com.aspose.slides.internal.h2.t1.class)) {
                  int var37 = this.y1().a3().u3(this).c8().l6(this);
                  var32 = q1.n5(var37, var32);
                  if (var35 < var32) {
                     var35 = var32;
                  }

                  this.a6(var32);
                  var1.l6(com.aspose.slides.internal.v8.u9.n5(var32, var35, var35));
               } else {
                  if (var6 == 0 || this.a0().n5((com.aspose.slides.internal.f2.u9)this) > var6) {
                     var6 = this.a0().n5((com.aspose.slides.internal.f2.u9)this);
                  }

                  if (var32 > var6) {
                     var6 = var32;
                  }

                  if (this.y1().s0()) {
                     var6 += this.y1().x9().n5(false);
                     var6 += this.y1().x9().l6(false);
                  }

                  this.a6(var6);
                  var1.l6(com.aspose.slides.internal.v8.u9.n5(var32, var6, var6));
               }
            }

            if (var3.l6()) {
               boolean var34 = var6 > 0;
               double var20 = 0.0;
               if (var34) {
                  var20 = var9 == 0 ? 0.0 : (double)var6 / var9;
                  if (var20 < 1.0) {
                     for (int var39 = 0; var39 < var8.size(); var39++) {
                        com.aspose.slides.internal.u6.m3 var41 = (com.aspose.slides.internal.u6.m3)var8.get_Item(var39);
                        com.aspose.slides.internal.v8.u9 var49 = var41.b3();
                        if (var49.n5() == var49.k5()) {
                           int var43 = var49.n5();
                           var41.n5(com.aspose.slides.internal.h2.j5.n5(var43, "mpt"));
                           var6 -= var43;
                           var9 -= var43;
                           var8.removeAt(var39);
                           var39--;
                        }
                     }

                     var20 = var9 == 0 ? 0.0 : (double)var6 / var9;
                  }
               }

               List$Enumerator var40 = var8.iterator();

               try {
                  while (var40.hasNext()) {
                     com.aspose.slides.internal.u6.m3 var42 = (com.aspose.slides.internal.u6.m3)var40.next();
                     boolean var50 = false;
                     com.aspose.slides.internal.v8.u9 var47 = var42.b3();
                     int var44;
                     if (var34) {
                        if (var20 > 1.0 && var5) {
                           var44 = com.aspose.slides.internal.v6g.k5.u3(var47.l6() * var20, 14);
                        } else if (var6 < var9) {
                           var44 = com.aspose.slides.internal.v6g.k5.u3(var47.l6() * var20, 14);
                           if (var44 < var47.n5()) {
                              var44 = var47.n5();
                              var50 = true;
                           }
                        } else {
                           var44 = var47.l6();
                        }
                     } else {
                        var44 = var47.l6();
                     }

                     var6 -= var44;
                     var9 -= var47.l6();
                     if (var50) {
                        var20 = var9 == 0 ? 0.0 : (double)var6 / var9;
                     }

                     int var45 = this.p3();
                     if (var45 < 0) {
                        int var51 = var1.z3();
                        if (var44 > var51 && !var5) {
                           var44 = var51;
                        }

                        var42.n5(com.aspose.slides.internal.h2.j5.n5(var44, "mpt"));
                     } else {
                        var42.n5(com.aspose.slides.internal.h2.j5.n5(var44, "mpt"));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
                     var40.dispose();
                  }
               }
            }

            this.m3 = new a6(this.y1());
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   protected j8 b3() {
      if (this.p8 == null) {
         this.p8 = new h2(this, 0);
      }

      return this.p8;
   }

   public final void n5(com.aspose.slides.internal.u6.m3 var1, com.aspose.slides.internal.a0.t2 var2, int var3) {
      this.n5(var2);
      if (this.s3 == null) {
         this.s3 = new List<>();
      }

      this.s3.addItem(new y4$n5(var1, var2, var3));
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      this.c4();
      if (var2.a0() != 0) {
         this.n5(0.0, com.aspose.slides.internal.v8.u9.n5(var2.a0()));
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.y1().p3().k5, k7.class) && com.aspose.slides.internal.v6g.k5.l6(this.y1().p3().u3, k7.class)) {
         int var9;
         if (this.y1().a3().u3(this).a6() == 9) {
            var9 = this.a0().n5((com.aspose.slides.internal.f2.u9)this);
            var9 += this.y1().x9().n5(false);
            var9 += this.y1().x9().l6(false);
         } else {
            var9 = this.c8();
         }

         int var4 = (this.a6() - var9) / 2;
         if (var4 < 0) {
            var4 = 0;
         }

         j5 var5 = com.aspose.slides.internal.h2.j5.n5((double)(var4));
         y2 var6 = (y2)this.y1().p3().h0;
         var6.n5(this.y1().p3().k5, var5);
         var6 = (y2)this.y1().p3().c8;
         var6.n5(this.y1().p3().u3, var5);
         this.q0 = this.y1().p3().h0.l6(this);
         this.z3 = this.y1().p3().c8.l6(this);
      }

      int var10 = this.y1().p3().h0.l6(this);
      int var11 = 0;
      t1 var13 = new t1(0);
      var13.l6(this.c8());
      this.k7.l6(var10);
      this.k7.n5(var1, var13);
      var11 += this.k7.c8();
      this.t2.k5(var11);
      if (this.s3 != null) {
         com.aspose.slides.internal.r4.u3 var15 = new com.aspose.slides.internal.r4.u3<>(this.s3);

         while (var15.l6()) {
            y4$n5 var7 = (y4$n5)var15.k5();
            p6.n5(var7.l6, var7.n5.x9(), this, var7.k5, -var7.l6.d5(), var7.n5.i1().l6(this), var11);
         }

         this.s3.clear();
      }

      if (this.y1().s0()) {
         p6.n5(this.t2, this.y1().x9(), this.w1, this.r4, false, false, this);
         p6.l6(this.t2, this.y1().x9(), this.c4, this.y2, false, false, this);
      }

      p6.n5(this.t2, this.y1().x9(), this);
      p6.n5(this.t2, this.y1().x9(), this.q0, this.z3, this);
      p6.n5(this.t2, this.y1().t1(), this.y1().u6());
      p6.n5(this.t2, var2.m3(), this.y1, this.a0);
      this.d5();
      this.x9();
      this.t2 = null;
      this.y2();
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 == null) {
         this.t2 = new com.aspose.slides.internal.a0.t2();
         this.t2.x8(this.f2);
         this.u3.n5(this.t2);
         p6.n5(this.t2, this.y1().y1());
         this.t2.l6(this.c8());
         this.n5((com.aspose.slides.internal.a0.s7)this.t2);
      }

      return this.t2;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 != null) {
         this.t2.l6((com.aspose.slides.internal.a0.t2)var1);
      }
   }

   public final void n5(com.aspose.slides.internal.a0.t2 var1) {
      this.t2.n5(var1);
   }

   @Override
   public int n5(int var1, i1 var2) {
      return 0;
   }

   @Override
   public void n5(e5 var1) {
   }

   @Override
   public f2 s3() {
      return this.y1().j8();
   }

   @Override
   public f2 p8() {
      return this.y1().o5();
   }

   @Override
   public f2 f2() {
      return this.y1().y0();
   }

   public final boolean i1() {
      return this.y1().o0();
   }

   @Override
   public int n5(int var1, t9 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.u6.m3.class) && var2.s_() == this.y4()) {
         switch (var1) {
            case 5:
               return this.c8();
            case 11:
               if (this.k7 != null && this.i1() && ((com.aspose.slides.internal.u6.m3)var2).a5()) {
                  Object var3 = this.k7.n5(var2);
                  return var3 == null ? 0 : com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
               }

               return com.aspose.slides.internal.v6g.k5.u3(this.z8, 14);
            default:
               return 0;
         }
      } else {
         switch (var1) {
            case 11:
               return com.aspose.slides.internal.v6g.k5.u3(this.z8, 14);
            default:
               return super.n5(var1, var2);
         }
      }
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
      this.t2 = null;
      this.z8 = 0.0;
   }

   private y4$l6 y0() {
      return new y4$l6(this);
   }
}
