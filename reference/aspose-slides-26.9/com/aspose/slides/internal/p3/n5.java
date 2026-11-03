package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class n5 implements y2 {
   protected boolean n5 = false;
   protected boolean l6 = false;
   protected com.aspose.slides.internal.e5.t9 k5;

   public n5() {
      this.k5 = null;
   }

   public n5(com.aspose.slides.internal.e5.t9 var1) {
      this.k5 = var1;
      this.n5(var1.j5());
      if (this.s7()) {
         this.l6(true);
      }
   }

   @Override
   public int n5(int var1, com.aspose.slides.internal.e5.t9 var2) {
      if (var2 == this.k5) {
         switch (var1) {
            case 3:
               return this.u3();
            case 4:
               return this.a6();
            case 5:
               return this.n5();
            case 6:
               return this.l6();
            default:
               return 0;
         }
      } else {
         y2 var3 = this.h0();

         while (var3 != null && var2 != var3.y4()) {
            var3 = var3.h0();
         }

         return var3 != null ? var3.n5(var1, var2) : 0;
      }
   }

   protected final int n5() {
      for (y2 var1 = this.h0(); var1 != null; var1 = var1.h0()) {
         if (var1.x8() && !var1.n3()) {
            return var1.c8();
         }
      }

      return 0;
   }

   protected final int l6() {
      for (y2 var1 = this.h0(); var1 != null; var1 = var1.h0()) {
         if (var1.x8() && !var1.n3()) {
            return var1.t2();
         }
      }

      return 0;
   }

   protected final t2 k5() {
      for (y2 var1 = this.h0(); var1 != null; var1 = var1.h0()) {
         t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, t2.class);
         if (var2 != null) {
            int var3 = var2.y1().n5;
            if (var3 == 1 || var3 == 206 || var3 == 110) {
               return var2;
            }

            if (var2.i1().s0()) {
               return com.aspose.slides.internal.v6g.k5.n5(var2.h0().h0(), t2.class);
            }

            if (var3 == 9) {
               t2 var4 = com.aspose.slides.internal.v6g.k5.n5(this, t2.class);
               if (var4 != null && var4.y1().n5 == 1 && var4.y1().a6.a6() == 9 && var4.y1().k5.a6() == 9 && var4.y1().l6.a6() == 9 && var4.y1().u3.a6() == 9) {
                  return var2;
               }
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var1.h0(), z8.class)) {
               return var2;
            }
         }
      }

      return null;
   }

   protected final int u3() {
      y2 var1 = this.h0();
      return var1 != null ? var1.c8() : 0;
   }

   public final int a6() {
      for (y2 var1 = this.h0(); var1 != null; var1 = var1.h0()) {
         if (var1.s7()) {
            return var1.c8();
         }
      }

      return 0;
   }

   protected final int u9() {
      for (y2 var1 = this.h0(); var1 != null; var1 = var1.h0()) {
         if (var1.s7()) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, t2.class)) {
               t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, t2.class);
               int var3 = var2.i1().i1().n5;
               if (var3 == 1 || var3 == 51 || var3 == 206 || var3 == 215) {
                  return var1.t2();
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z8.class)) {
               return var1.t2();
            }
         }
      }

      return 0;
   }

   @Override
   public abstract y2 h0();

   @Override
   public int c8() {
      throw new NotSupportedException("getContentAreaIPD() called when it should have been overridden");
   }

   @Override
   public int t2() {
      throw new NotSupportedException("getContentAreaBPD() called when it should have been overridden");
   }

   @Override
   public boolean s7() {
      return this.n5;
   }

   protected final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public boolean x8() {
      return this.l6;
   }

   protected final void l6(boolean var1) {
      this.l6 = var1;
   }

   @Override
   public boolean n3() {
      return false;
   }

   @Override
   public final com.aspose.slides.internal.e5.t9 y4() {
      return this.k5;
   }

   @Override
   public boolean e2() {
      y2 var1 = this.h0();
      return var1 == null ? false : var1.e2();
   }

   @Override
   public void t9() {
      throw new NotSupportedException("Not implemented");
   }

   @Override
   public boolean z1() {
      return false;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, Stack<y2> var3, j8 var4, y2 var5) {
      throw new NotSupportedException("Not implemented");
   }
}
