package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class t2 extends y4 implements c4 {
   private com.aspose.slides.internal.a0.x8 t2;
   private com.aspose.slides.internal.a0.t2 k7;
   private com.aspose.slides.internal.h2.h0 m3;
   private com.aspose.slides.internal.f2.n5 z8;
   private com.aspose.slides.internal.a0.e2 j5;
   private com.aspose.slides.internal.f2.k5 w1;
   private com.aspose.slides.internal.f2.k5 r4;
   private int c4;
   private boolean y2 = true;
   private boolean y1 = false;
   private boolean a0;
   private boolean d2;
   private boolean d5;
   private boolean s3;
   private com.aspose.slides.internal.v8.u9 p8;
   private com.aspose.slides.internal.v8.u9 f2;
   private double i1;
   private double e5;
   private boolean b3;
   private List<j8> o0 = new List<>();
   private int z7 = 0;
   private boolean v4 = false;

   public t2(com.aspose.slides.internal.v4.c8 var1) {
      super(var1);
      this.b3 = var1.v8();
   }

   public final com.aspose.slides.internal.h2.h0 y1() {
      return this.m3;
   }

   @Override
   public void t4() {
      this.m3 = this.i1().i1();
      this.q0 = this.i1().e5().h0.l6(this);
      this.m1 = this.z3 = this.i1().e5().c8.l6(this);
      if (this.j8()) {
         this.r4 = this.i1().f0().u3(this).c8();
         this.w1 = this.i1().z7().u3(this).c8();
      } else {
         this.r4 = this.i1().z7().u3(this).c8();
         this.w1 = this.i1().f0().u3(this).c8();
      }

      this.n3 = this.i1().e5().a6.z1().u3(this).c8().l6(this);
      this.y4 = this.i1().e5().u9.z1().u3(this).c8().l6(this);
      int var1 = 0;
      if (this.r4.a6() != 9) {
         var1 = this.r4.l6(this);
      }

      if (var1 == 0 && this.n3 != 0 && this.n3 + this.y4 == 0 && this.q0 == 0 && this.z3 == 0) {
         this.i1().e5().u9.z1().u3(this).c8().n5(0);
         this.i1().e5().a6.z1().u3(this).c8().n5(0);
         this.n3 = 0;
         this.y4 = 0;
      }
   }

   private void x9() {
      this.a0 = false;
      this.d2 = false;
      this.d5 = false;
      this.s3 = false;
      this.p8 = null;
      this.f2 = null;
   }

   private boolean y0() {
      int var1 = this.i1().a3();
      return var1 == 57 || var1 == 42 || this.i1().v3() != null;
   }

   private int j9() {
      byte var1 = 0;
      return var1 + this.i1().b3().u9(false, this);
   }

   private boolean z6() {
      return this.m3.n5 == 1 || this.m3.n5 == 51 || this.m3.n5 == 206 || this.m3.n5 == 215;
   }

   public final boolean a0() {
      return this.m3.n5 == 1;
   }

   private boolean e9() {
      return this.m3.n5 == 51;
   }

   public final boolean d2() {
      return this.b3;
   }

   @Override
   public int t2() {
      return this.y2 ? -1 : this.c4;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null, null);
   }

   @Override
   protected t1 n5(t1 var1) {
      t1 var2 = new t1(0);
      var2.n5(var1.q0().l6(com.aspose.slides.internal.v8.u9.n5(this.z8.l6)));
      var2.l6(this.z8.n5);
      var2.n5(this.i1().o5());
      return var2;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, Stack<y2> var3, j8 var4, y2 var5) {
      this.x9();
      if (this.z6()) {
         return this.u3(var1);
      }

      boolean var6 = var3 != null;
      boolean var7 = !var6 || var3.size() == 0;
      this.k5(var1);
      List var8 = new List();
      List var9 = new List();
      if (!this.n5(var1, var9)) {
         return var9;
      }

      this.n5(var9, var1, var2);
      if (this.y2 && this.y1) {
         y2 var10 = null;
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

         while (var11 != null) {
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
               var1.l6(var12.f2().l6(this.p3()));
            }

            if (var8.size() == 0 && var12.x8()) {
               var1.l6(var12.u9());
               var12.c8();
            }

            if (var13.size() == 1 && com.aspose.slides.internal.p3.q0.k5(var13)) {
               var8.addRange(var13);
               this.n5(var8, var9);
               return var9;
            }

            if (var10 != null) {
               this.n5(var8, var1, var12);
            }

            if (var13.size() == 1
               && var8.size() > 0
               && com.aspose.slides.internal.p3.q0.l6(var8)
               && com.aspose.slides.internal.v6g.k5.l6(var13.get_Item(0), f2.class)
               && ((f2)var13.get_Item(0)).z1() == 0) {
               var8.insertItem(var8.size() - 1, var13.get_Item(0));
            } else {
               var8.addRange(var13);
            }

            if (var13.size() != 0) {
               var1.n5(var12.a6());
               var12.t2();
               var10 = var11;
               var11 = this.q0();
            }
         }

         this.n5(var8, var9);
      } else {
         var9.addItem(this.o5());
         var1.l6(com.aspose.slides.internal.v8.u9.n5(-1));
      }

      this.l6(var9, var1, var2);
      this.l6(var9, var1);
      var1.n5(this.v0());
      this.k5(true);
      if (this.i1().s0()) {
         if (var9.size() > 2
            && com.aspose.slides.internal.v6g.k5.l6(var9.get_Item(0), g7.class)
            && com.aspose.slides.internal.v6g.k5.l6(var9.get_Item(1), g7.class)
            && ((g7)var9.get_Item(1)).s7().l6() != 13440) {
            var9.removeAt(1);
         }

         if (var9.size() > 2
            && com.aspose.slides.internal.v6g.k5.l6(var9.get_Item(var9.size() - 1), g7.class)
            && com.aspose.slides.internal.v6g.k5.l6(var9.get_Item(var9.size() - 2), g7.class)
            && ((g7)var9.get_Item(var9.size() - 2)).s7().l6() != 13440) {
            var9.removeAt(var9.size() - 2);
         }
      }

      return var9;
   }

   private void k5(t1 var1) {
      this.y2 = false;
      int var2 = var1.q0().l6();
      com.aspose.slides.internal.v4.c8 var3 = this.i1();
      int var10;
      if (this.r4.a6() == 9 || !this.r4.k5() && this.l6() <= 0) {
         com.aspose.slides.internal.f2.k5 var4 = this.i1().z7().n5(3072).c8();
         if (var4.a6() == 9) {
            var10 = var2;
            this.y2 = true;
            this.y1 = var3.p3() == 0;
         } else {
            var10 = var4.l6(this);
            var10 += this.j9();
         }
      } else {
         var10 = this.r4.l6(this);
         var10 += this.j9();
      }

      this.c4 = var10 - this.j9();
      this.t4 = var1.z3();
      if (this.w1.a6() == 9) {
         com.aspose.slides.internal.f2.k5 var7 = this.i1().f0().n5(3072).c8();
         if (var7.a6() == 9) {
            this.o0();
         } else {
            this.u3(var7.l6(this));
         }
      } else {
         int var8 = this.w1.l6(this);
         this.u3(var8);
      }

      this.i1 = 0.0;
      this.e5 = 0.0;
      this.i1 = this.i1 + var3.e5().h0.l6(this);
      this.e5 = this.e5 + var3.b3().k5(false);
      this.e5 = this.e5 + var3.b3().k5(false, this);
      this.s0();
      int var9 = this.t4 - this.p3();
      if (this.c8() > var9) {
         w1 var6 = com.aspose.slides.internal.p3.n3.n5(var3.q_().m1());
         var6.n5(this, var3.t9(), this.c8(), var1.z3(), var3.m_());
      }
   }

   private f2 o5() {
      com.aspose.slides.internal.v8.u9 var1 = com.aspose.slides.internal.v8.u9.n5(this.z8.n5);
      t2$n5 var2 = new t2$n5(this, var1);
      var2.n5(this.z8.l6, this.y2);
      boolean var3 = var2.n3();
      if (this.y2) {
         int var4 = var2.u3.y4;
         if (this.j8()) {
            this.a6(var4);
         } else {
            this.c4 = var4;
         }

         this.s0();
      }

      t2$l6 var8 = new t2$l6(this, var2);
      f2 var5 = new f2(this.c4, this.n5(var8), false);
      if (var3) {
         w1 var6 = com.aspose.slides.internal.p3.n3.n5(this.i1().q_().m1());
         boolean var7 = this.i1().a3() != 42;
         var6.n5(this, this.i1().t9(), var2.y4(), this.y0(), var7, this.i1().m_());
      }

      return var5;
   }

   private boolean j8() {
      return this.i1().p3() % 180 != 0;
   }

   @Override
   public boolean z1() {
      return true;
   }

   private List<com.aspose.slides.internal.r4.u9> u3(t1 var1) {
      this.y2 = false;
      boolean var2 = this.j8();
      com.aspose.slides.internal.o9b.j5 var3 = this.v8().k5();
      t2 var4 = this.k5();
      com.aspose.slides.internal.f2.u9 var5;
      com.aspose.slides.internal.f2.u9 var6;
      if (var4 != null && var4.z8 != null) {
         var5 = new com.aspose.slides.internal.f2.t2(null, 5, var4.z8.n5);
         var6 = new com.aspose.slides.internal.f2.t2(null, 6, var4.z8.l6);
      } else {
         var5 = this;
         var6 = this;
      }

      int var16;
      if (this.r4.a6() == 9 || !this.r4.k5() && var4.u9() <= 0) {
         int var17 = 0;
         if (this.m3.u3.a6() != 9) {
            int var8;
            if (this.e9()) {
               var8 = com.aspose.slides.internal.v6g.k5.u3(this.w1().l6().k5(), 13);
            } else {
               var8 = var1.q0().l6();
            }

            var17 = var8;
            var16 = var17 - var3.l6();
            if (this.m3.u3.a6() != 9) {
               var16 -= this.m3.u3.l6(var6);
               if (var16 < 0) {
                  var16 = 0;
               }
            } else if (var16 < 0) {
               var16 = 0;
            }
         } else {
            var16 = var1.q0().l6();
            if (!var2) {
               this.y2 = true;
            }
         }
      } else {
         var16 = this.r4.l6(var6);
         var16 += this.j9();
      }

      int var9;
      if (this.w1.a6() == 9) {
         int var19;
         if (this.e9()) {
            var19 = com.aspose.slides.internal.v6g.k5.u3(this.w1().l6().s7(), 13);
         } else {
            var19 = var1.z3();
         }

         var9 = var19;
         if (this.m3.a6.a6() != 9) {
            var9 -= this.m3.a6.l6(var5);
         }

         if (this.m3.k5.a6() != 9) {
            var9 -= this.m3.k5.l6(var5);
            if (var9 < 0) {
               var9 = 0;
            }
         } else {
            if (var9 < 0) {
               var9 = 0;
            }

            if (var2) {
               this.y2 = true;
            }
         }
      } else {
         var9 = this.w1.l6(var5);
         var9 += this.p3();
      }

      this.c4 = var16 - this.j9();
      this.a6(var9 - this.p3());
      this.i1 = 0.0;
      this.e5 = 0.0;
      this.s0();
      com.aspose.slides.internal.v8.u9 var20 = com.aspose.slides.internal.v8.u9.n5(this.z8.n5);
      t2$n5 var10 = new t2$n5(this, var20);
      var10.n5(this.y2 ? 0 : this.z8.l6, this.y2);
      boolean var11 = var10.n3();
      if (this.y2) {
         int var12 = var10.u3.y4;
         if (var2) {
            this.a6(var12);
         } else {
            this.c4 = var12;
         }

         this.s0();
      }

      List var22 = new List();
      if (!var10.t2()) {
         t2$l6 var13 = new t2$l6(this, var10);
         if (var4 != null && this.m3.n5 == 1) {
            var4.o0.addItem(var13);
         }

         var22.addItem(new f2(0, this.n5(var13), false));
         if (!this.y2 & var11) {
            w1 var14 = com.aspose.slides.internal.p3.n3.n5(this.i1().q_().m1());
            boolean var15 = this.i1().a3() != 42;
            var14.n5(this, this.i1().t9(), var10.y4(), this.y0(), var15, this.i1().m_());
         }
      }

      this.k5(true);
      return var22;
   }

   private void w2() {
      t2 var1 = this.k5();
      if (var1 != null) {
         this.v4 = true;
         com.aspose.slides.internal.e5.t9 var2 = this.y4();
         if (var2 != null) {
            List$Enumerator var3 = var1.o0.iterator();

            try {
               while (var3.hasNext()) {
                  j8 var4 = (j8)var3.next();
                  t2 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.u3(), t2.class);
                  if (var5 != null) {
                     com.aspose.slides.internal.e5.t9 var6 = var5.y4();
                     if (var6 != null && var6 == var2) {
                        var5.v4 = true;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }
   }

   private void s0() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1((float)this.i1, (float)this.e5, this.c8(), this.c4);
      this.z8 = new com.aspose.slides.internal.f2.n5(0, 0);
      this.j5 = com.aspose.slides.internal.a0.e2.n5(this.i1().p3(), this.i1().o5(), var1.y4(), this.z8);
   }

   private com.aspose.slides.internal.o9b.j5 v8() {
      t2 var1 = this.k5();
      com.aspose.slides.internal.f2.u9 var2;
      com.aspose.slides.internal.f2.u9 var3;
      if (var1 != null && var1.z8 != null) {
         var2 = new com.aspose.slides.internal.f2.t2(null, 5, var1.z8.n5);
         var3 = new com.aspose.slides.internal.f2.t2(null, 6, var1.z8.l6);
      } else {
         var2 = this;
         var3 = this;
      }

      int var4 = 0;
      int var5 = 0;
      if (this.m3.a6.a6() != 9) {
         var4 = this.m3.a6.l6(var2);
      } else if (this.m3.k5.a6() != 9) {
         int var6 = 0;
         if (this.w1.a6() != 9) {
            var6 = this.w1.l6(var2);
         } else {
            var6 = this.z7;
         }

         if (var1 != null) {
            if (this.y1().n5 == 1) {
               var4 = var1.z8.n5 - this.m3.k5.l6(var2) - var6;
            }
         } else {
            var4 = this.h0().c8() - this.m3.k5.l6(var2) - var6;
         }
      }

      if (this.m3.l6.a6() != 9) {
         var5 = this.m3.l6.l6(var3);
      } else if (this.m3.u3.a6() != 9 && this.r4.a6() != 9) {
         var5 = var1.z8.l6 - this.m3.u3.l6(var3) - this.r4.l6(var3);
      }

      return new com.aspose.slides.internal.o9b.j5(var4, var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      if (this.v4 && this.m3.n5 == 1) {
         while (var1.l6()) {
            var1.k5();
         }
      } else {
         if (var2.a0() > 0) {
            this.n5(0.0, com.aspose.slides.internal.v8.u9.n5(var2.a0()));
         }

         y2 var3 = null;
         t1 var4 = new t1(0);
         var4.n5(var2.m3());
         if (var2.d2() > 0) {
            var4.c8(var2.d2());
         }

         t2$l6 var5 = null;
         List var6 = new List();
         j8 var7 = null;
         j8 var8 = null;

         while (var1.l6()) {
            j8 var9 = (j8)var1.k5();
            if (var9.a6() >= 0) {
               if (var7 == null) {
                  var7 = var9;
               }

               var8 = var9;
            }

            j8 var10 = var9;
            if (com.aspose.slides.internal.v6g.k5.l6(var9, f0.class)) {
               var10 = var9.k5();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var9, t2$l6.class)) {
               if (var5 != null) {
                  throw new InvalidOperationException("Only one BlockContainerPosition allowed");
               }

               var5 = (t2$l6)var9;
            } else if (var10 != null && (var10.u3() != this || com.aspose.slides.internal.v6g.k5.l6(var10, y4$l6.class))) {
               var6.addItem(var10);
               var3 = var10.u3();
            }
         }

         this.c4();
         this.n5(true, this.l6(var7), this.k5(var8));
         if (var5 == null) {
            w2 var11 = new w2(new com.aspose.slides.internal.r4.u3(var6));

            y2 var12;
            while ((var12 = var11.u9()) != null) {
               n5(var2, var4, var12, var3, var11);
            }

            if (this.o0.size() > 0) {
               List var18 = new List();
               List$Enumerator var13 = this.o0.iterator();

               try {
                  while (var13.hasNext()) {
                     j8 var14 = (j8)var13.next();
                     var18.addItem(var14);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                     var13.dispose();
                  }
               }

               this.o0.clear();
               var11 = new w2(new com.aspose.slides.internal.r4.u3(var18));

               while ((var12 = var11.u9()) != null) {
                  var12.n5(this);
                  n5(var2, var4, var12, var3, var11);
               }
            }
         } else {
            var5.n5().e2();
         }

         this.n5(false, this.l6(var7), this.k5(var8));
         if (this.p8 == null && this.f2 == null) {
            int var19 = this.i1().e5().n5.u3();
            int var22 = this.i1().e5().l6.u3();
            if (var19 < 0 || this.a0() || this.i1().s0()) {
               this.p8 = com.aspose.slides.internal.v8.u9.n5(var19);
            }

            if (var22 < 0 || this.a0() || this.i1().s0()) {
               this.f2 = com.aspose.slides.internal.v8.u9.n5(var22);
            }
         }

         p6.n5(this.t2, var2.m3(), this.p8, this.f2);
         this.d5();
         this.t2 = null;
         this.k7 = null;
         this.x9();
         this.y2();
         this.w2();
      }
   }

   private static void n5(t1 var0, t1 var1, y2 var2, y2 var3, w2<j8> var4) {
      var1.n5(128, var0.k5() && var2 == var3);
      var1.n5(var0.q0());
      var2.n5(var4, var1);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 == null) {
         boolean var2 = this.j8();
         boolean var3 = this.y2 && !var2;
         int var4 = this.i1().d2();
         this.t2 = new com.aspose.slides.internal.a0.x8(var3, this);
         this.t2.n5(this.w1);
         this.t2.n5(32, true);
         if (var4 >= 0) {
            this.t2.u3(var4);
         }

         this.t2.l6(this.c8());
         if (var3) {
            this.t2.k5(0);
         } else {
            this.t2.k5(this.c4);
         }

         this.n5(this.t2);
         p6.n5(this.t2, this.i1().y1());
         p6.n5(this.t2, this.i1().j8());
         p6.n5(this.t2, this.i1().o0(), this);
         p6.k5(this.t2, this.i1().w2());
         p6.n5(this.t2, this.i1().b3(), this.a0, this.d2, false, false, this);
         p6.l6(this.t2, this.i1().b3(), this.d5, this.s3, false, false, this);
         int var5 = this.q0;
         int var6 = this.z3;
         if (com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().k5, com.aspose.slides.internal.h2.k7.class)
            && com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().u3, com.aspose.slides.internal.h2.k7.class)) {
            int var7 = this.c8();
            int var8 = (this.a6() - var7) / 2;
            if (var8 < 0) {
               var8 = 0;
            }

            com.aspose.slides.internal.h2.j5 var9 = com.aspose.slides.internal.h2.j5.n5((double)(var8));
            com.aspose.slides.internal.b3.y2 var10 = (com.aspose.slides.internal.b3.y2)this.i1().e5().h0;
            var10.n5(this.i1().e5().k5, var9);
            var10 = (com.aspose.slides.internal.b3.y2)this.i1().e5().c8;
            var10.n5(this.i1().e5().u3, var9);
            if (this.m3.n5 != 1 && this.m3.n5 != 51 && this.m3.n5 != 206 && this.m3.n5 != 215) {
               this.q0 = this.i1().e5().h0.l6(this);
               this.z3 = this.i1().e5().c8.l6(this);
            } else {
               this.t2.n5(this.i1().e5().h0.l6(this), false, false);
            }
         }

         if (this.m3.n5 == 110) {
            if (this.m3.a6.a6() != 9) {
               this.t2.y4 = this.m3.a6.l6(this);
            }

            if (this.m3.k5.a6() != 9) {
               this.t2.e2 = this.m3.k5.l6(this);
            }

            if (this.m3.l6.a6() != 9) {
               this.t2.t9 = this.m3.l6.l6(this);
            }

            if (this.m3.u3.a6() != 9) {
               this.t2.z1 = this.m3.u3.l6(this);
            }
         }

         p6.n5(this.t2, this.i1().b3(), this.q0, this.z3, this);
         this.t2.n3(this.m1);
         this.t2.n5(this.j5);
         this.t2.k5(this.y0());
         if (this.i1().v3() != null) {
            com.aspose.slides.internal.f2.c8 var11 = this.i1().v3();
            this.t2.n5(var11.n5().y4());
         }

         if ((this.m3.n5 == 1 || this.m3.n5 == 51 || this.m3.n5 == 206 || this.m3.n5 == 215)
            && (
               !com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().k5, com.aspose.slides.internal.h2.k7.class)
                  || !com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().u3, com.aspose.slides.internal.h2.k7.class)
            )) {
            com.aspose.slides.internal.o9b.j5 var12 = this.v8().k5();
            this.t2.n5(var12.n5(), this.m3.a6.a6() == 9, this.m3.k5.a6() == 9);
            this.t2.l6(var12.l6(), this.m3.l6.a6() == 9, this.m3.u3.a6() == 9);
         }

         this.k7 = new com.aspose.slides.internal.a0.t2();
         this.k7.n5(31, true);
         if (var4 >= 0) {
            this.k7.u3(var4);
         }

         p6.n5(this.k7, this.i1().y1());
         if (this.m3.n5 == 1) {
            this.t2.t2(2);
         } else if (this.m3.n5 == 206) {
            this.t2.t2(4);
         } else if (this.m3.n5 == 215) {
            this.t2.t2(5);
         } else if (this.m3.n5 == 51) {
            this.t2.t2(3);
         } else if (this.m3.n5 == 110) {
            this.t2.t2(1);
         }

         this.u3.n5(this.k7);
         this.k7.l6(this.z8.n5);
         if (com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().k5, com.aspose.slides.internal.h2.k7.class)
            && com.aspose.slides.internal.v6g.k5.l6(this.i1().e5().u3, com.aspose.slides.internal.h2.k7.class)) {
            this.k7.n5(this.q0, false, false);
         }

         this.n5(this.t2);
      }

      return this.k7;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 != null) {
         this.k7.l6((com.aspose.slides.internal.a0.t2)var1);
      }
   }

   @Override
   protected void d5() {
      this.t2.n5(this.k7, this.y2);
      p6.n5(this.t2, this.i1().b3(), this);
      super.d5();
   }

   @Override
   public int n5(int var1, i1 var2) {
      return 0;
   }

   @Override
   public void n5(e5 var1) {
   }

   @Override
   public com.aspose.slides.internal.h2.f2 s3() {
      return this.i1().v0();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 p8() {
      return this.i1().h2();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 f2() {
      return this.i1().a5();
   }

   public final com.aspose.slides.internal.v4.c8 i1() {
      return (com.aspose.slides.internal.v4.c8)this.k5;
   }

   @Override
   public boolean s7() {
      return true;
   }

   @Override
   public boolean x8() {
      return true;
   }

   @Override
   public final void n5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (v3.n5 == var1) {
         this.p8 = var2;
      } else {
         this.f2 = var2;
      }
   }

   @Override
   public final void l6(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.a0 = true;
         } else {
            this.d2 = true;
         }
      }
   }

   @Override
   public final void k5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.d5 = true;
         } else {
            this.s3 = true;
         }
      }
   }

   // $VF: synthetic method
   static int n5(t2 var0, int var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static int n5(t2 var0) {
      return var0.z7;
   }
}
