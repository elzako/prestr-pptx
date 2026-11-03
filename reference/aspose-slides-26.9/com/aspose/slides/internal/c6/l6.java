package com.aspose.slides.internal.c6;

import com.aspose.slides.IAIConversation;
import com.aspose.slides.IAIWebClient;
import com.aspose.slides.ms.System.d1;

class l6 implements t9 {
   private final IAIWebClient n5;

   public l6(IAIWebClient var1) {
      this.n5 = var1;
   }

   @Override
   public z3 n5(String var1) {
      IAIConversation var2 = this.n5.createConversation();
      String var3 = n5(var2, var1);
      return com.aspose.slides.internal.c6.n5.n5(z3.class, var3);
   }

   private static String n5(IAIConversation var0, String var1) {
      String var2 = d1.n5(
         "Provide detailed presentation content in JSON format corresponding for the given text. Group it by sections.\r\nHere is the json scheme: {{ 'title': '', 'subtitle': '', 'sections': [ {{ ... }}, {{ ... }} ] }}.\r\nThe section schema depends on type and can be one of the following:\r\n            {{ 'type': 'ordinary', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'bulleted', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'numbered', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'table', 'title': '', 'columnHeaders': ['', ''], 'rows': [ {{ cells: ['', ''] }} ] }}\r\n{1}\r\nHere is the text: {0}",new Object[]{
         var1,
         d1.n5
      });
      return var0.getResponse(var2);
   }
}
