package com.aspose.slides;

class x2j extends r6o<VideoFrame> {
   public x2j(TemplateContext<VideoFrame> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      VideoFrame var1 = this.u3().getObject();
      com.aspose.slides.internal.o9b.j5 var2 = this.u3().getLocal().<com.aspose.slides.internal.o9b.j5>get("origin").k5();
      String var3 = com.aspose.slides.ms.System.d1.n5(
         "left: {0}px; top: {1}px; width: {2}px; height: {3}px;",
         com.aspose.slides.internal.v6g.k5.u3(var1.getX(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getY(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getWidth(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getHeight(), 13)
      );
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var1.getWidth(), 13);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.getHeight(), 13);
      String var6 = f3p.n5(var1, this.u3());
      String var7 = var1.getEmbeddedVideo().getContentType();
      String var8 = com.aspose.slides.ms.System.d1.n5(
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      );
      String var9 = "";
      if (this.u3().getLocal().containsKey("animationAttributes")) {
         var9 = this.u3().getLocal().get("animationAttributes");
      }

      this.l6("\r\n<table class=\"table\"");
      this.n5("id", " id=\"", 1306, "\"", 1314, 1);
      this.n5("", 1311, var8, 1311, 3, false);
      this.a6();
      this.n5("style", " style=\"", 1315, "\"", 1337, 1);
      this.n5("", 1323, var3, 1323, 14, false);
      this.a6();
      this.l6(" ");
      this.k5(this.n5(var9));
      this.l6(">\r\n    <tr>\r\n        <td>\r\n        <video");
      this.n5("style", " style=\"", 1405, "\"", 1427, 1);
      this.n5("", 1413, var3, 1413, 14, false);
      this.a6();
      this.l6(" controls>\r\n            <source");
      this.n5("src", " src=\"", 1459, "\"", 1474, 1);
      this.n5("", 1465, var6, 1465, 9, false);
      this.a6();
      this.n5("type", " type=\"", 1475, "\"", 1494, 1);
      this.n5("", 1482, var7, 1482, 12, false);
      this.a6();
      this.l6(">\r\n            Your browser does not support the video tag.\r\n        </video>\r\n        </td>\r\n    </tr>\r\n</table>\r\n");
   }
}
