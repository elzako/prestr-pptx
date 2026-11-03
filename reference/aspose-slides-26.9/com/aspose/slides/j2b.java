package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class j2b {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("strVal", "intVal", "fltVal", "boolVal", "clrVal");

   public static Object n5(com.aspose.slides.internal.k4y.k7v var0) {
      switch (n5.n5(var0.n5().n5())) {
         case 0:
            com.aspose.slides.internal.k4y.w8j var1 = (com.aspose.slides.internal.k4y.w8j)var0.n5().l6();
            return var1.n5();
         case 1:
            com.aspose.slides.internal.k4y.f1f var2 = (com.aspose.slides.internal.k4y.f1f)var0.n5().l6();
            return var2.n5();
         case 2:
            com.aspose.slides.internal.k4y.k1k var3 = (com.aspose.slides.internal.k4y.k1k)var0.n5().l6();
            return var3.n5();
         case 3:
            com.aspose.slides.internal.k4y.w5w var4 = (com.aspose.slides.internal.k4y.w5w)var0.n5().l6();
            return var4.n5();
         case 4:
            com.aspose.slides.internal.k4y.z4 var5 = (com.aspose.slides.internal.k4y.z4)var0.n5().l6();
            ColorFormat var6 = new ColorFormat(null);
            c4i.n5(var6, var5);
            return var6;
         default:
            throw new Exception();
      }
   }

   public static void n5(Object var0, com.aspose.slides.internal.k4y.k7v var1) {
      if (var0 instanceof String) {
         com.aspose.slides.internal.k4y.w8j var2 = (com.aspose.slides.internal.k4y.w8j)var1.n5("strVal").l6();
         var2.n5((String)var0);
      } else if (var0 instanceof Integer) {
         com.aspose.slides.internal.k4y.f1f var3 = (com.aspose.slides.internal.k4y.f1f)var1.n5("intVal").l6();
         var3.n5((Integer)var0);
      } else if (var0 instanceof Float) {
         com.aspose.slides.internal.k4y.k1k var4 = (com.aspose.slides.internal.k4y.k1k)var1.n5("fltVal").l6();
         var4.n5((Float)var0);
      } else if (var0 instanceof Boolean) {
         com.aspose.slides.internal.k4y.w5w var5 = (com.aspose.slides.internal.k4y.w5w)var1.n5("boolVal").l6();
         var5.n5((Boolean)var0);
      } else {
         if (!(var0 instanceof IColorFormat)) {
            throw new Exception();
         }

         com.aspose.slides.internal.k4y.z4 var6 = (com.aspose.slides.internal.k4y.z4)var1.n5("clrVal").l6();
         c4i.l6((IColorFormat)var0, var6);
      }
   }
}
