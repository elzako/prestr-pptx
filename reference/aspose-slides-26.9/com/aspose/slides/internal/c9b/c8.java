package com.aspose.slides.internal.c9b;

import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.w1;

public final class c8 {
   private final Object n5;

   public c8(w1 var1) {
      this.n5 = var1;
   }

   public c8(j5 var1) {
      this.n5 = var1;
   }

   public static c8 n5(w1 var0) {
      return new c8(var0);
   }

   public static c8 n5(j5 var0) {
      return new c8(var0);
   }

   public static c8[] n5(w1[] var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.length == 0) {
         return new c8[0];
      }

      c8[] var1 = new c8[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = n5(var0[var2]);
      }

      return var1;
   }

   public static c8[] n5(j5[] var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.length == 0) {
         return new c8[0];
      }

      c8[] var1 = new c8[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = n5(var0[var2]);
      }

      return var1;
   }

   private Object u3() {
      return this.n5;
   }

   public Number n5() {
      return this.k5() ? ((j5)this.n5).n5() : ((w1)this.n5).l6();
   }

   public Number l6() {
      return this.k5() ? ((j5)this.n5).l6() : ((w1)this.n5).k5();
   }

   public static boolean n5(c8 var0) {
      return var0.u3() instanceof w1;
   }

   public static boolean l6(c8 var0) {
      return var0.u3() instanceof j5;
   }

   public static w1 k5(c8 var0) {
      if (var0 == null) {
         return null;
      } else {
         return n5(var0) ? (w1)var0.u3() : w1.n5((j5)var0.u3());
      }
   }

   public static j5 u3(c8 var0) {
      if (var0 == null) {
         return null;
      } else {
         return l6(var0) ? (j5)var0.u3() : j5.l6((w1)var0.u3());
      }
   }

   public static j5 a6(c8 var0) {
      if (var0 == null) {
         return null;
      } else {
         return l6(var0) ? (j5)var0.u3() : j5.k5((w1)var0.u3());
      }
   }

   public boolean k5() {
      return l6(this);
   }

   public boolean u9(c8 var1) {
      return this.u3().equals(var1.u3());
   }
}
