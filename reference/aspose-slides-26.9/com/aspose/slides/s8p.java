package com.aspose.slides;

class s8p extends r6o<MasterSlide> {
   public s8p(TemplateContext<MasterSlide> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      IBackgroundEffectiveData var1 = this.u3().getObject().getBackground().getEffective();
      String var2 = o8n.n5(var1.getFillFormat(), this.u3());
      this.l6("\r\n.master-bg {\r\n    ");
      this.k5(this.n5(var2));
      this.l6("\r\n}");
   }
}
