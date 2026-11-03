package com.aspose.slides.internal.f8y;

public class n5 {
   private static boolean l6 = true;
   private static int k5 = 0;
   private static int u3 = 0;
   private static n5$n5 a6 = n5$n5.k5;
   private static final com.aspose.slides.internal.c9q.n5$n5 u9 = new l6();
   // $VF: synthetic field
   static final boolean n5 = !n5.class.desiredAssertionStatus();

   public static void n5(boolean var0) {
      assert var0;
   }

   public static void n5(boolean var0, String var1) {
      assert var0 : var1;
   }

   public static void n5(String var0) {
      assert false : var0;
   }

   public static void l6(String var0) {
      k5(var0);
   }

   public static void k5(String var0) {
      com.aspose.slides.internal.c9q.n5.n5(var0);
   }

   public static void n5(String var0, Object... var1) {
      com.aspose.slides.internal.c9q.n5.n5(u9, var0, var1);
   }

   public static void u3(String var0) {
      k5(var0);
   }

   public static void l6(boolean var0, String var1) {
      if (var0) {
         u3(var1);
      }
   }

   public static void n5(Throwable var0, n5$n5 var1) {
      switch (var1) {
         case None:
         default:
            break;
         case Message:
            k5(var0.toString());
            break;
         case Full:
            com.aspose.slides.internal.c9q.n5.n5(var0.toString(), var0);
      }
   }

   public static void n5(Throwable var0) {
      n5(var0, a6);
   }
}
