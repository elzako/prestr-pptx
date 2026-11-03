package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.net.URI;
import java.net.URISyntaxException;

class d3p implements IHtmlFormattingController {
   private boolean n5;
   private String l6;
   private com.aspose.slides.ms.System.r8 k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;

   d3p(String var1, boolean var2, String var3, String var4, String var5, String var6) {
      if (var1 == null) {
         this.k5 = null;
         this.l6 = null;
      } else {
         try {
            URI var7 = new URI(var1);
            this.k5 = com.aspose.slides.ms.System.r8.n5(var7);
         } catch (RuntimeException var8) {
            com.aspose.slides.internal.n8e.v4.n5(var8);
            this.l6 = var1;
         } catch (URISyntaxException var9) {
            com.aspose.slides.internal.n8e.v4.n5(var9);
            this.l6 = var1;
         }
      }

      this.n5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
   }

   private String n5(String var1) {
      if (null == var1) {
         return null;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.z0k.r4 var3 = new com.aspose.slides.internal.z0k.r4(var2);
      int var4 = var1.length();

      for (int var5 = 0; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if ('"' == var6) {
            var3.n5("&quot;");
         } else if ('&' == var6) {
            var3.n5("&amp;");
         } else if ('<' == var6) {
            var3.n5("&lt;");
         } else if ('>' == var6) {
            var3.n5("&gt;");
         } else if (160 < var6 && 256 >= var6) {
            var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"&#", com.aspose.slides.ms.System.a3.n5(var6, com.aspose.slides.internal.x7n.l6.k5()), ";"}));
         } else {
            var3.n5(var6);
         }
      }

      return var2.toString();
   }

   @Override
   public final void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      var3.n5(this.u3,new Object[]{ this.n5()});
      generator.addHtml(var3.toString());
      this.c8 = null;
   }

   @Override
   public final void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
      generator.addHtml(com.aspose.slides.ms.System.d1.n5(this.a6, new Object[]{this.c8}));
   }

   @Override
   public final void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
      String var3 = null;
      if (this.c8 == null) {
         this.c8 = com.aspose.slides.ms.System.d1.n5(new String[]{"slideIface", com.aspose.slides.ms.System.a3.l6(generator.getSlideIndex() + 1)});
      }

      IGenericEnumerator var4 = slide.getShapes().iterator();

      try {
         while (var4.hasNext()) {
            Shape var5 = (Shape)var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, AutoShape.class)
               && var5.getPlaceholder() != null
               && (var5.getPlaceholder().getType() == 0 || var5.getPlaceholder().getType() == 2)) {
               var3 = ((AutoShape)var5).l6().t2();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      String var10 = this.l6(var3);
      String var6 = generator.getNextSlideIndex() > 0
         ? com.aspose.slides.ms.System.d1.n5(new String[]{"slideIface", com.aspose.slides.ms.System.a3.l6(generator.getNextSlideIndex() + 1)})
         : "slideEnd";
      String var7 = this.n5((Slide)slide);
      generator.addHtml(
         com.aspose.slides.ms.System.d1.n5(
            this.u9,new Object[]{ var10, com.aspose.slides.ms.System.d1.n5(new String[]{"slideIface", com.aspose.slides.ms.System.a3.l6(generator.getSlideIndex() + 1)}), var6, var7
         })
      );
   }

   private String l6(String var1) {
      String var2 = "";
      if (var1 != null && this.n5) {
         var2 = com.aspose.slides.ms.System.d1.n5(this.h0, new Object[]{this.n5(var1)});
      }

      return var2;
   }

   private String n5(Slide var1) {
      IBackgroundEffectiveData var2 = var1.getBackground().getEffective();
      switch (var2.getFillFormat().getFillType()) {
         case 3:
            com.aspose.slides.internal.z0k.r4 var3 = new com.aspose.slides.internal.z0k.r4();

            try {
               this.n5(var3, var1);
               return com.aspose.slides.ms.System.d1.n5("style=\"background-image:url('data:;base64,{0}')\"", new Object[]{var3});
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         default:
            return "";
      }
   }

   private String n5() {
      if (this.l6 != null) {
         return com.aspose.slides.ms.System.d1.n5("\n<style type=\"text/css\">\n{0}</style>", new Object[]{this.l6});
      } else {
         return this.k5 != null ? com.aspose.slides.ms.System.d1.n5("\n<link rel=StyleSheet href=\"{0}\" type=\"text/css\">", new Object[]{this.k5}) : "";
      }
   }

   private void n5(com.aspose.slides.internal.z0k.a0 var1, Slide var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)var2.getPresentation().getSlideSize()).n5().a6();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), 139273
      );

      try {
         r1c var5 = new r1c(var4, var3.l6(), var3.k5());

         try {
            ShapeFrame var6 = new ShapeFrame(-1.0F, -1.0F, var3.l6() + 2.0F, var3.k5() + 2.0F, (byte)0, (byte)0, 0.0F);
            s5u var7 = new s5u(
               var2, new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class), new y4x()
            );
            a1v var8 = var2.t4().n5((Background)var2.getBackground(), var6, null, var7);
            var5.n5(var6.n5().y4(), null, var8);
            com.aspose.slides.internal.j9e.s7 var9 = this.l6();
            com.aspose.slides.internal.z0k.e2 var10 = new com.aspose.slides.internal.z0k.e2();

            try {
               var4.n5(var10, var9, null);
               var1.n5(com.aspose.slides.ms.System.z3.n5(var10.getBuffer(), 0, (int)var10.getLength()));
            } finally {
               if (var10 != null) {
                  var10.dispose();
               }
            }
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private com.aspose.slides.internal.j9e.s7 l6() {
      for (com.aspose.slides.internal.j9e.s7 var4 : com.aspose.slides.internal.j9e.s7.n5()) {
         if ("image/png".equals(var4.h0())) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public final void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
      generator.addHtml("</div>");
   }

   @Override
   public final void writeShapeStart(IHtmlGenerator generator, IShape shape) {
   }

   @Override
   public final void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
   }
}
