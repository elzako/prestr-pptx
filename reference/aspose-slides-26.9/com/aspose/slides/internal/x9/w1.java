package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.t1;

public abstract class w1 extends com.aspose.slides.internal.p3.u3 implements j5 {
   protected com.aspose.slides.internal.v8.u9 e2 = com.aspose.slides.internal.v8.u9.n5;
   private com.aspose.slides.internal.a0.l6 t2;
   protected t1 t9;

   protected w1(com.aspose.slides.internal.e5.t9 var1) {
      super(var1);
   }

   @Override
   public int c8() {
      com.aspose.slides.internal.p3.y2 var1 = this.h0();
      return var1 != null ? var1.c8() : 0;
   }

   protected boolean a6(boolean var1) {
      return false;
   }

   protected boolean u9(boolean var1) {
      return false;
   }

   protected f0 d2() {
      return null;
   }

   protected f0 d5() {
      return null;
   }

   protected final com.aspose.slides.internal.a0.l6 i1() {
      return this.t2;
   }

   protected final void k5(com.aspose.slides.internal.a0.l6 var1) {
      this.t2 = var1;
   }

   protected void n5(boolean var1, boolean var2) {
   }

   protected final void n5(t1 var1) {
      this.t9 = var1;
   }

   protected final t1 e5() {
      return this.t9;
   }

   protected final void n5(com.aspose.slides.internal.a0.l6 var1, com.aspose.slides.internal.v8.u9 var2, double var3) {
      if (var2 != null) {
         int var5 = var2.l6();
         if (var3 > 0.0) {
            var5 += com.aspose.slides.internal.v6g.k5.u3(var2.a6() * var3, 14);
         } else if (var3 < 0.0) {
            var5 += com.aspose.slides.internal.v6g.k5.u3(var2.u3() * var3, 14);
         }

         if (var5 != 0) {
            com.aspose.slides.internal.d2.y4 var6 = new com.aspose.slides.internal.d2.y4();
            var6.l6(var5);
            int var7 = var1.h0();
            if (var7 >= 0) {
               var6.u3(var7);
            }

            var1.n5(var6);
         }
      }
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1) {
      return this.l6(var1, 0);
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1, var1.size());
      com.aspose.slides.internal.p3.i1 var4 = (com.aspose.slides.internal.p3.i1)var3.a6();
      int var5 = var2 + 1;
      j8 var6 = var4.k7();
      j5 var7 = null;
      if (var6 != null) {
         var7 = (j5)var6.n5(var5);
      }

      if (var7 == null) {
         return var1;
      }

      var1 = var7.l6(var1, var5);
      var3 = new com.aspose.slides.internal.r4.u3(var1);

      while (var3.l6()) {
         var4 = (com.aspose.slides.internal.p3.i1)var3.k5();
         var6 = var4.k7();
         var7 = null;
         if (var6 != null) {
            var7 = (j5)var6.n5(var2);
         }

         if (var7 != this) {
            var4.n5(this.n5(new com.aspose.slides.internal.p3.f0(this, var4.k7())));
         }
      }

      return var1;
   }

   @Override
   public final String a6(j8 var1) {
      j8 var2 = var1.k5();
      return ((j5)var2.u3()).a6(var2);
   }

   @Override
   public final void n5(j8 var1, q0 var2) {
      j8 var3 = var1.k5();
      ((j5)var3.u3()).n5(var3, var2);
   }

   @Override
   public final boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      return this.k5(var1, 0);
   }

   @Override
   public final boolean k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1);
      var2++;
      j5 var4 = null;
      int var5 = 0;
      boolean var6 = false;

      while (var3.l6()) {
         com.aspose.slides.internal.p3.i1 var7 = (com.aspose.slides.internal.p3.i1)var3.k5();
         j8 var8 = var7.k7();
         j5 var9;
         if (var8 == null) {
            var9 = null;
         } else {
            var9 = (j5)var8.n5(var2);
         }

         if (var4 == null) {
            var4 = var9;
         }

         if (var9 != var4 || !var3.l6()) {
            if (var4 == this || var9 == this) {
               var4 = var9;
            } else if (var3.l6()) {
               var6 = var4.k5(var1.getRange(var5, var3.h0()), var2) || var6;
               var4 = var9;
               var5 = var3.h0();
            } else if (var9 == var4) {
               var6 = var4 != null && var4.k5(var1.getRange(var5, var1.size()), var2) || var6;
            } else {
               var6 = var4.k5(var1.getRange(var5, var3.h0()), var2) || var6;
               if (var9 != null) {
                  var6 = var9.k5(var1.getRange(var3.h0(), var1.size()), var2) || var6;
               }
            }
         }
      }

      return var6;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return this.n5(var1, var2, 0);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3(var1);
      var3++;
      List var5 = new List();
      List var6 = new List();
      j5 var7 = null;
      int var8 = 0;

      while (var4.l6()) {
         com.aspose.slides.internal.p3.i1 var9 = (com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var4.k5()).n5();
         j8 var10 = var9.k7();
         j5 var11;
         if (var10 == null) {
            var11 = null;
         } else {
            var11 = (j5)var10.n5(var3);
         }

         if (var7 == null) {
            var7 = var11;
         }

         if (var11 != var7 || !var4.l6()) {
            if (var4.l6()) {
               com.aspose.slides.internal.v3.t2.n5(var5, var7.n5(var1.getRange(var8, var4.h0() - var8 + 1), var2, var3));
               var7 = var11;
               var8 = var4.h0();
            } else if (var11 == var7) {
               com.aspose.slides.internal.v3.t2.n5(var5, var7.n5(var1.getRange(var8, var1.size() - var8 + 1), var2, var3));
            } else {
               com.aspose.slides.internal.v3.t2.n5(var5, var7.n5(var1.getRange(var8, var4.h0() - var8 + 1), var2, var3));
               if (var11 != null) {
                  com.aspose.slides.internal.v3.t2.n5(var5, var11.n5(var1.getRange(var4.h0(), var1.size() - var4.h0() + 1), var2, var3));
               }
            }
         }
      }

      com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3(var5);

      while (var14.l6()) {
         com.aspose.slides.internal.p3.i1 var12 = (com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var14.k5()).n5();
         var12.n5(this.n5(new com.aspose.slides.internal.p3.f0(this, var12.k7())));
         var6.addItem(var12);
      }

      return var6;
   }
}
