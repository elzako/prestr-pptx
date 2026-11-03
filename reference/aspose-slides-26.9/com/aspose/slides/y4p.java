package com.aspose.slides;

class y4p {
   public static String n5(IFontData var0, int var1) {
      return var1 == 0
         ? com.aspose.slides.ms.System.d1.n5("fonts/{0}.ttf", new Object[]{var0.getFontName()})
         : com.aspose.slides.ms.System.d1.n5(
            "fonts/{0} {1}.ttf",new Object[]{ var0.getFontName(), com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o9b.e2.class, var1)
         });
   }

   public static <T> String n5(IPortionFormatEffectiveData var0, TemplateContext<T> var1) {
      TemplateContext var2 = com.aspose.slides.internal.v6g.k5.n5(var1, TemplateContext.class);
      if (var2 == null || var2.getObject() == null || !(var2.getObject() instanceof Portion)) {
         return var0.getLatinFont().toString();
      } else {
         return "he-IL".equals(((Portion)var2.getObject()).getPortionFormat().getLanguageId())
            ? var0.getComplexScriptFont().toString()
            : var0.getLatinFont().toString();
      }
   }
}
