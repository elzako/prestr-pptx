package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class q3j extends r6o<Presentation> {
   public q3j(TemplateContext<Presentation> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Presentation var1 = this.u3().getObject();
      boolean var2 = this.u3().getGlobal().<Boolean>get("animateTransitions");
      if (!var2) {
         this.u3().getGlobal().put("animateShapes", false);
      }

      float var3 = ((SlideSize)var1.getSlideSize()).n5().l6();
      float var4 = ((SlideSize)var1.getSlideSize()).n5().k5();
      String var5 = this.u3().getGlobal().containsKey("commentsPosition") ? this.u3().getGlobal().get("commentsPosition") : null;
      if (var5 != null && !"None".equals(var5)) {
         boolean var39 = true;
      } else {
         boolean var10000 = false;
      }

      if (this.u3().getGlobal().containsKey("commentsAreaWidth")) {
         this.u3().getGlobal().<Integer>get("commentsAreaWidth");
      } else {
         short var40 = 170;
      }

      int[] var8 = this.u3().getGlobal().containsKey("slideIndicies") ? this.u3().getGlobal().get("slideIndicies") : null;
      boolean var9 = this.u3().getGlobal().containsKey("handout");
      int var10 = var9 ? this.u3().getGlobal().<Integer>get("handout") : 0;
      if (var9) {
         this.u3().getGlobal().<Boolean>get("printComments");
      } else {
         boolean var41 = false;
      }

      boolean var12 = var9 ? this.u3().getGlobal().<Boolean>get("printSlideNumbers") : true;
      if (var9) {
         this.u3().getGlobal().<Boolean>get("printFrameSlide");
      } else {
         boolean var42 = true;
      }

      this.l6(
         "\r\n<!DOCTYPE html>\r\n\r\n<html\r\n    xmlns=\"http://www.w3.org/1999/xhtml\"\r\n    xmlns:svg=\"http://www.w3.org/2000/svg\"\r\n    xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <title>"
      );
      this.k5(var1.getDocumentProperties().getTitle());
      this.l6(
         "</title>\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"pres.css\" />\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"master.css\" />\r\n    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\">\r\n    </script>\r\n    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js\">\r\n    </script>\r\n    <script src=\"animation.js\"></script>\r\n    <script src=\"effects.js\"></script>\r\n    <script src=\"navigation.js\"></script>\r\n</head>\r\n<body>\r\n    <div class=\"bg\">\r\n        <div id=\"flash\" class=\"slide\" style=\"background-color: #FFFFFF; outline: 0; display: none;\">\r\n        </div>\r\n        <div id=\"blackboard\" class=\"slide\" style=\"background-color: #000000; outline: 0; display: none;\">\r\n        </div>\r\n"
      );
      if (var8 == null) {
         int var14 = 0;
         var8 = new int[var1.getSlides().size()];
         IGenericEnumerator var15 = var1.getSlides().iterator();

         try {
            while (var15.hasNext()) {
               Slide var16 = (Slide)var15.next();
               var8[var14++] = var16.getSlideNumber() - 1;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }
      } else {
         for (int var26 = 0; var26 < var8.length; var26++) {
            var8[var26]--;
         }
      }

      List var27 = new List();

      for (int var18 : var8) {
         if (!var1.getSlides().get_Item(var18).getHidden()) {
            var27.addItem(var18);
         }
      }

      var8 = com.aspose.slides.internal.n8e.v4.k5(var27);
      this.l6("\r\n");
      if (var9) {
         int var29 = var8.length;
         byte var32 = 0;
         switch (var10) {
            case 0:
               var32 = 1;
               break;
            case 1:
               var32 = 2;
               break;
            case 2:
               var32 = 3;
               break;
            case 3:
               var32 = 4;
               break;
            case 4:
               var32 = 4;
               break;
            case 5:
               var32 = 6;
               break;
            case 6:
               var32 = 6;
               break;
            case 7:
               var32 = 9;
               break;
            case 8:
               var32 = 9;
         }

         int var34 = var29 / var32;
         if (var34 * var32 < var29) {
            var34++;
         }

         int var36 = 0;

         for (int var19 = 0; var19 < var34; var19++) {
            this.l6("                <div class=\"date\">");
            this.k5(com.aspose.slides.ms.System.j5.s7().n5("dd.MM.yyyy"));
            this.l6("</div>\r\n                <div class=\"page\"");
            this.n5("id", " id=\"", 4496, "\"", 4529, 2);
            this.n5("", 4501, "page", 4501, 4, true);
            this.n5("", 4505, com.aspose.slides.ms.System.a3.l6(var19 + 1), 4505, 24, false);
            this.a6();
            this.l6(">\r\n");

            for (int var20 = 0; var20 < var32 && var36 < var29; var20++) {
               int var21 = var8[var36];
               Slide var22 = (Slide)var1.getSlides().get_Item(var21);
               if (!var22.getHidden()) {
                  var36++;
                  this.l6("                    <div class=\"slideframe\">\r\n                    ");
                  this.k5(g2r.n5(Slide.class, this.n5, "slide", this.u3().subModel(var22)));
                  this.l6("\r\n");
                  if (var12) {
                     this.l6("                        <div class=\"slidenumber\">");
                     this.k5(com.aspose.slides.ms.System.a3.l6(var21 + 1));
                     this.l6("</div>\r\n");
                  }

                  this.l6("                    </div>\r\n");
               }
            }

            this.l6("                </div>\r\n");
         }
      } else {
         for (int var37 : var8) {
            Slide var38 = (Slide)var1.getSlides().get_Item(var37);
            if (!var38.getHidden()) {
               this.k5(g2r.n5(Slide.class, this.n5, "slide", this.u3().subModel(var38)));
               if (var38.getSlideComments(null) != null && var38.getSlideComments(null).length > 0 && !"Right".equals(var5)) {
                  this.k5(g2r.n5(Slide.class, this.n5, "comments", this.u3().subModel(var38)));
               }
            }
         }
      }

      this.l6(
         "\r\n        <div id=\"svgdiv\">\r\n            <svg width=\"0\" height=\"0\" xmlns=\"http://www.w3.org/2000/svg\" style=\"width: 100%; height: auto;\">\r\n                <defs>\r\n                    <clipPath id=\"effectsclip\""
      );
      this.n5("viewbox", "  viewbox=\"", 6058, "\"", 6199, 4);
      this.n5("", 6069, "0", 6069, 1, true);
      this.n5(" ", 6070, "0", 6071, 2, true);
      this.n5(" ", 6072, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 6073, 62, false);
      this.n5(" ", 6135, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 6136, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip1\"");
      this.n5("viewbox", " viewbox=\"", 6261, "\"", 6401, 4);
      this.n5("", 6271, "0", 6271, 1, true);
      this.n5(" ", 6272, "0", 6273, 2, true);
      this.n5(" ", 6274, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 6275, 62, false);
      this.n5(" ", 6337, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 6338, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip2\"");
      this.n5("viewbox", " viewbox=\"", 6463, "\"", 6603, 4);
      this.n5("", 6473, "0", 6473, 1, true);
      this.n5(" ", 6474, "0", 6475, 2, true);
      this.n5(" ", 6476, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 6477, 62, false);
      this.n5(" ", 6539, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 6540, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip3\"");
      this.n5("viewbox", " viewbox=\"", 6665, "\"", 6805, 4);
      this.n5("", 6675, "0", 6675, 1, true);
      this.n5(" ", 6676, "0", 6677, 2, true);
      this.n5(" ", 6678, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 6679, 62, false);
      this.n5(" ", 6741, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 6742, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip4\"");
      this.n5("viewbox", " viewbox=\"", 6867, "\"", 7007, 4);
      this.n5("", 6877, "0", 6877, 1, true);
      this.n5(" ", 6878, "0", 6879, 2, true);
      this.n5(" ", 6880, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 6881, 62, false);
      this.n5(" ", 6943, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 6944, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip5\"");
      this.n5("viewbox", " viewbox=\"", 7069, "\"", 7209, 4);
      this.n5("", 7079, "0", 7079, 1, true);
      this.n5(" ", 7080, "0", 7081, 2, true);
      this.n5(" ", 7082, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 7083, 62, false);
      this.n5(" ", 7145, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 7146, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip6\"");
      this.n5("viewbox", " viewbox=\"", 7271, "\"", 7411, 4);
      this.n5("", 7281, "0", 7281, 1, true);
      this.n5(" ", 7282, "0", 7283, 2, true);
      this.n5(" ", 7284, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 7285, 62, false);
      this.n5(" ", 7347, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 7348, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip7\"");
      this.n5("viewbox", " viewbox=\"", 7473, "\"", 7613, 4);
      this.n5("", 7483, "0", 7483, 1, true);
      this.n5(" ", 7484, "0", 7485, 2, true);
      this.n5(" ", 7486, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 7487, 62, false);
      this.n5(" ", 7549, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 7550, 63, false);
      this.a6();
      this.l6("></clipPath>\r\n                    <clipPath id=\"effectsclip8\"");
      this.n5("viewbox", " viewbox=\"", 7675, "\"", 7815, 4);
      this.n5("", 7685, "0", 7685, 1, true);
      this.n5(" ", 7686, "0", 7687, 2, true);
      this.n5(" ", 7688, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), 7689, 62, false);
      this.n5(" ", 7751, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5()), 7752, 63, false);
      this.a6();
      this.l6(
         "></clipPath>\r\n                </defs>\r\n            </svg>\r\n        </div>\r\n        <div id=\"svgdivpaths\">\r\n            <svg id=\"patheffects\""
      );
      this.n5("width", " width=\"", 7956, "\"", 8001, 1);
      this.n5("", 7964, f7i.n5(var3), 7964, 37, false);
      this.a6();
      this.n5("height", " height=\"", 8002, "\"", 8049, 1);
      this.n5("", 8011, f7i.n5(var4), 8011, 38, false);
      this.a6();
      this.n5("viewBox", " viewBox=\"", 8050, "\"", 8140, 4);
      this.n5("", 8060, "0", 8060, 1, true);
      this.n5(" ", 8061, "0", 8062, 2, true);
      this.n5(" ", 8063, f7i.n5(var3), 8064, 37, false);
      this.n5(" ", 8101, f7i.n5(var4), 8102, 38, false);
      this.a6();
      this.l6(
         ">\r\n                <path id=\"entranceBouncePath\" d=\"M -310 -150 Q -200 -330 -110 -20 Q -80 -80 -60 -10 Q -40 -50 -20 0 Q -10 -30 0 0\" fill=\"none\"></path>\r\n                <path id=\"exitBouncePath\" d=\"M 0 0 Q 110 -180 200 130 Q 230 70 250 140 Q 270 100 290 150 Q 300 120 310 150\" fill=\"none\"></path>\r\n                <path id=\"entranceSpiralPath\" d=\"M -430 -210 C -310 -380 90 -380 200 -300 C 400 -200 350 60 110 130 C -130 150 -200 -70 20 -80 C 140 -70 70 50 0 0\" fill=\"none\"></path>\r\n                <path id=\"exitSpiralPath\" d=\"M 0 0 C -50 -10 0 -90 70 -40 C 150 40 -20 150 -110 30 C -160 -50 -70 -200 160 -150 C 370 -100 430 380 -350 400\" fill=\"none\"></path>\r\n                <path id=\"entranceCenterRevolvePath\" d=\"M 0 230 A 40 40 0 0 0 0 0\" fill=\"none\"></path>\r\n                <path id=\"exitCenterRevolvePath\" d=\"M 0 0 A 40 40 0 1 1 0 230\" fill=\"none\"></path>\r\n                <path id=\"entranceCurveUpDownPath\" d=\"M -70 240 C 40 260 140 180 140 70 C 140 -20 30 -70 0 0\" fill=\"none\"></path>\r\n                <path id=\""
      );
      this.l6(
         "exitCurveUpDownPath\" d=\"M 0 0 C 10 -40 120 -40 130 70 C 120 160 90 220 -70 240\" fill=\"none\"></path>\r\n            </svg>\r\n        </div>\r\n    </div>\r\n\r\n    <button class=\"navigationButton\" id=\"PrevSlide\""
      );
      this.n5("style", " style=\"", 9367, "\"", 9538, 7);
      this.n5("", 9375, "left:", 9375, 5, true);
      this.n5(" ", 9380, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6() / 2.0F - 100.0F - 5.0F), 9381, 76, false);
      this.n5("", 9457, "px;", 9457, 3, true);
      this.n5(" ", 9460, "top:", 9461, 5, true);
      this.n5(" ", 9465, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5() + 40.0F), 9466, 68, false);
      this.n5("", 9534, "px;", 9534, 3, true);
      this.n5(" ", 9537, "", 9538, 1, true);
      this.a6();
      this.l6(">Prev Slide</button>\r\n    <button class=\"navigationButton\" id=\"NextSlide\"");
      this.n5("style", " style=\"", 9612, "\"", 9777, 7);
      this.n5("", 9620, "left:", 9620, 5, true);
      this.n5(" ", 9625, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6() / 2.0F + 5.0F), 9626, 70, false);
      this.n5("", 9696, "px;", 9696, 3, true);
      this.n5(" ", 9699, "top:", 9700, 5, true);
      this.n5(" ", 9704, f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5() + 40.0F), 9705, 68, false);
      this.n5("", 9773, "px;", 9773, 3, true);
      this.n5(" ", 9776, "", 9777, 1, true);
      this.a6();
      this.l6(">Next Slide</button>\r\n</body>\r\n</html>");
   }
}
