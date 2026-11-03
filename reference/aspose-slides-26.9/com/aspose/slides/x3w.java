package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class x3w {
   private final com.aspose.slides.internal.l1.k5 n5;
   private final String l6;
   private final HttpURLConnection k5;

   x3w(com.aspose.slides.internal.l1.k5 var1, String var2, HttpURLConnection var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public String n5(String var1) {
      com.aspose.slides.internal.i7.n5 var2 = this.l6(var1);

      try {
         com.aspose.slides.internal.i7.l6 var3 = this.n5.n5(var2, this.k5);
         return var3.n5().get(0).n5().l6();
      } catch (com.aspose.slides.internal.i7.c8 var4) {
         throw new SlidesAIAgentException(var4.getMessage());
      }
   }

   final IAIConversation n5() {
      return new e1k(this.n5, this.l6, this.k5);
   }

   static HttpURLConnection l6() {
      try {
         URL var0 = new URL("https://api.openai.com/v1/chat/completions");
         HttpURLConnection var1 = (HttpURLConnection)var0.openConnection();
         var1.setReadTimeout(300000);
         return var1;
      } catch (IOException var2) {
         throw new InvalidOperationException("Failed to create default HttpURLConnection");
      }
   }

   private com.aspose.slides.internal.i7.n5 l6(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Open AI chat instruction can't be null or empty");
      }

      com.aspose.slides.internal.i7.n5 var2 = new com.aspose.slides.internal.i7.n5();
      String var3 = this.l6;
      if (var3 == null) {
         var3 = "gpt-4o-mini";
      }

      var2.n5(var3);
      com.aspose.slides.internal.i7.u9 var4 = new com.aspose.slides.internal.i7.u9();
      var4.l6(var1);
      var4.n5("user");
      var2.n5().add(var4);
      return var2;
   }
}
