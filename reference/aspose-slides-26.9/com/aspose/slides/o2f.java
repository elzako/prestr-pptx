package com.aspose.slides;

class o2f<TModel> extends OutputFile {
   private TemplateContext<TModel> n5;
   private String l6;
   private com.aspose.slides.internal.z0k.t4 k5;
   private final ITemplateEngine u3;

   public o2f(ITemplateEngine var1) {
      this.u3 = var1;
   }

   public final TemplateContext<TModel> n5() {
      return this.n5;
   }

   public final void n5(TemplateContext<TModel> var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.z0k.t4 k5() {
      return this.k5;
   }

   public final void l6(com.aspose.slides.internal.z0k.t4 var1) {
      this.k5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      String var2 = this.u3.compile(this.l6(), this.n5());
      byte[] var3 = com.aspose.slides.internal.l7h.j5.z3().u3(var2);
      var1.write(var3, 0, var3.length);
   }
}
