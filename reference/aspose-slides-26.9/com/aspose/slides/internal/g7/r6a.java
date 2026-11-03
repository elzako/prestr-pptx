package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class r6a implements q8 {
   private u0a n5;
   private o8m l6 = null;
   private o8m k5 = null;

   public r6a(u0a var1) {
      this.n5 = var1;
   }

   @Override
   public final r3 n5(int var1, int var2) {
      switch (var1) {
         case 0:
            return this.l6(var2, var1);
         case 1:
            return this.k5(var2, var1);
         default:
            throw new ArgumentOutOfRangeException("FeatType", var1, null);
      }
   }

   public final e8 n5(int var1) {
      switch (var1) {
         case 0:
            o8m var3 = this.l6;
            if (var3 == null) {
               var3 = this.l6 = new o8m(this.n5.l6().q0().l6(), var1, this);
            }

            return var3;
         case 1:
            o8m var2 = this.k5;
            if (var2 == null) {
               var2 = this.k5 = new o8m(this.n5.l6().z3().l6(), var1, this);
            }

            return var2;
         default:
            throw new ArgumentOutOfRangeException("featType", var1, null);
      }
   }

   private r3 l6(int var1, int var2) {
      g1p var3 = this.n5.l6().q0();
      k3h var4 = var3.k5().n5(var1);
      switch (var4.n5()) {
         case 1:
            return new t9p(var4, var2);
         case 2:
            return new r5d(var4, var2);
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            throw new d9m(com.aspose.slides.ms.System.d1.n5("Unsupported lookup type: {0}", new Object[]{var4.n5()}));
         case 4:
            return new k4s(var4, var2);
         case 8:
            return new x6s(var4, var2, this);
      }
   }

   private r3 k5(int var1, int var2) {
      n9q var3 = this.n5.l6().z3();
      l1b var4 = var3.k5().n5(var1);
      switch (var4.n5()) {
         case 1:
            return new y8m(var4, var2);
         case 2:
         default:
            throw new d9m(com.aspose.slides.ms.System.d1.n5("Unsupported lookup type: {0}", new Object[]{var4.n5()}));
         case 3:
            return new u7f(var4, var2);
         case 4:
            return new o3i(var4, var2);
         case 5:
            return new z1n(var4, var2, this);
         case 6:
            return new x1f(var4, var2, this);
      }
   }
}
