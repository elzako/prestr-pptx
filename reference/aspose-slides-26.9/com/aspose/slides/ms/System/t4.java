package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;

public class t4 {
   static com.aspose.slides.internal.z0k.a0 n5;
   private static com.aspose.slides.internal.z0k.a0 u3;
   private static com.aspose.slides.internal.z0k.y1 a6;
   static com.aspose.slides.internal.l7h.j5 l6 = com.aspose.slides.internal.l7h.j5.u9();
   static com.aspose.slides.internal.l7h.j5 k5 = com.aspose.slides.internal.l7h.j5.u9();

   public static com.aspose.slides.internal.z0k.a0 n5() {
      return n5;
   }

   public static com.aspose.slides.internal.z0k.t4 l6() {
      return new t4$n5(System.in, null);
   }

   public static com.aspose.slides.internal.z0k.t4 k5() {
      return new t4$l6(com.aspose.slides.internal.t9p.l6.n5, null);
   }

   public static void n5(com.aspose.slides.internal.z0k.a0 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("newOut");
      }

      n5 = var0;
   }

   public static void n5(String var0) {
      n5.n5(var0);
   }

   public static void n5(boolean var0) {
      n5.k5(var0);
   }

   public static void n5(int var0) {
      n5.l6(var0);
   }

   public static void n5(Object var0) {
      n5.l6(var0);
   }

   public static void l6(String var0) {
      n5.l6(var0);
   }

   public static void n5(String var0, Object... var1) {
      if (var1 == null) {
         n5.l6(var0);
      } else {
         n5.l6(var0, var1);
      }
   }

   public static void n5(String var0, Object var1, Object var2) {
      n5.l6(var0, var1, var2);
   }

   public static void n5(String var0, Object var1, Object var2, Object var3) {
      n5.l6(var0, var1, var2, var3);
   }

   static void n5(com.aspose.slides.internal.l7h.j5 var0, com.aspose.slides.internal.l7h.j5 var1) {
      com.aspose.slides.internal.z0k.j5 var2 = new com.aspose.slides.internal.z0k.j5(k5(), var1);
      var2.n5(true);
      n5 = com.aspose.slides.internal.z0k.a0.n5(var2);
      var2 = new com.aspose.slides.internal.z0k.j5(k5(), var1);
      var2.n5(true);
      u3 = com.aspose.slides.internal.z0k.a0.n5(var2);
      a6 = new com.aspose.slides.internal.z0k.m3(l6(), var0);
      e5.n5(n5);
      e5.n5(u3);
      e5.n5(a6);
   }

   static {
      n5(l6, k5);
   }
}
