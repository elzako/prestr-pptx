package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.ArgumentException;

public class s3 {
   public static final s3 n5 = new s3(Integer.MIN_VALUE, 9);
   public static final s3 l6 = new s3(Integer.MAX_VALUE, 75);
   private int k5;
   private int u3;

   private s3(int var1, int var2) {
      this.k5 = var1;
      this.u3 = var2;
   }

   private static int n5(com.aspose.slides.internal.h2.a5 var0) {
      if (var0.t4()) {
         return Integer.MIN_VALUE;
      } else {
         return var0.a6() == 7 ? Integer.MAX_VALUE : com.aspose.slides.internal.v6g.k5.u3(var0.h0(), int.class);
      }
   }

   public static s3 n5(com.aspose.slides.internal.h2.f2 var0) {
      s3 var1 = new s3(Integer.MIN_VALUE, 9);
      var1.n5(var0.n3(), 104);
      var1.n5(var0.s7(), 28);
      var1.n5(var0.t2(), 75);
      return var1;
   }

   private void n5(com.aspose.slides.internal.h2.a5 var1, int var2) {
      if (!var1.t4()) {
         this.k5 = n5(var1);
         this.u3 = var2;
      }
   }

   public final boolean n5() {
      return this.k5 == Integer.MIN_VALUE;
   }

   public final int l6() {
      return this.u3;
   }

   public final int k5() {
      if (this.k5 == Integer.MIN_VALUE) {
         return 0;
      } else {
         return this.k5 == Integer.MAX_VALUE ? 1000 : 999;
      }
   }

   private static int n5(int var0) {
      switch (var0) {
         case 9:
            return 3;
         case 28:
            return 1;
         case 75:
            return 0;
         case 104:
            return 2;
         default:
            throw new ArgumentException();
      }
   }

   public final s3 n5(s3 var1) {
      if (this.k5 == Integer.MAX_VALUE && this.k5 > var1.k5) {
         return this;
      } else if (var1.k5 == Integer.MAX_VALUE && var1.k5 > this.k5) {
         return var1;
      } else {
         int var2 = n5(this.u3);
         int var3 = n5(var1.u3);
         if (var2 == var3) {
            return this.k5 >= var1.k5 ? this : var1;
         } else {
            return var2 < var3 ? this : var1;
         }
      }
   }

   @Override
   public String toString() {
      return this.k5 == Integer.MIN_VALUE ? "auto" : (this.k5 == Integer.MAX_VALUE ? "always" : com.aspose.slides.ms.System.a3.l6(this.k5));
   }
}
