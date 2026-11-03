package com.aspose.slides.internal.n8e;

class b5 {
   private static int n5;
   private static boolean l6;
   private static int k5;

   static void n5() {
      n5 = 48;
      l6 = true;
      k5 = 0;
   }

   static int l6() {
      return n5 == 128 && !l6 ? 256 : 4096;
   }

   static void n5(int var0) {
      k5 = var0;
   }

   static int k5() {
      return n5;
   }

   static void l6(int var0) {
      n5 = var0;
   }

   static void n5(boolean var0) {
      l6 = var0;
   }

   static {
      n5();
   }
}
