package com.aspose.slides.internal.v8;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public class c8 {
   private u9 n5;
   private boolean l6;
   private boolean k5;
   private int u3;

   public c8(f0 var1, com.aspose.slides.internal.f2.u9 var2) {
      this.n5 = n5(var1, var2);
      this.l6 = var1.q0().a6() == 32;
      a5 var3 = var1.e2();
      if (var3.h0() != null) {
         this.u3 = com.aspose.slides.internal.v6g.k5.u3(var3.h0(), int.class);
         this.k5 = false;
      } else {
         this.k5 = var3.a6() == 53;
         this.u3 = 0;
      }
   }

   private static u9 n5(f0 var0, com.aspose.slides.internal.f2.u9 var1) {
      int var2 = var0.l6(var1).c8().l6(var1);
      int var3 = var0.u3(var1).c8().l6(var1);
      int var4 = var0.k5(var1).c8().l6(var1);
      return u9.n5(var2, var3, var4);
   }

   public c8(u9 var1, boolean var2, boolean var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public static c8 n5(a5 var0, c8 var1, com.aspose.slides.internal.v0.u3 var2) {
      if (var0.a6() == 97) {
         int var3 = var2.l6(' ');
         u9 var4 = u9.n5(-var3 / 3, 0, var3 / 2);
         return new c8(var4.n5(var1.u3().a6(2)), true, true, 0);
      } else {
         return new c8(var0.z1(), null);
      }
   }

   public static c8 n5(a5 var0) {
      return var0.a6() == 97 ? new c8(u9.n5, true, true, 0) : new c8(var0.z1(), null);
   }

   public final boolean n5() {
      return this.l6;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final int k5() {
      return this.u3;
   }

   public final u9 u3() {
      return this.n5;
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{"SpaceVal: ", this.u3().toString()});
   }
}
