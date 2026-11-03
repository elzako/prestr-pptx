package com.aspose.slides;

class b5 extends r6o<AudioFrame> {
   public b5(TemplateContext<AudioFrame> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      AudioFrame var1 = this.u3().getObject();
      String var2 = q8s.n5(var1.getEmbeddedAudio(), this.u3());
      String var3 = com.aspose.slides.ms.System.d1.n5(
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      );
      String var4 = this.u3().getLocal().containsKey("animationAttributes") ? this.u3().getLocal().get("animationAttributes") : "";
      this.l6("\r\n<audio");
      this.n5("id", " id=\"", 692, "\"", 700, 1);
      this.n5("", 697, var3, 697, 3, false);
      this.a6();
      this.l6(" ");
      this.k5(this.n5(var4));
      this.l6(">\r\n    <source");
      this.n5("src", " src=\"", 741, "\"", 759, 1);
      this.n5("", 747, var2, 747, 12, false);
      this.a6();
      this.n5("type", " type=\"", 760, "\"", 807, 1);
      this.n5("", 767, var1.getEmbeddedAudio().getContentType(), 767, 40, false);
      this.a6();
      this.l6(">\r\n    Your browser does not support the audio tag.\r\n</audio>\r\n");
   }
}
