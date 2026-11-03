package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.io.Closeable;
import java.net.HttpURLConnection;

public class OpenAIWebClient implements IAIWebClient, Closeable {
   private final x3w n5;
   private final HttpURLConnection l6;
   private boolean k5;

   public OpenAIWebClient(String model, String apiKey, String organizationId) {
      this(model, apiKey, organizationId, x3w.l6());
      this.k5 = true;
   }

   public OpenAIWebClient(String model, String apiKey, String organizationId, HttpURLConnection httpClient) {
      if (com.aspose.slides.ms.System.d1.n5(apiKey)) {
         throw new ArgumentException("API key value can't be null or empty");
      }

      if (com.aspose.slides.ms.System.d1.n5(model)) {
         throw new ArgumentException("Text model value can't be null or empty");
      }

      if (httpClient == null) {
         throw new ArgumentNullException("httpClient", "HttpClient instance is not provided");
      }

      this.l6 = httpClient;
      this.n5 = new x3w(new com.aspose.slides.internal.i7.h0(apiKey, organizationId), model, httpClient);
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
   public final void close() {
      if (this.k5) {
         this.l6.disconnect();
      }
   }
}
