package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class z3 extends y4 {
   private boolean k7;
   private final List<com.aspose.slides.internal.x9.t9> m3 = new List<>();
   public int t2 = -1;
   private int z8;
   private int j5 = 0;
   private int w1 = 0;
   private boolean r4;
   private int c4;
   private int y2;
   private int y1;
   private int a0;
   private int d2;
   private int d5 = 0;
   private int s3 = 0;
   private boolean p8 = false;
   private int f2 = 0;
   private Object i1 = null;
   private com.aspose.slides.internal.a0.l6 e5 = null;
   private Object b3 = null;
   private boolean o0 = false;
   private static final com.aspose.slides.internal.v6g.c8<Integer> z7 = new com.aspose.slides.internal.v6g.c8<>(0);
   private boolean v4 = false;

   public final boolean y1() {
      return this.k7;
   }

   public final List<com.aspose.slides.internal.x9.t9> a0() {
      return this.m3;
   }

   public final void u9(int var1) {
      this.w1 = var1;
   }

   public final com.aspose.slides.internal.a0.l6 d2() {
      return this.e5;
   }

   public final void k5(com.aspose.slides.internal.a0.l6 var1) {
      this.e5 = var1;
   }

   public final Object i1() {
      return this.i1;
   }

   public final void n5(Object var1) {
      this.i1 = var1;
   }

   public final Object x9() {
      return this.b3;
   }

   public final void l6(Object var1) {
      this.b3 = var1;
   }

   public final boolean y0() {
      return this.o0;
   }

   public final void h0(int var1) {
      this.f2 = var1;
   }

   public final boolean j9() {
      return this.p8;
   }

   public final void u3(boolean var1) {
      this.p8 = var1;
   }

   public z3(com.aspose.slides.internal.v4.x8 var1) {
      super(var1);
   }

   public final boolean z6() {
      return this.r4;
   }

   public final int e9() {
      return this.d2;
   }

   public final int o5() {
      return this.z8;
   }

   public final int j8() {
      return this.d5;
   }

   public final void c8(int var1) {
      this.d5 = var1;
   }

   public final int w2() {
      return this.s3;
   }

   public final void t2(int var1) {
      this.s3 = var1;
   }

   public final int s0() {
      return this.y2;
   }

   public final void s7(int var1) {
      this.y2 = var1;
   }

   public final void x8(int var1) {
      this.c4 = this.y2 = var1;
   }

   public final int v8() {
      return this.y1;
   }

   public final void n3(int var1) {
      this.y1 = var1;
   }

   public final int v3() {
      return this.a0;
   }

   public final void y4(int var1) {
      this.a0 = var1;
      this.t2 = var1 + 1;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return super.n5(var1, var2);
   }

   /** @deprecated */
   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      y2 var3 = null;
      y2 var4 = null;
      t1 var5 = new t1(0);
      List var6 = new List();

      while (var1.l6()) {
         j8 var7 = (j8)var1.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var7, f0.class)) {
            j8 var8 = var7.k5();
            if (var8.u3() != this) {
               var6.addItem(var8);
               var4 = var8.u3();
            }
         }
      }

      w2 var10 = new w2(new com.aspose.slides.internal.r4.u3(var6));

      while ((var3 = var10.u9()) != null) {
         var5.n5(128, var2.k5() && var3 == var4);
         var3.n5(var10, var5);
      }
   }

   public final com.aspose.slides.internal.v4.x8 g7() {
      return (com.aspose.slides.internal.v4.x8)this.k5;
   }

   @Override
   public com.aspose.slides.internal.h2.f2 p8() {
      return this.g7().i1();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 s3() {
      return this.g7().e5();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 f2() {
      return this.g7().b3();
   }

   public final com.aspose.slides.internal.o9b.y2 j4() {
      int var1 = this.t2 > 0 ? this.t2 * this.w1 : 0;
      if (this.j5 < this.s3 + var1) {
         return new com.aspose.slides.internal.o9b.y2(this.d5, this.s3 + var1 - this.j5, this.d2, this.z8);
      } else if (this.j5 < this.s3 + var1 + this.z8) {
         return new com.aspose.slides.internal.o9b.y2(this.d5, 0, this.d2, this.s3 + var1 + this.z8 - this.j5);
      } else {
         return this.j5 == 0
            ? new com.aspose.slides.internal.o9b.y2(this.d5, 0, this.d2, this.z8)
            : new com.aspose.slides.internal.o9b.y2(this.d5, 0, this.d2, 0);
      }
   }

   private com.aspose.slides.internal.a0.l6 l6(List<com.aspose.slides.internal.r4.u9> var1) {
      t1 var2 = new t1(0);
      com.aspose.slides.internal.p3.h0.n5(null, new z7(var1, 0, var1.size()), var2);
      com.aspose.slides.internal.x9.t9 var3 = (com.aspose.slides.internal.x9.t9)this.h0();
      return var3.d5();
   }

   private List<com.aspose.slides.internal.r4.u9> l6(t1 var1, int var2) {
      return this.n5(new t1(var1), var2, null, null, null);
   }

   private void n5(Stack<y2> var1, y2 var2) {
      if (var2 != null) {
         if (var2 != this) {
            y2 var3 = var2.h0();
            if (var3.r4().size() == 0) {
               var3.k5(var2);
            }

            var1.push(var2);
            this.n5(var1, var3);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, int var1, int var2) {
      com.aspose.slides.internal.a0.x8 var3 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.a0.x8.class);
      if (var3 != null) {
         List$Enumerator var38 = var3.c4().iterator();

         try {
            while (var38.hasNext()) {
               com.aspose.slides.internal.a0.l6 var40 = (com.aspose.slides.internal.a0.l6)var38.next();
               n5(var40, var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
               var38.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.a0.k7 var4 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.a0.k7.class);
         if (var4 != null) {
            List$Enumerator var39 = var4.m3().iterator();

            try {
               while (var39.hasNext()) {
                  com.aspose.slides.internal.a0.l6 var42 = (com.aspose.slides.internal.a0.l6)var39.next();
                  com.aspose.slides.internal.d2.x8 var44 = com.aspose.slides.internal.v6g.k5.n5(var42, com.aspose.slides.internal.d2.x8.class);
                  if (var44 != null) {
                     com.aspose.slides.internal.a0.l6 var46 = var44.m3();
                     com.aspose.slides.internal.d2.t2 var49 = com.aspose.slides.internal.v6g.k5.n5(var46, com.aspose.slides.internal.d2.t2.class);
                     if (var49 != null) {
                        n5(var49.m1(), var1, var2);
                        continue;
                     }
                  }

                  com.aspose.slides.internal.d2.t2 var47 = com.aspose.slides.internal.v6g.k5.n5(var42, com.aspose.slides.internal.d2.t2.class);
                  if (var47 != null) {
                     n5(var47.m1(), var1, var2);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var42, com.aspose.slides.internal.d2.t9.class)) {
                     n5(var42, var1, var2);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
                  var39.dispose();
               }
            }
         } else {
            com.aspose.slides.internal.a0.t2 var5 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.a0.t2.class);
            if (var5 != null) {
               try {
                  List var41 = var5.c4();
                  if (var41 != null) {
                     List$Enumerator var43 = var41.iterator();

                     try {
                        while (var43.hasNext()) {
                           Object var45 = var43.next();
                           com.aspose.slides.internal.a0.l6 var48 = com.aspose.slides.internal.v6g.k5.n5(var45, com.aspose.slides.internal.a0.l6.class);
                           if (var48 != null) {
                              n5(var48, var1, var2);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
                           var43.dispose();
                        }
                     }
                  }

                  if (var5.e_() != 0 && var5.e_() < var1) {
                     var5.k5(var1);
                  }

                  if (var5.l6() != 0 && var5.l6() > var2) {
                     var5.l6(var2);
                  }
               } catch (RuntimeException var36) {
               }
            } else {
               com.aspose.slides.internal.d2.t2 var6 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.d2.t2.class);
               if (var6 != null) {
                  n5(var6.m1(), var1, var2);
               } else {
                  com.aspose.slides.internal.d2.s7 var7 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.d2.s7.class);
                  if (var7 != null) {
                     List$Enumerator var8 = var7.d_().iterator();

                     try {
                        while (var8.hasNext()) {
                           com.aspose.slides.internal.a0.l6 var9 = (com.aspose.slides.internal.a0.l6)var8.next();
                           n5(var9, var1, var2);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                           var8.dispose();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final void n5(int var1, int var2, int var3, m1 var4) {
      if (!this.r4) {
         this.r4 = true;
         if (this.d2() == null) {
            this.t4();

            com.aspose.slides.internal.a0.l6 var6;
            try {
               com.aspose.slides.internal.x9.z1.l6().l6(true);
               List var5 = this.l6(var4.u3(), var4.a6());
               com.aspose.slides.internal.x9.z1.l6().n5(true);
               var6 = this.l6(var5);
            } finally {
               com.aspose.slides.internal.x9.z1.l6().n5(false);
               com.aspose.slides.internal.x9.z1.l6().l6(false);
            }

            this.k5(var6);
            var6.n5(this);
            com.aspose.slides.internal.o9b.p8 var18 = var6.n5(false).u3();
            int var7 = 0;
            List var8 = var4.n5().c8();
            if (var8 == null) {
               var8 = com.aspose.slides.internal.x9.z1.l6().u3().y1();
            }

            if (var18.l6() == 0 && this.m3.size() > 0 && this.m3.get_Item(this.m3.size() - 1).d2() == null) {
               if (!((com.aspose.slides.internal.x9.t9)this.h0()).a0()) {
                  this.n5(var1, var2, var3, var4, var18.u3(), var6).k5(var18);
               } else {
                  com.aspose.slides.internal.o9b.p8[] var19 = new com.aspose.slides.internal.o9b.p8[]{var18};
                  var6 = this.n5(var3, var4.u3(), var4.a6(), var6, var19);
                  var19[0].k5(var18);
               }
            } else {
               List$Enumerator var9 = this.m3.iterator();

               try {
                  while (var9.hasNext()) {
                     com.aspose.slides.internal.x9.t9 var10 = (com.aspose.slides.internal.x9.t9)var9.next();
                     if (var10.d2() == null) {
                        var8.addItem(var10);
                     } else {
                        var7 = q1.n5(var7, var10.d2().o5());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }
            }

            this.z8 = var18.k5();
            this.d2 = var18.l6();
            if (z7.get() != 0) {
               this.z8 = q1.n5(this.z8, var7);
            }

            if (this.z8 == 0) {
               this.z8 = 1;
            }

            com.aspose.slides.internal.a0.x8 var20 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.a0.x8.class);
            var6.n5(43, new com.aspose.slides.internal.b3.k7(1000.0, 10));
            if (var20 != null) {
               if (var20.y4() == 0) {
                  this.d2 = this.d2 + var20.f2();
               }

               if (!var20.u9(17)) {
                  this.s3 = -var20.c8();
               }
            }
         }
      }
   }

   private void n5(y2 var1, int[] var2, int[] var3, k7 var4) {
      var2[0] = 0;
      var3[0] = 0;

      while (var1 != null) {
         com.aspose.slides.internal.x9.k7 var5 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x9.k7.class);
         if (var5 != null) {
            com.aspose.slides.internal.v4.t9 var6 = (com.aspose.slides.internal.v4.t9)var5.y4();
            if (var6.z7().a6() != 9) {
               var3[0] = var6.z7().l6(var5);
               if (var4.a6() != null) {
                  var3[0] -= var4.a6().j5().n5().e5().k5.u3();
               }
            }

            if (var6.o0().a6() != 9) {
               var2[0] = var6.o0().l6(var5);
            }
            break;
         }

         var1 = var1.h0();
      }
   }

   private int n5(com.aspose.slides.internal.x9.t9 var1, y2 var2) {
      int var3 = 0;
      com.aspose.slides.internal.e5.t9 var4 = var1.y4();

      while (var2 != null && var4 != var2.y4()) {
         t2 var5 = com.aspose.slides.internal.v6g.k5.n5(var2, t2.class);
         if (var5 != null) {
            var3 += var5.i1().e5().n5.l6(var5);
         }

         var2 = var2.h0();
      }

      return var3;
   }

   public final boolean i9() {
      return this.v4;
   }

   private com.aspose.slides.internal.o9b.p8 n5(
      int var1, int var2, int var3, m1 var4, com.aspose.slides.internal.o9b.p8 var5, com.aspose.slides.internal.a0.l6 var6
   ) {
      try {
         z7.set(z7.get() + 1);
         this.r4 = false;
         var4.n5().n5(this.m3);
         m3 var7 = var4.n5(var1, var2, var3);
         var4.n5().n5((List<com.aspose.slides.internal.x9.t9>)null);
         if (var7.l6() != var3 || var7.n5() != 0) {
            var5 = new com.aspose.slides.internal.o9b.p8(var3 - var7.l6() + var7.n5(), 1);
         }

         com.aspose.slides.internal.a0.k7 var8 = new com.aspose.slides.internal.a0.k7();
         int var9 = 0;
         List$Enumerator var10 = this.m3.iterator();

         try {
            while (var10.hasNext()) {
               com.aspose.slides.internal.x9.t9 var11 = (com.aspose.slides.internal.x9.t9)var10.next();
               z3 var12 = var11.d2();
               com.aspose.slides.internal.d2.t2 var13 = new com.aspose.slides.internal.d2.t2();
               com.aspose.slides.internal.a0.t2 var14 = com.aspose.slides.internal.v6g.k5.n5(
                  com.aspose.slides.internal.v6g.k5.l6(var12.d2(), com.aspose.slides.internal.a0.x8.class)
                     ? com.aspose.slides.internal.v6g.k5.n5(
                        ((com.aspose.slides.internal.a0.x8)var12.d2()).c4().get_Item(0), com.aspose.slides.internal.a0.t2.class
                     )
                     : var12.d2(),
                  com.aspose.slides.internal.a0.t2.class
               );
               if (var14 != null) {
                  int var15 = var12.j8();
                  if (var12.j9()) {
                     var15 -= var12.e9();
                  }

                  if (z7.get() == 1) {
                     var9 = this.n5((com.aspose.slides.internal.x9.t9)this.h0(), ((com.aspose.slides.internal.x9.t9)var12.h0()).s7);
                     int var16 = 0;
                     int var17 = 0;
                     int[] var18 = new int[]{0};
                     int[] var19 = new int[]{0};
                     this.n5(((com.aspose.slides.internal.x9.t9)this.h0()).s7, var18, var19, var4.n5());
                     var16 = var18[0];
                     var17 = var19[0];
                     var15 += var17;
                     var9 += var16;
                     var13.t2 = var4.l6() < 0 ? 1 : var4.l6();
                     n5(var12.d2(), var9 - var4.l6() / 2 - var4.k5(), var12.d2);
                     var9 += var4.l6() / 2;
                     this.v4 = true;
                  } else {
                     n5(var12.d2(), 0, var12.d2);
                  }

                  var14.n5(var15, true, true);
                  var14.l6(var12.w2() + var9, true, true);
                  if (var12.j3() || var12.n1()) {
                     var14.l6(true);
                     var14.s7(var12.e9());
                  }

                  var13.n5(var12.d2());
                  var8.n5(var13);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         this.k5(var6);
         com.aspose.slides.internal.a0.t2 var30 = com.aspose.slides.internal.v6g.k5.n5(
            com.aspose.slides.internal.v6g.k5.l6(this.d2(), com.aspose.slides.internal.a0.x8.class)
               ? com.aspose.slides.internal.v6g.k5.n5(((com.aspose.slides.internal.a0.x8)this.d2()).c4().get_Item(0), com.aspose.slides.internal.a0.t2.class)
               : this.d2(),
            com.aspose.slides.internal.a0.t2.class
         );
         var30.n5(var8);
         var6.a6 = true;
         return var5;
      } finally {
         this.r4 = true;
         z7.set(z7.get() - 1);
      }
   }

   private com.aspose.slides.internal.a0.l6 n5(int var1, t1 var2, int var3, com.aspose.slides.internal.a0.l6 var4, com.aspose.slides.internal.o9b.p8[] var5) {
      this.m3.get_Item(this.m3.size() - 1).u9(true);
      com.aspose.slides.internal.x9.t9 var6 = this.m3.get_Item(this.m3.size() - 1);
      this.m3.removeAt(this.m3.size() - 1);

      try {
         com.aspose.slides.internal.x9.z1.l6().l6(true);
         Stack var7 = new Stack();
         this.n5(var7, var6.h0());
         var6.h0().k5(var6);
         this.t9();
         List var8 = this.n5(new t1(var2), var3, var7, null, var6);
         com.aspose.slides.internal.x9.z1.l6().n5(true);
         var4 = this.l6(var8);
      } finally {
         com.aspose.slides.internal.x9.z1.l6().n5(false);
         com.aspose.slides.internal.x9.z1.l6().l6(false);
      }

      this.k5(var4);
      var4.n5(this);
      var4.n5(false).k5(var5[0]);
      return var4;
   }

   public final void f5() {
      this.r4 = false;
      this.j5 = 0;
      this.y1 = 0;
      this.b3 = this.i1;
      this.o0 = true;
   }

   public final void n5(int var1, int var2, int var3, k7 var4) {
      if (this.j4().l6() > 0) {
         com.aspose.slides.internal.y0.k5 var5 = var4.k5();
         if (var5 != null && var5.a0()) {
            return;
         }

         int var6 = var1 - this.t2;
         int var7 = com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)((float)this.j4().n5() / var2)), 14);
         this.j5 += var6 * var2;
         var6 = var7 > var6 ? var6 : var7;
         this.y1 += var6;
         if (var3 != -1) {
            this.y1 = this.y1 > var3 ? this.y1 - var3 : 0;
         }
      }

      this.t2 = -1;
      this.s7(0);
   }

   public final boolean j3() {
      return this.p6() == 135;
   }

   public final boolean n1() {
      return this.p6() == 39;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      int var2 = ((com.aspose.slides.internal.v4.x8)this.y4()).o0();
      if (var2 == 13) {
         var1.n5(3);
      } else if (var2 != 135 && var2 != 39) {
         var1.n5(0);
      } else {
         var1.n5(5);
      }

      this.h0().l6(var1);
   }

   public final int p6() {
      return ((com.aspose.slides.internal.v4.x8)this.y4()).o0();
   }
}
