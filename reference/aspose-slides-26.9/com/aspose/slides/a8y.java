package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class a8y extends r6o<Slide> {
   public a8y(TemplateContext<Slide> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("    \r\n");
      Slide var1 = this.u3().getObject();
      int var2 = q8s.n5((ISlide)var1);
      String var3 = com.aspose.slides.ms.System.d1.n5(new String[]{"slide-", com.aspose.slides.ms.System.a3.l6(var2), "-comments"});
      String var4 = this.u3().getGlobal().containsKey("notesPosition") ? this.u3().getGlobal().get("notesPosition") : null;
      String var5 = this.u3().getGlobal().containsKey("commentsPosition") ? this.u3().getGlobal().get("commentsPosition") : null;
      if (var4 != null && !"None".equals(var4)) {
         boolean var15 = true;
      } else {
         boolean var10000 = false;
      }

      boolean var7 = var5 != null && !"None".equals(var5);
      int var8 = 0;
      String var9 = "comments";
      if (!"Right".equals(var5)) {
         var9 = com.aspose.slides.ms.System.d1.n5(new String[]{"slide ", var9, " master-bg"});
      }

      this.l6(" \r\n");
      if (var7) {
         this.l6("<div");
         this.n5("id", " id=\"", 1061, "\"", 1074, 1);
         this.n5("", 1066, var3, 1066, 8, false);
         this.a6();
         this.n5("class", " class=\"", 1075, "\"", 1096, 1);
         this.n5("", 1083, var9, 1083, 13, false);
         this.a6();
         this.l6(">\r\n\r\n    <div class=\"comments-header\">Slide ");
         this.n5(var2);
         this.l6("</div>\r\n        \r\n");
         IGenericEnumerator var10 = q8s.n5(var1).iterator();

         try {
            while (var10.hasNext()) {
               IComment var11 = (IComment)var10.next();
               this.l6("            <div");
               this.n5("class", " class=\"", 1279, "\"", 1347, 2);
               this.n5("", 1287, "comment", 1287, 7, true);
               this.n5(" ", 1294, this.n5(var11.getParentComment() != null ? "comment-child" : ""), 1295, 52, false);
               this.a6();
               this.l6(">\r\n                <div class=\"comment-avatar\">\r\n                    ");
               this.k5(this.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var11.getAuthor().getInitials(), com.aspose.slides.ms.System.a3.l6(++var8)})));
               this.l6("\r\n                </div>\r\n                <div class=\"comment-content\">\r\n                    <div class=\"comment-text\">");
               this.k5(this.n5(var11.getText()));
               this.l6("</div>\r\n                    <div class=\"comment-origin\">");
               this.k5(this.n5(var11.getAuthor().getName()));
               this.l6(" ");
               this.k5(((Comment)var11).n5().toString());
               this.l6("</div>\r\n                </div>\r\n            </div>\r\n");
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         this.l6("\r\n</div>\r\n");
      }
   }
}
