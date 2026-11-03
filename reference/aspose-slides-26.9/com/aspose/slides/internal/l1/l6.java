package com.aspose.slides.internal.l1;

import com.aspose.slides.internal.i7.c8;
import com.aspose.slides.ms.System.d1;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public final class l6 extends k5 {
   private final String n5;
   private final String l6;

   public l6(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   protected HttpURLConnection n5(com.aspose.slides.internal.i7.n5 var1) {
      try {
         String var2 = d1.k5(this.l6, "/") ? this.l6 : d1.n5(new String[]{this.l6, "/"});
         URI var3 = new URI(var2);
         URI var4 = var3.resolve("chat/completions");
         URL var5 = var4.toURL();
         HttpURLConnection var6 = (HttpURLConnection)var5.openConnection();
         var6.setRequestMethod("POST");
         var6.setRequestProperty("Content-Type", "application/json");
         var6.setRequestProperty("Authorization", "Bearer " + this.n5);
         return var6;
      } catch (Exception var7) {
         throw new c8("Failed to establish connection: " + var7.getMessage());
      }
   }
}
