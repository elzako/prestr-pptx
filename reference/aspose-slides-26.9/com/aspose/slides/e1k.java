package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import java.net.HttpURLConnection;

class e1k implements IAIConversation {
   private final com.aspose.slides.internal.l1.k5 n5;
   private final String l6;
   private final List<com.aspose.slides.internal.i7.u9> k5 = new List<>();
   private final HttpURLConnection u3;

   e1k(com.aspose.slides.internal.l1.k5 var1, String var2, HttpURLConnection var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   @Override
   public String getResponse(String instruction) {
      com.aspose.slides.internal.i7.u9 var2 = new com.aspose.slides.internal.i7.u9();
      var2.l6(instruction);
      var2.n5("user");
      this.k5.addItem(var2);
      com.aspose.slides.internal.i7.n5 var3 = new com.aspose.slides.internal.i7.n5();
      var3.n5(this.l6);
      var3.n5(this.k5);
      com.aspose.slides.internal.i7.l6 var4 = this.n5.n5(var3, this.u3);
      this.k5.addItem(var4.n5().get(0).n5());
      return var4.n5().get(0).n5().l6();
   }
}
