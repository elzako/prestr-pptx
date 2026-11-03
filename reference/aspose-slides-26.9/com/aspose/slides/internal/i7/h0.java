package com.aspose.slides.internal.i7;

import java.net.HttpURLConnection;
import java.net.URL;

public final class h0 extends com.aspose.slides.internal.l1.k5 {
   private final String n5;
   private final String l6;

   public h0(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   protected HttpURLConnection n5(n5 var1) {
      try {
         URL var2 = new URL("https://api.openai.com/v1/chat/completions");
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setRequestMethod("POST");
         var3.setRequestProperty("Content-Type", "application/json");
         var3.setRequestProperty("Authorization", "Bearer " + this.n5);
         if (this.l6 != null && !this.l6.isEmpty()) {
            var3.setRequestProperty("OpenAI-Organization", this.l6);
         }

         return var3;
      } catch (Exception var4) {
         throw new c8("Failed to establish connection: " + var4.getMessage());
      }
   }
}
