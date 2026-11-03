package com.aspose.slides;

import com.aspose.slides.internal.DOMResourcesUtils;

class x4q {
   public static byte[] n5(String var0) {
      try {
         com.aspose.slides.internal.z0k.t4 var1 = DOMResourcesUtils.getResourceStream(var0);

         try {
            com.aspose.slides.internal.o9b.l6 var24 = new com.aspose.slides.internal.o9b.l6(var1);

            try {
               com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

               try {
                  var24.n5(var3, com.aspose.slides.internal.j9e.x8.s7());
                  return var3.toArray();
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } catch (RuntimeException var23) {
         String var2 = com.aspose.slides.ms.System.d1.n5(
            "Error occured in read a bitmap resource embedded file. Details: {0}.", new Object[]{var23.getMessage()}
         );
         throw new t1c(var2, var23);
      }
   }

   public static String l6(String var0) {
      try {
         com.aspose.slides.internal.z0k.t4 var1 = DOMResourcesUtils.getResourceStream(var0);

         try {
            com.aspose.slides.internal.z0k.m3 var15 = new com.aspose.slides.internal.z0k.m3(var1);

            try {
               return var15.c8();
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } catch (RuntimeException var14) {
         String var2 = com.aspose.slides.ms.System.d1.n5("Error occured in read a text resource embedded file. Details: {0}.", new Object[]{var14.getMessage()});
         throw new t1c(var2, var14);
      }
   }
}
