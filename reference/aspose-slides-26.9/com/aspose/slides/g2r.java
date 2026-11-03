package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class g2r {
   public static <T> String n5(Class<T> var0, com.aspose.slides.internal.z0k.a0 var1, String var2, TemplateContext<T> var3) {
      return n5(var0, var2, var3, var1);
   }

   public static <T> String n5(Class<T> var0, String var1, TemplateContext<T> var2, com.aspose.slides.internal.z0k.a0 var3) {
      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.internal.v6g.k5.n5(var0);
      if (var4 == com.aspose.slides.internal.v6g.k5.n5(Presentation.class)) {
         if ("styles-pres".equals(var1)) {
            new t1u(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         } else if ("scripts-animation".equals(var1)) {
            new s6b(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         } else if ("scripts-effects".equals(var1)) {
            new x8f(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         } else if ("scripts-navigation".equals(var1)) {
            new o5i(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         }
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(Paragraph.class)) {
         if ("bullet".equals(var1)) {
            new v1(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         } else if ("paragraph".equals(var1)) {
            new q8j(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         }
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(AutoShape.class)) {
         new p7(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(MasterSlide.class)) {
         new s8p(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(PictureFrame.class)) {
         new u6g(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(Portion.class)) {
         new o4a(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(Shape.class)) {
         new c5p(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(Slide.class)) {
         if ("comments".equals(var1)) {
            new a8y(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         } else {
            new n1e(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
         }
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(Table.class)) {
         new h7e(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(TextFrame.class)) {
         new b5e(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else if (var4 == com.aspose.slides.internal.v6g.k5.n5(VideoFrame.class)) {
         new x2j(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      } else {
         if (var4 != com.aspose.slides.internal.v6g.k5.n5(AudioFrame.class)) {
            throw new NotImplementedException("Unknown template type");
         }

         new b5(com.aspose.slides.internal.v6g.k5.n5(var2, TemplateContext.class), var3).n5();
      }

      return "";
   }
}
