package com.aspose.slides.internal.c6;

import com.aspose.slides.IAIConversation;
import com.aspose.slides.IAIWebClient;
import com.aspose.slides.ms.System.d1;

class z1 implements t9 {
   private final IAIWebClient n5;

   public z1(IAIWebClient var1) {
      this.n5 = var1;
   }

   @Override
   public z3 n5(String var1) {
      IAIConversation var2 = this.n5.createConversation();
      String var3 = n5(var2, var1);
      z3 var4 = com.aspose.slides.internal.c6.n5.n5(z3.class, var3);

      for (int var5 = 0; var5 < var4.k5().size(); var5++) {
         n5(var2, var4, var5);
      }

      return var4;
   }

   private static void n5(IAIConversation var0, z3 var1, int var2) {
      String var3 = l6(var0, var1.k5().get_Item(var2).n5());
      z8 var4 = com.aspose.slides.internal.c6.n5.n5(z8.class, var3);
      if (!d1.n5(var4.n5())) {
         var4.n5(var1.k5().get_Item(var2).n5());
         var1.k5().set_Item(var2, var4);
      }
   }

   private static String n5(IAIConversation var0, String var1) {
      String var2 = d1.n5(
         "Provide presentation structure in JSON format corresponding for the given text.\r\nHere is the json schema: {{ 'title': '', 'subtitle': '', 'sections': [ {{ ... }}, {{ ... }} ] }}.\r\nDo not leave the sections array empty.\r\nThe sections must contain title and conform to the following schema: {{ 'title': '' }}\r\n{1}\r\nHere is the text: {0}",new Object[]{
         var1,
         d1.n5
      });
      return var0.getResponse(var2);
   }

   private static String l6(IAIConversation var0, String var1) {
      String var2 = d1.n5(
         "Give more detailed content in JSON format for the following part:\r\n{0}\r\nThe JSON must conform to one of the following schemas\r\n            {{ 'type': 'ordinary', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'bulleted', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'numbered', 'title': '', 'paragraphs': ['', ''] }}\r\n            {{ 'type': 'table', 'title': '', 'columnHeaders': ['', ''], 'rows': [ {{ cells: ['', ''] }} ] }}.\r\nPlease do not add JSON properties that do not conform to one of the schemas above.",
         new Object[]{var1}
      );
      return var0.getResponse(var2);
   }
}
