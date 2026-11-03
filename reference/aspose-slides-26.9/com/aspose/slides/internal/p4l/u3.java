package com.aspose.slides.internal.p4l;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.g7;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

class u3 {
   static Object[] n5(c4 var0, y8 var1, boolean var2) {
      Object[] var3 = (Object[])Array.newInstance(var1.z1(), 0);
      if (var0.h0() != null) {
         return var3;
      }

      List var4 = new List();
      a6 var5 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var5 = new a6(var1);
      }

      n5(var0.x8(), var4, var5);
      if (var2) {
         n5(var0, var4, var5);
      }

      return var4.toArray(var3);
   }

   static Object[] n5(z3 var0, y8 var1) {
      Object[] var2 = (Object[])Array.newInstance(var1.z1(), 0);
      List var3 = new List();
      u9 var4 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var4 = new u9(var1);
      }

      Annotation[] var5 = var0.u9();
      if (var0.u3() instanceof q0) {
         var5 = ((q0)var0.u3()).m1().getParameterAnnotations()[var0.a6()];
      } else if (var0.u3() instanceof k5) {
         var5 = ((k5)var0.u3()).n5().getParameterAnnotations()[var0.a6()];
      }

      n5(var5, var3, var4);
      return var3.toArray(var2);
   }

   static Object[] n5(m3 var0, y8 var1) {
      Object[] var2 = (Object[])Array.newInstance(var1.z1(), 0);
      List var3 = new List();
      h0 var4 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var4 = new h0(var1);
      }

      n5(var0.x8(), var3, var4);
      return var3.toArray(var2);
   }

   static Object[] n5(z8 var0, y8 var1) {
      return new Object[0];
   }

   static Object[] n5(j5 var0, y8 var1) {
      Object[] var2 = (Object[])Array.newInstance(var1.z1(), 0);
      List var3 = new List();
      c8 var4 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var4 = new c8(var1);
      }

      n5(var0.x8(), var3, var4);
      return var3.toArray(var2);
   }

   static Object[] n5(r4 var0, y8 var1) {
      Object[] var2 = (Object[])Array.newInstance(var1.z1(), 0);
      List var3 = new List();
      t2 var4 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var4 = new t2(var1);
      }

      n5(var0.x8(), var3, var4);
      return var3.toArray(var2);
   }

   static Object[] n5(w1 var0, y8 var1, boolean var2) {
      Object[] var3 = (Object[])Array.newInstance(var1.z1(), 0);
      if (var0.z3() && !var0.q0()) {
         var0 = com.aspose.slides.internal.v6g.k5.n5(var0.m3(), w1.class);
      }

      List var4 = new List();
      s7 var5 = null;
      if (var1 != null && !var1.k5(com.aspose.slides.internal.v6g.k5.n5(Object.class))) {
         var5 = new s7(var1);
      }

      n5(var0.x8(), var4, var5);
      if (var2) {
         Type[] var6 = var0.u9();
         y8[] var7 = new y8[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = com.aspose.slides.internal.v6g.k5.n5(var6[var8].getClass());
         }

         n5(var0, var7, var4, var5);
      }

      return var4.toArray(var3);
   }

   static boolean l6(c4 var0, y8 var1, boolean var2) {
      Object[] var3 = n5(var0, var1, var2);
      return var3.length > 0;
   }

   static boolean l6(z3 var0, y8 var1) {
      Object[] var2 = n5(var0, var1);
      return var2.length > 0;
   }

   static boolean l6(m3 var0, y8 var1) {
      Object[] var2 = n5(var0, var1);
      return var2.length > 0;
   }

   static boolean l6(z8 var0, y8 var1) {
      Object[] var2 = n5(var0, var1);
      return var2.length > 0;
   }

   static boolean l6(j5 var0, y8 var1) {
      Object[] var2 = n5(var0, var1);
      return var2.length > 0;
   }

   static boolean l6(w1 var0, y8 var1, boolean var2) {
      Object[] var3 = n5(var0, var1, var2);
      return var3.length > 0;
   }

   static boolean l6(r4 var0, y8 var1) {
      Object[] var2 = n5(var0, var1);
      return var2.length > 0;
   }

   static void n5(Annotation[] var0, List<Object> var1, g7<Annotation> var2) {
      if (var0 != null) {
         for (Annotation var6 : var0) {
            if ((var2 == null || var2.invoke(var6)) && !var1.containsItem(var6)) {
               var1.addItem(var6);
            }
         }
      }
   }

   static void n5(Annotation[] var0, List<Object> var1, g7<Annotation> var2, boolean var3) {
      for (Annotation var7 : var0) {
         if ((var2 == null || var2.invoke(var7)) && !var1.containsItem(var7) && (!var3 || n5(var7))) {
            var1.addItem(var7);
         }
      }
   }

   private static void n5(q0 var0, y8[] var1, List<Object> var2, g7<Annotation> var3) {
      Annotation[] var4 = var0.x8();
      if (var4 != null && var4.length > 0) {
         n5(var4, var2, var3, true);
      }

      y8 var5 = var0.t2().n5();
      if (var5 != null) {
         q0 var6 = var5.n5(var0.s7(), var1);
         if (var6 != null) {
            n5(var6, var1, var2, var3);
         }
      }
   }

   private static void n5(y8 var0, List<Object> var1, g7<Annotation> var2) {
      Annotation[] var3 = var0.x8();
      if (var3 != null && var3.length > 0) {
         n5(var3, var1, var2, true);
      }

      y8 var4 = var0.n5();
      if (var4 != null) {
         n5(var4, var1, var2);
      }
   }

   private static boolean n5(Annotation var0) {
      boolean var1 = true;
      Annotation[] var2 = var0.annotationType().getAnnotations();

      for (Annotation var6 : var2) {
         if (var6.annotationType().equals(com.aspose.slides.ms.System.s7.class)) {
            var1 = ((com.aspose.slides.ms.System.s7)var6).n5();
         }
      }

      return var1;
   }
}
