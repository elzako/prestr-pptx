package com.aspose.slides;

class s3p {
   private final v6v n5 = new v6v(l6());
   private static final v6v l6 = new v6v();
   private static final v6v k5 = new v6v();

   public s3p() {
   }

   public final v6v n5() {
      return this.n5;
   }

   public static v6v l6() {
      return l6;
   }

   public static v6v k5() {
      return k5;
   }

   public static v6v n5(IPresentationComponent var0) {
      Presentation var1 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, Presentation.class)) {
         var1 = (Presentation)var0;
      } else if (var0 != null && var0.getPresentation() != null) {
         var1 = com.aspose.slides.internal.v6g.k5.n5(var0.getPresentation(), Presentation.class);
      }

      return var1 != null ? ((FontsManager)var1.getFontsManager()).n5() : k5();
   }
}
