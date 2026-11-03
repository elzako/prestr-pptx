package com.aspose.slides;

class s5l {
   public static boolean n5(String var0, int[] var1) {
      var1[0] = n5("diagrams/data", "diagrams/data".length(), var0);
      return var1[0] != -1;
   }

   public static boolean l6(String var0, int[] var1) {
      var1[0] = n5("slideLayouts/slideLayout", "slideLayouts/slideLayout".length(), var0);
      return var1[0] != -1;
   }

   public static boolean k5(String var0, int[] var1) {
      var1[0] = n5("slideMasters/slideMaster", "slideMasters/slideMaster".length(), var0);
      return var1[0] != -1;
   }

   public static boolean u3(String var0, int[] var1) {
      var1[0] = n5("notesSlides/notesSlide", "notesSlides/notesSlide".length(), var0);
      return var1[0] != -1;
   }

   public static boolean a6(String var0, int[] var1) {
      var1[0] = n5("comments/comment", "comments/comment".length(), var0);
      if (var1[0] == -1) {
         var1[0] = n5(var0);
      }

      return var1[0] != -1;
   }

   private static int n5(String var0, int var1, String var2) {
      int var3 = com.aspose.slides.ms.System.d1.u9(var2, var0, (short)4);
      return var3 == -1 ? -1 : n5(var2, var1, var3);
   }

   private static int n5(String var0, int var1, int var2) {
      int var3 = var2 + var1;
      int var4 = com.aspose.slides.ms.System.d1.l6(var0, '.', var3);
      return com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var0, var3, var4 - var3));
   }

   private static int n5(String var0) {
      com.aspose.slides.internal.r7c.c8 var1 = new com.aspose.slides.internal.r7c.c8("modernComment.*?(\\d+)[^/]*\\.xml", 0);
      com.aspose.slides.internal.r7c.u3 var2 = var1.l6(var0);
      return var2.u3() ? com.aspose.slides.ms.System.a3.n5(var2.a6().n5(1).k5()) : -1;
   }
}
