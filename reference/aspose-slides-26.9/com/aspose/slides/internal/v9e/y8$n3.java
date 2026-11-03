package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.f4;

abstract class y8$n3 implements com.aspose.slides.internal.k4s.n5 {
   private int n5;
   private int l6;
   private int k5;
   private int[] u3;

   public y8$n3() {
   }

   public y8$n3(int var1, int var2, int var3, int[] var4) {
      this.n5(var1, var2, var3, var4);
   }

   protected final void n5(int var1, int var2, int var3, int[] var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final int n5() {
      return this.n5;
   }

   @Override
   public final int l6() {
      return this.l6;
   }

   @Override
   public final int k5() {
      return this.k5;
   }

   public final int[] u3() {
      return this.u3;
   }

   public static com.aspose.slides.internal.x6s.h0 n5(Object var0) {
      com.aspose.slides.internal.x6s.h0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.h0.class);
      if (var1 == null) {
         throw XsltException.create("Cannot convert the operand to a node-set.");
      } else {
         return var1;
      }
   }

   public static com.aspose.slides.internal.x6s.a6 l6(Object var0) {
      com.aspose.slides.internal.x6s.a6 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.a6.class);
      if (var1 == null) {
         throw XsltException.create("Cannot convert the operand to 'Result tree fragment'.");
      } else {
         return var1;
      }
   }

   private static String n5(com.aspose.slides.internal.x6s.h0 var0) {
      return var0.l6() ? var0.k5().c8() : com.aspose.slides.ms.System.d1.n5;
   }

   public static String k5(Object var0) {
      com.aspose.slides.internal.x6s.h0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.h0.class);
      return var1 != null ? n5(var1) : f4.l6(var0);
   }

   public static boolean u3(Object var0) {
      com.aspose.slides.internal.x6s.h0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.h0.class);
      if (var1 != null) {
         return com.aspose.slides.ms.System.z3.n5(n5(var1), com.aspose.slides.internal.x7n.l6.k5());
      }

      com.aspose.slides.internal.x6s.a6 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.a6.class);
      return var2 != null
         ? com.aspose.slides.ms.System.z3.n5(var2.toString(), com.aspose.slides.internal.x7n.l6.k5())
         : com.aspose.slides.ms.System.z3.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static double a6(Object var0) {
      com.aspose.slides.internal.x6s.h0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.h0.class);
      if (var1 != null) {
         return f4.n5((Object)n5(var1));
      }

      com.aspose.slides.internal.x6s.a6 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.a6.class);
      return var2 != null ? f4.n5((Object)var2.toString()) : f4.n5(var0);
   }

   private static Object n5(Object var0, int var1) {
      return com.aspose.slides.ms.System.z3.n5(a6(var0), var1, com.aspose.slides.internal.x7n.l6.k5());
   }

   public static Object n5(Object var0, int var1, int var2) {
      switch (var1) {
         case 0:
            return n5(var0, var2);
         case 1:
            if (var2 == 18) {
               return k5(var0);
            }

            return l6(var0);
         case 2:
            return u3(var0);
         case 3:
            return n5(var0);
         case 4:
         default:
            return var0;
         case 5:
         case 6:
            return var0;
      }
   }
}
