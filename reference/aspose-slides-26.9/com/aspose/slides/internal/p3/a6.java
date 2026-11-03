package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public abstract class a6 extends u3 implements d2 {
   protected com.aspose.slides.internal.a0.a6 t2;
   protected com.aspose.slides.internal.a0.q0 s7;
   protected com.aspose.slides.internal.t1.n5 x8;
   protected x9 n3;
   protected int y4 = 0;
   protected int e2 = 0;

   public a6(com.aspose.slides.internal.a0.a6 var1, com.aspose.slides.internal.t1.n5 var2) {
      super(var2);
      this.t2 = var1;
      this.s7 = var1.a6();
      this.x8 = var2;
   }

   public final y1 y1() {
      return this.t2.u3();
   }

   @Override
   public x9 j5() {
      return this.n3;
   }

   public final void n5(x9 var1) {
      this.n3 = var1;
   }

   public final int a0() {
      return this.y4;
   }

   @Override
   public void t4() {
      this.e2 = this.x8.e5();
      this.y4 = this.e2 - 1;
   }

   public final o5 n5(String var1) {
      List var2 = this.s7.u3(var1);
      return var2 != null && var2.size() > 0 ? (o5)var2.get_Item(0) : null;
   }

   public final o5 l6(String var1) {
      List var2 = this.s7.u3(var1);
      return var2 != null && var2.size() > 0 ? (o5)var2.get_Item(var2.size() - 1) : null;
   }

   public final void k5(String var1) {
      if (var1 != null && var1.length() > 0) {
         this.s7.n5(var1, this.n3.l6());
      }
   }

   public final boolean u3(String var1) {
      if (!this.s7.k5(var1)) {
         this.s7.n5(var1);
         return false;
      } else {
         return true;
      }
   }

   public final void a6(String var1) {
      this.s7.l6(var1);
   }

   public final void n5(String var1, com.aspose.slides.internal.a0.m1 var2) {
      this.n3.l6().n5(var1, var2);
      this.s7.n5(var1, (com.aspose.slides.internal.a0.m1)this.n3.l6());
   }

   public final com.aspose.slides.internal.v4.s3 n5(com.aspose.slides.internal.v4.s3 var1) {
      com.aspose.slides.internal.a0.u9 var2 = this.t2.k5();
      String var3 = var1.i1();
      int var4 = var1.e5();
      int var5 = var1.b3();
      com.aspose.slides.internal.v4.j5 var6 = this.w1().n5(var3, var4);
      if (var6 == null && var5 != 104) {
         boolean var7 = var5 == 34;
         int var8 = var2.k5();

         int var9;
         for (var9 = var2.n5(var8) - 1; var9 < 0 && var7 && var8 > 1; var9 = var2.n5(var8) - 1) {
            var8--;
         }

         while (var9 >= 0) {
            o5 var10 = var2.n5(var8, var9);
            var6 = var10.n5(var3, 74);
            if (var6 != null) {
               break;
            }

            var9--;
            if (var9 < 0 && var7 && var8 > 1) {
               var8--;
               var9 = var2.n5(var8) - 1;
            }
         }
      }

      if (var6 == null) {
         return null;
      }

      var1.l6(var6);
      return var1;
   }

   protected abstract x9 n5(int var1, boolean var2);

   public x9 u3(boolean var1) {
      if (this.n3 != null) {
         this.d2();
      }

      this.y4++;
      this.n3 = this.n5(this.y4, var1);
      this.k5(this.x8.e2().y1());
      this.k5(this.x8.y1());
      return this.n3;
   }

   protected void d2() {
      this.s7.n5(this.n3.l6());
      this.t2.k5().n5(this.n3.l6());
      this.n3 = null;
   }

   @Override
   public final void n5(com.aspose.slides.internal.f2.u3 var1) {
      int var2 = this.x8.b3();
      if (var1 != null && var2 == 9) {
         if (var1.a6() != 0) {
            int var3 = var1.a6();
            if (var3 == 11) {
               var2 = 40;
            } else if (var3 == 10) {
               var2 = 41;
            } else {
               var2 = 88;
            }
         } else {
            int var4 = var1.u3();
            var4 = var4 > 0 ? var4 : 1;
            if (var4 % 2 == 0) {
               var2 = 41;
            } else {
               var2 = 40;
            }
         }
      }

      if (var2 == 43) {
         if ((this.y4 - this.e2 + 1) % 2 != 0) {
            this.n3 = this.u3(true);
         }
      } else if (var2 == 99) {
         if ((this.y4 - this.e2 + 1) % 2 == 0) {
            this.n3 = this.u3(true);
         }
      } else if (var2 == 40) {
         if (this.y4 % 2 != 0) {
            this.n3 = this.u3(true);
         }
      } else if (var2 == 41) {
         if (this.y4 % 2 == 0) {
            this.n3 = this.u3(true);
         }
      } else if (var2 == 88) {
      }

      if (this.n3 != null) {
         this.d2();
      }
   }

   @Override
   public void t9() {
      throw new InvalidOperationException();
   }
}
