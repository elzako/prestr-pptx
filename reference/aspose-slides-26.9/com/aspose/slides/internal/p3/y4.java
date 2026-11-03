package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public abstract class y4 extends u3 implements r4 {
   protected com.aspose.slides.internal.a0.s7 s7;
   protected int x8;
   protected int n3;
   protected int y4;
   protected List<i1> e2;
   protected boolean t9;
   protected boolean z1;
   protected int t4;
   protected int q0;
   protected int z3;
   protected int m1;
   private j8 t2;
   private int k7;

   private int y1() {
      return this.k7;
   }

   private void u9(int var1) {
      this.k7 = var1;
   }

   public y4(com.aspose.slides.internal.e5.t9 var1) {
      super(var1);
      this.l6(true);
   }

   protected final com.aspose.slides.internal.a0.s7 e5() {
      return this.s7;
   }

   protected final void n5(com.aspose.slides.internal.a0.s7 var1) {
      this.s7 = var1;
   }

   public final void n5(double var1, com.aspose.slides.internal.v8.u9 var3) {
      int var4 = p6.n5(var1, var3);
      if (var4 != 0) {
         com.aspose.slides.internal.a0.t2 var5 = new com.aspose.slides.internal.a0.t2();
         var5.k5(var4);
         this.u3.l6(var5);
      }
   }

   protected final void n5(com.aspose.slides.internal.a0.l6 var1, com.aspose.slides.internal.a0.s7 var2) {
      var2.l6((com.aspose.slides.internal.a0.t2)var1);
      this.d5();
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      this.n5(var1, this.e5());
   }

   protected void d5() {
      if (this.e5() != null) {
         this.u3.l6(this.e5());
      }
   }

   protected j8 b3() {
      j8 var1 = this.t2;
      if (var1 == null) {
         f0 var2 = new f0(this, null);
         this.t2 = var2;
         var1 = var2;
      }

      return var1;
   }

   protected final int k5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)((float)var1 / this.x8)), 14);
   }

   protected final int o0() {
      int var1 = this.t4 - (this.q0 + this.z3);
      if (var1 < 0) {
         w1 var2 = com.aspose.slides.internal.p3.n3.n5(this.y4().q_().m1());
         var2.n5(this, this.y4().t9(), var1, this.y4().m_());
         var1 = 0;
      }

      this.a6(var1);
      return var1;
   }

   protected final int u3(int var1) {
      int var2 = this.t4 - (var1 + this.q0 + this.z3);
      if (var2 < 0) {
         w1 var3 = com.aspose.slides.internal.p3.n3.n5(this.y4().q_().m1());
         var3.n5(this, this.y4().t9(), var2, this.y4().m_());
         this.z3 += var2;
      }

      this.a6(var1);
      return var1;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null, null);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, Stack<y2> var3, j8 var4, y2 var5) {
      this.t4 = var1.z3();
      this.o0();
      boolean var6 = var3 != null;
      boolean var7 = !var6 || var3.size() == 0;
      List var8 = new List();
      List var9 = new List();
      if (!this.n5(var1, var9)) {
         return var9;
      }

      this.n5(var9, var1, var2);
      z1 var10 = null;
      y2 var11;
      if (var6) {
         if (var7) {
            var11 = var5;
         } else {
            var11 = (y2)var3.pop();
         }

         this.l6(var11);
      } else {
         var11 = this.q0();
      }

      while (true) {
         label214: {
            if (var11 != null) {
               t1 var12 = this.n5(var1);
               List var13;
               if (var6 && !var7) {
                  var13 = this.n5(var11, var1, var12, var2, var3, var4, var5);
                  var7 = true;
               } else {
                  if (var6) {
                     var11.t9();
                  }

                  var13 = this.n5(var11, var1, var12, var2, null, null, null);
               }

               int var14 = var12.z3();
               com.aspose.slides.internal.v8.u9 var15 = var1.f2().u9(var12.f2().n5()).h0(var12.f2().k5());
               if (var12.f2().l6() == -1 && var15.l6() == 0) {
                  var15 = var12.f2();
               }

               var1.l6(var15);
               com.aspose.slides.internal.j9.y4 var16 = com.aspose.slides.internal.v6g.k5.n5(var11, com.aspose.slides.internal.j9.y4.class);
               if (var16 != null) {
                  if (var16.i1()) {
                     boolean var17 = var16.y1().s0();
                     int var18 = var16.a0().n5();
                     int var24 = 0;
                     com.aspose.slides.internal.v8.u9 var19 = com.aspose.slides.internal.v8.u9.n5;

                     for (int var20 = 1; var20 <= var18; var20++) {
                        com.aspose.slides.internal.u6.m3 var21 = var16.a0().n5(var20);
                        com.aspose.slides.internal.v8.u9 var22 = var21.b3();
                        if (var22 != null) {
                           var19 = var19.n5(var22);
                        }

                        if (var17) {
                           int var23 = 0;
                           var23 += var21.x9().n5(false);
                           var23 += var21.x9().n5(false, com.aspose.slides.internal.f2.x8.n5());
                           var23 += var21.x9().l6(false);
                           var23 += var21.x9().l6(false, com.aspose.slides.internal.f2.x8.n5());
                           var19 = var19.l6(var23);
                        } else {
                           var19 = var19.l6(var21.s7 / 2);
                        }
                     }

                     var14 = var19.k5();
                     com.aspose.slides.internal.h2.t1 var31 = com.aspose.slides.internal.v6g.k5.n5(
                        var16.y1().a3().u3(this), com.aspose.slides.internal.h2.t1.class
                     );
                     if (var31 != null) {
                        y2 var32 = com.aspose.slides.internal.v6g.k5.n5(this.h0(), com.aspose.slides.internal.j9.c8.class);
                        if (var32 != null && var32.c8() == 0) {
                           var32 = var32.h0();
                        }

                        if (var32 != null && var32.c8() != 0 && var32.c8() < var19.l6() && var32.c8() > var19.n5()) {
                           var14 = var19.n5() + var16.p3();
                        }
                     }

                     if (var16.y1().s0()) {
                        var24 = var14 + var16.y1().x9().n5(false);
                        var14 = var24 + var16.y1().x9().l6(false);
                     }
                  } else {
                     com.aspose.slides.internal.u6.m3 var27 = var16.a0().n5(var16.a0().n5());
                     var14 = var16.c8() - var27.s7;
                  }

                  if (this.e2() && this.c8() < var14) {
                     this.t4 = var14;
                     this.o0();
                     var1.l6(this.t4);
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var11, com.aspose.slides.internal.x9.d2.class)) {
                  if (this.c8() < var14 && this.e2()) {
                     this.t4 = this.q0 + var14 + this.z3;
                     this.o0();
                     var1.l6(this.t4);
                  }
               } else if (this.t4 < var14 && this.e2()) {
                  this.t4 = var14;
                  this.o0();
                  var1.l6(this.t4);
               }

               if (var8.size() == 0) {
                  var1.l6(var12.u9());
               }

               if (var13 == null || var13.size() == 0) {
                  break label214;
               }

               if (var8.size() != 0 && !com.aspose.slides.internal.p3.q0.k5(var13)) {
                  boolean var28 = true;
                  if (var13.size() == 1) {
                     f2 var29 = com.aspose.slides.internal.v6g.k5.n5(var13.get_Item(0), f2.class);
                     if (var29 != null && var29.z1() == 0) {
                        t2 var30 = com.aspose.slides.internal.v6g.k5.n5(var29.m3(), t2.class);
                        if (var30 != null && var30.a0()) {
                           var28 = false;
                        }
                     }
                  }

                  if (var28) {
                     this.n5(var8, var1, var12);
                  }
               }

               if (var13.size() == 1 && com.aspose.slides.internal.p3.q0.k5(var13)) {
                  if (!var11.m3() || this.z3()) {
                     if (var8.size() == 0) {
                        var9.addItem(this.d2());
                     }

                     y4$n5.n5(var8, var13);
                     this.n5(var8, var9);
                     return var9;
                  }

                  var10 = (z1)var13.get_Item(0);
                  var1.z1();
               } else {
                  y4$n5.n5(var8, var13);
                  if (!com.aspose.slides.internal.p3.q0.l6(var13)) {
                     var1.n5(var12.a6());
                     break label214;
                  }

                  if (!var11.m3() || this.z3()) {
                     this.n5(var8, var9);
                     return var9;
                  }

                  var10 = (z1)com.aspose.slides.internal.v3.t2.l6(var8);
                  var1.z1();
               }
            }

            if (var8.size() == 0) {
               if (var10 == null) {
                  var9.addItem(this.d2());
               }
            } else {
               this.n5(var8, var9);
            }

            this.l6(var9, var1, var2);
            if (var10 == null) {
               this.l6(var9, var1);
            } else {
               var10.n3();
               var9.addItem(var10);
            }

            var1.n5(this.v0());
            this.k5(true);
            return var9;
         }

         var11 = this.q0();
      }
   }

   protected t1 n5(t1 var1) {
      t1 var2 = new t1(0);
      var2.n5(var1);
      var2.n5(var1.q0());
      var2.l6(this.t4);
      return var2;
   }

   protected void n5(List<com.aspose.slides.internal.r4.u9> var1, t1 var2, int var3) {
      if (!this.z1) {
         this.l6(var1, var3);
         var2.l6(this.h2());
      }

      this.n5(var1, !this.z1);
      this.z1 = true;
      this.l6(var2);
   }

   protected final void l6(List<com.aspose.slides.internal.r4.u9> var1, t1 var2, int var3) {
      this.l6(var1, true);
      this.k5(var1, var3);
      var2.z1();
   }

   protected final boolean n5(t1 var1, List<com.aspose.slides.internal.r4.u9> var2) {
      if (!this.t9) {
         this.t9 = true;
         if (!var1.u3() && this.n5(var2, var1)) {
            return false;
         }
      }

      return this.t9;
   }

   private f2 a0() {
      return new f2(0, new f0(this, null), false);
   }

   private f2 d2() {
      return new f2(0, this.n5(new j8(this)), true);
   }

   private o0 h0(int var1) {
      return new o0(0, var1, false, new f0(this, null), false);
   }

   private e5 n5(int var1, u9 var2, boolean var3) {
      return new e5(var1, 0, 0, var2, new f0(this, null), var3);
   }

   protected List<com.aspose.slides.internal.r4.u9> n5(y2 var1, t1 var2, t1 var3, int var4, Stack<y2> var5, j8 var6, y2 var7) {
      if (var1 == this.a6.get_Item(0)) {
         var3.n5(16);
      }

      return var5 == null ? var1.n5(var3, var4) : var1.n5(var3, var4, var5, var6, var7);
   }

   protected final void n5(List<com.aspose.slides.internal.r4.u9> var1, t1 var2, t1 var3) {
      if (!this.v4() && !var2.s7() && !var3.x8()) {
         v0 var7 = (v0)com.aspose.slides.internal.v3.t2.n5(var1);
         if (!var7.x_() && !com.aspose.slides.internal.p3.q0.u3(var1)) {
            var1.addItem(new z1(new j8(this), 0, 9, var2));
         }
      } else {
         s3 var4 = this.a5();
         var4 = var4.n5(var2.a6());
         var2.h0();
         var4 = var4.n5(var3.u9());
         var3.c8();
         var1.addItem(new z1(new j8(this), var4.k5(), var4.l6(), var2));
      }
   }

   @Override
   public int n5(int var1, i1 var2) {
      j8 var3 = var2.k7().k5();
      if (var3 == null && var2.x_()) {
         if (((e5)var2).u9() == com.aspose.slides.internal.p3.u9.l6) {
            this.n3 += var1;
         } else {
            this.y4 += var1;
         }

         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, y4$l6.class)) {
         y4$l6 var8 = (y4$l6)var3;
         if (var2.x_()) {
            com.aspose.slides.internal.r4.u3 var10 = new com.aspose.slides.internal.r4.u3<>(this.e2, var8.n5());
            int var6 = 0;

            while (var10.u9() <= var8.l6()) {
               i1 var7 = (i1)var10.k5();
               if (var7.x_()) {
                  var6 += ((r4)var7.m3()).n5(var1 - var6, var7);
               }
            }

            return var6 > 0 ? this.x8 * this.k5(var6) : -this.x8 * this.k5(-var6);
         } else {
            o0 var9 = (o0)this.e2.get_Item(var8.l6());
            return var9.z1() > 0 ? ((r4)var9.m3()).n5(var9.z1(), var9) : var1;
         }
      } else if (var3 != null && var3.u3() != this) {
         f0 var4 = (f0)var2.k7();
         var2.n5(var3);
         int var5 = ((r4)var2.m3()).n5(var1, var2);
         var2.n5(var4);
         return var5;
      } else {
         return 0;
      }
   }

   @Override
   public void n5(e5 var1) {
      j8 var2 = var1.k7().k5();
      if (var2 != null && var2.u3() != this) {
         f0 var3 = (f0)var1.k7();
         var1.n5(var2);
         ((r4)var1.m3()).n5(var1);
         var1.n5(var3);
      } else if (var1.u9() == com.aspose.slides.internal.p3.u9.l6) {
         this.n3 = 0;
      } else {
         this.y4 = 0;
      }
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1);
      i1 var4 = null;
      i1 var5 = null;
      List var6 = new List();
      List var7 = new List();
      int var8 = 0;

      while (var3.l6()) {
         i1 var9 = (i1)var3.k5();
         j8 var10 = var9.k7().k5();
         if (var10 != null) {
            var9.n5(var10);
         } else {
            var9.n5(new j8(this));
         }
      }

      for (com.aspose.slides.internal.r4.u3 var32 = new com.aspose.slides.internal.r4.u3(var1); var32.l6(); var5 = var4) {
         var4 = (i1)var32.k5();
         if (var5 != null && var5.m3() != var4.m3()) {
            r4 var11 = (r4)var5.m3();
            r4 var12 = (r4)var4.m3();
            boolean var13 = false;
            if (var11 != this) {
               List var14 = var11.n5(var1.getRange(var8, var32.h0() - var8 + 1), var2);
               List$Enumerator var15 = var14.iterator();

               try {
                  while (var15.hasNext()) {
                     com.aspose.slides.internal.r4.u9 var16 = (com.aspose.slides.internal.r4.u9)var15.next();
                     var6.addItem(var16);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                     var15.dispose();
                  }
               }

               var13 = true;
            }

            var8 = var32.h0();
            if (!var13 || !this.v4() && !var11.t1() && !var12.u6()) {
               if (var13 && !com.aspose.slides.internal.v3.t2.<i1>n5(var6).x_()) {
                  var6.addItem(this.h0(1000));
               }
            } else {
               var6.addItem(this.h0(1000));
            }
         }
      }

      if (var4 != null) {
         y2 var33 = var4.m3();
         if (var33 != this) {
            List var35 = var33.n5(var1.getRange(var8, var1.size() - var8 + 1), var2);
            List$Enumerator var37 = var35.iterator();

            try {
               while (var37.hasNext()) {
                  com.aspose.slides.internal.r4.u9 var40 = (com.aspose.slides.internal.r4.u9)var37.next();
                  var6.addItem(var40);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                  var37.dispose();
               }
            }
         } else if (var6.size() != 0) {
            com.aspose.slides.internal.v3.t2.l6(var6);
         }
      }

      boolean var34 = true;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.h0.class)) {
         var34 = this.f0().z3();
      }

      if (this.n3 != 0) {
         if (!var34) {
            var7.addItem(this.a0());
            var7.addItem(this.h0(1000));
         }

         var7.addItem(this.n5(this.n3, com.aspose.slides.internal.p3.u9.l6, false));
      }

      List$Enumerator var36 = var7.iterator();

      try {
         while (var36.hasNext()) {
            i1 var38 = (i1)var36.next();
            var38.n5(new f0(this, var38.k7()));
            var7.addItem(var38);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var36, IDisposable.class)) {
            var36.dispose();
         }
      }

      boolean var39 = true;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.h0.class)) {
         var39 = this.a3().z3();
      }

      if (this.y4 != 0) {
         if (!var39) {
            var7.addItem(this.h0(1000));
         }

         var7.addItem(this.n5(this.y4, com.aspose.slides.internal.p3.u9.k5, var39));
         if (!var39) {
            var7.addItem(this.a0());
         }
      }

      return var7;
   }

   protected final s3 z7() {
      s3 var1 = s3.n5;
      if (com.aspose.slides.internal.v6g.k5.l6(this.h0(), r4.class)) {
         var1 = ((r4)this.h0()).a5();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.h0(), com.aspose.slides.internal.x9.k7.class) && ((com.aspose.slides.internal.x9.k7)this.h0()).p8()) {
         var1 = s3.l6;
      }

      return var1;
   }

   @Override
   public final boolean v4() {
      return !this.a5().n5();
   }

   @Override
   public final boolean u6() {
      return !this.h2().n5();
   }

   @Override
   public final boolean t1() {
      return !this.v0().n5();
   }

   @Override
   public s3 a5() {
      s3 var1 = s3.n5(this.s3());
      return var1.n5(this.z7());
   }

   public s3 h2() {
      return s3.n5(this.p8());
   }

   public s3 v0() {
      return s3.n5(this.f2());
   }

   public com.aspose.slides.internal.h2.f2 s3() {
      throw new InvalidOperationException();
   }

   public com.aspose.slides.internal.h2.f2 p8() {
      throw new InvalidOperationException();
   }

   public com.aspose.slides.internal.h2.f2 f2() {
      throw new InvalidOperationException();
   }

   protected final void l6(t1 var1) {
      com.aspose.slides.internal.h2.t2 var2 = this.i1();
      if (var2 != null) {
         if (var2.k5(false) > 0) {
            var1.l6(new e2(this.b3(), var2.n5(0).k5(), v3.n5, false, false, this));
         }

         if (var2.k5(false, this) > 0) {
            var1.l6(new p3(this.b3(), var2.a6(0), v3.n5, false, false, this));
         }

         if (var2.u3(false) > 0) {
            var1.n5(new e2(this.b3(), var2.n5(1).k5(), v3.l6, false, false, this));
         }

         if (var2.u3(false, this) > 0) {
            var1.n5(new p3(this.b3(), var2.a6(1), v3.l6, false, false, this));
         }
      }
   }

   private com.aspose.slides.internal.h2.t2 i1() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.h0.class)) {
         return ((com.aspose.slides.internal.v4.h0)this.k5).b3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.c8.class)) {
         return ((com.aspose.slides.internal.v4.c8)this.k5).b3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.m1.class)) {
         return ((com.aspose.slides.internal.v4.m1)this.k5).b3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.k7.class)) {
         return ((com.aspose.slides.internal.v4.k7)this.k5).b3();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u6.z1.class) ? ((com.aspose.slides.internal.u6.z1)this.k5).x9() : null;
      }
   }

   protected final com.aspose.slides.internal.h2.f0 f0() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.h0.class)) {
         return ((com.aspose.slides.internal.v4.h0)this.k5).e5().a6;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.c8.class)) {
         return ((com.aspose.slides.internal.v4.c8)this.k5).e5().a6;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.m1.class)) {
         return ((com.aspose.slides.internal.v4.m1)this.k5).e5().a6;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.k7.class)) {
         return ((com.aspose.slides.internal.v4.k7)this.k5).e5().a6;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u6.z1.class)
            ? ((com.aspose.slides.internal.u6.z1)this.k5).p3().a6
            : null;
      }
   }

   protected final com.aspose.slides.internal.h2.f0 a3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.h0.class)) {
         return ((com.aspose.slides.internal.v4.h0)this.k5).e5().u9;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.c8.class)) {
         return ((com.aspose.slides.internal.v4.c8)this.k5).e5().u9;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.m1.class)) {
         return ((com.aspose.slides.internal.v4.m1)this.k5).e5().u9;
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.k7.class)) {
         return ((com.aspose.slides.internal.v4.k7)this.k5).e5().u9;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.u6.z1.class)
            ? ((com.aspose.slides.internal.u6.z1)this.k5).p3().u9
            : null;
      }
   }

   protected final void n5(List<com.aspose.slides.internal.r4.u9> var1, boolean var2) {
      com.aspose.slides.internal.h2.t2 var3 = this.i1();
      if (var3 != null) {
         if (var3.k5(false) > 0) {
            var1.addItem(new e2(this.b3(), var3.n5(0).k5(), v3.n5, var2, false, this));
         }

         if (var3.k5(false, this) > 0) {
            var1.addItem(new p3(this.b3(), var3.a6(0), v3.n5, var2, false, this));
         }
      }
   }

   protected final void l6(List<com.aspose.slides.internal.r4.u9> var1, boolean var2) {
      com.aspose.slides.internal.h2.t2 var3 = this.i1();
      if (var3 != null) {
         if (var3.u3(false, this) > 0) {
            var1.addItem(new p3(this.b3(), var3.a6(1), v3.l6, false, var2, this));
         }

         if (var3.u3(false) > 0) {
            var1.addItem(new e2(this.b3(), var3.n5(1).k5(), v3.l6, false, var2, this));
         }
      }
   }

   protected final boolean n5(List<com.aspose.slides.internal.r4.u9> var1, t1 var2) {
      int var3 = this.x9();
      if (var3 != 104 && var3 != 28 && var3 != 44 && var3 != 100) {
         return false;
      }

      var1.addItem(new z1(this.b3(), 0, -1000, var3, var2));
      return true;
   }

   private int x9() {
      int var1 = 9;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.h2.d2.class)) {
         var1 = ((com.aspose.slides.internal.h2.d2)this.k5).t1();
      }

      y2 var2 = this.q0();
      y4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, y4.class);
      if (var3 != null) {
         var1 = com.aspose.slides.internal.v3.n5.n5(var1, var3.x9());
      }

      return var1;
   }

   protected final boolean l6(List<com.aspose.slides.internal.r4.u9> var1, t1 var2) {
      int var3 = -1;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.h2.d2.class)) {
         var3 = ((com.aspose.slides.internal.h2.d2)this.k5).u6();
      }

      if (var3 != 104 && var3 != 28 && var3 != 44 && var3 != 100) {
         return false;
      }

      var1.addItem(new z1(this.b3(), 0, -1000, var3, var2));
      return true;
   }

   protected final void l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.h2.f0 var3 = this.f0();
      if (var3 != null && (var3.l6(this).c8().l6(this) != 0 || var3.k5(this).c8().l6(this) != 0)) {
         var1.addItem(new g7(this.b3(), var3, v3.n5, true, false, this));
      }
   }

   protected final void k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.h2.f0 var3 = this.a3();
      if (var3 != null && (var3.l6(this).c8().l6(this) != 0 || var3.k5(this).c8().l6(this) != 0)) {
         var1.addItem(new g7(this.b3(), var3, v3.l6, false, true, this));
      }
   }

   protected final void n5(List<com.aspose.slides.internal.r4.u9> var1, List<com.aspose.slides.internal.r4.u9> var2) {
      this.n5(var1, var2, false);
   }

   protected final void n5(List<com.aspose.slides.internal.r4.u9> var1, List<com.aspose.slides.internal.r4.u9> var2, boolean var3) {
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.r4.u9 var5 = (com.aspose.slides.internal.r4.u9)var4.next();
            if (var5.k5()) {
               this.n5(var5.n5(), var2, var3);
            } else if (var5.u3()) {
               this.n5(var5.l6(), var2, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   protected final void n5(v0 var1, List<com.aspose.slides.internal.r4.u9> var2, boolean var3) {
      if (var3 || var1.m3() != this) {
         var1.n5(this.n5(new f0(this, var1.k7())));
      }

      var2.addItem(var1);
   }

   public int p3() {
      return this.q0 + this.z3;
   }

   @Override
   public int c8() {
      return this.y1();
   }

   protected void a6(int var1) {
      this.u9(var1);
   }

   @Override
   public int t2() {
      return -1;
   }

   @Override
   public void t9() {
      super.t9();
      this.t9 = false;
      this.z1 = false;
   }
}
