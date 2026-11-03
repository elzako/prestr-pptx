package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class n1e extends r6o<Slide> {
   public n1e(TemplateContext<Slide> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   private void n5(
      IShape var1,
      Slide var2,
      boolean var3,
      int var4,
      Dictionary<IShape, List<m0j<String, String, Float, Float, String, String, Integer, z6>>> var5,
      boolean var6,
      boolean var7
   ) {
      int var8 = this.u3().getGlobal().<Integer>get("slideMargin");
      int var9 = var3 ? 1 : var4;
      int var10 = com.aspose.slides.internal.v6g.k5.u3(((SlideSize)var2.getPresentation().getSlideSize()).n5().k5() + (var8 + 1) / 2.0F, 13) * (var9 - 1)
         + (!var3 ? var8 * var9 : 0);
      if (var6) {
         var10 = com.aspose.slides.internal.v6g.k5.u3((var8 + 1) / 2.0F, 13) + (!var3 ? var8 : 0);
      }

      com.aspose.slides.internal.o9b.j5 var11 = new com.aspose.slides.internal.o9b.j5(!var3 ? var8 : 0, var10);
      String var12 = "";
      if (var5.containsKey(var1)) {
         List var13 = (List)var5.get_Item(var1);
         if (var13.size() == 1) {
            m0j var14 = (m0j)var13.get_Item(0);
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-type=\"", (String)var14.n5(), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-subtype=\"", (String)var14.l6(), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-duration=\"", f7i.n5((Float)var14.k5()), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-delay=\"", f7i.n5((Float)var14.u3()), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-clickTarget=\"", (String)var14.a6(), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-extra=\"", (String)var14.u9(), "\" "}));
            var12 = com.aspose.slides.ms.System.d1.n5(
               var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-sound=\"", q8s.n5(((z6)var14.c8()).n5(), this.u3()), "\" "})
            );
            var12 = com.aspose.slides.ms.System.d1.n5(
               var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-repeat=\"", f7i.n5(((z6)var14.c8()).l6()), "\" "})
            );
            var12 = com.aspose.slides.ms.System.d1.n5(
               var12,
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "data-animation-auto-reverse=\"", com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.n3.l6(((z6)var14.c8()).k5())), "\" "
               })
            );
            var12 = com.aspose.slides.ms.System.d1.n5(
               var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-index=\"", com.aspose.slides.ms.System.a3.l6((Integer)var14.h0()), "\" "})
            );
         } else {
            var12 = com.aspose.slides.ms.System.d1.n5(
               var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-count=\"", com.aspose.slides.ms.System.a3.l6(var13.size()), "\" "})
            );

            for (int var40 = 0; var40 < var13.size(); var40++) {
               m0j var15 = (m0j)var13.get_Item(var40);
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-type-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", (String)var15.n5(), "\" "})
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-subtype-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", (String)var15.l6(), "\" "})
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-duration-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", f7i.n5((Float)var15.k5()), "\" "
                  })
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-delay-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", f7i.n5((Float)var15.u3()), "\" "})
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-clickTarget-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", (String)var15.a6(), "\" "})
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-extra-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", (String)var15.u9(), "\" "})
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-sound-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", q8s.n5(((z6)var15.c8()).n5(), this.u3()), "\" "
                  })
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-repeat-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", f7i.n5(((z6)var15.c8()).l6()), "\" "
                  })
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-auto-reverse-",
                     com.aspose.slides.ms.System.a3.l6(var40),
                     "=\"",
                     com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.n3.l6(((z6)var15.c8()).k5())),
                     "\" "
                  })
               );
               var12 = com.aspose.slides.ms.System.d1.n5(
                  var12,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-index-", com.aspose.slides.ms.System.a3.l6(var40), "=\"", com.aspose.slides.ms.System.a3.l6((Integer)var15.h0()), "\" "
                  })
               );
            }
         }
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class) || ((AutoShape)var1).getShapeType() != 5 && ((AutoShape)var1).getShapeType() != -1) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, VideoFrame.class)) {
            TemplateContext var35 = this.u3().subModel((VideoFrame)var1);
            var35.getLocal().put("origin", var11.k5());
            var35.getLocal().put("animationAttributes", var12);
            this.k5(g2r.n5(VideoFrame.class, this.n5, "videoframe", var35));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, AudioFrame.class)) {
            TemplateContext var36 = this.u3().subModel((AudioFrame)var1);
            var36.getLocal().put("origin", var11.k5());
            var36.getLocal().put("animationAttributes", var12);
            this.k5(g2r.n5(AudioFrame.class, this.n5, "audioframe", var36));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, PictureFrame.class)) {
            TemplateContext var37 = this.u3().subModel((PictureFrame)var1);
            var37.getLocal().put("origin", var11.k5());
            var37.getLocal().put("animationAttributes", var12);
            this.k5(g2r.n5(PictureFrame.class, this.n5, "pictureframe", var37));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Table.class)) {
            TemplateContext var38 = this.u3().subModel((Table)var1);
            var38.getLocal().put("origin", var11.k5());
            var38.getLocal().put("animationAttributes", var12);
            this.k5(g2r.n5(Table.class, this.n5, "table", var38));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Shape.class)) {
            TemplateContext var39 = this.u3().subModel((Shape)var1);
            var39.getLocal().put("origin", var11.k5());
            var39.getLocal().put("animationAttributes", var12);
            this.k5(g2r.n5(Shape.class, this.n5, "shape", var39));
         }
      } else {
         TemplateContext var34 = this.u3().subModel((AutoShape)var1);
         var34.getLocal().put("origin", var11.k5());
         var34.getLocal().put("animationAttributes", var12);
         this.k5(g2r.n5(AutoShape.class, this.n5, "autoshape", var34));
      }
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Slide var1 = this.u3().getObject();
      boolean var2 = this.u3().getGlobal().<Boolean>get("animateTransitions");
      int var3 = q8s.n5((ISlide)var1);
      Dictionary var4 = q8s.u3(var1);
      String var5 = com.aspose.slides.ms.System.d1.n5("slide-", com.aspose.slides.ms.System.a3.l6(var3));
      String var6 = q8s.n5(this.u3());
      String var7 = com.aspose.slides.ms.System.d1.n5("display: ", var2 ? "none" : "block", ";", var6);
      String var8 = this.u3().getGlobal().containsKey("notesPosition") ? this.u3().getGlobal().get("notesPosition") : null;
      String var9 = this.u3().getGlobal().containsKey("commentsPosition") ? this.u3().getGlobal().get("commentsPosition") : null;
      boolean var10 = var8 != null && !"None".equals(var8);
      boolean var11 = var9 != null && !"None".equals(var9);
      boolean var12 = this.u3().getGlobal().containsKey("handout");
      boolean var13 = var12 ? this.u3().getGlobal().<Boolean>get("printComments") : false;
      this.l6("\r\n");
      this.l6("\r\n");
      if (var10) {
         this.l6("\r\n\t    <div");
         this.n5("id", "\r\n\t\t\tid=\"", 7692, "\"", 7715, 2);
         this.n5("", 7701, var5, 7701, 8, false);
         this.n5("", 7709, "-notes", 7709, 6, true);
         this.a6();
         this.l6("\r\n\t\t\tclass=\"notes\">\r\n    ");
      }

      this.l6("\r\n");
      IMasterNotesSlide var14 = var1.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
      INotesSlide var15 = var1.getNotesSlideManager() != null ? var1.getNotesSlideManager().getNotesSlide() : null;
      this.l6("\r\n");
      if (var10) {
         IGenericEnumerator var16 = var14.getShapes().iterator();

         try {
            while (var16.hasNext()) {
               IShape var17 = (IShape)var16.next();
               if (var17.getPlaceholder() != null && var17.getPlaceholder().getType() == 14) {
                  double var18 = (double)var17.getWidth() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6();
                  double var20 = (double)var17.getHeight() / ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5();
                  int var22 = this.u3().getGlobal().<Integer>get("slideMargin");
                  float var23 = var17.getX();
                  float var24 = var17.getY();
                  float var25 = ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6();
                  float var26 = ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5();
                  double var27 = var23 - var22 - (1.0 - var18) * var25 / 2.0;
                  double var29 = var24 - var22 - (1.0 - var20) * var26 / 2.0;
                  String var31 = com.aspose.slides.ms.System.d1.n5("border: {0};", new Object[]{g6k.n5(var17.getLineFormat().getEffective())});
                  var7 = com.aspose.slides.ms.System.d1.n5(
                     var7,
                     com.aspose.slides.ms.System.d1.n5(
                        " transform: matrix({0},0,0,{1},{2},{3}); transform-origin: {4}px {5}px; {6}",new Object[]{
                        f7i.n5(var18),
                        f7i.n5(var20),
                        f7i.n5(var27),
                        f7i.n5(var29),
                        f7i.n5(((SlideSize)var1.getPresentation().getSlideSize()).n5().l6() / 2.0F),
                        f7i.n5(((SlideSize)var1.getPresentation().getSlideSize()).n5().k5() / 2.0F),
                        var31
                     })
                  );
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }

         if (var15 != null) {
            IGenericEnumerator var85 = var15.getShapes().iterator();

            try {
               while (var85.hasNext()) {
                  IShape var33 = (IShape)var85.next();
                  if (var33.getPlaceholder() == null || var33.getPlaceholder().getType() != 14) {
                     this.n5(var33, var1, var2, var3, var4, var10, false);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var85, IDisposable.class)) {
                  var85.dispose();
               }
            }
         }
      }

      this.l6("\r\n<div");
      this.n5("id", " id=\"", 9539, "\"", 9552, 1);
      this.n5("", 9544, var5, 9544, 8, false);
      this.a6();
      this.l6(" class=\"slide master-bg\"\r\n     data-transition-type=\"");
      this.k5(com.aspose.slides.ms.System.s3.n5(TransitionType.class, var1.getSlideShowTransition().getType()));
      this.l6("\"\r\n     data-transition-speed=\"");
      this.k5(com.aspose.slides.ms.System.s3.n5(TransitionSpeed.class, var1.getSlideShowTransition().getSpeed()));
      this.l6("\"\r\n     data-transition-direction=\"");
      this.k5(q8s.l6(var1));
      this.l6("\"\r\n     data-transition-extra=\"");
      this.k5(q8s.k5(var1));
      this.l6("\"");
      this.n5("style", "\r\n     style=\"", 9893, "\"", 9923, 1);
      this.n5("", 9907, this.n5(var7), 9907, 16, false);
      this.a6();
      this.l6(">\r\n\r\n");
      IGenericEnumerator var84 = var1.getLayoutSlide().getMasterSlide().getShapes().iterator();

      try {
         while (var84.hasNext()) {
            IShape var86 = (IShape)var84.next();
            if (var1.getLayoutSlide().getShowMasterShapes() && var86.getPlaceholder() == null && !var86.getHidden()) {
               this.n5(var86, var1, var2, var3, var4, var10, true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var84, IDisposable.class)) {
            var84.dispose();
         }
      }

      this.l6("\r\n");
      IGenericEnumerator var87 = var1.getLayoutSlide().getShapes().iterator();

      try {
         while (var87.hasNext()) {
            IShape var89 = (IShape)var87.next();
            if (var89.getPlaceholder() == null) {
               this.n5(var89, var1, var2, var3, var4, var10, true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var87, IDisposable.class)) {
            var87.dispose();
         }
      }

      this.l6("\r\n");
      IGenericEnumerator var90 = var1.getShapes().iterator();

      try {
         while (var90.hasNext()) {
            IShape var37 = (IShape)var90.next();
            if (!var37.getHidden()) {
               this.n5(var37, var1, var2, var3, var4, var10, true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var90, IDisposable.class)) {
            var90.dispose();
         }
      }

      this.l6("\r\n");
      if (var11 || var13) {
         int var91 = 0;
         IGenericEnumerator var39 = q8s.n5(var1).iterator();

         try {
            while (var39.hasNext()) {
               IComment var40 = (IComment)var39.next();
               String var88 = com.aspose.slides.ms.System.d1.n5(
                  "left: {0}px; top: {1}px; z-index: {2};",new Object[]{ f7i.n5(((Comment)var40).l6().l6()), f7i.n5(((Comment)var40).l6().k5()), 10
               });
               if (var40.getParentComment() != null) {
                  var88 = com.aspose.slides.ms.System.d1.n5(
                     "left: {0}px; top: {1}px; z-index: {2};",new Object[]{
                     f7i.n5(((Comment)var40.getParentComment()).l6().l6()),
                     f7i.n5(((Comment)var40.getParentComment()).l6().k5()),
                     1
                  });
               }

               this.l6("        <div class=\"comment-mark\"");
               this.n5("style", " style=\"", 11448, "\"", 11465, 1);
               this.n5("", 11456, var88, 11456, 9, false);
               this.a6();
               this.l6(">");
               this.k5(this.n5(com.aspose.slides.ms.System.d1.n5(var40.getAuthor().getInitials(), com.aspose.slides.ms.System.a3.l6(++var91))));
               this.l6("</div>\r\n");
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
               var39.dispose();
            }
         }
      }

      if (var11 && "Right".equals(var9)) {
         this.k5(g2r.n5(Slide.class, this.n5, "comments", this.u3().subModel(var1)));
      }

      this.l6("\r\n</div>\r\n\r\n");
      if (var10) {
         this.l6("\r\n        ");
         this.k5(this.n5("</div>"));
         this.l6("\r\n    ");
      }
   }
}
