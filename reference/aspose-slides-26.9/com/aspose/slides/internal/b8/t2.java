package com.aspose.slides.internal.b8;

import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import java.io.InputStream;

public class t2 {
   public static InputStream n5(Class var0, String var1) {
      return var0.getResourceAsStream(var1);
   }

   public static t4 l6(Class var0, String var1) {
      var1 = var1.replace("/Aspose/Foundation/Resources/", "");
      InputStream var2 = n5(var0, var1);
      if (var2 == null) {
         throw new IllegalStateException(d1.n5("Cannot find resource '{0}'.", new Object[]{var1}));
      } else {
         return t4.fromJava(var2);
      }
   }
}
