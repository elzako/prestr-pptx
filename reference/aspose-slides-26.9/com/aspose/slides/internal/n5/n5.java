package com.aspose.slides.internal.n5;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class n5 extends l6 {
   public n5() {
   }

   public n5(InputStream var1) throws IOException {
      this(var1, null);
   }

   public n5(InputStream var1, String var2) throws IOException {
      this(var1, 1024, var2);
   }

   public n5(InputStream var1, int var2, String var3) throws IOException {
      this(var1, var2, 1024, var3);
   }

   public n5(InputStream var1, int var2, int var3, String var4) throws IOException {
      InputStreamReader var5;
      if (var4 != null) {
         var5 = new InputStreamReader(var1, var4);
      } else {
         var5 = new InputStreamReader(var1);
      }

      this.n5(var5, var2, var3);
   }
}
