package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class VideoPlayerHtmlController implements IVideoPlayerHtmlController {
   private final Dictionary<Integer, String> n5 = new Dictionary<>();
   private final Dictionary<IAudio, String> l6 = new Dictionary<>();
   private final Dictionary<IVideo, String> k5 = new Dictionary<>();
   private final Dictionary<String, String> u3 = new Dictionary<>();
   private final List<IAudio> a6 = new List<>();
   private final com.aspose.slides.ms.System.r8 u9;
   private final String h0;
   private final String c8;
   private int t2 = 1;
   private int s7;
   private static final String x8 = com.aspose.slides.ms.System.d1.n5(new String[]{
      "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">",
      "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\n<title>"
   });
   private static final String n3 = com.aspose.slides.ms.System.d1.n5(new String[]{
      "</title>\n<style type=\"text/css\"></style>\n<script type=\"text/javascript\">\n",
      "function playPause(id)\n{\n  var media = document.getElementById(id);\n",
      "  if (media.paused || media.ended || media.seeking || media.readyState < media.HAVE_FUTURE_DATA)\n",
      "    media.play();\n  else\n    media.pause();\n}\n</script>\n</head>\n<body>"
   });
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "image/svg+xml", "video/mp4", "video/ogg", "video/webm", "video/x-msvideo", "video/quicktime", "audio/mpeg", "audio/wav", "audio/ogg", "audio/mp4"
   );

   public VideoPlayerHtmlController(String path, String fileName, String baseUri) {
      this.c8 = path;
      this.h0 = fileName;
      this.u9 = new com.aspose.slides.ms.System.r8(baseUri);
   }

   @Override
   public final void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
      generator.addHtml(x8);
      generator.addText(presentation.getDocumentProperties().getTitle());
      generator.addHtml(n3);
   }

   @Override
   public final void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
      for (int var3 = 0; var3 < this.a6.size(); var3++) {
         generator.addHtml(com.aspose.slides.ms.System.d1.n5("<audio id=\"audio{0}\" style=\"display:none\">\n", new Object[]{var3}));
         IAudio var4 = this.a6.get_Item(var3);
         generator.addHtml(com.aspose.slides.ms.System.d1.n5("<source src=\"{0}\" type=\"{1}\">\n</audio>",new Object[]{ this.n5(var4), var4.getContentType()}));
      }

      generator.addHtml("</body></html>");
   }

   @Override
   public final void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
      generator.addHtml(
         com.aspose.slides.ms.System.d1.n5(
            "<div class=\"slideImage\" style=\"position: relative; width:{0}; height:{1}\">\n<div style=\"position: absolute; left:0; right:0; z-index:0\">\n",new Object[]{
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.Xml.f4.n5(((HtmlGenerator)generator).u3().l6()), generator.getSlideImageSizeUnitCode()
            }),
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.Xml.f4.n5(((HtmlGenerator)generator).u3().k5()), generator.getSlideImageSizeUnitCode()
            })
         })
      );
      this.t2 = 1;
   }

   @Override
   public final void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
      generator.addHtml("</div></div>\n");
   }

   @Override
   public final void writeShapeStart(IHtmlGenerator generator, IShape shape) {
   }

   @Override
   public final void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
      if (com.aspose.slides.internal.v6g.k5.l6(shape, VideoFrame.class)) {
         IVideoFrame var3 = (IVideoFrame)shape;
         if (var3.getEmbeddedVideo() != null) {
            IVideo var4 = var3.getEmbeddedVideo();
            if (!"video/mp4".equals(var4.getContentType()) && !"video/webm".equals(var4.getContentType()) && !"video/ogg".equals(var4.getContentType())) {
               this.l6(var3, generator);
            } else {
               this.n5(var3, generator);
            }
         }
      }
   }

   private void n5(IVideoFrame var1, IHtmlGenerator var2) {
      VideoPlayerHtmlController$n5 var3 = this.k5(var1, var2);
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5("</div><div id=\"video{0}\" style=\"position:absolute; left:{1}; top:{2}; z-index:{3}\">\n", this.s7, var3.n5(), var3.l6(), ++this.t2);
      var4.n5("<video id=\"video{0}video\" style=\"width:{1}; height:{2}\" controls=\"controls\">\n", this.s7, var3.k5(), var3.u3());
      var4.n5("<source src=\"{0}\" type=\"{1}\">\n", this.n5(var1.getEmbeddedVideo()), var1.getEmbeddedVideo().getContentType());
      this.s7++;
      var4.n5("</video>\n</div>\n<div style=\"position: absolute; left:0; right:0; z-index:{0}; pointer-events:none\">", ++this.t2);
      var2.addHtml(var4.toString());
   }

   private void l6(IVideoFrame var1, IHtmlGenerator var2) {
      VideoPlayerHtmlController$n5 var3 = this.k5(var1, var2);
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5("</div><div id=\"video{0}\" style=\"position:absolute; left:{1}; top:{2}; z-index:{3}\">\n", this.s7, var3.n5(), var3.l6(), ++this.t2);
      var4.n5(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            "<object id=\"video{0}\" classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" ",
            "codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0\" ",
            "width=\"{1}\" height=\"{2}\" >\n"
         }),
         this.s7,
         var3.k5(),
         var3.u3()
      );
      String var5 = this.n5(var1.getEmbeddedVideo());
      var4.n5("<param name=\"movie\" value=\"{0}\">", var5);
      var4.n5("<param name=\"quality\" value=\"high\" >");
      var4.n5("<param name=\"LOOP\" value=\"false\">");
      var4.n5("<param name=\"ShowControls\" value=\"true\">");
      var4.n5("<param name=\"autostart\" value=\"false\">");
      var4.n5("<param name=\"ShowStatusBar\" value=\"false\">");
      float var6 = ((HtmlGenerator)var2).u3().l6() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6();
      float var7 = ((HtmlGenerator)var2).u3().k5() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5();
      var4.n5(
         com.aspose.slides.ms.System.d1.n5(new String[]{
            "<embed src=\"{0}\" width=\"{1}\" height=\"{2}\" ",
            "loop=\"false\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" ",
            "type=\"application/x-shockwave-flash\"></embed>"
         }),
         var5,
         com.aspose.slides.internal.v6g.k5.u3(var1.getFrame().getWidth() * var6 * 100.0F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getFrame().getHeight() * var7 * 100.0F, 13)
      );
      var4.n5("</object>\n");
      this.s7++;
      var4.n5("</div>\n<div style=\"position: absolute; left:0; right:0; z-index:{0}; pointer-events:none\">", ++this.t2);
      var2.addHtml(var4.toString());
   }

   private VideoPlayerHtmlController$n5 k5(IVideoFrame var1, IHtmlGenerator var2) {
      float var3 = ((HtmlGenerator)var2).u3().l6() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6();
      float var4 = ((HtmlGenerator)var2).u3().k5() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5();
      IShapeFrame var5 = var1.getFrame();
      String var6 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var5.getX() * var3), var2.getSlideImageSizeUnitCode()});
      String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var5.getY() * var4), var2.getSlideImageSizeUnitCode()});
      String var8 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var5.getWidth() * var3), var2.getSlideImageSizeUnitCode()});
      String var9 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var5.getHeight() * var4), var2.getSlideImageSizeUnitCode()});
      return new VideoPlayerHtmlController$n5(var6, var7, var8, var9);
   }

   @Override
   public final void formatShape(ISvgShape svgShape, IShape shape) {
      if (com.aspose.slides.internal.v6g.k5.l6(shape, OleObjectFrame.class)) {
         OleObjectFrame var3 = (OleObjectFrame)shape;
         if (var3.e2() != null) {
            svgShape.setEventHandler(3, com.aspose.slides.ms.System.d1.n5("document.location.assign('{0}')", new Object[]{this.n5("object", "bin", var3.e2())}));
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(shape, IAudioFrame.class)) {
         IAudioFrame var5 = (IAudioFrame)shape;
         if (var5.getEmbeddedAudio() != null) {
            IAudio var4 = var5.getEmbeddedAudio();
            if (!"audio/mpeg".equals(var4.getContentType())
               && !"audio/wav".equals(var4.getContentType())
               && !"audio/ogg".equals(var4.getContentType())
               && !"audio/mp4".equals(var4.getContentType())) {
               svgShape.setEventHandler(3, com.aspose.slides.ms.System.d1.n5("document.location.assign('{0}')", new Object[]{this.n5(var5.getEmbeddedAudio())}));
            } else {
               svgShape.setEventHandler(3, com.aspose.slides.ms.System.d1.n5("playPause('{0}')", new Object[]{this.l6(var5.getEmbeddedAudio())}));
            }
         }
      }
   }

   @Override
   public final int getObjectStoringLocation(int id, byte[] entityData, String semanticName, String contentType, String recomendedExtension) {
      switch (y4.n5(contentType)) {
         case 0:
            return 1;
         default:
            String var6 = recomendedExtension;
            if (var6 == null) {
               var6 = "bin";
            }

            String var7 = this.n5(semanticName, var6);
            if (!this.n5.containsKey(id)) {
               this.n5.addItem(id, var7);
            }

            return 0;
      }
   }

   @Override
   public final String getUrl(int id, int referrer) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !this.n5.tryGetValue(id, var4);
      var3 = var4[0];
      if (var5) {
         return null;
      }

      com.aspose.slides.ms.System.r8 var6;
      if (id == 0) {
         var6 = new com.aspose.slides.ms.System.r8(this.u9, this.h0);
      } else {
         String var7 = null;
         String[] var8 = new String[]{var7};
         this.n5.tryGetValue(referrer, var8);
         var7 = var8[0];
         var6 = new com.aspose.slides.ms.System.r8(this.u9, var7);
      }

      com.aspose.slides.ms.System.r8 var11 = new com.aspose.slides.ms.System.r8(this.u9, var3);
      return var6.n5(var11).toString();
   }

   @Override
   public final void saveExternal(int id, byte[] entityData) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      this.n5.tryGetValue(id, var4);
      var3 = var4[0];
      com.aspose.slides.internal.z0k.n3 var5 = new com.aspose.slides.internal.z0k.n3(this.n5(var3), 2);

      try {
         var5.write(entityData, 0, entityData.length);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private String n5(String var1, String var2, byte[] var3) {
      com.aspose.slides.internal.o8m.h6 var4 = new com.aspose.slides.internal.o8m.h6();

      try {
         var4.l6(var3);
         String var5 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.x8.n5(var4.n3()), var2});
         String var6 = null;
         String[] var7 = new String[]{var6};
         boolean var8 = this.u3.tryGetValue(var5, var7);
         var6 = var7[0];
         if (var8) {
            return var6;
         }

         var6 = this.n5(var1, var2);
         com.aspose.slides.internal.z0k.n3 var9 = new com.aspose.slides.internal.z0k.n3(this.n5(var6), 2);

         try {
            var9.write(var3, 0, var3.length);
            var9.close();
            this.u3.set_Item(var5, var6);
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }

         return var6;
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private String n5(IVideo var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = this.k5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      String var5 = l6(var1.getContentType());
      var2 = this.n5("video", var5);
      this.k5.set_Item(var1, var2);
      com.aspose.slides.internal.z0k.n3 var6 = new com.aspose.slides.internal.z0k.n3(com.aspose.slides.internal.z0k.z1.l6(this.c8, var2), 2);

      try {
         byte[] var7 = var1.getBinaryData();
         var6.write(var7, 0, var7.length);
         var6.close();
         return var2;
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private String n5(IAudio var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = this.l6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      String var5 = l6(var1.getContentType());
      var2 = this.n5("audio", var5);
      this.l6.set_Item(var1, var2);
      com.aspose.slides.internal.z0k.n3 var6 = new com.aspose.slides.internal.z0k.n3(com.aspose.slides.internal.z0k.z1.l6(this.c8, var2), 2);

      try {
         byte[] var7 = var1.getBinaryData();
         var6.write(var7, 0, var7.length);
         var6.close();
         return var2;
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private String l6(IAudio var1) {
      int var2 = this.a6.indexOf(var1);
      if (var2 >= 0) {
         return com.aspose.slides.ms.System.d1.n5(new String[]{"audio", com.aspose.slides.ms.System.a3.l6(var2)});
      }

      this.a6.addItem(var1);
      return com.aspose.slides.ms.System.d1.n5(new String[]{"audio", com.aspose.slides.ms.System.a3.l6(this.a6.size() - 1)});
   }

   private String n5(String var1, String var2) {
      int var3 = 0;

      while (true) {
         String var4 = this.n5(com.aspose.slides.ms.System.d1.n5("{0}{1}.{2}",new Object[]{ var1, var3, var2}));
         if (!com.aspose.slides.internal.z0k.u9.k5(var4)) {
            return com.aspose.slides.internal.z0k.z1.n5(var4);
         }

         var3++;
      }
   }

   private String n5(String var1) {
      return com.aspose.slides.internal.z0k.z1.l6(this.c8, var1);
   }

   private static String l6(String var0) {
      String var1;
      switch (y4.n5(var0)) {
         case 1:
            var1 = "mp4";
            break;
         case 2:
            var1 = "ogv";
            break;
         case 3:
            var1 = "webm";
            break;
         case 4:
            var1 = "avi";
            break;
         case 5:
            var1 = "mov";
            break;
         case 6:
            var1 = "mp3";
            break;
         case 7:
            var1 = "wav";
            break;
         case 8:
            var1 = "ogg";
            break;
         case 9:
            var1 = "m4a";
            break;
         default:
            var1 = "bin";
      }

      return var1;
   }
}
