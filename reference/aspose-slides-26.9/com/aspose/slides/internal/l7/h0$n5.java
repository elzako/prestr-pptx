package com.aspose.slides.internal.l7;

import com.aspose.slides.internal.q5.c8$n5;
import com.aspose.slides.internal.q5.k5$n5;
import com.aspose.slides.internal.q5.s7$n5;
import com.aspose.slides.internal.q5.t2$n5;
import com.aspose.slides.internal.q5.x8$n5;
import com.aspose.slides.ms.System.d1;

public abstract class h0$n5 extends l6$n5 {
   private u3 n5;

   protected h0$n5(u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   public final String toString() {
      return d1.n5(new String[]{"Table Builder for - ", this.n5.toString()});
   }

   public final u3 y4() {
      return this.n5;
   }

   @Override
   protected void n5(l6 var1) {
      if (this.h0() || this.u9()) {
         ((h0)var1).l6 = new u3(this.y4().n5(), var1.l6());
      }
   }

   public static h0$n5 l6(u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      int var2 = var0.n5();
      if (var2 == 1735162214) {
      }

      if (var2 == com.aspose.slides.internal.x6.k5.l6) {
         return k5$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.k5) {
         return com.aspose.slides.internal.q5.u3$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.u3) {
         return com.aspose.slides.internal.q5.u9$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.a6) {
         return com.aspose.slides.internal.q5.h0$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.u9) {
         return c8$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.h0) {
         return t2$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.c8) {
         return s7$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.t2) {
         return x8$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.s7) {
         return com.aspose.slides.internal.e4.k5$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.n3) {
         return com.aspose.slides.internal.e4.u9$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.y4) {
         return com.aspose.slides.internal.e4.h0$n5.n5(var0, var1);
      }

      if (var2 == com.aspose.slides.internal.x6.k5.e2) {
         return com.aspose.slides.internal.e4.l6$n5.n5(var0, var1);
      }

      if (var2 != com.aspose.slides.internal.x6.k5.t4 && var2 != com.aspose.slides.internal.x6.k5.q0 && var2 != com.aspose.slides.internal.x6.k5.z3) {
         if (var2 == com.aspose.slides.internal.x6.k5.c4) {
            return com.aspose.slides.internal.q5.a6$n5.n5(var0, var1);
         }

         if (var2 == com.aspose.slides.internal.x6.k5.v0) {
            return com.aspose.slides.internal.q5.u3$n5.n5(var0, var1);
         }

         if (var2 != com.aspose.slides.internal.x6.k5.f0 && var2 == com.aspose.slides.internal.x6.k5.a3) {
         }
      }

      return com.aspose.slides.internal.l7.k5.n5(var0, var1);
   }
}
