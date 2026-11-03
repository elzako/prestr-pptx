package com.aspose.slides;

class u6g extends r6o<PictureFrame> {
   public u6g(TemplateContext<PictureFrame> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      PictureFrame var1 = this.u3().getObject();
      com.aspose.slides.internal.o9b.j5 var2 = this.u3().getLocal().<com.aspose.slides.internal.o9b.j5>get("origin").k5();
      int var3 = this.u3().getGlobal().containsKey("picturesCompression") ? this.u3().getGlobal().<Integer>get("picturesCompression") : 5;
      String var4 = m4w.n5(var1.getPictureFormat().getPicture().getImage(), this.u3());
      if (this.u3().getGlobal().<Boolean>get("embedImages")) {
         var4 = m4w.n5(
            var4,
            var1.getPictureFormat().getCropLeft(),
            var1.getPictureFormat().getCropTop(),
            var1.getPictureFormat().getCropRight(),
            var1.getPictureFormat().getCropBottom()
         );
      } else {
         if ("image/tiff".equals(var1.getPictureFormat().getPicture().getImage().getContentType())) {
            m4w.l6(var1.getPictureFormat().getPicture().getImage(), this.u3());
            var4 = com.aspose.slides.ms.System.d1.n5(var4, ".png");
         }

         var4 = m4w.n5(
            var1.getPictureFormat().getPicture().getImage(),
            this.u3(),
            var1.getPictureFormat().getCropLeft(),
            var1.getPictureFormat().getCropTop(),
            var1.getPictureFormat().getCropRight(),
            var1.getPictureFormat().getCropBottom()
         );
      }

      String var5 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      });
      String var6 = "";
      if (this.u3().getLocal().containsKey("animationAttributes")) {
         var6 = this.u3().getLocal().get("animationAttributes");
      }

      String var7 = m4w.n5(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var5, "-effect"}));
      String var8 = com.aspose.slides.ms.System.d1.n5(var7) ? "" : com.aspose.slides.ms.System.d1.n5(new String[]{"filter: url(#", var5, "-effect)"});
      String var9 = m4w.n5(var1);
      var4 = m4w.n5(var4, com.aspose.slides.internal.v6g.k5.n5(this.u3(), TemplateContext.class), var3);
      this.k5(this.n5(var7));
      this.l6("\r\n<img");
      this.n5("src", " src=\"", 2502, "\"", 2515, 1);
      this.n5("", 2508, var4, 2508, 7, false);
      this.a6();
      this.n5("id", " id=\"", 2516, "\"", 2524, 1);
      this.n5("", 2521, var5, 2521, 3, false);
      this.a6();
      this.l6(" class=\"pictureframe\"");
      this.n5("style", " style=\"", 2546, "\"", 2638, 3);
      this.n5("", 2554, this.n5(var1, var2.k5()), 2554, 48, false);
      this.n5(" ", 2602, this.n5(var8), 2603, 17, false);
      this.n5(" ", 2620, this.n5(var9), 2621, 17, false);
      this.a6();
      this.l6(" ");
      this.k5(this.n5(var6));
      this.l6("/>");
   }

   private String n5(PictureFrame var1, com.aspose.slides.internal.o9b.j5 var2) {
      return m4w.n5(var1, var2.k5());
   }
}
