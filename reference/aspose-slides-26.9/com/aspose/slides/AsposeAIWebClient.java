package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import java.net.HttpURLConnection;

public final class AsposeAIWebClient implements IAIWebClient, IDisposable {
   private x3w n5;
   private HttpURLConnection l6;
   private boolean k5;

   public AsposeAIWebClient() {
      this(x3w.l6());
      this.k5 = true;
   }

   public AsposeAIWebClient(HttpURLConnection httpClient) {
      this("https://api.aspose.ai/slides/llm/chat/completions", httpClient);
   }

   public AsposeAIWebClient(String url) {
      this(url, x3w.l6());
      this.k5 = true;
   }

   public AsposeAIWebClient(String url, HttpURLConnection httpClient) {
      if (com.aspose.slides.ms.System.d1.n5(url)) {
         throw new ArgumentNullException("url", "URL can't be null or empty");
      }

      if (httpClient == null) {
         throw new ArgumentNullException("httpClient", "HttpClient instance is not provided");
      }

      this.l6 = httpClient;
      this.n5 = new x3w(new com.aspose.slides.internal.l1.n5(url), "recommended", httpClient);
   }

   @Override
   public String callChat(String instruction) {
      return this.n5.n5(instruction);
   }

   @Override
   public final IAIConversation createConversation() {
      return this.n5.n5();
   }

   @Override
   public final void dispose() {
      if (this.k5) {
         this.l6.disconnect();
      }
   }
}
