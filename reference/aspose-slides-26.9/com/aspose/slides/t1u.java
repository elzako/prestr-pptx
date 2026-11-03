package com.aspose.slides;

class t1u extends r6o<Presentation> {
   public t1u(TemplateContext<Presentation> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      IFontData[] var1 = this.u3().getObject().getFontsManager().getEmbeddedFonts();

      for (IFontData var5 : var1) {
         this.l6("@font-face\r\n        {\r\n            font-family: \"");
         this.k5(var5.getFontName());
         this.l6("\";\r\n            src: url(\"");
         this.k5(y4p.n5(var5, 0));
         this.l6("\");\r\n        }\r\n        ");
      }

      boolean var24 = this.u3().getGlobal().<Boolean>get("animateTransitions") || this.u3().getGlobal().<Boolean>get("navigationEnabled");
      int var25 = this.u3().getGlobal().<Integer>get("slideMargin");
      String var26 = this.u3().getGlobal().containsKey("notesPosition") ? this.u3().getGlobal().get("notesPosition") : null;
      boolean var27 = var26 != null && !"None".equals(var26);
      String var6 = this.u3().getGlobal().containsKey("commentsPosition") ? this.u3().getGlobal().get("commentsPosition") : null;
      boolean var7 = var6 != null && !"None".equals(var6);
      int var8 = this.u3().getGlobal().containsKey("commentsAreaWidth") ? this.u3().getGlobal().<Integer>get("commentsAreaWidth") : 170;
      com.aspose.slides.internal.o9b.c8 var9 = (this.u3().getGlobal().containsKey("commentsAreaColor")
            ? this.u3().getGlobal().<com.aspose.slides.internal.o9b.c8>get("commentsAreaColor")
            : com.aspose.slides.internal.o9b.c8.n5(135, 205, 235))
         .o8();
      com.aspose.slides.internal.o9b.c8 var10 = com.aspose.slides.internal.o9b.c8.n5(47, 82, 143).o8();
      String var11 = e2o.n5(var9.o8());
      String var12 = e2o.n5(var10.o8());
      float var13 = ((SlideSize)this.u3().getObject().getSlideSize()).n5().l6() + (float)(var25 / 2.0);
      float var14 = ((SlideSize)this.u3().getObject().getSlideSize()).n5().k5() + (float)(var25 / 2.0);
      boolean var15 = this.u3().getGlobal().containsKey("handout");
      int var16 = var15 ? this.u3().getGlobal().<Integer>get("handout") : 0;
      boolean var17 = var15 ? this.u3().getGlobal().<Boolean>get("printFrameSlide") : true;
      String var18 = "";
      String var19 = "";
      String var20 = "";
      String[] var21 = new String[]{var18};
      String[] var22 = new String[]{var19};
      String[] var23 = new String[]{var20};
      q8s.n5(this.u3(), var21, var22, var23);
      var18 = var21[0];
      var19 = var22[0];
      var20 = var23[0];
      if ("Right".equals(var6)) {
         var13 += var8;
      }

      this.l6(
         "\r\nbody, html {\r\n    height: 100%;\r\n}\r\n\r\nbody {\r\n    margin: 0 !important;\r\n    padding: 0 !important;\r\n    background-color: #e6e6e6;\r\n}\r\n\r\n.bg {\r\n        "
      );
      this.k5(var24 ? com.aspose.slides.ms.System.d1.n5(new String[]{"width: ", f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6() + var25 * 2), "px;"}) : "");
      this.l6("\r\n        ");
      this.k5(
         var24 ? com.aspose.slides.ms.System.d1.n5(new String[]{"height: ", f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5() + var25 * 2), "px;"}) : ""
      );
      this.l6("\r\n        ");
      this.k5(var24 ? "overflow: hidden;" : "");
      this.l6("\r\n        ");
      this.k5(var24 ? "position: fixed;" : "");
      this.l6(
         "\r\n}\r\n.date{\r\n    position: absolute;\r\n    left: 7.5in;\r\n    margin: 0.3em -5.5em;\r\n    font-family: sans-serif;\r\n    z-index: 1;\r\n}\r\n.slidenumber {\r\n    position: absolute;\r\n    font-family: sans-serif;\r\n    top: "
      );
      this.k5(var20);
      this.l6("px;\r\n    margin-top: 0.3em;\r\n}\r\n.slideframe \r\n{\r\n    position: relative;\r\n    box-shadow: black 0px 0px 1px 1px;\r\n");
      if (var17) {
         this.l6("\r\n            border: 2px solid black;\r\n        ");
      }

      this.l6("    ");
      this.k5(var18);
      this.l6("\r\n}\r\n.slide {\r\n    width: ");
      this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{f7i.n5(var13), "px"}));
      this.l6(";\r\n    height: ");
      this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{f7i.n5(var14), "px"}));
      this.l6(";\r\n    outline: 1px solid #c6c6c6;\r\n    overflow: hidden;\r\n    margin: ");
      this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var25), "px"}));
      this.l6(";\r\n    position: relative;\r\n    ");
      this.k5(var24 ? "position: absolute;" : "");
      this.l6("\r\n    ");
      this.k5(var19);
      this.l6(
         "\r\n}\r\n\r\n.page {\r\n    width: 7.5in;\r\n    height: 10in;\r\n    position: relative;\r\n    display: flex;\r\n    border: 1px solid gray;\r\n    background: white;\r\n    margin: 10px;\r\n    flex-wrap: wrap;\r\n    align-content: flex-start;\r\n    justify-content: flex-start;\r\n    align-items: center;\r\n"
      );
      if (!var15 || var16 != 3 && var16 != 5 && var16 != 7) {
         this.l6("\r\n            flex-direction: column;\r\n        ");
      } else {
         this.l6("\r\n            flex-direction: row;\r\n        ");
      }

      this.l6("}\r\n\r\n.comments {\r\n    /*padding: 2em;*/\r\n    font-family: sans-serif;\r\n");
      if (var7 && "Right".equals(var6)) {
         this.l6("\r\n            display: block;\r\n            position: relative;\r\n            left: ");
         this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().l6()), "px"}));
         this.l6(";\r\n            width: ");
         this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{f7i.n5(var8 + 1.0F), "px"}));
         this.l6(";\r\n            height: ");
         this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{f7i.n5(((SlideSize)this.u3().getObject().getSlideSize()).n5().k5() + 1.0F), "px"}));
         this.l6(";\r\n            font-size: 0.7em;\r\n            background: ");
         this.k5(var11);
         this.l6(";\r\n            border: 2px solid ");
         this.k5(var12);
         this.l6(";\r\n        ");
      }

      this.l6("}\r\n.comments-header {\r\n    border-bottom: 1px solid black;\r\n    margin: 1em;\r\n    font-size: 1.5em;\r\n    padding: 0.3em;\r\n");
      if ("Right".equals(var6)) {
         this.l6("\r\n            display: none;\r\n        ");
      }

      this.l6("}\r\n.comment {\r\n    display: flex;\r\n    flex-direction: row;\r\n    margin: 0.5em;\r\n}\r\n.comment-child {\r\n");
      if (!"Right".equals(var6)) {
         this.l6("\r\n            margin-left: 3em;\r\n        ");
      }

      this.l6(
         "}\r\n.comment-avatar {\r\n    margin-left: 5px;\r\n    width: 3em;\r\n    height: 3em;\r\n    text-align: center;\r\n    font-size: 1.1em;\r\n    font-weight: bold;\r\n}\r\n.comment-content {\r\n    margin-left: 5px;\r\n}\r\n.comment-text {\r\n}\r\n.comment-origin {\r\n    color: gray;\r\n    font-size: 0.9em;\r\n}\r\n.comment-mark {\r\n    font-size: 1em;\r\n    position: absolute;\r\n    font-family: sans-serif;\r\n    border: 1px solid black;\r\n    display: inline;\r\n    background-color: aliceblue;\r\n    padding: 2px;\r\n}\r\n\r\n"
      );
      if (var27) {
         this.l6("\r\n    .notes {\r\n        width: ");
         this.k5(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.n1.u9(((NotesSize)this.u3().getObject().getNotesSize()).n5().l6() + (float)(var25 / 2.0)), "px"
            })
         );
         this.l6(";\r\n        height: ");
         this.k5(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.n1.u9(((NotesSize)this.u3().getObject().getNotesSize()).n5().k5() + (float)(var25 / 2.0)), "px"
            })
         );
         this.l6(";\r\n        outline: 1px solid #c6c6c6;\r\n        overflow: hidden;\r\n        margin: ");
         this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(var25), "px"}));
         this.l6(";\r\n        ");
         this.k5(var24 ? "position: absolute;" : "");
         this.l6("\r\n    }\r\n    ");
      }

      this.l6(
         "\r\n.navigationArea {\r\n    float: left; \r\n    width: 240px; \r\n    height: 100%; \r\n    overflow-y: auto;\r\n}\r\n\r\n.navigationAreaBorder {\r\n    border-right: solid #777777 1px;\r\n}\r\n\r\n.navigationSelected {\r\n    background: #d24726;\r\n}\r\n\r\n.slideThumb {\r\n    margin: 10px; \r\n    margin-bottom: 5px;\r\n    padding: 5px;\r\n    padding-bottom: 1px;\r\n    cursor: pointer;\r\n}\r\n\r\n.slide-content {\r\n    \r\n}\r\n\r\n.shape {\r\n    position: absolute;\r\n}\r\n\r\n.table {\r\n    position: absolute;\r\n    border-collapse: collapse;\r\n}\r\n\r\n.paragraph {\r\n    position: absolute;\r\n}\r\n\r\n.pictureframe {\r\n    position: absolute;\r\n}\r\n\r\n.thumbnail {\r\n    margin: "
      );
      this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(this.u3().getGlobal().<Integer>get("slideMargin")), "px"}));
      this.l6(";\r\n    margin-top: ");
      this.k5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(this.u3().getGlobal().<Integer>get("slideMargin")), "px"}));
      this.l6(
         ";\r\n}\r\n  \r\n.navigationButton {\r\n    position: absolute;\r\n    width: 100px;\r\n    height: 50px;\r\n    border: solid black 1px;\r\n    text-align: center;\r\n    vertical-align: middle;\r\n    line-height: 50px;\r\n    display: none;\r\n    cursor: pointer;\r\n}\r\n\r\n#svgdiv, #svgdivpaths {\r\n    position: absolute;\r\n    top: 10px;\r\n    left: 10px;\r\n    z-index: -100;\r\n}"
      );
   }
}
